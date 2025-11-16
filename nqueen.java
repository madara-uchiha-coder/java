public class nqueen {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
static int queens(boolean[][] board , int rows){
    if(rows==board.length){
        return 1;
    }
    int count=0;
    
    for(int i=0;i<board.length;i++)
        {
         if(isSafe(board, rows, i)) {
                board[rows][i] = true;
                count += queens(board, rows + 1);
                board[rows][i] = false;
            }
        }
    return count;
    
}
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }
}


