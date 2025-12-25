package Unit_3;



// interface a{
//     default void show(){
//         System.out.println("Hello from interface a");
//     }
// }
// interface b{
//     default void show(){
//         System.out.println("Hello from interface b");
//     }
// }
// class C implements a,b{
//     @Override
//     public void show(){
//     System.out.println("Hello from class C");
//         a.super.show();
//         b.super.show();
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         C obj  = new C();
//         obj.show();
//     }
    
// }



// class Parent {  
//     void show() {  
//         System.out.println("Parent");  
//     }  
// }  

// class Child extends Parent {  
//     void show() {  
//         System.out.println("Child");  
//     }  
// }  

// public class Main {  
//     public static void main(String[] args) {  
//         Parent obj = new Child();  
//         obj.show(); // Issue  
//     }  
// }


//introduction of object class
// 1> equals() method

// class car{
//     String name;
//     car(String name){
//         this.name = name;
//     }

//     @Override
//     public boolean equals(Object obj){
//         if (this == obj) return true;
//         if(obj == null || getClass()!= obj.getClass()) return false;
//         car c = (car)obj;
//         return name.equals(c.name); // comparing the values of the strings
//     }
// }
// class Main{
     
//     public static void main(String[] args){
//         car c1 = new car("BMW");
//         car c2 = new car("BMW");
//         System.out.println(c1.equals(c2)); // false because c1 and c2 are different objects and have diff memory locations
//         System.out.println(c1 == c2); // false
//         System.out.println(c1.name.equals(c2.name)); // true because name is a string and we are comparing the values of the strings
//         System.out.println(c1.name == c2.name); // true


//     }
// }


// 2> hashCode() method
// class car{
//     String name;
//     car(String name){
//         this.name = name;
//     }
//     @Override
//     protected void finalize() throws Throwable{
//         System.out.println("Object is destroyed");
//     }

// }
// public class Main{
//     public static void main(String[] args){
//         car c = new car("BMW");
//         c = null;
//         System.gc(); // garbage collector is called to destroy the object
//     }
// }

//final variable : a constant variable whose value cannot be changed once it is assigned. It is declared using the final keyword.
// It can be used with variables, methods and classes. It is a non-access modifier.

// final int MAX_Users = 100; // final variable

//final method : a method that cannot be overridden in the subclass. It is declared using the final keyword. It is a non-access modifier.
// It is used to prevent method overriding in inheritance. It is used to make the method final so that it cannot be changed in the subclass.

// class Parent{
//     final void show(){
//         System.out.println("Hello from parent class");
//     }
// }
// class Child extends Parent{
//     void show1(){ // cannot override the final method from parent class
//         System.out.println("Hello from child class");
//     }
// }

//final class : a class that cannot be inherited. It is declared using the final keyword. It is a non-access modifier.
// It is used to prevent inheritance. It is used to make the class final so that it cannot be changed in the subclass.

// final class Parent{
//     void show(){
//         System.out.println("Hello from parent class");
//     }
// }
// class Child extends Parent{
//     void show1(){ // cannot inherit the final class from parent class
//         System.out.println("Hello from child class");
//     }
// }
