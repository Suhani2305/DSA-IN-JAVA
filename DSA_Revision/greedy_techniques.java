
import java.util.ArrayList;
// public class greedy_techniques {
    
//     public static void activitySelection(int start[], int finish[], int n){
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         maxAct = 1;
//         ans.add(0);
//         int prevFinish = finish[0];
//         for(int i = 1; i < n; i++){
//             if(start[i] >= prevFinish){
//                 maxAct++;
//                 ans.add(i);
//                 prevFinish = finish[i];
//             }
//         }
//         System.out.println("Maximum number of activities: " + maxAct);
//         for(int i = 0; i < ans.size(); i++){
//             System.out.print("A"+ans.get(i) + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int finish[] = {2, 4, 6, 7, 9, 9};
//         int n = start.length;
//         activitySelection(start, finish, n);


        
//     }
// }



//fractional knapsack
// import java.util.Arrays;
// class greedy_techniques{
//     public static void fractionalKnapsack(int weight[], int value[], int capacity){
//         int[] ratio = new int[weight.length];
//         for(int i = 0; i < weight.length; i++){
//             ratio[i] = value[i] / weight[i];
//         }
//         // Sort the items based on value/weight ratio
//         Integer[] indices = new Integer[weight.length];
//         for(int i = 0; i < weight.length; i++){
//             indices[i] = i;
//         }
//         Arrays.sort(indices, (a, b) -> Double.compare((double)value[b] / weight[b], (double)value[a] / weight[a]));
//         double totalValue = 0;
//         for(int i = 0; i < weight.length; i++){
//             if(capacity == 0){
//                 break;
//             }
//             int index = indices[i];
//             if(weight[index] <= capacity){
//                 totalValue += value[index];
//                 capacity -= weight[index];
//             } else {
//                 totalValue += (double)value[index] / weight[index] * capacity;
//                 capacity = 0;
//             }
//         }
//         System.out.println("Maximum value in knapsack = " + totalValue);
//         }
//     public static void main(String[] args) {
//         int weight[] = {10, 20, 30};
//         int value[] = {60, 100, 120};
//         int capacity = 50;
//         fractionalKnapsack(weight, value, capacity);
//     }
// }


// //minimum absolute difference pair
// import java.util.Arrays;
// class greedy_techniques{
//      public static void minAbsDiff(int arr1[], int arr2[]){
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         int n = arr1.length;
//         int m = arr2.length;
//         int i = 0, j = 0;
//         int minDiff = Integer.MAX_VALUE;
//         int ans1 = 0, ans2 = 0;
//         while(i < n && j < m){
//             int diff = Math.abs(arr1[i] - arr2[j]);
//             if(diff < minDiff){
//                 minDiff = diff;
//                 ans1 = arr1[i];
//                 ans2 = arr2[j];
//             }
//             if(arr1[i] < arr2[j]){
//                 i++;
//             } else {
//                 j++;
//             }
//         }
//         System.out.println("Minimum absolute difference pair: (" + ans1 + ", " + ans2 + ")");
//         System.out.println("Minimum absolute difference: " + minDiff);
        
//     }
//     public static void main(String[] args) {
//         int arr1[] = {1, 3, 15, 11, 2};
//         int arr2[] = {23, 127, 235, 19, 8};
//         minAbsDiff(arr1, arr2);
//     }
// }


// // maximum length chain of pairs
// import java.util.Arrays;
// class greedy_techniques{
//     public static void maxChainLength(int arr[][]){
//         Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//         int n = arr.length;
//         int maxLength = 1;
//         int prevEnd = arr[0][1];
//         for(int i = 1; i < n; i++){
//             if(arr[i][0] > prevEnd){
//                 maxLength++;
//                 prevEnd = arr[i][1];
//             }
//         }
//         System.out.println("Maximum length of chain of pairs: " + maxLength);
//     }
//     public static void main(String[] args) {
//         int arr[][] = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}};
//         maxChainLength(arr);
//     }
// }


// //indian coin change problem
import java.util.Arrays;
// class greedy_techniques{
//     public static void coinChange(int coins[], int amount){
//         Arrays.sort(coins);
//         int count = 0;
//         for(int i = coins.length - 1; i >= 0; i--){
//             while(amount >= coins[i]){
//                 amount -= coins[i];
//                 count++;
//             }
//         }
//         System.out.println("Minimum number of coins needed: " + count);
//     }
//     public static void main(String[] args) {
//         int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
//         int amount = 5925953;
//         coinChange(coins, amount);
//     }
// }

//job sequencing problem
import java.util.Arrays;
class greedy_techniques{
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void jobSequencing(Job arr[], int n){
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        boolean result[] = new boolean[n];
        int job[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = Math.min(n, arr[i].deadline) - 1; j >= 0; j--){
                if(!result[j]){
                    result[j] = true;
                    job[j] = arr[i].id;
                    break;
                }
            }
        }
        System.out.println("Jobs done: ");
        for(int i = 0; i < n; i++){
            if(result[i]){
                System.out.print(job[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Job arr[] = {new Job(1, 2, 100), new Job(2, 1, 19), new Job(3, 2, 27), new Job(4, 1, 25), new Job(5, 3, 15)};
        int n = arr.length;
        jobSequencing(arr, n);
    }
}