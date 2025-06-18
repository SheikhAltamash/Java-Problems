import java.util.*;

public class String_First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String are immutable
        // Palindrome
        // String str = "nonon";
        // int n = str.length();
        // for (int i = 0; i < n / 2; i++) {
        //     if (str.charAt(i) != str.charAt(n - i - 1)) {
        //         n = 0;
        //         break;
        //     }
        // }
        // if (n == 0) {
        //     System.out.println("Not a palindrome");
        // } else {
        //     System.out.println("Palindrome");
        // }
        System.out.println(compress("auuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaayubbcc"));
        sc.close();
    }

    static StringBuilder compress(String original) {
        Integer count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            count++;
            if (i == original.length() - 1 || original.charAt(i) != original.charAt(i + 1)) {

                result.append(original.charAt(i));
                if (count != 1)
                    result.append(count);
                count = 0;
            }

        }
        return result;
    }
   
}
