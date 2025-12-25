// public class dp {
//     public static int maxSum(int arr[], int ind, int dp[]) {
//         if (ind < 0) return 0;
//         if (ind == 0) return arr[0];
//         if (dp[ind] != -1) return dp[ind];

//         int pick = arr[ind] + maxSum(arr, ind - 2, dp);
//         int notPick = maxSum(arr, ind - 1, dp);

//         return dp[ind] = Math.max(pick, notPick);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         int dp[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             dp[i] = -1;
//         }

//         System.out.println(maxSum(arr, n - 1, dp)); // Output: 9 (1 + 3 + 5)
//     }
// }


// // this iss using tabulation approach
// public class dp {
//     public static int maxSum(int[] arr) {
//         int n = arr.length;
//         if (n == 0) return 0;
//         if (n == 1) return arr[0];

//         int[] dp = new int[n];
//         dp[0] = arr[0];
//         dp[1] = Math.max(arr[0], arr[1]);

//         for (int i = 2; i < n; i++) {
//             int pick = arr[i] + dp[i - 2];
//             int notPick = dp[i - 1];
//             dp[i] = Math.max(pick, notPick);
//         }

//         return dp[n - 1];
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         System.out.println(maxSum(arr)); // Output: 9
//     }
// }


//2d dp

// import java.util.*;

// class dp {
//     // Recursive function to calculate the maximum points for the ninja training
//     static int f(int day, int last, int[][] points, int[][] dp) {
//         // If the result is already calculated, return it
//         if (dp[day][last] != -1) return dp[day][last];

//         // Base case: When it's the first day (day == 0)
//         if (day == 0) {
//             int maxi = 0;
//             for (int i = 0; i <= 2; i++) {
//                 if (i != last)
//                     maxi = Math.max(maxi, points[0][i]);
//             }
//             return dp[day][last] = maxi; // Store and return the result
//         }

//         int maxi = 0;
//         // Loop through the three activities on the current day
//         for (int i = 0; i <= 2; i++) {
//             if (i != last) {
//                 // Calculate the points for the current activity and recursively
//                 // calculate the maximum points for the previous day
//                 int activity = points[day][i] + f(day - 1, i, points, dp);
//                 maxi = Math.max(maxi, activity); // Update the maximum points
//             }
//         }

//         return dp[day][last] = maxi; // Store and return the result
//     }

//     // Function to find the maximum points for ninja training
//     static int ninjaTraining(int n, int[][] points) {
//         // Initialize a memoization table with -1 values
//         int dp[][] = new int[n][4];
//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         // Start the recursive calculation from the last day (n - 1) with the last activity (3)
//         return f(n - 1, 3, points, dp);
//     }

//     public static void main(String args[]) {
//         // Define the points for each activity on each day
//         int[][] points = {{10, 40, 70},
//                           {20, 50, 80},
//                           {30, 60, 90}};

//         int n = points.length; // Get the number of days
//         System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
//     }
// }


// // unique path without obstacles

// class dp{

//     public static int f(int i, int j, int[][] dp){
//         if(i==0 && j ==0){
//             return 1;
//         }
//         if(i<0||j<0) return 0;
//         if(dp[i][j] !=-1) return dp[i][j];
//         int up = f(i-1,j, dp);
//         int left = f(i,j-1,dp);
//         return dp[i][j] = up + left;
//     }
//     public static int uniquePath(int m , int n){

//         int arr[][] = new int[m][n];

//         for(int i =0;i<m;i++){
//             for(int j =0;j<n;j++){
//                 arr[i][j] = -1;
//             }
//         }

//         return f(m-1, n-1, arr);
         


//     }

//     public static void main(String[] args) {
//         System.out.println(uniquePath(3, 3));
//     }
// }




// unique path 2nd..  here u have dead cells


class dp{



    public static void main(String[] args) {
        
    }
}