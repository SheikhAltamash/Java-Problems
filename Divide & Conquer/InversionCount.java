public class InversionCount {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 2, 5, 6, 7, 8 };
        bruteForcedInversion(array);
    }

    static void bruteForcedInversion(int[] array) {
        int inversionCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    inversionCount++;
            }
        }
        System.out.println(inversionCount);
    }
}