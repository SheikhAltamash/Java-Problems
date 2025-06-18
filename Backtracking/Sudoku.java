public class Sudoku {
    public static void main(String[] args) {
        int[][] sudokuGrid = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        sudoku(sudokuGrid, 0, 0);
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.print(sudokuGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean sudoku(int grid[][], int row, int col) {
        if (row == 9 )
            return true;
        
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (grid[row][col] != 0) {
            return sudoku(grid, nextRow, nextCol);
        }
        for (int i = 0; i <= 9; i++) {
            if (isValid(grid, row, col, i)) {
                grid[row][col] = i;
                if (sudoku(grid, nextRow, nextCol)) {
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isValid(int[][] grid, int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == value) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == value) {
            return false;
            }
        }
        int startCol = (col / 3) * 3;
        int startRow = (row / 3) * 3;
        for (int i = startRow; i <startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if (grid[i][j] == value) {
                    return false;
                }
            }
            
        }
        return true;
    }
    
}
