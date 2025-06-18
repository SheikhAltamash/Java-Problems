public class Merge_Sort {
    public static void main(String[] args) {
        int array[] = { 0, 4, 5, 3, 6, 2, 7, 1, 8, 9 };
        String nameArray[] = { "sheikh", "altamash", "uzma", "parveen" };
        mergeSort(array, 0, array.length - 1); // Added line to sort integer array
        mgtString(nameArray, 0, nameArray.length - 1); // Corrected line
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");
        }
    }

    static void mergeSort(int array[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(array, start, mid);// for left
        mergeSort(array, mid + 1, end);// for Right
        merge(array, start, mid, end);
    }

    static void merge(int[] array, int start, int mid, int end) {
        // int s = s;
        // int e = mid + 1;
        int i = start, j = mid + 1, k = 0;
        int[] temp = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = array[j];
            j++;
            k++;
        }
        for (i = start; i <= end; i++) {
            array[i] = temp[i - start];
        }
    }

    static void mgt(int array[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mgt(array, start, mid);
        mgt(array, mid + 1, end);
        ms(array, start, mid, end);

    }

    static void ms(int array[], int start, int mid, int end) {
        int left = mid - start + 1;
        int right = end - mid;
        int leftArray[] = new int[left];
        int rightArray[] = new int[right];
        for (int i = 0; i < left; i++) {
            leftArray[i] = array[start + i];

        }
        for (int i = 0; i < right; i++) {
            rightArray[i] = array[mid + 1 + i];

        }
        int i = 0, j = 0, k = start;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];

                i++;
            } else {
                array[k] = rightArray[j];
                j++;

            }
            k++;
        }
        while (i < left) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < right) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }

    static void mgtString(String array[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mgtString(array, start, mid);
        mgtString(array, mid + 1, end);
        msString(array, start, mid, end);

    }

    static void msString(String array[], int start, int mid, int end) {
        int left = mid - start + 1;
        int right = end - mid;
        String leftArray[] = new String[left];
        String rightArray[] = new String[right];
        for (int i = 0; i < left; i++) {
            leftArray[i] = array[start + i];

        }
        for (int i = 0; i < right; i++) {
            rightArray[i] = array[mid + 1 + i];

        }
        int i = 0, j = 0, k = start;

        while (i < left && j < right) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k] = leftArray[i];

                i++;
            } else {
                array[k] = rightArray[j];
                j++;

            }
            k++;
        }
        while (i < left) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < right) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }

}
