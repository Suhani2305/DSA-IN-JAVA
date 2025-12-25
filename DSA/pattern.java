package DSA;
// print STAR pattern
// *
// **
// ***
// ****
// public class pattern {
//     public static void main(String[] args) {
//         for(int i =1; i<=4; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

    
// }


// // inverted star print

// public class pattern {
//     public static void main(String[] args) {
//         for(int i =1; i<=4; i++){
//             for(int j = 1; j<=4-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

    
// }

// // half pyamid pattern
// // 1
// // 12
// // 123
// // 1234
// public class pattern {
//     public static void main(String[] args) {
//         for(int i =1; i<=4; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j);
//                 // j++;
//             }
//             System.out.println();
//         }
//     }

    
// }

// // // print characater pattern
// // A
// // BC
// // DEF
// // GHIJ
// public class pattern {
//     public static void main(String[] args) {
//         char ch = 'A';
//         for(int i =1; i<=4; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }

    
// }


// class pattern{
//     public static void invertHalfPyramid(int m){
//         for(int i = m ;i>1;i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("  ");
//             }
//             for(int k = 1; k<=m-i+1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         invertHalfPyramid(9);
//     } 
// }




// class pattern{
//     public static void invertedHalfPyramid(int m){
//         for(int i =m; i>0;i--){
//             for(int j =1;j<i;j++){
//                 System.out.print(j + " ");
//             }
//             for(int k = 1; k<m-i;k++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         invertedHalfPyramid(5);
//     }
// }



// class pattern{
//     public static void flyodTriangle(int n){
//         int number =1;
//         for(int i =0;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(number + " ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         flyodTriangle(5);
//     }
// }


// class pattern{
//     public static void oneAndZeroes(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){  //even number
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         oneAndZeroes(5);
//     }
// }


// class pattern{
//     public static void butterfly(int n){
//         //first half codee
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int space = 2*n-2*i;
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // second half code
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int space = 2*n-2*i;
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         butterfly(12);
//     }
// }


// class pattern{
//     public static void palindromicPattern(int n){
//         for(int i=1;i<=n;i++){
//             int j;
//             for(j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             int k = i;
//             for(;j<=n;j++){
//                 System.out.print(k--);
//             }
//             k=2;
//             for(;j<=n+i-1;j++){
//                 System.out.print(k++);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         palindromicPattern(5);
//     }
// }



// class pattern{
//     public static void solid_Rhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         solid_Rhombus(5);
//     }
// }


// class pattern{
//     public static void hollowRhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             if(i==1 || i==n){
//                 for(int j=1;j<=n;j++){
//                     System.out.print("*");
//                 }
//             }else{
//                 for(int j=1;j<=n;j++){
//                     if(j==1 || j==n){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollowRhombus(5);
//     }
// }


// class pattern{
//     public static void numberPattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int j=i-1;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         numberPattern(5);
//     }
// }

// class pattern{
//     public static void diamont_pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         diamont_pattern(5);
//     }
// }