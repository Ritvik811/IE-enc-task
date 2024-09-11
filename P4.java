import java.util.Scanner;

public class P4
{
    
    // Function to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols)
    {
        int[][] transpose = new int[cols][rows];

        // Loop to transpose the matrix
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Function to calculate the sum of elements in each column
    public static void sumOfColumns(int[][] matrix, int rows, int cols) 
    {
        System.out.println("Sum of elements in each column:");
        for (int j = 0; j < cols; j++) 
        {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) 
            {
                columnSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Creating the matrix and taking input for its elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find and display the transpose of the matrix
        int[][] transpose = transposeMatrix(matrix, rows, cols);
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // displaying the sum of elements in each column of the original matrix
        sumOfColumns(matrix, rows, cols);

        scanner.close();
    }
}