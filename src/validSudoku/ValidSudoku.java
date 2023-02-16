package validSudoku;//package validSudoku;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ValidSudoku {
//    public boolean isValidSudoku(char[][] board) {
//        int rows = board.length;
//        int cols = board.length;
//
//        Set<Character> rowSet = null;
//        Set<Character> colSet = null;
//        for (int i = 0; i < rows; i++) {
//            rowSet = new HashSet<>();
//            for (int j = 0; j < cols; j++) {
//                if (board[i][j] == '.') {
//                    continue;
//                }
//                if (rowSet.contains(board[i][j])) {
//                    return false;
//                }
//                rowSet.add(board[i][j]);
//            }
//        }
//        for (int i = 0; i < cols; i++) {
//            colSet = new HashSet<>();
//            for (int j = 0; j < rows; j++) {
//                if (board[j][i] == '.') {
//                    continue;
//                }
//                if (colSet.contains(board[i][j])) {
//                    return false;
//                }
//                colSet.add(board[i][j]);
//            }
//        }
//        for (int i = 0; i < rows; i = i + 3) {
//            for (int j = 0; i < cols; i = j + 3) {
//                if (!checkBlock(i,j,board)){
//                    return false;
//                }
//            }
//        }
//    }
//
//
//    public boolean checkBlock(int idxI, int idxJ, char[][] board) {
//        Set<Character> blockSet = new HashSet<>();
//        int rows = idxI + 3;
//        int cols = idxJ + 3;
//        for (int i = idxI; i < rows; i++) {
//            for (int j = idxJ; j < cols; j++) {
//                if (board[i][j] == '.'){
//                    continue;
//                }
//                if(blockSet.contains(board[i][j])){
//                    return false;
//                }
//                blockSet.add(board[i][j]);
//            }
//        }
//        return true;
//    }
//}

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SolutionValid{
    public  boolean isValid(char[][] boards){
        int rows = boards.length;
        int cols = boards.length;

        Set<Character> rowSet = null;
        Set<Character> colSet = null;

        for(int i =0; i<cols;i++){
            rowSet = new  HashSet<>();
            for(int j = 0; j < cols;j++){
                if(boards[i][j] == '.'){
                    continue;
                }
                if (rowSet.contains(boards[i][j])){
                    return false;
                }
                rowSet.add(boards[i][j]);
            }
        }
        for(int i = 0; i < cols;i++){
            colSet = new HashSet<>();
            for(int j =0;j<rows;j++){
                if(boards[j][i]=='.'){
                    continue;
                }
                if(colSet.contains(boards[j][i])){
                    return false;
                }
                colSet.add(boards[j][i]);
            }
        }
        return true;
    }
    public boolean checkBlackBox(int idxI,int idxJ, char[][] board){
        Set<Character> blockSet = new HashSet<>();
        int rows  = idxI + 3;
        int cols = idxJ + 3;
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(blockSet.contains(board[i][j])){
                    return false;
                }
                blockSet.add(board[i][j]);
            }
        }
        return false;
    }
}















