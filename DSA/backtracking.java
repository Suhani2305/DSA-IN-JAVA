package DSA;
// public class backtracking {
//     public static void changeArr(int arr[], int i, int val){
//         // base case
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }

//         // recursion
//         arr[i]=val;
//         changeArr(arr, i+1, val+1);   //fnx call step
//         arr[i]=arr[i]-2;   //backtraking step

//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
//     }
// }



// // subsets
// /**
//  * backtracking
//  */
// public class backtracking {
//     public static void findSubsets(String str, String ans,int i){
//         // base case
//         if(i==str.length()){
//             System.out.println(ans);
//             return;
//         }
//         // Yes choice
//         findSubsets(str, ans+str.charAt(i),i+1);

//         // no choice
//         findSubsets(str,ans,i+1 );

//     }
       
        

//     public static void main(String[] args) {
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }

// // find permutation
// /**
//  * backtracking
//  */
// public class backtracking {
//     public static void findPermutation(String str,String ans){
//         // base case
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         // kaam
//         for(int i=0;i<str.length();i++){
//             char curr = str.charAt(i);
//             String Newstr = str.substring(0, i)+str.substring(i+1);
//             findPermutation(Newstr, ans+curr);
//         }

//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         findPermutation(str," ");
         
//     }
// }


// O(n*n!)

// n-queens
// o(n!)
// t(n)= 1 queenplace*t(n-1)+is safe


// // grids way
// /**
//  * backtracking
//  */
// public class backtracking {
//     public static int gridsWays(int i, int j, int n, int m){
//         // base case
//         if(i==n-1 &&j==m-1){  //condn for last cell
//             return 1;

//         }else if(i==n||j==n){ //boundary cross cond
//             return 0;

//         }
//         int w1 = gridsWays(i+1, j, n, m);
//         int w2 =gridsWays(i, j+1, n, m);
//         return w1+w2;

//     }

//     public static void main(String[] args) {
//         int n=3, m=3;
//         System.out.println(gridsWays(0, 0, n, m));
        
//     }
// }


// // Sudoku
// public class backtracking {

//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//         // base case
//         if (row == 9) {
//             return true;
//         }

//         // next row and column
//         int nextRow = row, nextCol = col + 1;
//         if (col == 8) {
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         // already set digits
//         if (sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         for (int digit = 1; digit <= 9; digit++) {
//             if (isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit;
//                 if (sudokuSolver(sudoku, nextRow, nextCol)) {   // solution exists
//                     return true;
//                 }
//                 sudoku[row][col] = 0;
//             }
//         }

//         return false; // If no digit can be placed
//     }

//     public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//         // column check
//         for (int i = 0; i < 9; i++) {
//             if (sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         // row check
//         for (int j = 0; j < 9; j++) {
//             if (sudoku[row][j] == digit) {
//                 return false;
//             }
//         }

//         // grid check
//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;
//         // 3x3 grid
//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 System.out.print(sudoku[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int sudoku[][] = {
//             {0, 0, 8, 0, 0, 0, 0, 0, 0},
//             {4, 9, 0, 1, 5, 7, 0, 0, 2},
//             {0, 0, 3, 0, 0, 4, 1, 9, 0},
//             {1, 8, 5, 0, 6, 0, 0, 2, 0},
//             {0, 0, 0, 0, 2, 0, 0, 6, 0},
//             {9, 6, 0, 4, 0, 5, 3, 0, 0},
//             {0, 3, 0, 0, 7, 2, 0, 0, 4},
//             {0, 4, 9, 0, 3, 0, 0, 5, 7},
//             {8, 2, 7, 0, 0, 9, 0, 1, 3}
//         };

//         if (sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("Solution exists");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("Solution does not exist");
//         }
//     }
// }


// n queens
public class backtracking {

    public static boolean solveNQueens(int board[][], int row) {
        int n = board.length;
        // base case: If all queens are placed, return true
        if (row >= n) {
            return true;
        }

        // Try placing a queen in all columns one by one in the current row
        for (int col = 0; col < n; col++) {
            // Check if the queen can be placed on board[row][col]
            if (isSafe(board, row, col)) {
                // Place the queen on board[row][col]
                board[row][col] = 1;
                // Recur to place the rest of the queens
                if (solveNQueens(board, row + 1)) {
                    return true;
                }
                // If placing the queen in board[row][col] doesn't lead to a solution, remove it
                board[row][col] = 0; // backtrack
            }
        }

        // If the queen cannot be placed in any column in this row, return false
        return false;
    }

    // Helper function to check if a queen can be placed on board[row][col]
    public static boolean isSafe(int board[][], int row, int col) {
        int i, j;
        int n = board.length;

        // Check this column on upper side
        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper diagonal on right side
        for (i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Utility function to print the solution
    public static void printSolution(int board[][]) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this value for different sizes of the board
        int board[][] = new int[n][n];

        if (solveNQueens(board, 0)) {
            printSolution(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}



// // Rat in maze
// import java.util.ArrayList;
// import java.util.List;

// public class backtracking {

//     // Directions arrays to represent movement: D (down), L (left), R (right), U (up)
//     private static final int[] rowMoves = {1, 0, 0, -1};
//     private static final int[] colMoves = {0, -1, 1, 0};
//     private static final char[] directions = {'D', 'L', 'R', 'U'};

//     public static List<String> findPaths(int[][] maze) {
//         List<String> paths = new ArrayList<>();
//         int n = maze.length;
//         boolean[][] visited = new boolean[n][n];

//         if (maze[0][0] == 1) {
//             findPathsUtil(maze, 0, 0, "", visited, paths);
//         }

//         return paths;
//     }

//     private static void findPathsUtil(int[][] maze, int row, int col, String path, boolean[][] visited, List<String> paths) {
//         int n = maze.length;

//         // Base case: If the destination is reached, add the path to the list
//         if (row == n - 1 && col == n - 1) {
//             paths.add(path);
//             return;
//         }

//         // Mark the current cell as visited
//         visited[row][col] = true;

//         // Explore all possible directions
//         for (int i = 0; i < 4; i++) {
//             int nextRow = row + rowMoves[i];
//             int nextCol = col + colMoves[i];

//             // Check if the next move is valid
//             if (isValidMove(maze, nextRow, nextCol, visited)) {
//                 findPathsUtil(maze, nextRow, nextCol, path + directions[i], visited, paths);
//             }
//         }

//         // Backtrack: Mark the current cell as unvisited for other paths
//         visited[row][col] = false;
//     }

//     private static boolean isValidMove(int[][] maze, int row, int col, boolean[][] visited) {
//         int n = maze.length;
//         return row >= 0 && row < n && col >= 0 && col < n && maze[row][col] == 1 && !visited[row][col];
//     }

//     public static void main(String[] args) {
//         int[][] maze = {
//             {1, 0, 0, 0},
//             {1, 1, 0, 1},
//             {0, 1, 0, 0},
//             {1, 1, 1, 1}
//         };

//         List<String> paths = findPaths(maze);

//         if (paths.isEmpty()) {
//             System.out.println("No paths found.");
//         } else {
//             System.out.println("Found paths:");
//             for (String path : paths) {
//                 System.out.println(path);
//             }
//         }
//     }
// }



// // keypad combination
// public class backtracking {
//     // Mapping of digits to corresponding letters
//     final static char[][] L = {
//         {}, {}, // 0 and 1 don't map to any letters
//         {'a', 'b', 'c'},    // 2
//         {'d', 'e', 'f'},    // 3
//         {'g', 'h', 'i'},    // 4
//         {'j', 'k', 'l'},    // 5
//         {'m', 'n', 'o'},    // 6
//         {'p', 'q', 'r', 's'}, // 7
//         {'t', 'u', 'v'},    // 8
//         {'w', 'x', 'y', 'z'} // 9
//     };

//     public static void letterCombinations(String D) {
//         int len = D.length();
//         if (len == 0) {
//             System.out.println("");
//             return;
//         }
//         bfs(0, len, new StringBuilder(), D);
//     }

//     public static void bfs(int pos, int len, StringBuilder sb, String D) {
//         if (pos == len) {
//             System.out.println(sb.toString());
//         } else {
//             char[] letters = L[Character.getNumericValue(D.charAt(pos))];
//             for (int i = 0; i < letters.length; i++) {
//                 bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Testing with sample inputs
//         System.out.println("Sample Input 1: digits = \"23\"");
//         letterCombinations("23");

//         System.out.println("Sample Input 2: digits = \"2\"");
//         letterCombinations("2");

//         System.out.println("Sample Input 3: digits = \"\"");
//         letterCombinations("");
//     }
// }



// //  Knight's Tour problem
// public class backtracking {
//     // Size of the chessboard
//     static final int N = 8;

//     // Utility function to check if (x, y) is a valid move
//     static boolean isSafe(int x, int y, int sol[][]) {
//         return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
//     }

//     // Utility function to print the solution matrix
//     static void printSolution(int sol[][]) {
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++) {
//                 System.out.print(sol[x][y] + " ");
//             }
//             System.out.println();
//         }
//     }

//     // This function solves the Knight Tour problem using Backtracking
//     static boolean solveKT() {
//         int sol[][] = new int[N][N];

//         // Initialization of solution matrix
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++) {
//                 sol[x][y] = -1;
//             }
//         }

//         // xMove[] and yMove[] define the next move of the knight.
//         // xMove[] is for the x coordinates and yMove[] is for the y coordinates.
//         int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
//         int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

//         // The knight is initially at the first block
//         sol[0][0] = 0;

//         // Start from 0,0 and explore all tours using solveKTUtil()
//         if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//             System.out.println("Solution does not exist");
//             return false;
//         } else {
//             printSolution(sol);
//         }

//         return true;
//     }

//     // A recursive utility function to solve Knight Tour problem
//     static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
//         int k, next_x, next_y;
//         if (movei == N * N) {
//             return true;
//         }

//         // Try all next moves from the current coordinate x, y
//         for (k = 0; k < 8; k++) {
//             next_x = x + xMove[k];
//             next_y = y + yMove[k];
//             if (isSafe(next_x, next_y, sol)) {
//                 sol[next_x][next_y] = movei;
//                 if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
//                     return true;
//                 } else {
//                     sol[next_x][next_y] = -1; // backtracking
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         solveKT();
//     }
// }


