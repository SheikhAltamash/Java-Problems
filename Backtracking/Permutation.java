public class Permutation {
    public static void main(String[] args) {
        System.out.println("Permutation of ABC");
        Permut("abc", "");
    }

    static void Permut(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            Permut(ros, ans + ch);
        }
    }
    
}