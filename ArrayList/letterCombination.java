import java.util.*;

public class letterCombination {
    public static void main(String[] args) {
        String map[] = { "", "", "abc", "cde", "fgh", "ijk", "lmn", "opqr", "stuv", "wxyz" };
        letterCombine(map,"89");
    }

    public static void letterCombine(String[] map,String digit) {
        List<String> ans = new ArrayList<String>();
        rec(ans, map, "", 0, digit);
        System.out.println(ans);
    }

    static void rec(List<String> ans, String[] map,String res, int i,String digit) {
        if (i == digit.length()) {
            ans.add(res);
            return;
        }
        char ch = digit.charAt(i);
        int num = ch - '0';
        String str = map[num];
        for (int j = 0; j < str.length(); j++) {
            rec(ans, map, res+str.charAt(j), i+1, digit);
        }

   }
}