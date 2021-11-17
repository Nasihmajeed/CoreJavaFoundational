import java.util.Scanner;

public class Matrixoperation
{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);


System.out.println("MATRIX OPERATION");


int i,j,m,n;


System.out.println("Enter the number of Rows");
 
m=sc.nextInt();


System.out.println("Enter the number of Columns");

 n=sc.nextInt();


int matrix[][]=new int[m][n];



System.out.println("Enter the elements of matrix");


for(i=0;i<m;i++)

{

for( j=0;j<n;j++)

{

matrix[i][j]=sc.nextInt();

}

}



int Tsum=0;

for(i=0;i<n;i++)
{
Tsum=Tsum+matrix[0][i];
}

System.out.println("The sum of the top row elements of the given matrix is :"+Tsum);


int Dsum=0;

for(i=0;i<m;i++)
{
Dsum=Dsum+matrix[i][i];
}

System.out.println("The sum of the diagonal row elements of the given matrix is :"+Dsum);


int Bsum=0;

for(i=0;i<m;i++) 
{
if (i==m) 
{
for(j=0;j<n;j++) 
{
Bsum=Bsum+matrix[i][j];
}
}
}
System.out.println("The sum of the bottom row elements of the given matrix is :"+Bsum);

}
}
