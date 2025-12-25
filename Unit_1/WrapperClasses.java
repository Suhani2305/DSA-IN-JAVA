// package Unit_1;

// import java.util.ArrayList;
// autoboxing and unboxing
// Wrapper classes are used to convert primitive data types into objects
// public class WrapperClasses {
//     public static void main(String[] args){
//         // autoboxing: converting primitive data types into objects
//         int a =10;
//         Integer i = a;
// import java.util.Scanner;

//         // unboxing: converting objects into primitive data types
//         Integer j = 20;
//         int b = j;

//         System.out.println("Primitive data type: "+a+" Object: "+i);
//         System.out.println("Object: "+j+" Primitive data type: "+b);
//     }
// }



// // using utility methods
// public class WrapperClasses {
//     public static void main(String[] args){
//         String number ="123";
//         int a = Integer.parseInt(number);

//         int b = 20;
//         String str = Integer.toString(b);
//         System.out.println("String to Integer: "+a);
//         System.out.println("Integer to String: "+str);
//     }
// }



// wrapper classes in collections
// public class WrapperClasses { 
//     public static void main(String[] args){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);

//         int first = list.get(0);
//         System.out.println("First element: "+first);
//         System.out.println("List: "+list);

//         doubleValue(list);
//         System.out.println("List after doubling: "+list);
//         int a = 10;
//         System.out.println(Integer.toBinaryString(a));
//         System.out.println(Integer.toHexString(a));



//         try (Scanner scanner = new Scanner(System.in)) {
//             System.out.println("Enter first number: ");
//             int num1 = scanner.nextInt();
//             System.out.println("Enter second number: ");
//             int num2 = scanner.nextInt();
//             System.out.println("Enter third number: ");
//             int num3 = scanner.nextInt();

//             int largest;
//             if (num1 >= num2 && num1 >= num3) {
//                 largest = num1;
//             } else if (num2 >= num1 && num2 >= num3) {
//                 largest = num2;
//             } else {
//                 largest = num3;
//             }

//             System.out.println("The largest number is: " + largest);
//         }

//     }

//     public static void doubleValue(ArrayList<Integer> list) {
//         for (int i = 0; i < list.size(); i++) {
//             list.set(i, list.get(i) * 2);
//         }
//     }
 
// }