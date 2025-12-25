package DSA;
// import java.util.*;
// public class matrices {
//     public static void main(String[] args) {
//         int martix[][]=new int[3][3];
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 martix[i][j] =sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.err.print(martix[i][j]+ " ");
                 
//             }
//             System.out.println();
//         }
//     }
     
    
// }


/**
 * matrices
 */
// public class matrices {
//     public static void printSpiral(int matrix[][]){
//         int startRow=0;
//         int startCol=0;
//         int endRow = matrix.length-1;
//         int endcol=matrix[0].length-1;
//         while (startRow<=endRow && startCol<=endcol) {
//             // top
//             for(int j=startCol;j<=endcol;j++){
//                 System.out.print(matrix[startRow][j]+ " ");
//             }
//             // right
//             for(int i = startRow+1;i<=endRow;i++){
//                 System.out.print(matrix[i][endcol]+" ");
//             }
//             // bottom
//             for(int j=endcol-1;j>=startCol+1;j--){
//                 if(startRow==endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+" ");

//             }
//             // left
//             for(int i = endRow-1;i>=startRow+1;i--){
//                 if(startCol==endcol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }
//             startCol++;
//             startRow++;
//             endcol--;
//             endRow--;
            
//         }
         
//     }

//     public static void main(String[] args) {
//         int matrix[][]={
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         printSpiral(matrix);
//     }
// }


/**
 * matrices
//  */
// public class matrices {
//     public static int diagonalSum(int martix[][]){
//         int sum = 0;
//         for(int i = 0; i<martix.length;i++){
//             // pd
//             sum+= martix[i][i];
//             // sd
//             if(i!=martix.length-1-i){
//                 sum+=martix[i][martix.length-i-1];
//             }
//         }
//         return sum;

//     }

//     public static void main(String[] args) {
//         int matrix[][]={
//                 {1,2,3},
//                 {5,6,7},
//                 {9,10,11},
//             };
//         System.out.print("The sum of diagonal of matrix are : "+ diagonalSum(matrix));
        
//     }
// }

// class matrices{
//     public static void straircaseSearch(int matrix[][],int target){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int i = 0;
//         int j = m-1;
//         while (i<n && j>=0) {
//             if(matrix[i][j]==target){
//                 System.out.println("Element found at index "+ i + " " + j);
//                 return;
//             }
//             if(matrix[i][j]>target){
//                 j--;
//             }else{
//                 i++;
//             }
//         }
//         System.out.println("Element not found");
//     }
//     public static void main(String[] args) {
//         int matrix[][]={
//             {10,20,30,40},
//             {15,25,35,45},
//             {27,29,37,48},
//             {32,33,39,50}
//         };
//         straircaseSearch(matrix, 1000);
//     }
// }



// practices  question of apna college
// class matrices{
//     public static void  main(String[] args){
//         int a[][]={{1,7,3},{4,7,6},{7,8,7}};
//         int count = 0;
//         for(int i =0; i<a.length;i++){
//             for(int j =0;j<a[i].length;j++){
//                 if(a[i][j]==7){
//                     count++;
//                 }
//             }  
//         }
//         System.out.println(count);

//     }
// }

// class matrices{
//     public static void main(String[] args){
//         int a[][]={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         int transpose[][]=new int[3][3];
//         for(int i =0;i<a.length;i++){
//             for(int j =0;j<a[i].length;j++){
//                 transpose[i][j]=a[j][i];
//             }
//         }
//         for(int i =0;i<transpose.length;i++){
//             for(int j =0;j<transpose[i].length;j++){
//                 System.out.print(transpose[i][j]+" ");
//             }
//             System.out.println();
//     }
// }
// }