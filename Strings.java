// import java.util.Scanner;

// public class Strings {
//     public static void main(String[] args) {
//         char arr[] = {'a', 'b', 'c', 'd'};
//         String str = "abcd";
//         String str2 = new String("xyz");

//         // Input
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//     }

//     // Strings are immutable (do not change)


// }


// STRING LENGTH
// public class Strings {

//     public static void main(String[] args) {
//         String fullname = "Suhani Rawat";
//         System.out.println(fullname.length());
//     }
// }


// concatenation
// public class Strings {

//     public static void main(String[] args) {
//         String firstname = "Suhani";
//         String lastname = "Rawat";
//         String fullname = firstname + " " + lastname ;
//         System.out.println(fullname);
//     }
// }

// // string charAt method
// public class Strings {

//     public static void main(String[] args) {
//         String firstname = "Suhani";
//         String lastname = "Rawat";
//         String fullname = firstname + " " + lastname ;
//         System.out.println(fullname.charAt(1));
//     }
// }

// check stringh is palindrome or not
/**
 * Strings
//  */
// public class Strings {
//     public static boolean isPalindrome(String str){
//         for(int i=0;i<str.length()/2;i++){
//             int n =  str.length();
//             if(str.charAt(i)!=str.charAt(n-1-i)){
//                 return false;

//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "racecare";
//         System.out.println(isPalindrome(str));
        
//     }
// }


// shortest path
/**
//  * Strings
//  */
// public class Strings {
//     public static float getShortestPath(String path){
//         int x =0 ,y = 0;
//         for(int i =0;i<path.length();i++){
//             char dir = path.charAt(i);
//             // south
//             if(dir=='S'){
//                 y--;
//             }
//             else if (dir=='N'){
//                 y++;
//             }
//             else if(dir == 'W'){
//                 x--;
//             }else{
//                 x++;
//             }
//         }
//         int X2=x*x;
//         int Y2=y*y;
//         return(float)Math.sqrt(X2+Y2);
//     }

//     public static void main(String[] args) {
        
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }
// }


// string compare
/**
 * Strings
 */
// public class Strings {

//     public static void main(String[] args) {
//         String s1 ="Tony";
//         String s2 ="Tony";  //see at object level
//         String s3 = new String("Tony");
//         if(s1.equals(s3)){
//             System.out.println("String are equeal");
//         }else{
//             System.out.println("Strings are not equal");
//         }

//     }
// }



// // string substring
// public class Strings {

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(str.substring(0,5));

//     }
// }


// // print tha largest string in laxicographic;

// public class Strings {

//     public static void main(String[] args) {
//         String fruits[]={"apple","banana","mango"};
//         String largest = fruits[0];
//         for(int i = 1; i<fruits.length;i++){
//             if(largest.compareTo(fruits[i])<0){
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);

//     }
// }




// // stringbuilder
// // StringBuilder sb = new StringBuilder("HW");
// // sb.toString();
// public class Strings {

//     public static void main(String[] args) {
//         StringBuilder sb =new StringBuilder("");
//         for(char ch='a'; ch<='z';ch++){
//             sb.append(ch);

//         }
//         System.out.println(sb);
//     }
// }

// // first letter of each word is capital
// // Character.toUpperCase(ch)    inbuild fxn
// public class Strings {
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1; i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }else{
//                 sb.append(str.charAt(i));
//             }

//         }
//         return sb.toString();

//     }

//     public static void main(String[] args) {
//          String str ="hi, i am shradha";
//          System.out.println(toUpperCase(str));

//     }
// }
// time compl: o liner



