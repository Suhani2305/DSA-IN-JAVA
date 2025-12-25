package DSA;
// public class funtion {
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
//     public static void main(String[] args) {
//         printHelloWorld();  //funtion call
//     }
// }

// import java.util.Scanner;

// public class funtion {
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
//     public static int calculateSum(int num1, int num2){ //parameters or formal parametes
//         int sum = num1 + num2;
//         return sum;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b); //arguments or actual parameters
//         System.out.println("Sum is : "+sum);

//     }
// }

// // call by value
// public class funtion {
//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);

//     }

//     public static void main(String[] args) {
//         int a =5;
//         int b = 8;
//         // int temp = a;
//         // a = b;
//         // b = temp;
//         // System.out.println("a = "+a);
//         // System.out.println("b = "+b);
//         swap(a, b);
//     }
// }


// // find product of a and b
 
// public class funtion {
//     public static int multiply(int a, int b) {
//         int product = a*b;
//         return product;
        
//     }
//     public static void main(String[] args) {
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a,b);
//         System.out.println("Product of given two number are: " + prod);
//     }

    
// }



// // find factorial of numbers
// /**
//  * funtion
//  */
// public class funtion {

//     public static int factorial(int n){
//         int fact =1;
//         for(int i = 1; i<=n; i++){
//            fact = fact * i; 
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
         
//         System.out.println(factorial(5));
//     }
// }

// // binomial coefficient
// // nCr = n!/r!(n-r)!

// public class funtion {

//     public static int factorial(int n){
//         int fact =1;
//         for(int i = 1; i<=n; i++){
//            fact = fact * i; 
//         }
//         return fact;
//     }
//     public static int binCoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }
//     public static void main(String[] args) {
         
//         System.out.println(binCoeff(5, 2));
//     }
// }

// // /binary to decimal
// /**
//  * funtion
//  */
// public class funtion {
//     public static void binToDec(int n){
//         int mynum = n;
//         int pow= 0;
//         int decNum = 0;
//         while(n>0){
//             int lastDigit = n %10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
//             pow++;
//             n = n/10;

//         }
//         System.out.println("Decimal of "+ mynum + " = "+ decNum);
//     }
//     public static void main(String[] args) {
//         binToDec( 1010);
        
//     }

    
// }   


// decimal to binary
/**
 * funtion
 */
// public class funtion {
//     public static void decToBin(int n){
//         int pow = 0;
//         int myNum = n;
//         int binNum = 0;
//         while(n>0){
//             int rem = n%2;
//             binNum = binNum +(rem * (int)Math.pow(10,pow));
//             pow++;
//             n=n/2;

//         }
//         System.out.println("Binary form of "+ myNum + " = "+ binNum);

//     }

//     public static void main(String[] args) {
//         decToBin(15);
        
//     }
// }

// // // Math class in Java:
// public class funtion    
// {    
//     public static void main(String[] args)     
//     {    
//         double x = 28;    
//         double y = 4;    
          
//         // return the maximum of two numbers  
//         System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
//         // return the square root of y   
//         System.out.println("Square root of y is: " + Math.sqrt(y));   
          
//         //returns 28 power of 4 i.e. 28*28*28*28    
//         System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
//         // return the logarithm of given value       
//         System.out.println("Logarithm of x is: " + Math.log(x));   
//         System.out.println("Logarithm of y is: " + Math.log(y));  
          
//         // return the logarithm of given value when base is 10      
//         System.out.println("log10 of x is: " + Math.log10(x));   
//         System.out.println("log10 of y is: " + Math.log10(y));    
          
//         // return the log of x + 1  
//         System.out.println("log1p of x is: " +Math.log1p(x));    
  
//         // return a power of 2    
//         System.out.println("exp of a is: " +Math.exp(x));    
          
//         // return (a power of 2)-1  
//         System.out.println("expm1 of a is: " +Math.expm1(x));  
//     }    
// }    

  