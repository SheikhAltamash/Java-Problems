public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 ,43,66,223};
        int[] arr2 = { 2, 4, 6, 10 ,11,77,221};
        mergeSortedArrays(arr1, arr2);

    }

    static void mergeSortedArrays(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int ans[] = new int[a.length + b.length];
        int k = 0, j = 0, i = 0;
        while (k < n1 && j < n2) {
            if (a[k] > b[j]) {
                ans[i] = b[j];
                j++;
            } else {
                ans[i] = a[k];
                k++;
            }
            i++;
        }
        while (k <n1) {
            ans[i] = a[k];
            k++;
            i++;
        }
        while (j < n2) {
            ans[i] = b[j];
            j++;
            i++;
        }
        for (i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
