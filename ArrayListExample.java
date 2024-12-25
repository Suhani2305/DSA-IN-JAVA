// import java.util.*;
// public class arrayList {

//     public static void main(String[] args) {
//         // JAVA COLLECTION FRAMEWORKS
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list.size());
//         // print the array list
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i));
//         }
//         System.out.println();

        
//     }
    

// }

// // reverse of an array
// import java.util.*;
// public class arrayList {

//     public static void main(String[] args) {
//         // JAVA COLLECTION FRAMEWORKS
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
         
//         for(int i=list.size()-1;i>=0;i--){
//             System.out.print(list.get(i)+"  ");
//         }
//         System.out.println();

        
//     }
    

// }

// find maximum in an arraylist
// import java.util.*;
// public class arrayList {

//     public static void main(String[] args) {
//         // JAVA COLLECTION FRAMEWORKS
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);
//         int max = Integer.MIN_VALUE;
//         for(int i =0;i<list.size();i++){
//             // if(max<list.get(i)){
//             //     max = list.get(i);
//             // }

//             max= Math.max (max, list.get(i));
//         }
//         System.out.println("max element = "+max);
         
        
//     }
    

// }


// // swap 2 number
// // index: idx1 = 1, idx2 = 3
// import java.util.*;
// public class arrayList {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2,temp);
//     }

//     public static void main(String[] args) {
//         // JAVA COLLECTION FRAMEWORKS
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);
//         int idx1 =1, idx2 = 3;
//         System.out.println(list);
//         swap(list, idx1, idx2);
//         System.out.println(list);
//     }
    

// }


// // sorting an arraylist : Collections.sort(), optimised fxn
// /**
//  * arrayList
//  */
// import java.util.*;
// public class arrayList {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);
//         System.out.println("List before Sorting "+list);
//         Collections.sort(list);  // ascending
//         System.out.println("List after Sorting "+list);
//         // descending
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.println(list);
//         // comparator  -- fnx logic




        
//     }

    
// }


// // Multi dimensional ArrayList
// /**
//  * arrayList
//  */
// import java.util.*;
// public class arrayList {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer>list1 = new ArrayList<>();
//         ArrayList<Integer>list2 = new ArrayList<>();
//         ArrayList<Integer>list3 = new ArrayList<>();
      
//          for(int i=1;i<=5;i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);

//          }
//          mainList.add(list1);
//          mainList.add(list2);
//          mainList.add(list3);
//          System.out.println(mainList);
//         //  nested loops
//         for(int i=0; i<mainList.size();i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j =0 ; j<currList.size();j++){
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }


// // container with most water
// // brute force

// import java.util.ArrayList;

// /**
//  * arrayList
//  */
// public class arrayList {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
//         for(int i =0; i<height.size();i++){
//             for(int j = i+1;j<height.size();j++){
//                 int ht = Math.min(height.get(i),height.get(j));
//                 int width = j-i;
//                 int currWater = ht* width;
//                 maxWater =  Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
    // }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));

//     }
// }



// // container with most water  - O(n)
// // 2 pointer approach
// /**
//  * InnerarrayList
//  */
// import java.util.ArrayList;
// public class arrayList {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
//         int lp = 0;
//         int rp =  height.size()-1;
//         while(lp<rp){
//             // calculate water area
//             int ht = Math.min(height.get(lp), height.get(rp));
//             int width = rp-lp;
//             int currWater = ht * width;
//             maxWater = Math.max(maxWater, currWater);

//             // update ptr
//             if(height.get(lp)<height.get(rp)){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return maxWater;

//     }
//     public static void main(String[] args){
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));

//     }

    
// }


// // pair sum 1 - O(n square)
// // find if any pair in a sorted arraylist has a target sum;
// /**
//  * arrayList
//  */
// import java.util.*;
// public class arrayList {
//     public static boolean pairSum1(ArrayList<Integer> list, int target){
//         for(int i=0;i<list.size();i++){
//             for(int j= i+1;j<list.size();j++){
//                 if(list.get(i)+ list.get(j) == target ){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairSum1(list, target));
         

        
//     }

    
// }


// // pair sum 1  
// // 2 pointer approach 
// // o(n)
// /**
//  * arrayList
//  */
// import java.util.*;
// public class arrayList {
//     public static boolean pairSum1(ArrayList<Integer> list, int target){
//        int lp=0;
//        int rp = list.size()-1;
//        while(lp != rp){
//         // case 1
//         if(list.get(lp)+ list.get(rp)==target){
//             return true;
//         }
//         // case 2
//         if(list.get(lp)+ list.get(rp)<target){
//             lp++;
//         }else{
//             // case 3
//             rp--;
//         }
//        }
//        return false;

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairSum1(list, target));
         

        
//     }


    
// }


// // pair sum 2
// // o(n)
// /**
//  * arrayList
//  */
// import java.util.*;

// public class ArrayListExample {
    
//     // Method to find the pair that sums up to the target
//     public static boolean pairSum2(ArrayList<Integer> list, int target) {
//         int n = list.size();
        
//         // Step 1: Find the breaking point where the rotation happens
//         int bp = -1;  // breaking point
//         for (int i = 0; i < n - 1; i++) {
//             if (list.get(i) > list.get(i + 1)) {
//                 bp = i;
//                 break;
//             }
//         }

//         // Step 2: Use two pointers to find the pair that sums to target
//         int left = (bp + 1) % n; // Start at the element after the break
//         int right = bp; // Start at the last element before the break
        
//         // Use two pointers to search for the pair
//         while (left != right) {
//             int sum = list.get(left) + list.get(right);
//             if (sum == target) {
//                 return true;  // Found the pair
//             } else if (sum < target) {
//                 left = (left + 1) % n;  // Move left pointer to the right
//             } else {
//                 right = (right - 1 + n) % n;  // Move right pointer to the left
//             }
//         }
        
//         return false;  // No pair found
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(6);
//         list.add(7);
//         list.add(9);
//         list.add(15);
//         list.add(2);
//         list.add(3);
//         int target = 10;
        
//         System.out.println(pairSum2(list, target)); // Should return true for pair (7, 3)
//     }
// }
