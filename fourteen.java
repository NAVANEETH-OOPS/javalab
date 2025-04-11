import java.util.Scanner;
public class fourteen {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Matrix dimensions input
            System.out.print("Enter the number of rows for the matrices: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns for the matrices: ");
            int cols = scanner.nextInt();

            // Dynamically allocating memory for the matrices
            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];
            int[][] sumMatrix = new int[rows][cols];
            int[][] productMatrix = new int[rows][cols];

            // Reading elements for matrix1
            System.out.println("Enter elements for Matrix 1:");
            fillMatrix(matrix1, scanner);

            // Reading elements for matrix2
            System.out.println("Enter elements for Matrix 2:");
            fillMatrix(matrix2, scanner);

            // Matrix Addition
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Matrix Multiplication (only valid if rows = cols for square matrices)
            if (rows == cols) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        productMatrix[i][j] = 0;
                        for (int k = 0; k < cols; k++) {
                            productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
            }

            // Displaying the results
            System.out.println("\nMatrix 1:");
            printMatrix(matrix1);

            System.out.println("\nMatrix 2:");
            printMatrix(matrix2);

            System.out.println("\nMatrix Addition (Matrix 1 + Matrix 2):");
            printMatrix(sumMatrix);

            if (rows == cols) {
                System.out.println("\nMatrix Multiplication (Matrix 1 * Matrix 2):");
                printMatrix(productMatrix);
            } else {
                System.out.println("\nMatrix Multiplication is not possible for non-square matrices.");
            }

            scanner.close();
        }

        // Method to fill the matrix with user input
        public static void fillMatrix(int[][] matrix, Scanner scanner) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("Enter element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        // Method to print the matrix
        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


