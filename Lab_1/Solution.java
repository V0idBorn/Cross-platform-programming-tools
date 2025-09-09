/**
 * Class with methods that help to solve the task
 */
public class Solution {
/**
 * 
 * @param rowsNcolumns number of rows and columns for square matrix
 * @param symbol symbol that matrix will be filed by
 * @return method return char matrix
 */
    public static char[][] CreateMatrixSquare(int rowsNcolumns , char symbol) {

        char[][] matrix = new char[rowsNcolumns][rowsNcolumns];
        
        int centre = rowsNcolumns/2;

        for(int i = 0 ; i < rowsNcolumns ; i++){
            if(i < centre){
                for(int j = 0 ; j < centre ; j++){
                    matrix[i][j] = symbol;
                }              
            }
            if(i >= centre){
                for(int j = centre ; j < rowsNcolumns ; j++){
                    matrix[i][j] = symbol;
                }
            }
        
        }
        return matrix;
    }

    /**
     * Method for output matrix in terminal
     * @param matrix char matrix for printing in console
     * @param rowsNcolumns number of rows and columns for square matrix
     */
 public static void printMatrix(char[][] matrix , int rowsNcolumns){
    for (int i = 0; i < rowsNcolumns; i++) {
        for (int j = 0; j < rowsNcolumns; j++) {
            if (matrix[i][j] != 0) {
            System.out.print(matrix[i][j] + " ");
        } else {
            System.out.print("  "); 
        }
        }
        System.out.println(); 
    }
  } 
}

