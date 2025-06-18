public class Array_Basic {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        findsubsets("abc",new StringBuilder(" "), 0);
        // ss("Sheikh Altamash Ahamad imli bagh kamptee sadar nagpur");
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double seconds = (double) duration / 1_000_000_000.0;
        System.out.println("Time taken: " + seconds + " seconds");
        System.out.println(count);
    }
        static int count = 0;  

    // 1. Find all subsets of an String
    static void findsubsets(String str, StringBuilder ans, int i) {
        //Base Case
        if (str.length() == i) {
            System.out.println(ans);
            // System.out.println(count++);
            count++;
            return;
        }
        // For Yes 
        ans.append(str.charAt(i));
        findsubsets(str, ans, i + 1);
        ans.deleteCharAt(ans.length() - 1);
        //For No
        findsubsets(str, ans, i + 1);
       

    }
    
    static void ss(String str) {
        long n = str.length();
        long length = (int) Math.pow(2, n);
        String[] sb = new String[(int) length];
        int index = 0;

        // Generate all subsets
        for (int i = 0; i < length; i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.append(str.charAt(j));
                }
            }
            sb[index++] = subset.toString();
            count++;
        }

        // Print all subsets
        System.out.println("All Subsets are: ");
        // for (int i = 0; i < sb.length; i++) {
        //     System.out.println(sb[i]);
        //     System.out.println(i);
        // }
        System.out.println("Total Subsets: " + sb.length);
    }
}
