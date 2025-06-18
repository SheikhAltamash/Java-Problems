public class Print_Binary_String {
    public static void main(String[] args) {
        // printBinaryString(4, 0, "");

        System.out.println(print(0, 4, "abcba"));
      

    }

    public static void printBinaryString(int n, int lastIndex, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryString(n - 1, 0, str + "0");
        if (lastIndex == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    static int print(int start, int end, String str) {
        if (start > end) {
            return 0;
        }
        // Check if current substring starts and ends with the same character
        
        // Recurse by moving start forward and end backward
        int first=print(start + 1, end, str);
        int back =print(start, end - 1, str);
        int mid = print(start + 1, end - 1, str);
        int count=first + back-mid;
        if(str.charAt(end)==str.charAt(start)){
            count++;
        }
        return count;
    }
}
