package Unit_2;

// public class Loops {
//     public static void main(String[] args) {
//         //for loop
//         for(int i =0; i<10;i++){
//             System.out.println(i);
//         }

//         int a =1;
//         boolean b = true;
//         while(b){
//             System.out.println("While loop execute");
//             System.out.println(a);
//             if(a == 20){
//                 b = false;
//             }
//             a++;
//         }

//         // do while loop
//         int c =100;
//         do{
//             System.out.println("Do while loop execute");
//             System.out.println(c);
//             c++;
//         }while(c<110);


//         // for each loop
//         int[] arr = {1,2,3,4,5,6,7,8,9,10};
//         for(int i: arr){
//             System.out.println(i);
//         }
// }
// }


// sum of numbers

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int sum  =0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         for(int i =0; i<=n;i++){
//             sum = sum + i;
//         }
//         System.out.println("Sum of numbers is: "+sum);
//     }
// }


// jump statement
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int i = 0;
//         while(i<10){
//             if(i == 5){
//                 i++;
//                 continue;
//             }
//             if(i==7){
//                 break;
//             }
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// // return method
// public class Loops {
//     public static void main(String[] args) {
//         int sum = sumOfNumbers(10);
//         System.out.println("Sum of numbers is: "+sum);
//         }
//         public static int sumOfNumbers(int n) {
//             int sum = 0;
//             for(int i = 0; i<=n;i++){
//                 sum = sum + i;
//             }
//             return sum;
//         }
//     }   



// // labelled break and continue
// public class Loops {
//     public static void main(String[] args) {
//         int i = 0;
//         outer:
//         while(i<10){
//             int j = 0;
//             inner:
//             while(j<10){
//                 if(i == 5 && j == 5){
//                     break outer;
//                 }
//                 System.out.println(i+" "+j);
//                 j++;
//             }
//             i++;
//         }
//     }
// }


//jump statement
// break and continue

// import java.util.*;
// public class Loops{
//     public static void main(String[] args){
//         for(int i = 0; i<10; i++){
//             if(i == 5){
//                 continue;
//             }
//             if(i == 7){
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }


// labelled break and continue

public class Loops{
    public static void main(String[] args){
        outer:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i == 5 && j == 5){
                    break outer;
                }
                System.out.println(i+" "+j);
            }
        }
    }
    
}
