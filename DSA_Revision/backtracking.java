import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class backtracking {
    // n queens pblm using backtracking
    public static boolean isSafe(int[][] board, int row, int col, int n){
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }
        

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }
    public static boolean solveNQueens(int[][] board, int row, int n) {
        if (row == n) return true; // All queens are placed

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1; // Place the queen
                if (solveNQueens(board, row + 1, n)) return true; // Recur to place next queen
                board[row][col] = 0; // Backtrack
            }
        }
        return false; // No valid position found
    }
    public static void printSolution(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


    //Word Break Problem using Backtracking
    public static boolean wordBreak(String s, Set<String> dict) {
        return wordBreakHelper(s, dict, 0);
    }
    private static boolean wordBreakHelper(String s, Set<String> dict, int start) {
        if (start == s.length()) return true; // Reached the end of the string

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (dict.contains(word) && wordBreakHelper(s, dict, end)) {
                return true; // Found a valid word and continue
            }
        }
        return false; // No valid segmentation found
    }
    public static void main(String[] args) {
        int n = 4; // Size of the chessboard
        int[][] board = new int[n][n]; // Initialize the board

        if (solveNQueens(board, 0, n)) {
            printSolution(board); // Print the solution if found
        } else {
            System.out.println("No solution exists");
        }

        // Example usage of word break problem
        String s = "leetcode";
        Set<String> dict = new HashSet<>(Arrays.asList("leet", "code"));
        if (wordBreak(s, dict)) {
            System.out.println("The string can be segmented into words from the dictionary.");
        } else {
            System.out.println("The string cannot be segmented into words from the dictionary.");
        }
    }
}
