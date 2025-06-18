public class rainWaterTrapping {
    public static void main(String[] args) {
        // int array[] = { 9, 4, 9, 6, 9 };
        // int total = calculaVolumeofRain(array, leftBoundary(array), rightBoundary(array));
        // System.out.println(total);
        // System.out.println(StockSellBuys(array));
        int array2[] = { 0, 0, 1, 1, 1, 1, 4, 4, 6, 6 };
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }System.out.println();
        int j=removeDuplicate(array2,1);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println(j);
    }

    public static int StockSellBuys(int price[]) {
        int n = price.length;
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            if (buy < price[i]) {
                int profit = price[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = price[i];
            }
        }
        return maxProfit;
    }

    public static int[] leftBoundary(int original[]) {
        int n = original.length;
        int leftAuxilary[] = new int[n];
        leftAuxilary[0] = original[0];
        for (int i = 1; i < n; i++) {
            leftAuxilary[i] = Math.max(original[i], leftAuxilary[i - 1]);
        }
        return leftAuxilary;
    }

    public static int[] rightBoundary(int original[]) {
        int n = original.length;
        int rightAuxilary[] = new int[n];
        rightAuxilary[n - 1] = original[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightAuxilary[i] = Math.max(original[i], rightAuxilary[i + 1]);
        }
        return rightAuxilary;
    }

    public static int calculaVolumeofRain(int original[], int leftBoundary[], int rightBoundary[]) {
        int n = original.length;
        int totalVolume = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(rightBoundary[i], leftBoundary[i]);
            int waterlevel = minHeight - original[i];
            if (waterlevel < 0) {
                totalVolume += 0;
            } else {
                totalVolume += waterlevel;
            }
        }
        return totalVolume;
    }

    public static int removeDuplicate(int nums[], int target) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != target) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

