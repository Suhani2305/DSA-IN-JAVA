// // practice set 
// // Question 1:
// import java.util.*;
// public class conditionalStatement {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in); 
//       int x = sc.nextInt();
//       if(x>0){
//         System.out.println("X is positive");
//       }else{
//         System.out.println("X is negative");
//       }
//     }
// }




// // question 2:
// /**
//  * conditionalStatement
//  */
// import java.util.*;
// public class conditionalStatement {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double x = sc.nextDouble();
//         if(x>100){
//             System.out.println("Fever");
//         }else{
//             System.out.println("No fever");
//         }

//     }
// }

// // question 3
// // switch case
// import java.util.*;
// public class conditionalStatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter week number(1-7): "); 
//         int week = sc.nextInt();
//         switch(week){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5: 
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7: 
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
//     }
    
// }



// // question 5
// import java.util.*; 
// public class conditionalStatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         boolean x = (year%4)==0;
//         boolean y = (year%100)!=0;
//         boolean z = ((year%100==0)&&(year%400==0));
//     } 
// }