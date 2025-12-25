package Unit_4;
// Static nested class
// class Outer{
//     static String name = "Suhani";
//     static class Inner{
//         void display(){
//             System.out.println("Accessing outer class static variable : "+name);
//         }
//     }
// }

// public class NestedClass {
//     public static void main(String []args){
//         Outer.Inner a = new Outer.Inner();
//         a.display();
//     }    
// }


// // member inner class
// class outer{
//     private String name = "Suhani";
//     class inner{
//         void display(){
//             System.out.println("Message from outer: "+name);
//         }
//     }
// }
// public class NestedClass{
//     public static void main(String args[]){
//         outer b = new outer();
//         outer.inner  c = b.new inner();
//         c.display();
         
//     }
// }


// Local inner class
// class outer{
//     void display(){
//     final String name = "Suhani";
//     class Local{
//         void show(){
//             System.out.println(name);
//         }
//     }
//     Local b = new Local();
//     b.show();
//     }
// }
// public class Nested{
//     public static void main(String []args){
//         outer o = new outer();
//         o.display();
//     }
// }


// //  Anonymous Inner Class
// interface Greeting{
//     void sayHello();
// }
// public class Nested{
//     public static void main(String[] args){
//         Greeting a = new Greeting() {
//             public void sayHello(){
//                 System.out.println("Hello from Anonymous Inner Class");
//             }
//         };
//         a.sayHello();

//     }
// }


// // Functional Interface
// @FunctionalInterface
// interface Greeting{
//     void sayHello();
//     default void b() {
//         System.out.println("Suhani iss only off vishal");
//     }
//     static void c() {
//         System.out.println("Suhani is only off vishal");
//     }

// }

// public class Nested{
//     public static void main(String[] args) {
//         Greeting a =() -> System.out.println("Hello from Functional Interface");
//         a.sayHello();
//         a.b();
//         Greeting.c();
//     }
// }


// // Predicate (Used for Filtering)
// import java.util.*;
// import java.util.function.Predicate;
// public class Nested{
//     public static void main(String[] args) {
//         Predicate<Integer> isEven = num -> num % 2 == 0;
//         System.out.println(isEven.test(10)); // prints: true
//         System.out.println(isEven.test(15));
//     }
// }

// Function (Takes Input and Returns a Result)
 
// import java.util.function.Function;

// public class Nested{
//     public static void main(String[] args) {
//         Function<Integer, Integer> square = num -> num * num;
//         System.out.println(square.apply(5)); // Output: 25
//         System.out.println(square.apply(7)); // Output: 49
//     }
// }


// import java.util.function.Supplier;  
// public class Nested {
//     public static void main(String[] args) {
//         // Supplier to generate a random number
//         Supplier<Double> randomValue = () -> Math.random();
//         System.out.println(randomValue.get());
//     }

// }
 

// interface a{
//     void m();
// }
// public class Nested{
//     public static void main(String[] args) {
//         a b = () -> System.out.println("Hello Suhani g KAISE HOO AAP");
//         b.m();
//     }
// }


// // Lambda Expression:
// import java.util.*;
// public class Nested{
//     public static void main(String[] args){
//         List<String> names = Arrays.asList("Java", "Python",
// "C");
//         Collections.sort(names , (s1,s2)->s1.compareTo(s2));
         
//         System.out.println(names);
//     }
// }


// import java.time.LocalDate;

// public class DateExample {  
//     public static void main(String[] args) {
//     LocalDate today = LocalDate.now(); // Gets the current
     
//     System.out.println("Today's Date: " + today);
//     LocalDate specificDate = LocalDate.of(2025, 2, 25); 
 
//     System.out.println("Specific Date: " + specificDate);
//     }
// }

// import java.time.Instant;  
// public class InstantExample {
// public static void main(String[] args) {
// Instant now = Instant.now();
// System.out.println("Current Timestamp: " + now);
// }
// }


// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// public class Nested{
//     public static void main(String[] args){
//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//         String a =now.format(f);
//         System.out.println(a);
//     }
// }




//sttaic nested class
// class Boy{
//     static String name = "Suhani";
//     static class girls{
//         void display(){
//             System.out.println("Accessing outer class static variable : "+name);
//         }
//     }
// }

// public class Nested{
//     public static void main(String []args){
//         Boy.girls s = new Boy.girls();
//         s.display();
//     }}


// member inner class