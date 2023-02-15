package validSudoku;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        Set<Character> rowSet = null;
        Set<Character> colSet = null;
        for (int i = 0; i < rows; i++) {
            rowSet = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (rowSet.contains(board[i][j])) {
                    return  false;
                }
            }
        }
    }
}
