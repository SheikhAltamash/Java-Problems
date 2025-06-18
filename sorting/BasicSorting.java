public class BasicSorting {
    public static void main(String[] args) {
        int array[] = { 1, 4, 6, 9, 8, 2, 3, 6, 1, 0 };
        // selectionSort(array);
        // bubbleSort(array);
        //InsertionSort(array);
        countSort(array);
    }

    public static void bubbleSort(int array[]) {
        int n = array.length;
        boolean isSwaped = false;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwaped = true;
                }

            }
            if (!isSwaped) {

                System.out.println("Array is already Sorted so the loop is exited after 1 successfull iteration ");
                break;
            }
            ;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static void InsertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int prev = i - 1, curr = array[i];
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
        }
        for (int i = 0; i < n; i++) {

            System.out.println(array[i]);
        }
    }

    static void countSort(int a[]) {
        int n = a.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int count[] = new int[max+1];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i =0; i<max; i++) {
            int freq = count[i];
            while (freq > 0) {
            
                System.out.print(i + " ");
                freq--;}
            
        }
    }
}
