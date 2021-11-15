import java.util.Scanner;

public class Matrixaddition

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);


System.out.println("MATRIX ADDITION");


int i,j,m,n;


System.out.println("Enter the number of Rows");
 
m=sc.nextInt();


System.out.println("Enter the number of Columns");

 n=sc.nextInt();


int matrix1[][]=new int[m][n];

int matrix2[][]=new int[m][n];

int sum[][]=new int[m][n];


System.out.println("Enter the elements of matrix1");


for(i=0;i<m;i++)

{

for( j=0;j<n;j++)

{

matrix1[i][j]=sc.nextInt();

}

}


System.out.println("Enter the elements of matrix2");


for(i=0;i<m;i++)

{

for( j=0;j<n;j++)

{

matrix2[i][j]=sc.nextInt();


}

}

for( i=0;i<m;i++)

{

for(j=0;j<n;j++)

{

sum[i][j]=matrix1[i][j]+matrix2[i][j];

}
}

System.out.println("The sum of given 2 matrices is:");

for( i=0;i<m;i++)

{

for(j=0;j<n;j++)

{

System.out.print(sum[i][j]+"\n");

}
}

}}