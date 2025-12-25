package Unit_2;

// public class Part3 {
//     public class Car{
//         String color;
//         String model;
//         int year;
//         // constructor
//         public Car(String color, String model, int year){
//             this.color = color;
//             this.model = model;
//             this.year = year;
//         }

//         // Method
//         public void display(){
//             System.out.println("Color: " + color);
//             System.out.println("Model: " + model);
//             System.out.println("Year: " + year);
//         }

//     }
// }


// class Calculator{
//     public int add(int a, int b){
//         return a + b;
//     }
// }
// public class Part3 {
//     public static void main(String[] args) {
//         Part3 part3 = new Part3();
//         Calculator obj = new Calculator();
//         System.out.println(obj.add(10, 20));
//     }
// }


// class Car{
//     String color;
//     String model;
//     int year;
//     // constructor
//     public Car(){
//         this("Black", "Toyota", 2020);
//     }
//     public Car(String color, String model, int year){
//         this.color = color;
//         this.model = model;
//         this.year = year;
//     }

//     public void display(){
//         System.out.println("Color: " + color);
//         System.out.println("Model: " + model);
//         System.out.println("Year: " + year);
//     }
// }

// class Garage{
//     public void park(Car car){
//         System.out.println("Car parked in the garage");
//         car.display();
//     }
// }

// public class Part3{
//     public static void main(String[] args){
//         Car car = new Car();
//         Garage garage = new Garage();
//         garage.park(car);
//     }
    
// }



//concrete classes : class that can be instantiated
//abstract classes : class that cannot be instantiated
// instantiated : create an object of a class
//anonymous classes : class that has no name and is used to instantiate an object

// using objects as parameters


    class car{
        String model;
        String color;
        int year;
        public car(String model, String color, int year){
            this.model = model;
            this.color = color;
            this.year = year;
        }
        public void display(){
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);
            System.out.println("Year: " + year);
        }
    }

    class garage{
        public void park(car c){
            System.out.println("Car parked in the garage");
            c.display();
        }

    }

     public class Part3{
        public static void main(String[] args){
            car c = new car("Toyota", "Black", 2020);
            garage g = new garage();
            g.park(c);
        }


    
}
