package Unit_4;

// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class Exception {
//     public static void main(String[] args) {
//         try{
//             FileReader file = new FileReader("C:\\Users\\Suhani\\Desktop\\Java\\Unit_4\\Exception.java");

//         }catch(FileNotFoundException e){
//             System.out.println("File not found exception: "+e.getMessage());

//         }
//     }
// }

public class Exception{
    static void method1(){
        int a = 10/0;
    }
    static void method2(){
        method1();
    }
    public static void main(String args[]){
    try{
        method2();
    }catch(ArithmeticException e){
        System.out.println("Arithmetic exception: "+e.getMessage());
    }finally{
        System.out.println("Finally block executed");
    }
}
}

//throw and throws keyword
// public class Exception{
//     static void validate(int age){
//         if(age<18){
//             throw new ArithmeticException("Not eligible to vote");
//         }else{
//             System.out.println("Eligible to vote");
//         }
//     }
//     public static void main(String args[]){
//         try{
//             validate(15);
//         }catch(ArithmeticException e){
//             System.out.println("Exception: "+e.getMessage());
//         }
// }
// }
    