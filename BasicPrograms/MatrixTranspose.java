import java.util.Scanner;

public class MatrixTranspose {

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

			for (j = 0; j < col; j++)
				Matrix[i][j] = in.nextInt();

		}
		
		int transposeMatrix[][] = new int[col][row];
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				transposeMatrix[j][i] = Matrix[i][j];
			}

		}
		System.out.println("Transpose of a given matrix is ");
		for (i = 0; i < col; i++) {
			for (j = 0; j < row; j++) {
				System.out.print(transposeMatrix[i][j] + " ");

			}
			System.out.print("\n");
		}

	}
}