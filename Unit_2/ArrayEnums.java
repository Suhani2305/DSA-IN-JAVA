package Unit_2;

// public class ArrayEnums {
//     public static void main(String[] args) {
//         int[] numbers = new int[7];
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;
//         numbers[5] = 60;
//         numbers[6] = 70;
//         for(int i = 0; i<numbers.length; i++){
//             System.out.println(numbers[i]);
//         }

//         int[][] matrix = new int[3][3];
//         matrix[0][0] = 10;
//         matrix[0][1] = 20;
//         matrix[0][2] = 30;
//         matrix[1][0] = 40;
//         matrix[1][1] = 50;
//         matrix[1][2] = 60;
//         matrix[2][0] = 70;
//         matrix[2][1] = 80;
//         matrix[2][2] = 90;
//         for(int i = 0; i<3; i++){
//             for(int j = 0; j<3; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }

//         int[][] jaggedArray = new int[3][];
//         jaggedArray[0] = new int[3];
//         jaggedArray[1] = new int[4];
//         jaggedArray[2] = new int[5];
//         jaggedArray[0][0] = 10;
//         jaggedArray[0][1] = 20;
//         jaggedArray[0][2] = 30;
//         jaggedArray[1][0] = 40;
//         jaggedArray[1][1] = 50;
//         jaggedArray[1][2] = 60;
//         jaggedArray[1][3] = 70;
//         jaggedArray[2][0] = 80;
//         jaggedArray[2][1] = 90;
//         jaggedArray[2][2] = 100;
//         jaggedArray[2][3] = 110;
//         jaggedArray[2][4] = 120;
//         for(int i = 0; i<3; i++){
//             for(int j = 0; j<jaggedArray[i].length; j++){
//                 System.out.print(jaggedArray[i][j]+" ");
//             }
//             System.out.println();
//         }

//         for(int i: numbers){
//             System.out.println(i);
//         }
//     }
// }



// // array class
// import java.util.*;
// class ArrayEnums {
//     public static void main(String[] args) {
//         int[] numbers = {109,20,309,4900,50,0,70};
//         Arrays.sort(numbers); 
//         System.out.println(Arrays.toString(numbers));
//         int index = Arrays.binarySearch(numbers,50);
//         System.out.println("Index of 50 is: "+index);

//         int[] copy =Arrays.copyOf(numbers,4);
//         System.out.println(Arrays.toString(copy));


//         int[] copyRange = Arrays.copyOfRange(numbers,2,5);
//         System.out.println(Arrays.toString(copyRange));
//         int length = numbers.length;
//         System.out.println("Length of array is: "+length);  
//     }
// }


// // using varargs
// class ArrayEnums {
//     public static void main(String[] args) {
//         printNumbers("Numbers are:",1,2,3,4,5,6,7,8,9,10);
//     }
//     static void printNumbers(String message,int... num){
//         System.out.println(message);
//         for(int i: num){
//             System.out.print(i+" ");
//         }
//     }
// }



// // enum
// import java.util.*;
// public class ArrayEnums {
//     public enum Day{
//         MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
//     }
//     public static void main(String[] args){
//         Day today = Day.MONDAY;
//         switch (today) {
//             case MONDAY:
//             System.out.println("Start of the work week!");
//             break;
//             case FRIDAY:
//             System.out.println("Almost the weekend!");
//             break;
//             case SATURDAY:
//             case SUNDAY:
//             System.out.println("Weekend!");
//             break;
//             default:
//             System.out.println("Midweek day.");
//         }

//         for( Day day:Day.values()){
//         System.out.println(day);
//         }
//         System.out.println(Day.MONDAY.ordinal());
//         System.out.println(Day.SATURDAY.ordinal());
//         EnumSet <Day> a = EnumSet.of(Day.SATURDAY,Day.SUNDAY);
//         System.out.println(a);
//         System.out.println(Day.valueOf("MONDAY"));
//     }
// }

    
// }
import java.util.*;
// public class ArrayEnums{
//     public static void main(String[] args){
//         int []numbers = {100,2900,30,0,50}; 
//         Arrays.sort(numbers);
//         for (int num : numbers) {
//             System.out.print(num + " ");
//         }
//         int index = Arrays.binarySearch(numbers, 100);
//         System.out.println("\nIndex of 3346853 is: " + index);

//         Arrays.fill(numbers, 69);
//         System.out.println(Arrays.toString(numbers));
//     }
// }

// class Calculator {  
//     // Method to add two numbers
//     public int add(int ... a) {
//         int sum = 0;
//           for (int num : a) {
//                 sum += num;
//           }
//           return sum;
//     }
// }
// public class ArrayEnums {
//     public static void main(String[] args) {
//     Calculator calc = new Calculator();
//     int result = calc.add(5, 3); // Method call
//     System.out.println("Sum: "+ result); // Output: Sum:
    
// }
// }


// commonly used methods in the arrays class
// import java.util.*;
// public class ArrayEnums{
//     public static void main(String[] args){
//         int []nums = {100,2900,30,0,50};
//         Arrays.sort(nums);
//         System.out.println(Arrays.toString(nums));


//         int index = Arrays.binarySearch(nums, 30);
//         System.out.println("Index of 3 is: " + index);

//         int []nums2={100,2900,30,0,50};
//         System.out.println(Arrays.equals(nums, nums2)); // true or false

//         int [] nums3 = Arrays.copyOf(nums, 3); // copy of first 3 elements
//         System.out.println(Arrays.toString(nums3)); // [100, 30, 0]


//         //filling an array
//         int []nums4 = new int[5];
//         Arrays.fill(nums4,69);
//         System.out.println(Arrays.toString(nums4)); // [69, 69, 69, 69, 69]

//     }
// }

// using varangs

// public class ArrayEnums{
//     public static void main(String[] args){
//         printNumbers("Numbers are:",1,2,3,4,5,6,7,8,9,10);
//     }
//     static void printNumbers(String message,int... num){
//         System.out.println(message);
//         for(int i: num){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//     }
// }

//varargs is treated as an array within the method


//enums
import java.util.*;


public class ArrayEnums {
    public enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }

    public static void main(String[] args){
        Day day = Day.MONDAY;
        switch(day){
            case MONDAY:
                System.out.println("Start of the week");
            case FRIDAY:
                System.out.println("Almost the weekend");
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
            default:
                System.out.println("Midweek day");

        }
        System.out.println("Day: " + day);

        // return the position of the enum constant (0-based)
        System.out.println("Position of Monday: "+ day.ordinal());
        System.out.println(day.name());


        // enumset
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend days: " + weekend);
        System.out.println("All days: " + EnumSet.allOf(Day.class));
        
    }
}