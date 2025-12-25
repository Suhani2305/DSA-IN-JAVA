package Unit_3;

// class Suhani{
//     void display(){
//         System.out.println("Hello from Suhani");
//     }
// }
// class Vishal extends Suhani{
//     @Override
//     void display(){
//         System.out.println("Hello from Vishal");
//         System.out.println("Hello from Suhani Rawat");
//     }
// }

// public class Polymorphism {
//     public static void main(String[] args) {
//         Suhani obj  = new Suhani();
//         obj = new Vishal();
//         obj.display();
         
//     }
// }

// class parent{
//     String name;
//     parent(String name){
//         this.name = name;
//     }
//     void display(){
//         System.out.println("Hello from parent class "+name);
//     }
// }

// class child extends parent{
//     int age ;
//     child(String name, int age){
//         super(name);
//         this.age = age;
//     }
//     void display(){
//         System.out.println("Hello from child class "+name+" "+age);
//     }
//     void show(){
//         System.out.println("Hello from child class "+name+" "+age);
//         super.display();
//     }
     
// }
// public class Polymorphism {
//     public static void main(String[] args) {
//         parent obj  = new parent("Suhani");
//         child obj2 = new child("Vishal", 20);
//         obj.display();
//         obj2.display();
//         obj2.show();
         
//     }
// }


// class Bike{
//     String model;
//     Bike(String model) {
//     this.model = model;
//     }

//     @Override
//     public boolean equals(Object obj){
//         if(this == obj) return true;
//         if(obj == null || getClass() != obj.getClass()) return false;
//         Bike bike = (Bike) obj;
//         return model.equals(bike.model);
//     }
//     @Override
//     public int hashCode(){
//         return model.hashCode();
//     }

//     @Override
//     public String toString(){
//         return "Bike{" +
//                 "model='" + model + '\'' +
//                 '}';
//     }
// }
// public class Polymorphism {
//     public static void main(String[] args) {
//         Bike bike1 = new Bike("Yamaha");
//         Bike bike2 = new Bike("Yamaha");
//         System.out.println(bike1.equals(bike2)); // true
//         System.out.println(bike1.hashCode());
//         System.out.println(bike2.hashCode()); // false
//         System.out.println(bike1.toString()); // Bike{model='Yamaha'}
//         System.out.println(bike1 instanceof Bike); // true
//         System.out.println(bike2 instanceof Object); // true
//     }
// }