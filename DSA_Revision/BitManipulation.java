 

// public class BitManipulation {
//     // Function to check if a number is even or odd using bitwise operator
//     public static boolean isEven(int n) {
//         int mask = 1;
//         if((n & mask) == 0) {
//             return true; // Even
//         } else {
//             return false; // Odd
//         }

//     }

//     // decimal to binary conversion using bitwise operator
//     public static String decimalToBinary(int n){
//         String binary = "";
//         while(n > 0){
//             int bit = n & 1; // Get the last bit
//             binary = bit + binary; // Append to the binary string
//             n = n >> 1; // Right shift to process the next bit
//         }
//         return binary;
//     }
//     // decimal to binary conversion using recursion
//     public static String decimalToBinaryRecursion(int n){
//         if(n == 0){
//             return "";
//         }
//         return decimalToBinaryRecursion(n >> 1) + (n & 1);
//     }

//     // binary to decimal conversion using bitwise operator
//     public static int binaryToDecimal(String binary){
//         int decimal = 0;
//         int base = 1; // 2^0
//         for(int i = binary.length() - 1; i >= 0; i--){
//             if(binary.charAt(i) == '1'){
//                 decimal += base;
//             }
//             base *= 2; // Increase the base (2^i)
//         }
//         return decimal;
//     }

//     // get ith bit of a number using bitwise operator
//     public static int getIthBit(int n, int i) {
//         int mask = 1<<i; // Create a mask with 1 at the ith position
//         return (n & mask) >> i; // Shift the result to the right by i places
//     }

//     // set ith bit of a number using bitwise operator
//     public static int setIthBit(int n, int i) {
//         int mask = 1 << i; // Create a mask with 1 at the ith position
//         return n | mask; // Set the ith bit to 1
//     }

//     // clear ith bit of a number using bitwise operator
//     public static int clearIthBit(int n, int i) {
//         int mask = ~(1 << i); // Create a mask with 0 at the ith position
//         return n & mask; // Clear the ith bit to 0
//     }

//     //update ith bit of a number using bitwise operator
//     public static int updateIthBit(int n, int i, int value) {
//         if(value == 0){
//             return clearIthBit(n, i); // Clear the ith bit to 0
//         }else{
//             return setIthBit(n, i); // Set the ith bit to 1
//         }
//     }

//     // clear last ith bits of a number using bitwise operator
//     public static int clearLastBits(int n, int i) {
//         int mask = (1 << i) - 1; // Create a mask with i bits set to 1
//         return n & mask; // Clear the last i bits to 0
//     }


//     //clear range of bits from i to j using bitwise operator
//     public static int clearRangeOfBits(int n, int i, int j){
//         int mask1 = ~(1 << (j+1)); // Create a mask with 0s from i to j
//         int mask2 = (1 << (i-1)) - 1; // Create a mask with 1s before i
//         int mask = mask1 | mask2; // Combine the masks
//         return n & mask; // Clear the range of bits from i to j to 0        
//     }

//     // check if a number is power of 2 or not
//     public static boolean isPowerOfTwo(int n) {
//         return (n>0 &&(n&(n-1))==0); // A number is a power of 2 if it has only one bit set
//     }

//     //count number of 1s in binary
//     public static int countSetBits(int n) {
//         int count = 0;
//         while(n > 0) {
//             count += (n & 1); // Increment count if the last bit is 1
//             n >>= 1; // Right shift to process the next bit
//         }
//         return count;
//     }

//     //Subsets of an Array Using Bitmasking
//     public static void printAllSubsets(int[] arr){
//         int n = arr.length;
//         int total = 1<<n;
//         for(int i=0;i<total;i++){
//             System.out.print("{ ");
//             for(int j =0; j<n;j++){
//                 if((i&(i<<j))!=0){
//                     System.out.print(arr[j] + " ");
//                 }
//             }
//             System.out.print("} ");
//         }
//     }
//     //clear lowest set bit
//     public static int clearLowestSetBit(int n) {
//         return n & (n - 1); // Clear the lowest set bit using bitwise AND
//     }

//     //find two unique numbers 
//     public static void findTwoUniqueNumbers(int[] arr){
//         int xor =0;
//         for(int num: arr){
//             xor = xor ^ num; // XOR all elements to get the XOR of the two unique numbers
//         }
//         int rightmostSetBit = xor & -xor; // Get the rightmost set bit
//         int num1 = 0, num2 = 0;
//         for(int num: arr){
//             if((num & rightmostSetBit) == 0){
//                 num1 ^= num; // XOR numbers with the rightmost set bit as 0
//             }else{
//                 num2 ^= num; // XOR numbers with the rightmost set bit as 1
//             }
//         }
//         System.out.println("Unique numbers are: " + num1 + " and " + num2);
//     }

//     // fast exponentiation using bitwise operator
//     public static int fastExponentiation(int base, int exponent) {
//         int result = 1;
//         while(exponent >0){
//             if((exponent % 2)==1){
//                 result = result * base; // Multiply the result by the base if the exponent is odd
//             }
//             base = base * base; // Square the base
//             exponent = exponent /2; // Right shift the exponent by 1 bit
//         }
//         return result;
//     }


//     //Convert uppercase characters to lowercase using bits
//     public static String convertToLowerCase(String str){
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch >= 'A' && ch <= 'Z'){
//                 ch = (char)(ch | (1 << 5)); // Set the 6th bit to convert to lowercase
//             }
//             sb.append(ch); // Append the character to the result
//         }
//         return sb.toString(); // Return the final string
//     }

//     //Convert lowercase characters to uppercase using bits
//     public static String convertToUpperCase(String str){
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch >= 'a' && ch <= 'z'){
//                 ch = (char)(ch & ~(1 << 5)); // Clear the 6th bit to convert to uppercase
//             }
//             sb.append(ch); // Append the character to the result
//         }
//         return sb.toString(); // Return the final string
//     }
 

//     public static void main(String[] args){
//         int num = 686545765;
//         System.out.println("Decimal to Binary: " + decimalToBinary(num));
//         if(isEven(num)){
//             System.out.println(num + " is even.");
//         }else{
//             System.out.println(num + " is odd.");
//         }
//         System.out.println("Ith bit: " + getIthBit(num, 5));
//         System.out.println("Set ith bit: " + setIthBit(num, 5));
//         System.out.println("Clear ith bit: " + clearIthBit(num, 5));
//         System.out.println("Update ith bit: " + updateIthBit(num, 5, 1));
//         System.out.println("Clear last ith bits: " + clearLastBits(num, 5));
//         System.out.println("Clear range of bits from i to j: " + clearRangeOfBits(num, 1, 5));
//         System.out.println("Is power of 2: " + isPowerOfTwo(num));
//         System.out.println("Count of set bits: " + countSetBits(num));
//         int arr[]={1,1,2,3,3,4,4,5,5,6,6,7};
//         findTwoUniqueNumbers(arr);
//         System.out.println("Fast Exponentiation: " + fastExponentiation(2, 10));
//         System.out.println("Convert to lowercase: " + convertToLowerCase("HELLO WORLD"));
//         System.out.println("Convert to uppercase: " + convertToUpperCase("hello world"));
        
        

//     }
    
// }


class BitManipulation{
    //swap two numbers using bitwise operator
    public static void swap(int a, int b){
        a = a ^ b; // Step 1: XOR a and b
        b = a ^ b; // Step 2: XOR the result with b to get original a
        a = a ^ b; // Step 3: XOR the result with new b to get original b
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    //check ith bit is set or not
    public static boolean isIthBitSet(int n, int i){
        return (n & (1<<i))!=0;
    }
    //set ith bit of a number
    public static int setIthBit(int n, int i){
        return n|(1<<i);
    }

    //clear ith bit of a number
    public static int clearIthBit(int n, int i){
        return n & ~(1<<i);
    }

    //toggle ith bit of a number
    public static int toggleIthBit(int n, int i){
        return n ^ (1 << i);
    }

    //remove the last set bit of a number
    public static int removeLastSetBit(int n) {
        return n & (n - 1);  
    }

     //check if a number is even or odd using bitwise operator
    public static boolean isEven(int n) {
        return (n & 1) == 0;  
    }
    //check is number is power of 2 or not
    public static boolean isPowerOfTwo(int n) {
        return (n > 0 && (n & (n - 1)) == 0);  
    }

    //count number of set bits in a number`
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);  
            n >>= 1;  
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap(a, b); // Call the swap method
        System.out.println("Is 2nd bit of 5 set? " + isIthBitSet(5,     1)); // Check if the 2nd bit of 5 is set
        System.out.println("Setting 2nd bit of 5: " + setIthBit(5, 1)); // Set the 2nd bit of 5
        System.out.println("Clearing 2nd bit of 5: " + clearIthBit(5, 1)); // Clear the 2nd bit of 5
        System.out.println("Toggling 2nd bit of 5: " + toggleIthBit(5, 1)); // Toggle the 2nd bit of 5
        System.out.println("Removing last set bit of 5: " + removeLastSetBit(6)); // Remove the last set bit of 5
        System.out.println("Is 7 even? " + isEven(7)); // Check if 6 is even
        System.out.println("Is 8 a power of 2? " + isPowerOfTwo(8)); // Check if 8 is a power of 2
        System.out.println("Count of set bits in 6: " + countSetBits(6)); // Count the number of set bits in 6
        System.out.println("Count of set bits in 7: " + countSetBits(7)); // Count the number of set bits in 7
    }
}