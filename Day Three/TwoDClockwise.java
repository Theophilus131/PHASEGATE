import java.util.Arrays;

public class TwoDClockwise {

    public static int[][] rotateClockwise(int[][] originalMatrix) {
        
		int totalRows = originalMatrix.length; 

        	int[][] rotatedMatrix = new int[totalRows][totalRows];

                for (int row = 0; row < totalRows; row++) {

            	for (int col = 0; col < totalRows; col++) {

             rotatedMatrix[col][totalRows - 1 - row] = originalMatrix[row][col];
            }
        }

        	return rotatedMatrix; 
    }

        public static void main(String[] args) {
       
        int[][] inputMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    	int[][] resultMatrix = rotateClockwise(inputMatrix);

        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
