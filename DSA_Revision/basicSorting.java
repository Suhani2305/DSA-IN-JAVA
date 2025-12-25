 

// import java.util.*;
// class basicSorting{
//     //bubble sort
//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for (int i = 0; i < n-1; i++){
//             for (int j = 0; j < n-i-1; j++){
//                 if (arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//     }

//     // selection sort
//     public static void selectionSort(int arr[]){
//         int n = arr.length;
//         for(int i = 0; i < n-1; i++){
//             int minIndex =i;
//             for(int j = i+1; j < n; j++){
//                 if(arr[j] < arr[minIndex]){
//                     minIndex = j;
//                 }
//             }
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }

//     }

//     //insertion sort
//     public static void insertionSort(int arr[]){
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int key = arr[i];
//             int j = i - 1;
//             while (j >= 0 && key < arr[j]) {
//                 //shifting elements to the right
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             //insertion of key
//             arr[j + 1] = key;
//         }
//     }

//     //counting sort
//     public static void countingSort(int arr[], int n, int exp) {
//         int output[] = new int[n];
//         int count[] = new int[10];
//         Arrays.fill(count, 0);
//         for (int i = 0; i < n; i++) {
//             count[(arr[i] / exp) % 10]++;
//         }
//         for (int i = 1; i < 10; i++) {
//             count[i] += count[i - 1];
//         }
//         for (int i = n - 1; i >= 0; i--) {
//             output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//             count[(arr[i] / exp) % 10]--;
//         }
//         for (int i = 0; i < n; i++) {
//             arr[i] = output[i];
//         }

//     }
    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
        
//         // bubbleSort(arr);
//         // selectionSort(arr);
//         // insertionSort(arr);6

//         // Arrays.sort(arr); // Using built-in sort for simplicity
//         // Arrays.sort(arr, Collections.reverseOrder()); // Sort in descending order
//         // its is work on object array only..it is used internal comparator
//         countingSort(arr, n, 1);
        
//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }











// Java program to Count Inversions in an array using merge sort

// import java.util.*;

// class  basicSorting {

//     // This function merges two sorted subarrays arr[l..m] and arr[m+1..r] 
//     // and also counts inversions in the whole subarray arr[l..r]
//     static int countAndMerge(int[] arr, int l, int m, int r) {
      
//         // Counts in two subarrays
//         int n1 = m - l + 1, n2 = r - m;

//         // Set up two arrays for left and right halves
//         int[] left = new int[n1];
//         int[] right = new int[n2];
//         for (int i = 0; i < n1; i++)
//             left[i] = arr[i + l];
//         for (int j = 0; j < n2; j++)
//             right[j] = arr[m + 1 + j];

//         // Initialize inversion count (or result)
//         // and merge two halves
//         int res = 0;
//         int i = 0, j = 0, k = l;
//         while (i < n1 && j < n2) {

//             // No increment in inversion count
//             // if left[] has a smaller or equal element
//             if (left[i] <= right[j])
//                 arr[k++] = left[i++];
          
//             // If right is smaller, then it is smaller than n1-i 
//             // elements because left[] is sorted
//             else {
//                 arr[k++] = right[j++];
//                 res += (n1 - i);
//             }
//         }

//         // Merge remaining elements
//         while (i < n1)
//             arr[k++] = left[i++];
//         while (j < n2)
//             arr[k++] = right[j++];

//         return res;
//     }

//     // Function to count inversions in the array
//     static int countInv(int[] arr, int l, int r) {
//         int res = 0;
//         if (l < r) {
//             int m = (r + l) / 2;

//             // Recursively count inversions
//             // in the left and right halves
//             res += countInv(arr, l, m);
//             res += countInv(arr, m + 1, r);

//             // Count inversions such that greater element is in 
//             // the left half and smaller in the right half
//             res += countAndMerge(arr, l, m, r);
//         }
//         return res;
//     }

//     static int inversionCount(int[] arr) {
//         return countInv(arr, 0, arr.length - 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 3, 2, 1};
//         System.out.println(inversionCount(arr));
//     }
// }



//selection sort
import java.util.*;
public class basicSorting{
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min =j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,87};
        // selectionSort(arr);
        bubbleSort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    }
     