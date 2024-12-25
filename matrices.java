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
//                 {1,2,3,4},
//                 {5,6,7,8},
//                 {9,10,11,12},
//                 {13,14,15,16}
//             };
//         System.out.print("The sum of diagonal of matrix are : "+ diagonalSum(matrix));
        
//     }
// }


 