 

// public class Recursion2 {
//     //tiling problem
//     public static int tilingProblem(int n){
//         if(n==0||n==1){
//             return 1;
//         }
//         return tilingProblem(n-1)+tilingProblem(n-2);
//     }



import java.util.*;
public class Recursion2{
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        return tilingProblem(n-1)+tilingProblem(n-2);
    }

    // remove duplicate from string
    public static String remove(String str, int index , StringBuilder newstr, boolean[] map){
        if(index == str.length()){
            return newstr.toString();
        }
        char curr = str.charAt(index);
        if(map[curr -'a']== true){
            return remove(str, index+1, newstr, map);
        }else{
            map[curr -'a']=true;
            return remove(str, index+1, newstr.append(curr), map);
        }
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}

//     //remove duplicates from string
//     public static String removeDuplicates(String str, int indx, StringBuilder newStr, boolean[] map){
//         if(indx == str.length()){
//             return newStr.toString();
//         }
//         char currentChar = str.charAt(indx);
//         if( map[currentChar -'a']==true){
//             return removeDuplicates(str, indx+1, newStr, map);
//         }else{
//             map[currentChar -'a']=true;
//             return removeDuplicates(str, indx+1, newStr.append(currentChar), map);
//         }
//     }

//     //friend pairing problem
//     public static int friendPairing(int n){
//         if(n==0||n==1||n==2){
//             return n;
//         }
//         return friendPairing(n-1)+friendPairing(n-2)*(n-1);
//     }

//     //binary string problem  paytm
//     public static void binaryString(int n , int LastPlace, StringBuilder str){
//         if(n==0){
//             System.out.println(str.toString());
//             return;
//         }
//         binaryString(n-1,0, new StringBuilder(str).append("0"));
//         if(LastPlace==0){
//             binaryString(n-1,1, new StringBuilder(str).append("1"));
//         }

//     }

//     //all occurence of a element in an array
//     public static void allOccurence(int arr[], int i, int x){
//         if(i==arr.length){
//             return;
//         }
//         if(arr[i]==x){
//             System.out.print(i+" ");
//         }
//         allOccurence(arr, i+1, x);
//     }

//     // printDigits in one, two , three etc
//     static String digit[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//     public static void printDigits(int n){
//         if(n==0){
//             return;
//         }
//         int lastdigit = n%10;
//         printDigits(n/10);
//         System.out.print(digit[lastdigit]+" "); 

//     }

//     //length of string using recursion
//     public static int lengthOfString(String str, int i){
//         if(i==str.length()){
//             return 0;
//         }
//         return 1+lengthOfString(str, i+1);
//     }
//     //reverse a string using recursion  
//     public static String reverseString(String str, int i){
//         if(i==str.length()){
//             return "";
//         }
//         return reverseString(str, i+1)+str.charAt(i);
//     }
//     //check if a string is palindrome or not using recursion
//     public static boolean isPalindrome(String str, int i){
//         if(i>=str.length()/2){
//             return true;
//         }
//         if(str.charAt(i)!=str.charAt(str.length()-i-1)){
//             return false;
//         }
//         return isPalindrome(str, i+1);
//     }

//     //count subsequences of a string
//     public static int countSubsequences(String str, int i, String newStr){
//         if(i==str.length()){
//             System.out.println(newStr);
//             return 1;
//         }
//         //include the character
//         int include = countSubsequences(str, i+1, newStr+str.charAt(i));
//         //exclude the character
//         int exclude = countSubsequences(str, i+1, newStr);
//         return include+exclude;
//     }


//     //tower of hanoi
//     public static void towerOfHanoi(int n, String src, String dest, String helper){
//         if(n==0){
//             return;
//         }
//         towerOfHanoi(n-1, src, helper, dest);
//         System.out.println("Move disk "+n+" from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, dest, src);
//     }



//     public static void main(String args[]){
//         int n = 4;
//         System.out.println(tilingProblem(n));
//         String str = "appnnacollege";
//         StringBuilder newStr = new StringBuilder("");
//         boolean[] map = new boolean[26];
//         System.out.println(removeDuplicates(str, 0, newStr, map));
//         System.out.println(friendPairing(3));
//         int n1 = 5;
//         StringBuilder str1 = new StringBuilder("");
 
//         System.out.println("Binary strings of length "+n1+" are: ");
//         binaryString(n1, 0, str1);

//         int arr[] = {1,2,3,4,5,6,7,8,9,1};
//         int x = 1;
//         System.out.print("All occurences of "+x+" are: ");
//         allOccurence(arr, 0, x);
//         System.out.println();
//         int n2 = 230503;
//         System.out.print("Digits in "+n2+" are: ");
//         printDigits(n2);

//         System.out.println();
//         String str2 = "Suhani";
//         System.out.println("Length of string "+str2+" is: "+lengthOfString(str2, 0));
//         System.out.println("Reverse of string "+str2+" is: "+reverseString(str2, 0));
//         System.out.println("Is "+str2+" a palindrome? "+isPalindrome(str2, 0));

//         String str3 = "abc";
//         System.out.println("Subsequences of "+str3+" are: ");
//         System.out.println("Count of subsequences of "+str3+" is: "+countSubsequences(str3, 0, ""));
//         int n3 = 3;
//         System.out.println("Tower of hanoi with "+n3+" disks: ");
//         towerOfHanoi(n3, "A", "C", "B");
//     }
// }


//Generate all binary strings


// class Recursion2 {

//     public static void generateBinaryString(int n, String str){
//     if(n == 0){
//         System.out.println(str);
//         return;
//     }
//     generateBinaryString(n - 1, str + "0");
//     generateBinaryString(n - 1, str + "1");
// }
//     public static void main(String[] args) {
//         int n = 3; // Length of binary strings
//         System.out.println("Binary strings of length " + n + ":");
//         generateBinaryString(n, "");
//     }
// }

// import java.util.*;
// //generate parenthesis combinations
// class Recursion2{
//     public static void generateParenthesis(int open, int close, String str){
//         if(open == 0 &&  close ==0){
//             System.out.println(str);
//             return;
//         }
//         if(open > 0){
//             generateParenthesis(open - 1, close, str + "(");
//         }
//         if(close > open){
//             generateParenthesis(open, close - 1, str + ")");
//         }
//     }
//     public static void main(String[] args) {
//         int n = 3; // Number of pairs of parentheses
//         System.out.println("Parenthesis combinations for " + n + " pairs:");
//         generateParenthesis(n, n, "");
//     }

// }