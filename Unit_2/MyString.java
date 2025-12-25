package Unit_2;
import java.util.*;
// public class MyString {
//     public static void main(String[] args) {
//         String str ="Hello";
//         String str1 = new String(str);
//         System.out.println(str1);

//         char[] str3 = {'H','e','l','l','o',' ','J','a','v','a'};
//         String str4 = new String(str3);
//         System.out.println(str4);


//         String str6 ="Hello, Suhani";
//         System.out.println(str6.charAt(1));

//         StringBuilder str7 = new StringBuilder("Hello");
//         str7.append(" Java");
//         System.out.println(str7.toString());
//         str7.reverse();
//         System.out.println(str7.toString());
//         str7.setCharAt(5, 'W');
//         System.out.println(str7.toString());
//         Scanner sc = new Scanner(System.in);
//         String str8 = sc.nextLine();
//         System.out.println(str8);
//         Double d = sc.nextDouble();
//         System.out.println(d);
        

 
//     }

// }


// public class MyString {
//     public static void main(String[] args) {
//         String str = "Heloo World , Hi Suhani";
//         String str1 = new String(str);
//         System.out.println(str1);
//         System.out.println(str1.length());
//         System.out.println(str1.charAt(0));
//         System.out.println(str1.substring(2));
//         System.out.println(str1.indexOf("Suhani"));
//         System.out.println(str1.lastIndexOf("h"));
//         System.out.println(str1.toUpperCase());
//         System.out.println(str1.toLowerCase());
//         System.out.println(str1.replace("Suhani","Vishal bhosadiwale chachaa gaand marwayenge apni bhosadi ki"));
//         // System.out.println(str1.split(","));

//     }
// }



public class MyString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str.append("Java!"));
        System.out.println(str.insert(5, " World"));
        System.out.println(str.reverse());
        System.out.println(str.reverse());
        System.out.println(str.delete(0, 5));
        System.out.println(str.deleteCharAt(0));
        System.out.println(str.replace(0, 5, "Hello"));
        System.out.println(str.replace(0, 5, "Hello World"));
        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("W"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));
        str.trimToSize();



    }
}