 
 
import java.util.Scanner;
class Recursion{
    //factorial using recursion
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //fibonacci using recursion
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //sum of digits using recursion
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }

    //check if array is sorted or not
    public static boolean isSorted(int arr[], int n){
        if(n==1 || n==0){
            return true;
        }
        return (arr[n-1]>arr[n-2] && isSorted(arr, n-1));
    }

    //first occurrence of a number in an array
    public static int firstOccurrence(int arr[], int n, int x){
        if(n==0){
            return -1;
        }
        if(arr[0]==x){
            return 0;
        }
        int index = firstOccurrence(arr, n-1, x);
        if(index==-1){
            return -1;
        }
        return index+1;
    }

    //last occurrence of a number in an array
    public static int lastOccurrence(int arr[], int n, int x){
        if(n==0){
            return -1;
        }
        if(arr[n-1]==x){
            return n-1;
        }
        return lastOccurrence(arr, n-1, x);
    }

    //reverse a string using recursion
    public static String reverseString(String str){
        if(str.length()==0){
            return str;
        }
        return str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
    }

    //tower of hanoi using recursion
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary){
        if(n==1){
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, auxiliary, destination, source);
    }

    //palindrome using recursion
    public static boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    // optimised method to calculate power using recursion
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return power(x, n/2) * power(x, n/2);
        }else{
            return x * power(x, n/2) * power(x, n/2);
        }
    }

    // print all subsequences of a string using recursion
    public static void printSubsequences(String str, String current, int index){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        // include the current character
        printSubsequences(str, current + str.charAt(index), index + 1);
        // exclude the current character
        printSubsequences(str, current, index + 1);
    }

    //tiling problem
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));

        
        System.out.println("Enter a number to find its fibonacci: ");
        n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        
        System.out.println("Enter a number to find sum of digits: ");
        n = sc.nextInt();
        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(n));
        
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Is array sorted? " + isSorted(arr, arr.length));
        
        System.out.println("Enter a number to find first occurrence in array: ");
        int x = sc.nextInt();
        System.out.println("First occurrence of " + x + " is at index: " + firstOccurrence(arr, arr.length, x));
        
        System.out.println("Enter a number to find last occurrence in array: ");
        x = sc.nextInt();
        System.out.println("Last occurrence of " + x + " is at index: " + lastOccurrence(arr, arr.length, x));
        
        System.out.println("Enter a string to reverse: ");
        String str = sc.next();
        System.out.println("Reversed string is: " + reverseString(str));
        
        System.out.println("Enter number of disks for Tower of Hanoi: ");
        int disks = sc.nextInt();
        towerOfHanoi(disks, 'A', 'C', 'B');
        
        System.out.println("Enter a string to check if it is palindrome: ");
        str = sc.next();
        System.out.println("Is palindrome? " + isPalindrome(str));
        
        System.out.println("Enter base and exponent for power calculation: ");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(base + "^" + exponent + " is: " + power(base, exponent));
        
        System.out.println("Enter a string to print all subsequences: ");
        str = sc.next();
        printSubsequences(str, "", 0);
    }
}
