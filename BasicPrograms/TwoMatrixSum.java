import java.util.Scanner;

public class TwoMatrixSum {
	public static void main(String args[])
	{
	int row, col,i,j;
	Scanner in = new Scanner(System.in);
	 
	System.out.println("Enter the number of rows");
	row = in.nextInt();
	 
	System.out.println("Enter the number columns");
	col = in.nextInt();
	 
	int firstMatrix[][] = new int[row][col];
	int secondMatrix[][] = new int[row][col];
	int result[][] = new int[row][col];
	 
	System.out.println("Enter the elements of firstMatrix : ");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	 
	for ( j= 0 ; j < col ;j++ )
		firstMatrix[i][j] = in.nextInt();
	 
	System.out.println();
	}
	System.out.println("Enter the elements of secondMatrix : ");
	 
	for ( i= 0 ; i < row ; i++ )
	{
	 
	for ( j= 0 ; j < col ;j++ )
		secondMatrix[i][j] = in.nextInt();
	 
	System.out.println();
	}
	 
	for ( i= 0 ; i < row ; i++ )
	for ( j= 0 ; j < col ;j++ )
	result[i][j] = firstMatrix[i][j] + secondMatrix[i][j] ; 
	 
	System.out.println("Sum of matrices : ");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(result[i][j]+"\t");
	 
	System.out.println();
	}
	 
	}
}