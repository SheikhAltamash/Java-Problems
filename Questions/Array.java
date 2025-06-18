import java.util.*;

public class Array {
    public static void main(String args[]) {

        // Question1();
        // Question2();
        // Question3();
        // Question4();
        // Question5();
        // Question6();
        // Question7();
        // Question8();
        // Question9();
        // Question10();
        // Question11();
        // Question12();
        // Question13();
        Question14();

    }

    public static void Question1() {
        // Question no 1 fin the count of repeated number from a given number
        // Given a number, find the count of repeating digits. (Wipro NLTH)
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int userInput = 123434;
        int original = userInput, i = 0, j = 0;
        while (original > 0) {
            int number = original % 10;
            i = 1;
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, i);
            }
            original /= 10;
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Index: " + j + ", Key: " + entry.getKey() + ", Value: " + entry.getValue());
            j++;
        }
    }

    public static void Question2() {
        // Given a number and a specific digit, count the occurrences of that digit in
        // the number.
        Map<Integer, Integer> map = new HashMap<>();
        int number = 123322;
        int specific = 2;
        while (number > 0) {
            int digit = number % 10, i = 1;
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else
                map.put(digit, i++);
            number /= 10;
        }
        System.out.println(map);
        System.out.println("Count of " + specific + " is " + map.get(specific));
    }

    public static void Question3() {
        // Calculate and return the sum of absolute differences between adjacent numbers
        // in an array
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += Math.abs(array[i] - array[i + 1]);
        }
        System.out.println(sum);
    }

    public static void Question4() {
        // Arrange an array so that all odd numbers come after all even numbers.
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int arrayodd[] = new int[array.length], arrayeven[] = new int[array.length];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayeven[evenIndex++] = array[i];
            } else {
                arrayodd[oddIndex++] = array[i];
            }
        }
        int idx = 0;
        for (int i = 0; i < evenIndex; i++) {
            array[idx++] = arrayeven[i];
        }
        for (int i = 0; i < oddIndex; i++) {
            array[idx++] = arrayodd[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void Question5() {
        // Given an array, print all unique elements and also the total count of
        // distinct elements.
        Map<Integer, Integer> map = new HashMap<>();
        int array[] = { 1, 2, 3, 4, 5, 4, 3, 6, 2, 8, 8 };
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 1);
        }
        System.out.println(map);
        System.out.println(map.size());

    }

    public static void Question6() {
        // Sort the array and print Assending and decending order
        int array[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 }, n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }

    public static void Question7() {
        // Given an array of integers, sort its first half in ascending order and the
        // second half in descending order.
        int array[] = { 5, 4, 3, 2, 1, 0, 6, 7, 8, 9 }, n = array.length;
        int Half = array.length / 2;
        for (int i = 0; i < Half; i++) {
            for (int j = i; j < Half; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = Half; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }

    public static void Question8() {
        // Given an array and a number k (where k is smaller than the size of the
        // array), find the k’th smallest (or largest) element in the given array.
        // Assume all array elements are distinct.

        int array[] = { 1, 3, 5, 7, 7, 7, 7, 7, 7, 7, 8, 0, 2, 4, 6, 7 }, n = array.length;
        int input = 5;
        Merge_Sort(array, 0, n - 1);
        for (int i = n - 1; i > 0; i--) {
            if (input == 0) {
                System.out.println(array[i + 1]);
                break;
            }
            if (array[i] == array[i - 1]) {
                continue;
            }
            input -= 1;

        }

    }

    public static void Merge_Sort(int array[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        Merge_Sort(array, start, mid);
        Merge_Sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public static void merge(int array[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];
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

    public static void Question9() {
        // Find second largest number in a array
        int array[] = { 5, 4, 3, 2, 1, 0, 6, 7, 8, 9 }, n = array.length;
        int firstlargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] > firstlargest) {
                secondLargest = firstlargest;
                firstlargest = array[i];
            }

        }
        System.out.println(secondLargest);
    }

    public static void Question10() {
        // Given an array of random numbers, push all the zeros of the array to the end,
        // maintaining the relative order of the non-zero elements.
        int array[] = { 5, 4, 0, 3, 2, 0, 1, 0, 6, 7, 8, 9 }, n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[n - 1] = 0;
                n--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void Question11() {
        // Given a list or array of integers, remove duplicate elements. (The specifics
        // might vary: keep first occurrence, or work on sorted array).
        int array[] = { 1, 2, 4, 6, 1, 8, 1, 2 }, n = array.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int idx = 0;
        for (int i : map.keySet()) {
            array[idx++] = i;
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void Question12() {
        // Calculate and return the sum of absolute differences between adjacent numbers
        // in an array of positive integers.
        int array[] = { 10, 11, 7, 12, 14 }, n = array.length;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(array[i] - array[i + 1]);
        }
        System.out.println(sum);
    }

    public static void Question13() {
        // Problem: Given N plot areas, determine how many of these plots are
        // square-shaped (i.e., their area is a perfect square).
        // Example: Input 8, 79 77 54 81 48 34 25 16 -> Output: 3 (for 81, 25, 16).
        int array[] = { 8, 9, 79, 81, 48, 94, 25, 36 };
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                System.out.println(num);
            }

        }
    }

    public static void Question14() {
        //Problem: From N cards with values, choose two cards such that their product is maximized. Return the sum of the values of these two chosen cards.
        //Example: Input 7, 9 -3 8 -6 -7 8 10 -> Max product 9*10=90. Sum 9+10=19. Output: 19.
        int array[] = { 7, 9, -3, 8, -6, -7, 8, 10 }, n = array.length;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            }
        }
        System.out.println(max1*max2);
    }


}
