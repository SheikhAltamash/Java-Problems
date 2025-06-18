public class D_First {
    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j n; j++) {
        // System.out.print(array[i][j] + " ");

        // }
        // System.out.println();
        // }
        // sum(array);
        // binarySearch2d(array, 11);
        // stareCaseSearch(array, 61);
        // SpiralClock(array);
        transpose(array);

    }

    public static void sum(int array[][]) {
        int n = array.length;
        int firstDiagonal = 0;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == j|| i + j == n - 1)
        // firstDiagonal += array[i][j];
        // }
        // }
        for (int i = 0; i < n; i++) {
            firstDiagonal += array[i][i];
            firstDiagonal += array[i][n - i - 1];
        }
        System.out.println(firstDiagonal);
    }

    static boolean binarySearch2d(int a[][], int target) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int high = a[i].length - 1;
            int low = 0;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (a[i][mid] == target) {
                    System.out.println(" Element is present in the 2D array at row  " + i + "  and at column  " + mid);
                    return true;
                } 
                else if (target > a[i][mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }

    static boolean stareCaseSearch(int a[][], int target) {
        int row = 0;
        int column = a[0].length - 1;
        while (row < a.length && column >= 0) {
            if (a[row][column] == target) {
                System.out.println("Element is present in the Matrix");
                return true;
            }

            else if (a[row][column] < target)
                row++;
            else
                column--;
        }
        System.out.println("Element is not present in the Matrix");
        return false;
    }

    static void SprialAntiClock(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int sr = 0, sc = 0, er = n - 1, ec = m - 1, row, col;
        while (sr <= er && sc <= er) {
            // Print starting column (Starting row to ending to ending row)
            col = sc;
            for (row = sr; row <= er && sr <= er && sc <= er; row++) {
                System.out.print(" " + a[row][col]);

            }
            sc++;

            // Print ending row (starting column to ending column)
            row = er;
            for (col = sc; col <= ec && sr <= er && sc <= er; col++) {
                System.out.print(" " + a[row][col]);
            }
            er--;

            // Print Ending column (ending row to starting row)
            col = ec;
            for (row = er; row >= sr && sr <= er && sc <= er; row--) {
                System.out.print(" " + a[row][col]);
            }
            ec--;

            // Print strting row (ending column to starting column)
            row = sr;
            for (col = ec; col >= sc && sr <= er && sc <= er; col--) {
                System.out.print(" " + a[row][col]);
            }
            sr++;
            System.out.println();
        }
    }

    static void SpiralClock(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int sr = 0, sc = 0, er = n - 1, ec = m - 1, row = 0, col = 0;
        while (sr <= er && sc <= er) {
            // Print strting row (starting column to ending column)
            row = sr;
            for (col = sc; col <= ec && sr <= er && sc <= er; col++) {
                System.out.print(" " + a[row][col]);
            }
            sr++;

            // Print Ending column (starting row to ending row)
            col = ec;
            for (row = sr; row <= er && sr <= er && sc <= er; row++) {
                System.out.print(" " + a[row][col]);
            }
            ec--;

            // Print ending row (ending column to starting column)
            row = er;
            for (col = ec; col >= sc && sr <= er && sc <= er; col--) {
                System.out.print(" " + a[row][col]);
            }
            er--;

            // Print starting column (ending row to starting to ending row)
            col = sc;
            for (row = er; row >= sr && sr <= er && sc <= er; row--) {
                System.out.print(" " + a[row][col]);

            }
            sc++;

            System.out.println();
        }
    }

    static void transpose(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int ans[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = a[i][j];
            }
        }
        System.out.println("Original");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Answer ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
