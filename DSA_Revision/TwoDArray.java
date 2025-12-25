 
import  java.util.*;
public class TwoDArray {
    // spiral matrix
    public static void spiralMatrix(int arr[][], int r, int c) {
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            // top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            // right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }


    public static int diagonalSum(int martix[][]){
                int sum = 0;
                for(int i = 0; i<martix.length;i++){
                    // pd
                    sum+= martix[i][i];
                    // sd
                    if(i!=martix.length-1-i){
                        sum+=martix[i][martix.length-i-1];
                    }
                }
                return sum;
        
            }


    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int r = arr.length;
        int c = arr[0].length;
        System.out.println("Spiral Matrix:");
        spiralMatrix(arr, r, c);
        System.out.println();
        System.out.println("Diagonal Sum: " + diagonalSum(arr));


    }
}
