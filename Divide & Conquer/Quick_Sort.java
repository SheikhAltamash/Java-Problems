public class Quick_Sort {
    public static void main(String[] args) {
        int array[] = { 1, 2,3, 5,2, 7, 9, 2, 4, 6, 8, 0,2 };
        QuickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int sort(int array[], int left, int right, int key) {
        int i = left;
        for (int j = left; j <= right; j++) {
            if (array[j] <= key) {

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        return i - 1;
    }

    public static void QuickSort(int array[], int left, int right) {
        if (left >= right)
            return;
        int pivot = sort(array, left, right, array[right]);
        QuickSort(array, left, pivot - 1);
        QuickSort(array, pivot+1, right);
    }

}
