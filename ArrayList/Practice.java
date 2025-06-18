
// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        // Problem 1 (Monotonically increasing or decreasing )
        // ArrayList<Integer> list = new ArrayList<>();
        // int array[] = { 9, 8, 7, 6, 5, 5, 5, 5, 5, 3 };
        // System.out.println(Monotonically(array));

        // Problem 2 (Lonely number finder)
        int array2[] = { 3,10,1, 3, 6, 7, 8, 3, 10, 3, 10, 4, 5, 6, 3, 6, 3, 10,3,6 };

        // LonelyNumber(array2);
        // System.out.println();
        maxTarget(array2, 3);
    }

    static boolean Monotonically(int array[]) {
        boolean inc = true, dec = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                inc = false;
            }
            if (array[i] < array[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

    static void LonelyNumber(int array[]) {
        Arrays.sort(array);
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int num = array[i];
            boolean is = true;

            // Check of number appears more than once
            for (int j = 0; j < n; j++) {
                if (i != j && array[j] == num) {
                    is = false;
                    break;
                }
            }

            // Check if num has adjacent numbers
            for (int l = 0; l < n; l++) {
                if (array[l] == num - 1 || array[l] == num + 1) {
                    is = false;
                    break;
                }
            }
            if (is) {
                System.out.println(num);
            }
        }

    }

    static void maxTarget(int array[], int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = array.length, max = Integer.MIN_VALUE,number=0;
        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (num == key) {
                if (map.containsKey(array[i + 1]) == false) {
                    map.put(array[i + 1], 1);
                } else {
                    map.put(array[i + 1], map.get(array[i + 1]) + 1);
                }
                
            }
        }
        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (map.containsKey(num) == true) {
                int a = map.get(num);
                if (max < a) {
                    max = a;
                    number = num;
                }
                
            }
        }
        System.out.println(number);

    }
}
