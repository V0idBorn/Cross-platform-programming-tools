import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of rows and columns: ");

        int rowsNcolumns = scanner.nextInt();

        System.out.print("Enter symbol: ");

        char symbol = scanner.next().charAt(0);

        char[][] matrix = Solution.CreateMatrixSquare(rowsNcolumns, symbol);

        Solution.printMatrix(matrix, rowsNcolumns);

        scanner.close();

    }
}
