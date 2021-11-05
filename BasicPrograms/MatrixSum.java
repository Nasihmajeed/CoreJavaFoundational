import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		int row, col, i, j;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		row = in.nextInt();

		System.out.println("Enter the number columns");
		col = in.nextInt();

		int Matrix[][] = new int[row][col];
		
		System.out.println("Enter the elements of Matrix : ");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {
				Matrix[i][j] = in.nextInt();
		}
		}
	 int topSum = 0;
		  for (i = 0; i < row; i++) {
		 topSum = topSum + Matrix[0][i];
		  }
		  System.out.println("Sum of top row elements of a matrix is: " + topSum);
		  int diagonalSum = 0;
		  for (i = 0; i < row; i++) {
		    diagonalSum = diagonalSum + Matrix[i][i];
		  }
		  System.out.println("Sum of diagonal elements of a matrix: " + diagonalSum);
		  int bottomSum = 0;
		  for (i = 0; i < row; i++) {
		    bottomSum = bottomSum + Matrix[row-1][i];
		  }
		  
		  System.out.println("Sum of bottom row elements of a matrix: " + bottomSum);
		}
}