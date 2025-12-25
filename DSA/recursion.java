package DSA;
// // print number in decreasing order
// public class recursion {
//     public static void printDec(int n){
//         if(n==1){
//             System.out.print(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n-1);
        
//     }
//     public static void main(String[] args) {
//         int n=10;
//         printDec(n);
        
//     }
// }


// // print number in increasing order
// public class recursion {
//     public static void printInc(int n){
//         if(n==1){
//             System.out.print(n+" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n + " ");
        
//     }
//     public static void main(String[] args) {
//         int n=5;
//         printInc(n);

      
        
//     }
// }


// // print factorial of n numbers
// public class recursion {
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n* fact(n-1);
//         return fn;
         
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n));   
//     }
// }



// // sum of n natural numbers
// /**
//  * recursion
//  */
// public class recursion {
//     public static int sumOfN(int n){
//         if(n==1){
//             return n;
//         }
//         int snm1 = sumOfN(n-1);
//         int sn = n + snm1;
//         return sn;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sumOfN(n));
        
//     }
// }




// // print the fibonacci number
// /**
//  * recursion
//  */
// public class recursion {
//     public static int fibo(int n){
//         if(n == 0  || n==1){
//             return n;
//         }
//         else{
//             return fibo(n-1)+fibo(n-2);
//         }
//     //     int fnm1 = fibo(n-1);
//     //     int fnm2 = fibo(n-2);
//     //     int fn = fnm1 + fnm2;
//     //     return fn;
//     }

//     public static void main(String[] args) {
//         int n = 25;
//         System.out.println(fibo(n));
        
//     }
// }


// o(2power n)


// // check if array is sorted or not
// /**
//  * recursion
//  */
// public class recursion {
//     public static boolean isSorted(int arr[], int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;

//         }
//         return isSorted(arr, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[]={2,1,2,3,4,5};
//         System.out.println(isSorted(arr, 0));
        
//     }
// }





// // first occurence
// /**
//  * recursion
//  */
// public class recursion {
//     public static int  firstOcc(int arr[],int key,int i){
//         if(i==arr.length){
//             return -1;

//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return firstOcc(arr, key, i+1);


//     }

    
//     public static void main(String[] args) {
//         int arr[]={8,3,6,9,5,10,2,5,3};
//         System.out.println(firstOcc(arr, 5, 0));
//     }
// }


// // last occurence
// public class recursion {
//     public static int  LastOcc(int arr[],int key,int i){
//         if(i==arr.length){
//             return -1;

//         }
//         int isFound = LastOcc(arr, key, i+1);
//         if(isFound!= -1){
//             return isFound;
//         }

//         // check with self
//         if(arr[i]==key){
//             return i;
//         }
//         return isFound;

//     }

    
//     public static void main(String[] args) {
//         int arr[]={8,3,6,9,5,10,2,5,3};
//         System.out.println(LastOcc(arr, 5, 0));
//     }
// }


// print x to the power n
/**
 * recursion
 */
// public class recursion {
//     public static int power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         int xnm1=power(x, n-1);
//         int xn = x*xnm1;
//         return xn;
//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 10));
        
//     }
// }


// // optimized way to calculate power of n   in   O(logn)
// public class recursion {
//     public static int power(int a, int n){
//         if(n==0){
//             return 1;
//         }
//         int halfPower = power(a, n/2);
//         int halfPowerSq = halfPower * halfPower; 
//         //n is odd
//         if(n%2==1){
//             halfPowerSq = a*halfPowerSq;
//         }
//         return halfPowerSq;

//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 5));
        
//     }
// }



// // tiling problem
//  /**
//   * recursion
//   */
//  public class recursion {
//     public static int tilingProblem(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         // kaam
//         // vertical tiles
//         int fnm1 = tilingProblem(n-1);
//         // horizontal tiles
//         int fnm2 = tilingProblem(n-2);
//         int totways = fnm1 + fnm2;
//         return totways; 
//     }
 
    
//     public static void main(String[] args) {
//         System.out.println(tilingProblem(5));
        

//     }
//  }


// // remove duplicates in a String
// /**
//  * recursion
//  */
// public class recursion {
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//         if(idx ==  str.length()){
//             System.out.println(newStr);
//             return;
//         }
//         // kaam
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a']== true){
//             // duplicate
//             removeDuplicates(str, idx+1, newStr, map);
//         }else{
//             map[currChar-'a'] = true;
//             removeDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
         
        
//     }
// }



// // friends pairing problem
// /**
//  * recursion
//  */
// public class recursion {
//     public static int friendsPairing(int n){
//         // base case
//         if(n==1 || n==2){
//             return n;

//         }

//         // choices
//         // single
//         int fnm1 = friendsPairing(n-1);
//         // pair
//         int fnm2 = friendsPairing(n-2);
//         int pairWays = (n-1)*fnm2;
//         // total ways
//         int totways = fnm1 + pairWays;
//         return totways;
//     }

//     public static void main(String[] args) {
//         System.out.println(friendsPairing(3));
        
//     }
// }


// // binary string problem 
// /**
//  * recursion
//  */
public class recursion {
    public static void printBinString(int n,int lastPlace,  String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinString(n-1, 0, str + "0");  
        if(lastPlace==0){
            printBinString(n-1, 1, str +"1");
        }

    }

    public static void main(String[] args) {

        printBinString(3, 0, "");
    }
}


