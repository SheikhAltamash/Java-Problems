public class Grid_ways {
    public static void main(String[] args) {
        int n = 20;
        int m = 21;
        System.out.println("Altamash");
        System.out.println(gridWays(0, 0, n, m));
        
        // int ratBoard[][] = { {1,0,1,1,1}, {0,1,1,1,1}, {1,1,1,0,1}, {1,1,0,1,1}, {1,1,1,0,1}};
    }

    static int gridWays(int i, int j, int n, int m) {
        if (n - 1 == i || m - 1 == j) {
            return 1;
        }
        if (n == i && m == j) {
            return 0;
        }
        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }
    
    static int ratRAce(int array[][], int n, int m) {
        if (array[n][m] == 0) {
            return 0;
        }
        return 0;
    }
}
