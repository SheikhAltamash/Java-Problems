public class Searching {
    public static void main(String[] args) {
        System.out.println("");
        int a[] = { 1, 2, 9, 4, 5, 0 };
        minMaxElem(a);
    }

    public static void minMaxElem(int a[]) {
        int n = a.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Minimum Value is : "+min+"\n Max Value is : "+max);
    }
}
