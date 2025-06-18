public class array {
    public static void main(String[] args) {
        int array[] = { 1,2,2,2,5,2,-1,2,9 };
        // int search = binarySearch(array, 1);
        // if (search == -1) {
        //     System.out.println("Element not found");
        // } else {
        //     System.out.println("Element found at index " + search);
        // }
        // largestNumber(array);
        // int first = 0, last = array.length - 1;
        // while (first < last) {
        //     int temp = array[last];
        //     array[last] = array[first];
        //     array[first] = temp;
        //     first++;
        //     last--;
        // }
        // for (int i = 0; i < array.length - 1; i++) {
        //     System.out.println(array[i]);
        // }
        //Pairs
        // for (int i = 0; i < array.length - 1; i++) {
        //     for (int j = i; j < array.length - 1; j++) {
        //         if (array[i] != array[j])
        //             System.out.println("(" + array[i] + " , " + array[j] + ")");
        //     }
        // }
        
        // secondLargest(array);
        // revArray(array);
        // duplicateNumber(array);
        // productArrayPuzzle(array);
        moreOptimized(array);
        boyersMoreVoting(array);
    }

    public static int binarySearch(int a[], int key) {
        int n = a.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }

    public static void largestNumber(int a[]) {
        int largestNumber = 0, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largestNumber) {
                largestNumber = a[i];
            }
        }
        System.out.println("Largest number is " + largestNumber);
        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }

        }
        System.out.println("Smallest number is " + smallest);
    }

    public static void secondLargest(int a[]) {
        int largestnumber = 0, secondLargestnumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largestnumber) {
                secondLargestnumber = largestnumber;
                largestnumber = a[i];
            } else if (a[i] > secondLargestnumber && a[i] != largestnumber) {
                secondLargestnumber = a[i];
            }

        }
        System.out.println(secondLargestnumber);
    }
    
    static void revArray(int a[]) {
        int rev[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            rev[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(rev[i]);
        }
    }

    static void duplicateNumber(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate number : " + a[i]);
                    break;
                }
            }
        }
    }

    static void productArrayPuzzle(int a[]) {
        int n = a.length;
        int res[] = new int[n];
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * a[i];
        }
        suffix[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = a[i] * suffix[i + 1];
        }
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefix[i - 1] * suffix[i + 1];
        }
        res[0] = suffix[1];
        res[n - 1] = prefix[n - 2];

       

    }

    public static void moreOptimized(int[] a) {
        int n = a.length, product = 1, zerocount = 0;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zerocount++;
                continue;
            } else
                product *= a[i];
        }
        for (int i = 0; i < n; i++) {
            if (zerocount > 1) {
                res[i] = 0;
            } else if (zerocount == 1) {
                res[i] = (a[i] == 0) ? product : 0;
            } else
                res[i] = product / a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }

    static void boyersMoreVoting(int a[]) {
        int majority = a[0], lead = 1;
        for (int i = 1; i < a.length; i++) {
            if (majority == a[i]) {
                lead++;
            } else if (lead == 0) {
                majority = a[i];
            } else {
                lead--;
            }
        }
        System.out.println(majority);
    }
}
