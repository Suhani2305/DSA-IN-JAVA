public class Basic {

    public static void hollow_rectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int rows) {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
                //first half codee
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    int space = 2*n-2*i;
                    for(int j=1;j<=space;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                // second half code
                for(int i=n;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    int space = 2*n-2*i;
                    for(int j=1;j<=space;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
             
        

    public static void main(String[] args) {
        hollow_rectangle(5, 5);
        System.out.println("***************");
        inverted_half_pyramid(5);
        System.out.println("***************");
        inverted_half_pyramid_with_numbers(5);
        System.out.println("***************");
        floyds_triangle(5);
        System.out.println("***************");
        zero_one_triangle(5);
        System.out.println("***************");
        solid_rhombus(5);
        System.out.println("***************");
        hollow_rhombus(5);
        System.out.println("***************");
        butterfly(5);
    }
}
