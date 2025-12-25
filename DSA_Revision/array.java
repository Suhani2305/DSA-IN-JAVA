// package DSA_Revision;

import java.util.*;

// public class array {

//     // Linear Search
//     public static int linearSearch(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     // Largest in an Array
//     public static int largest(int arr[]) {
//         int max = 0;
//         for (int i = 1; i < arr.length; i++) {  // Fixed: loop starts from 1
//             if (arr[i] > arr[max]) {
//                 max = i;
//             }
//         }
//         return arr[max];
//     }

//     // Reverse an Array
//     public static void reverse(int arr[]) {
//         int start = 0, end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     // Binary Search
//     public static int binarySearch(int arr[], int target) {
//         int start = 0, end = arr.length - 1;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             } else if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     // Pairs in an Array
//     public static void pairs(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 System.out.print("(" + arr[i] + "," + arr[j] + ") ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }

//     // Print Each Subarray
//     public static void printSubarray(int arr[], int start, int end) {
//         int totalSubarrays = 0;
//         for (int i = start; i <= end; i++) {
//             for (int j = i; j <= end; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 totalSubarrays++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarrays: " + totalSubarrays);
//     }

//     // Maximum Subarray Sum (Brute Force)
//     public static int maxSubarraySum(int arr[]) {
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += arr[k];
//                 }
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         return maxSum;
//     }

//     // Maximum Subarray Sum (Prefix Sum)
//     public static int maxSubarraySumPrefix(int arr[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length + 1];
//         prefix[0] = 0;
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + arr[i - 1];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int currentSum = prefix[j + 1] - prefix[i];
//                 if (currentSum > maxSum) {
//                     maxSum = currentSum;
//                 }
//             }
//         }
//         return maxSum;
//     }

//     // Maximum Subarray Sum (Kadane's Algorithm)
//     public static int maxSubarraySumKadane(int arr[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             currentSum += arr[i];
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }
//         return maxSum;
//     }

//     // Trapped Rain Water Problem
//     public static int trappedRainWater(int arr[]) {
//         int n = arr.length;
//         int leftMax[] = new int[n];
//         int rightMax[] = new int[n];
//         leftMax[0] = arr[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
//         }
//         rightMax[n - 1] = arr[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
//         }
//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater += waterLevel - arr[i];
//         }
//         return trappedWater;
//     }

//     // Buy and Sell Stock - Max Profit
//     public static int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int i = 0; i < prices.length; i++) {
//             minPrice = Math.min(minPrice, prices[i]);
//             int profit = prices[i] - minPrice;
//             maxProfit = Math.max(maxProfit, profit);
//         }
//         return maxProfit;
//     }

//     // duplicates
//     public static boolean duplicates(int arr[]) {
//         int n = arr.length;
//         for(int i =0; i<n ;i++){
//             for(int j = i+1; j<n ;j++){
//                 if(arr[i] == arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     // three sum
//     public static void threeSum(int[] nums) {
//         Arrays.sort(nums);  // Sort array first
//         int n = nums.length;

//         System.out.println("Triplets that sum to zero:");

//         for (int i = 0; i < n - 2; i++) {

//             // Skip duplicates for i
//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             int left = i + 1;
//             int right = n - 1;

//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (sum == 0) {
//                     // Print the triplet
//                     System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);

//                     left++;
//                     right--;

//                     // Skip duplicates for left
//                     while (left < right && nums[left] == nums[left - 1]) left++;
//                     // Skip duplicates for right
//                     while (left < right && nums[right] == nums[right + 1]) right--;

//                 } else if (sum < 0) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {

//         int arr[] = {112, -2, 30, 92, 150};
//         int target = 5;

//         int index = linearSearch(arr, target);
//         if (index != -1) {
//             System.out.println("Element found at index: " + index);
//         } else {
//             System.out.println("Element not found in the array.");
//         }

//         System.out.println("Largest element in the array: " + largest(arr));

//         System.out.println("Array before reversing: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         reverse(arr);
//         System.out.println("Array after reversing: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         int arr2[] = {1, 3, 4, 5, 6, 7};  // Sorted array for binary search
//         target = 6;
//         int binaryIndex = binarySearch(arr2, target);
//         if (binaryIndex != -1) {
//             System.out.println("Binary search found target at index: " + binaryIndex);
//         } else {
//             System.out.println("Target not found via binary search.");
//         }

//         System.out.println("Pairs in the array: ");
//         pairs(arr);

//         System.out.println("Subarrays in the array: ");
//         printSubarray(arr, 0, arr.length - 1);

//         System.out.println("Maximum subarray sum: " + maxSubarraySum(arr));
//         System.out.println("Maximum subarray sum using prefix sum: " + maxSubarraySumPrefix(arr));
//         System.out.println("Maximum subarray sum using Kadane's algorithm: " + maxSubarraySumKadane(arr));

//         int arr3[] = {4, 2, 0, 6, 3, 2, 5};  // Suitable for trapped rain water
//         System.out.println("Trapped rain water: " + trappedRainWater(arr3));

//         System.out.println("Maximum profit from stock prices: " + maxProfit(arr2));
//         int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 91};
//         if (duplicates(nums)) {
//             System.out.println("Duplicates found in the array.");
//         } else {
//             System.out.println("No duplicates found in the array.");
//         }
//         int nums2[] = {-1, 0, 1, 2, -1, -4};
//         threeSum(nums2);
//         System.out.println("Three sum problem solved.");
//     }
// }


class array{
    public int secondSmallest(int arr[], int n){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];

            }else if(arr[i]<secondMin && arr[i]!=min){
                secondMin = arr[i];
            }
        }
        if(secondMin == Integer.MAX_VALUE){
            return -1;}
        return secondMin;
    }

    public static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int arr[], int n , int k){
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr, 0,n-1);
    }

    public static ArrayList<Integer> printLeaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(max);
        for(int i = n-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;

    }

    public int longestConsecutive(int arr[]){
        int n = arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        int longestStreak = 1;
        int currentStreak = 1;
        for(int i =1; i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }else if(arr[i]==arr[i-1]+1){
                currentStreak++;
            }else{
                currentStreak = 1;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        return longestStreak;
    }


    public void setZeroes(int arr[][], int r, int c){
        boolean row[] = new boolean[r];
        boolean col[] = new boolean[c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;

                }
            }
        }
        for(int i =0;i<r;i++){
            if(row[i]){
                for(int j =0;j<c;j++){
                    arr[i][j] = 0;
                }
            }
        }

        for(int j =0;j<c;j++){
            if(col[j]){
                for(int i =0;i<r;i++){
                    arr[i][j] = 0;
                }
            }
        }
    }

    //Find the repeating and missing numbers
    public static int[] findMissingAndRepeating(int arr[], int n){
        int num[] = new int [2];
        boolean visited[] = new boolean[n+1];
        for(int i =0;i<n;i++){
            if(visited[arr[i]]){
                num[1] = arr[i]; // Repeating number
            }else{
                visited[arr[i]] = true;
            }
        }
        for(int i =1;i<=n;i++){
            if(!visited[i]){
                num[0] = i; // Missing number
                break;
            }
        }   
        return num;

    }


    public static void main(String[] args){
        int arr[] ={3, 5, 6, 7, 8};
        array obj = new array();
        System.out.println(obj.longestConsecutive(arr)); 

        int matrix[][] = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        obj.setZeroes(matrix, 3, 3);
        System.out.println("Matrix after setting zeroes:");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int arr2[] = {1, 2, 1, 4, 5};
        int n = arr2.length;
        int num[] = obj.findMissingAndRepeating(arr2, n);
        System.out.println("Missing number: " + num[0]);
        System.out.println("Repeating number: " + num[1]);
    }
}