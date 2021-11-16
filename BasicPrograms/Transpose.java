import java.util.Scanner;

public class Transpose
{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);



System.out.println("TRANSPOSE OF A MATRIX");


int i,j,m,n;



System.out.println("Enter the number of Rows");
 
m=sc.nextInt();



System.out.println("Enter the number of Columns");

 n=sc.nextInt();


int matrix[][]=new int[m][n];
int T[][]=new int[m][n];


System.out.println("Enter the elements of matrix");


for(i=0;i<m;i++)

{

for( j=0;j<n;j++)

{

matrix[i][j]=sc.nextInt();

}


System.out.println("\n");
}



System.out.println("The Transpose of the given matrix is :");
for( i=0;i<m;i++)
{
for( j=0;j<n;j++)
{
System.out.print(matrix[j][i]+"  ");
}
System.out.println("\n");
}

}
}