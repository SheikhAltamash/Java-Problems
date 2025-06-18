public class N_Queen {
    public static void main(String[] args) {
        int n = 5;
        char c[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 'x';
            }
        }
        NQueen(c, 0);
    }

    static boolean NQueen(char board[][], int i) {
        if (i == board.length) {
            System.out.println("____N_QUEEN____\n");
            print(board);
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';
                if (NQueen(board, i + 1))
                    return true;
                board[i][j] = 'x'; 
            }
        }
        return false;
    }

    static boolean isSafe(char board[][], int row, int col) {
        for (int j = row - 1; j >= 0; j--) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void print(char c[][]) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
