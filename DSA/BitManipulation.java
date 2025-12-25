package DSA;
// // bitwise and
// public class BitManipulation {
//     public static void main(String[] args) {
//         System.out.println(5 & 6);                 //bitwise ANd
//         System.out.println(5 | 6);                 //bitwise OR
//         System.out.println(5 ^ 6);                 //bitwise XOR\
//         System.out.println(~ -6);                 //binary one's compliment
//        System.out.println(5<<2);                 //binary one's compliment
//     }

    
// }


// // check if a number is odd and even
// /**
//  * BitManipulation
//  */
// public class BitManipulation {

//     public static void oddOrEven(int n){
//         int bitMask = 1;
//         if((n & bitMask)==0){
//             System.out.println("Even number");
//         }else{
//             System.out.println("Odd number");

//         }
//     }
//     public static void main(String[] args) {
//         oddOrEven(6);
//         oddOrEven(99);
//     }
// }



// // operation perform on bits
// /**
//  * BitManipulation
//  */
// public class BitManipulation {
//     public static int getIthBit(int n,int i){
//         int bitMask=1<<i;
//         if((n & bitMask)==0){
//             return 0;
//         }else{
//             return 1;
//         }
//     }
//     public static int setIthBit(int n,int i){
//         int bitMask=1<<i;
//          return n|bitMask;
//     }
//     public static int ClearIthBit(int n,int i){
//         int bitMask=~(1<<i);
//          return n & bitMask;
//     }
//     public static int updateIthBit(int n,int i,int newBit){
//         // if(newBit ==0){
//         //     return ClearIthBit(n,i);
//         // }
//         // else{
//         //     return setIthBit(n, i);
//         // }

//         n=ClearIthBit(n,i);
//         int bitMask =  newBit<<i;
//         return n|bitMask;
         
//     }

//     public static void main(String[] args) {
//         System.out.println(updateIthBit(10, 2,1));
        
//     }
// }

// clear Last i bits
/**
 * BitManipulation
 */
// public class BitManipulation {
//     public static int clearIBit(int n, int i){
//         int bitMask = (~0)<<i;
//         return n & bitMask;

//     }

//     public static void main(String[] args) {
//         System.out.println(clearIBit(15, 2));
        
//     }
// }


// // clear range of bits
// public class BitManipulation {
//     public static int clearRangeOfBit(int n, int i,int j){
//         int a =((~0)<<(j+1));
//         int b = (1<<i)-1;
//         int bitMask = a|b;
//         return n&bitMask;



//     }

//     public static void main(String[] args) {
//         System.out.println(clearRangeOfBit(10 , 2,4));
        
//     }
// }

// // check if a number is a power of 2 or not
// /**
//  * BitManipulation
//  */
// public class BitManipulation {
//     public static boolean isPowerOfTwo(int n){
//         return ((n&(n-1)) == 0);
//     }

//     public static void main(String[] args) {
//         System.out.println(isPowerOfTwo(16));
//     }
// }




// // count set bits in a number 
// public class BitManipulation {
//     public static int countSetBits(int n){
//         int count = 0;
//         while(n>0){
//             if((n&1)!=0){  //check our LSB
//                 count++;
//             }
//             n=n>>1;

//         }
//         return count;
//     }


//     public static void main(String[] args) {
//         System.out.println(countSetBits(15));
//     }
// }


// // Fast exponentiation
// /**
//  * BitManipulation
//  */
// public class BitManipulation {

//     public static int fastExpo(int a, int n){
//         int ans =1;
//         while(n>0){
//             if((n&1)!=0){      //check LSB
//                 ans = ans*a;
//             }
//             a=a*a;
//             n=n>>1;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(fastExpo(5, 4));
        
//     }
// }