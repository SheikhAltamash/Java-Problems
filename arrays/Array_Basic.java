public class Array_Basic {
    public static void main(String[] args) {
        // int array[] = { 1, 3, 5, 7, 9, 1, 4, 5, 7 };
        // int n = array.length;
        // P1 Checking whether a number repeat in the array or not
        // for (int i = 0; i < array.length; i++) {
        //     int index = Math.abs(array[i]) - 1;
        //     System.out.println(array[index]);
        //     if (array[index] < 0) {
        //         System.out.println("duplicate found");
        //     }
        //     array[index] = -array[index];
        // }
        //Second approach 
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (array[i] == array[j]) {
        //             System.out.println("Duplicate Found : " + array[i]);
        //         }
        //     }
        // }

        // //  P2 Binary search
        // int high = n - 1;
        // int low = 0;
        // int target = 4;
        // boolean found = false;
        // while (low <= high) {
        //     int mid = (low + high) / 2;
        //     if (array[mid] == target) {
        //         found = true;
        //         System.out.println("Target found at index : " + mid);
        //         break;
        //     } else if (array[mid] > target)
        //         high = mid - 1;
        //     else
        //         low = high + 1;

        // }
        // if (!found)
        //     {System.out.println("Target not found !");}
        int array2[] = { 7, 9, 10, 14, 15, 17 ,1, 3, 5 };
        int target2=1;
        int result = rotatedArrayBinarySearch(array2, target2);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        }
        else {
            System.out.println("Element not found");
        }
            System.out.println(target2);

    }
    
    public static int rotatedArrayBinarySearch(int a[],int target) {
        int n = a.length;
        int low = 0, high = n - 1,shift;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > a[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        shift = high;
        high = n - 1;low=0;
        while (low<=high) {
            int mid = (high + low) / 2;
            int Realmid = (mid + shift) % n;
            if (a[Realmid] == target) {
                return Realmid;
            }
            else if (a[Realmid] < target) {
                low = mid+ 1;
            }
            else {
                high = mid- 1;
            }
        }

        return -1;
    }

}
