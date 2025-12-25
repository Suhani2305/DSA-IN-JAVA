 

// public class MyString {
//     public static void main(String[] args) {
//         String s = new String("Hello");
//         String str = "Hello";
//         char[] ch = {'H', 'e', 'l', 'l', 'o'};
//         String str2 = new String(ch);
//         System.out.println(str2);
//         byte[] byteArray = {72, 101, 108, 108, 111};
//         String str3 = new String(byteArray);
//         System.out.println(str3);
//         System.out.println(str.length());
//         System.out.println(str.charAt(1));
//         System.out.println(str.substring(3));
//         System.out.println(str.substring(1,4));
//         System.out.println(str.indexOf("l"));
//         System.out.println(str.lastIndexOf("l"));

//         String str4 = "Hello";
//         String str5 = s.intern();
//         System.out.println(str4 == str5); 
//         System.out.println(str4 == s); 
//         // true, because str5 refers to the same string in the string pool
//         StringBuilder sb  = new StringBuilder("Hello");
//         sb.append(" World");
//         System.out.println(sb); // Hello World
//         sb.insert(5, " Beautiful");
//         System.out.println(sb); // Hello Beautiful World
//         sb.delete(5, 15);
//         System.out.println(sb); // Hello World
//         sb.reverse();
//         System.out.println(sb); // World Hello
        
//     }
// }


// import java.util.Arrays;
// public class MyString{
//     public static void main(String[] args){
//         String str1 = "earth";
//         String str2 = "heart";
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();
//         if(str1.length()== str2.length()){
//             char[] ch1 = str1.toCharArray();
//             char[] ch2= str2.toCharArray();
//             Arrays.sort(ch1);
//             Arrays.sort(ch2);
//             boolean isAnagram = Arrays.equals(ch1, ch2);
//             if(isAnagram){
//                 System.out.println("The strings are anagrams.");
//             }else{
//                 System.out.println("The strings are not anagrams.");
//             }
//         }else{
//             System.out.println("The strings are not anagrams.");
//         }
//     }
// }


// import java.util.Scanner;
// public class MyString{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().charAt(0);
//         if(Character.isLowerCase(ch)){
//             System.out.println("Lowercase letter: " + ch);
//         }else if(Character.isUpperCase(ch)){
//             System.out.println("Uppercase letter: " + ch);
//         }else if(Character.isDigit(ch)){
//             System.out.println("Digit: " + ch);
//         }else{
//             System.out.println("Special character: " + ch);
//         }
        


//     }
// }

// // first repeated character in a string
// import java.util.*;
// public class MyString{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length();j++){
//                 if(str.charAt(i)==str.charAt(j)){
//                     System.out.println("First repeated character: " + str.charAt(i));
//                     return;
//                 }
//             }
//         }
//         System.out.println("No repeated character found.");
//     }
// }

// string compression


import java.util.*;
public class MyString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder compressed = new StringBuilder();
        int count =1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                compressed.append(str.charAt(i));
                if(count>1){
                    compressed.append(count);
                }
                count = 1;
            }

        }
        System.out.println("Compressed string: " + compressed.toString());
        
    }
}