package DSA;
// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         int marks[]= new int[10];
//         // Scanner sc = new Scanner(System.in);
//         System.out.println("Length of an array : " + marks.length);

//         // marks[0]=sc.nextInt();
//         // marks[1]=sc.nextInt();
//         // marks[2]=sc.nextInt();

//         // System.out.println("Phy: "+ marks[0]);
//         // marks[2] = marks[2] + 6;
//         // System.out.println("Che: "+ marks[1]);
//         // System.out.println("Mth: "+ marks[2]);





//     }
// }
    


// import java.util.*;
// public class array {
//     public static void update(int marks[]){
//         for(int i = 0; i<marks.length  ;i++){
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[]={89,67,90};
//         update(marks);

//         for(int i = 0; i<marks.length  ;i++){
//             System.out.print(marks[i] + " ");
//         }
        
//     }

    
// }


// // linear search
// import java.util.*;
// public class array {

//     public static int linearSearch(int n[] ,int key ){
//         for(int i = 0; i<n.length ; i++){
//             if(n[i]== key){
//                 return i ;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int n[]={2,3,4,6,5,7,8,5,0};
//         int key = 5;
//         int index = linearSearch(n, key);
//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("Key is at index : "+ index);
//         }
//     }
    
// }


// // largest number
// import java.util.*;
// /**
//  * array
//  */
// public class array {

//     public static int getLargest(int n[] ){
//         int max = n[0];
//         for(int i = 0; i<n.length ; i++){
//             if(n[i]> max){
//                 max = n[i] ;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int n[]={2,3,4,6,5,7,8,5,0};
//         int index =  getLargest(n);
         
//         System.out.println("Largest value : " + index);
         
//     }
    
// }



// // binary search
// import java.util.*; 
// public class array {
//     public static int binarySearch(int numbers[],int key){
//         int start = 0 , end = numbers.length - 1;
//         while(start<=end){
//             int mid =  (start + end)/2;
//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start =  mid + 1;

//             }else{
//                 end = mid - 1;
//             }

//         }
//         return - 1;
        

//     }
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12,14};
//         int key = 25;
//         System.out.println("Index for key is : " + binarySearch(numbers, key));

//     }

    
// }

// // reverse of an array
// /**
//  * array
//  */
// public class array {
//     public static void reverse(int numbers[]){
//         int first = 0, last = numbers.length -1;
//         while(first<last){
//             int temp =  numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;

//         }


//     }

//     public static void main(String[] args) {
//         int numbers[]={2,3,4,6,8,10};
//         reverse(numbers);
//         for(int i =0; i<numbers.length;i++){
//             System.out.print(numbers[i]+ " ");
//         }

//     }
// }

// // reverse of an array
// class array{
//     public static void reverse(int n[]){
//         int s = 0;
//         int e = n.length - 1;
//         while(s<e){
//             int temp = n[s];
//             n[s] = n[e];
//             n[e] = temp;
//             s++;
//             e--;
//         }
//     }
//     public static void main(String[] args) {
//         int n[] = {2,3,4,5,6,7,8,9};
//         reverse(n);
//         for(int i = 0; i<n.length; i++){
//             System.out.print(n[i] + " ");
    
//     }
//     }
// }



// // pairs in an array
// import java.util.*;
// /**
//  * array
//  */
// public class array {
//     public static void printPairs(int numbers[]){
//         for(int i = 0; i<numbers.length; i++){
//             int curr =  numbers[i];
//             for (int j = i+1 ; j< numbers.length; j++){
//                 System.out.print("(" + curr + "," + numbers[j]+ ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printPairs(numbers);

        
//     }

    
// }


// print subarrayokyy

/**
 * array
//  */
// public class array {

//     public static void printSubarray(int numbers[]){
//         for(int i = 0; i<numbers.length;i++){
//             int start = i;
//             for(int j =i; j<numbers.length;j++){
//                 int end = j;
//                 for(int k = start ; k <= end; k++){
//                     System.out.print(numbers[k]+ " ");

//                 }
//                 System.out.println();
//             }

//         }
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printSubarray(numbers);
//     }
// }

// // // max subarray sum
// public class array {

//     public static void printSubarraySum(int numbers[]){

//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0; i<numbers.length;i++){
//             int start = i;
//             for(int j =i; j<numbers.length;j++){
//                 int end = j;
//                 currSum = 0;
//                 for(int k = start ; k <= end; k++){
//                     currSum += numbers[k];
//                 }
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }

//         }
//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printSubarraySum(numbers);
//     }
// }


// // max subarray sum(prefix sum)
// /**
//  * array
//  */
// public class array {

//     public static void maxSubarraySum(int numbers[]){
//         int currSum = 0;
//         int maxSum =  Integer.MIN_VALUE;
//         int prefix[]=new int [numbers.length];
          

//         // calculate prefix array
//         for(int i = 1; i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+numbers[i];


//         }


//         for(int i =0; i<numbers.length; i++){
//             int start = i;
//             for(int j = i; j<numbers.length; j++){
//                 int end = j;
                 
//                 currSum =  start == 0 ? prefix[end]: prefix[end]-prefix[start-1];
                
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " +maxSum);

//     }
//     public static void main(String[] args) {
//                 int numbers[] = {2,4,6,8,10};
//                 maxSubarraySum(numbers);
//             }
    
// }


// // max subarray sum(kadane's algorithm)

// /**
//  * array
//  */
// public class array {
//     public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i = 0; i<numbers.length; i++){
//             cs =cs +numbers[i];
//             if(cs<0){
//                 cs= 0;
//             }
//             ms = Math.max(cs,ms);

//         }
//         System.out.println("our max subarray sum is : " + ms);
//     }

//     public static void main(String args[]){
//         int numbers[]={-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);
//     }
// }




// // tapping rainwater
// public class array {
    
//     // Method to calculate trapped rainwater using the two-pointer technique
//     public int trap(int[] height) {
//         int n = height.length;
//         if (n == 0) return 0; // Handle edge case where height array is empty
        
//         int left = 0, right = n - 1; // Two pointers: left and right
//         int leftMax = 0, rightMax = 0; // Track the max height on both sides
//         int waterTrapped = 0; // Variable to store the total amount of trapped water

//         // Loop until the two pointers meet
//         while (left <= right) {
//             if (height[left] <= height[right]) {
//                 // If current left height is less than or equal to right height
//                 if (height[left] > leftMax) {
//                     leftMax = height[left]; // Update left max height
//                 } else {
//                     waterTrapped += leftMax - height[left]; // Add trapped water at left
//                 }
//                 left++; // Move the left pointer to the right
//             } else {
//                 // If current right height is smaller than left height
//                 if (height[right] > rightMax) {
//                     rightMax = height[right]; // Update right max height
//                 } else {
//                     waterTrapped += rightMax - height[right]; // Add trapped water at right
//                 }
//                 right--; // Move the right pointer to the left
//             }
//         }
//         return waterTrapped; // Return the total trapped water
//     }

//     public static void main(String[] args) {
//         array solution = new array(); // Instantiate the 'array' class
        
//         // Example input
//         int[] height = {8, 2, 0, 3, 2, 7};
//         System.out.println("Trapped water: " + solution.trap(height)); // Output: 21
//     }
// }



// // buy and sell stock
// import java.util.Scanner; // Import Scanner for input

// public class array {

// //     // Method to calculate the maximum profit from stock prices
//     public int maxProfit(int[] prices) {
//         int buy = prices[0]; // Assume we buy at the first day's price
//         int profit = 0; // Initialize profit to 0

//         for (int i = 1; i < prices.length; i++) { // Start from second day (index 1)
//             if (prices[i] < buy) {
//                 buy = prices[i]; // Update buy to a lower price
//             } else if (prices[i] - buy > profit) {
//                 profit = prices[i] - buy; // Calculate new profit
//             }
//         }
//         return profit; // Return the maximum profit
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create scanner object for user input

//         // Input: number of days (length of prices array)
//         System.out.print("Enter the number of days: ");
//         int n = scanner.nextInt();

//         // Input: stock prices for 'n' days
//         int[] prices = new int[n];
//         System.out.println("Enter stock prices for " + n + " days:");
//         for (int i = 0; i < n; i++) {
//             prices[i] = scanner.nextInt();
//         }

//         // Create an object of the array class to call maxProfit method
//         array solution = new array();
//         int result = solution.maxProfit(prices);

//         // Output the result
//         System.out.println("Maximum profit: " + result);

//         scanner.close(); // Close the scanner object
//     }
// }



class array{
    public static void rainWater(int n[]){
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int leftMaxArr[] = new int[n.length];
        int rightMaxArr[] = new int[n.length];
        
        for(int i =0; i<n.length; i++){
            leftMax = Math.max(leftMax, n[i]);
            leftMaxArr[i] = leftMax;
        }
        for(int i = n.length-1; i>=0; i--){
            rightMax = Math.max(rightMax, n[i]);
            rightMaxArr[i] = rightMax;
        }
        int water = 0;
        for(int i = 0; i<n.length; i++){
            water += Math.min(leftMaxArr[i], rightMaxArr[i]) - n[i];
        }
        System.out.println("Total water trapped : " + water);
    }
    public static void main(String[] args) {
        int n[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        rainWater(n);
    }
}