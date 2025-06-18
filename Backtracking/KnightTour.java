public class KnightTour {
    public static void main(String[] args) {
        System.out.println("hello World");
        int maze[][] = { { 0, 59, 38, 33, 30, 17, 8, 63 },
                { 37, 34, 31, 60, 9, 62, 29, 16 },
                { 58, 1, 36, 39, 32, 27, 18, 7 },
                { 35, 48, 41, 26, 61, 10, 15, 28 },
                { 42, 57, 2, 49, 40, 23, 6, 19 },
                { 47, 50, 45, 54, 25, 20, 11, 14 },
                { 56, 43, 52, 3, 22, 13, 24, 5 },
                { 51, 46, 55, 44, 53, 4, 21, 12}};
        // tour(maze);
        System.out.println(isvalid(maze, 0, 0, maze.length, 0));
    }

    static void tour(int[][] maze) {    }

    static boolean isvalid(int grid[][], int row, int col, int n, int expected) {
        if (row < 0 || row >= n || col < 0 || col >= n || grid[row][col] != expected)
            return false;
        if (expected == ((n * n) - 1))
            return true;
        expected +=1;
        boolean ans1 = isvalid(grid, row-2, col+1, n, expected);
        boolean ans2 = isvalid(grid, row-1, col+2, n, expected);
        boolean ans3 = isvalid(grid, row+1, col+2, n, expected);
        boolean ans4 = isvalid(grid, row+2, col+1, n, expected);
        boolean ans5 = isvalid(grid, row+2, col-1, n, expected);
        boolean ans6 = isvalid(grid, row+1, col-2, n, expected);
        boolean ans7 = isvalid(grid, row-1, col-2, n, expected);
        boolean ans8 = isvalid(grid, row-2, col-1, n, expected);
        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;

    }

    
}
