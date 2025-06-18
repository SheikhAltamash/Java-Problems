public class kadansAlgo {
    public static void main(String[] args) {
        int array[] = { -1, 10, -3, -4, -5, -5 };
        maxSubarraySum(array);
        maxSubArraySumPrefix(array);
        kadanesAlgorithm(array);
    }

    static void maxSubarraySum(int[] array) {
        int n = array.length, maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += array[k];
                }
                if (maxSum < currSum)
                    maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }

    static void maxSubArraySumPrefix(int[] array) {
        int n = array.length, maxSum = Integer.MIN_VALUE, currSum = 0;
        int prefix[] = new int[n];
        prefix[0] = array[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            if (maxSum < currSum)
                maxSum = currSum;

        }
        System.out.println(maxSum);
    }

    static void kadanesAlgorithm(int array[]) {
        int n = array.length, maxSum = 0, currSum = 0;
        boolean allNeg = true;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                allNeg = false;
                break;
            }
        }
        if (allNeg) {
            maxSum=Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (maxSum < array[j]) {
                maxSum=array[j];
                }
            }
        }
        if (!allNeg) {
            for (int i = 0; i < n; i++) {
                currSum += array[i];
                if (currSum < 0)
                    currSum = 0;
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }
}
