

//     // Method to find the maximum crossing subarray
//     public static int[] findMaxCrossingSubarray(int[] arr, int low, int mid, int high) {
//         int leftSum = Integer.MIN_VALUE;
//         int sum = 0;
//         int maxLeft = mid;

//         // Traverse the left part from mid to low
//         for (int i = mid; i >= low; i--) {
//             sum += arr[i];
//             if (sum > leftSum) {
//                 leftSum = sum;
//                 maxLeft = i;
//             }
//         }

//         int rightSum = Integer.MIN_VALUE;
//         sum = 0;
//         int maxRight = mid + 1;

//         // Traverse the right part from mid + 1 to high
//         for (int j = mid + 1; j <= high; j++) {
//             sum += arr[j];
//             if (sum > rightSum) {
//                 rightSum = sum;
//                 maxRight = j;
//             }
//         }

//         // Return the maximum subarray crossing the midpoint
//         return new int[]{maxLeft, maxRight, leftSum + rightSum};
//     }

//     // Method to find the maximum subarray using divide-and-conquer
//     public static int[] findMaximumSubarray(int[] arr, int low, int high) {
//         if (low == high) {
//             return new int[]{low, high, arr[low]};
//         } else {
//             int mid = (low + high) / 2;

//             // Recursively find maximum subarray on the left and right sides
//             int[] leftResult = findMaximumSubarray(arr, low, mid);
//             int[] rightResult = findMaximumSubarray(arr, mid + 1, high);
//             int[] crossResult = findMaxCrossingSubarray(arr, low, mid, high);

//             // Compare the three results and return the maximum one
//             if (leftResult[2] >= rightResult[2] && leftResult[2] >= crossResult[2]) {
//                 return leftResult;
//             } else if (rightResult[2] >= leftResult[2] && rightResult[2] >= crossResult[2]) {
//                 return rightResult;
//             } else {
//                 return crossResult;
//             }
//         }
//     }

//     // Main method to test the function
//     public static void main(String[] args) {
//         int[] arr = {2, -1, 3, 5, -2, 4, -1, 2};
//         int[] result = findMaximumSubarray(arr, 0, arr.length - 1);
//         System.out.println("Maximum Subarray: ");
//         System.out.println("Left Index: " + result[0] + ", Right Index: " + result[1] + ", Sum: " + result[2]);
//     }
// }


// class divide{
//     public static int[][] add(int[][]a, int [][]b){
//         int n = a.length;
//         int[][] result = new int[n][n];
//         for(int i =0;i<n;i++){
//             for(int j =0;j<n;j++){
//                 result[i][j] = a[i][j] + b[i][j];
//             }
//         }
//         return result;
//     }
//     public static int[][] subtract(int[][]a, int [][]b){
//         int n = a.length;
//         int[][] result = new int[n][n];
//         for(int i =0;i<n;i++){
//             for(int j =0;j<n;j++){
//                 result[i][j] = a[i][j] - b[i][j];
//             }
//         }
//         return result;
//     }

//     public static int[][] strassenMultiply(int [][]a , int[][]b){
//         int n = a.length;
//         if(n == 1){
//             int[][] result = new int[1][1];
//             result[0][0] = a[0][0] * b[0][0];
//             return result;
//         }
//         int mid = n/2;
//         int[][] a11 = new int[mid][mid];
//         int[][] a12 = new int[mid][mid];
//         int[][] a21 = new int[mid][mid];
//         int[][] a22 = new int[mid][mid];
//         int[][] b11 = new int[mid][mid];
//         int[][] b12 = new int[mid][mid];
//         int[][] b21 = new int[mid][mid];
//         int[][] b22 = new int[mid][mid];

//         for(int i =0;i<mid;i++){
//             for(int j=0;j<mid;j++){
//                 a11[i][j] = a[i][j];
//                 a12[i][j] = a[i][j+mid];
//                 a21[i][j] = a[i+mid][j];
//                 a22[i][j] = a[i+mid][j+mid];
//                 b11[i][j] = b[i][j];
//                 b12[i][j] = b[i][j+mid];
//                 b21[i][j] = b[i+mid][j];
//                 b22[i][j] = b[i+mid][j+mid];
//             }
//         }
//         int[][] m1 = strassenMultiply(add(a11, a22), add(b11, b22));
//         int[][] m2 = strassenMultiply(add(a21, a22), b11);  
//         int[][] m3 = strassenMultiply(a11, subtract(b12, b22));
//         int[][] m4 = strassenMultiply(a22, subtract(b21, b11));
//         int[][] m5 = strassenMultiply(add(a11, a12), b22);
//         int[][] m6 = strassenMultiply(subtract(a21, a11), add(b11, b12));
//         int[][] m7 = strassenMultiply(subtract(a12, a22), add(b21, b22));

//         int[][] c11 = add(subtract(add(m1, m4), m5), m7);
//         int[][] c12 = add(m3, m5);
//         int[][] c21 = add(m2, m4);
//         int[][] c22 = add(subtract(add(m1, m3), m2), m6);

//         int[][] result = new int[n][n];
//         for(int i =0;i<mid;i++){
//             for(int j=0;j<mid;j++){
//                 result[i][j] = c11[i][j];
//                 result[i][j+mid] = c12[i][j];
//                 result[i+mid][j] = c21[i][j];
//                 result[i+mid][j+mid] = c22[i][j];
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int[][] a = {
//             {1, 2},
//             {3, 4}
//         };
//         int[][] b = {
//             {5, 6},
//             {7, 8}
//         };
//         int[][] result = strassenMultiply(a, b);
//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[i].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// // merge sort
// class Divide {
//     public void merge_function(int[] arr, int l, int r, int m) {
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         int[] arr1 = new int[n1];
//         int[] arr2 = new int[n2];

//         for (int i = 0; i < n1; i++) {
//             arr1[i] = arr[l + i];
//         }
//         for (int j = 0; j < n2; j++) {
//             arr2[j] = arr[m + 1 + j];
//         }

//         int i = 0; // start from 0, not 1
//         int j = 0;
//         int k = l;

//         while (i < n1 && j < n2) {
//             if (arr1[i] < arr2[j]) {
//                 arr[k++] = arr1[i++];    
//             } else {
//                 arr[k++] = arr2[j++];     
//             }
//         }

//         // Copy remaining elements of arr1 if any
//         while (i < n1) {
//             arr[k++] = arr1[i++]; 
//         }

//         // Copy remaining elements of arr2 if any
//         while (j < n2) {
//             arr[k++] = arr2[j++];
//         }
//     }

//     public void merge_sort(int[] arr, int l, int r) {
//         if (l < r) {
//             int m = (l + r) / 2;
//             merge_sort(arr, l, m);
//             merge_sort(arr, m + 1, r);
//             merge_function(arr, l, r, m);
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 11, 13, 5, 6, 7};
//         Divide obj = new Divide();
//         obj.merge_sort(arr, 0, arr.length - 1);
//         System.out.println("Sorted array: ");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }


// public class Divide {

//     // This function takes the last element as pivot,
//     // places it at its correct sorted position,
//     // and places all smaller elements to the left of the pivot
//     // and all larger elements to the right.
//     public int quick_function(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1; // Index of smaller element
        
//         for (int j = low; j < high; j++) {
//             if (arr[j] < pivot) {
//                 i++;
//                 // Swap arr[i] and arr[j]
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
        
//         // Swap the pivot element to its correct position
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;

//         return i + 1; // Return the partition index
//     }

//     // The main function that implements QuickSort
//     public void quick_sort(int[] arr, int low, int high) {
//         if (low < high) {
//             // Partitioning index
//             int mid = quick_function(arr, low, high);

//             // Recursively sort elements before and after partition
//             quick_sort(arr, low, mid - 1);
//             quick_sort(arr, mid + 1, high);
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 11, 13, 5, 6, 7};
//         Divide obj = new Divide();
//         obj.quick_sort(arr, 0, arr.length - 1);
//         System.out.println("Sorted array: ");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }

import java.util.Random;

public class RandomizedQuickSort {

    // Function to perform the partitioning of the array
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot element at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partitioning index
        return i + 1;
    }

    // Randomized partition function
    public int randomizedPartition(int[] arr, int low, int high) {
        // Generate a random index between low and high
        Random rand = new Random();
        int randomIndex = low + rand.nextInt(high - low + 1);

        // Swap the pivot with the random index
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[high];
        arr[high] = temp;

        // Call the normal partitioning process
        return partition(arr, low, high);
    }

    // The main function that implements Randomized QuickSort
    public void randomizedQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get the partitioning index
            int q = randomizedPartition(arr, low, high);

            // Recursively sort elements before and after partition
            randomizedQuickSort(arr, low, q - 1);
            randomizedQuickSort(arr, q + 1, high);
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        RandomizedQuickSort obj = new RandomizedQuickSort();
        obj.randomizedQuickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
