import java.util.*;

class Matrix {
    static public int[][] Addition(int mat1[][], int mat2[][]) {
        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;

        if (row1 != row2 || col1 != col2) {
            System.out.println("Not a valid matrix");
            int[][] o = null;
            return o;
        }

        int[][] result = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }


    static public int[][] Multiplication(int mat1[][], int mat2[][]) {
        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;

        if (col1 != row2) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row1, col1;
        int row2, col2;
        System.out.println("Enter dimensions of first matrix:");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        System.out.println("Enter dimensions of second matrix:");
        row2 = sc.nextInt();
        col2 = sc.nextInt();

        if (row1 != row2 || col1 != col2) {
            System.out.println("Matrices dimensions do not match");
            return;
        }

        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] add = Addition(mat1, mat2);
        int[][] mul = Multiplication(mat1, mat2);

        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < add.length; i++) {
            for (int j = 0; j < add[0].length; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
