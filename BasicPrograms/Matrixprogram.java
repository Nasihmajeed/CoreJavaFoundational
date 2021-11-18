 import java.util.Scanner;
public class Matrixprogram  {
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);

int sum = 0;

System.out.println("Enter rows:");
int rows  = sc.nextInt();

System.out.println("Enter columns:");
int columns = sc.nextInt();

int matrix[][] = new int[rows][columns];

System.out.println("Enter the elements of matrix");

for(int i = 0; i <rows;i++)  {
for(int j = 0; j<columns; j++)  {
matrix[i][j] = sc.nextInt();
}

}

for(int i = 0; i< rows;i++)  {
sum = sum+matrix[0][i]; }

System.out.println("Sum of the Top row Matrix" + sum); 

int sum1 = 0;

for(int i = 0;i<rows; i++)  {
for(int j = 0; j< columns; j++)  {

if(i==j)
sum1=sum1+matrix[i][j];
}
}
System.out.println("Sum of diagonal matrix is" + sum1);

int sum2 = 0;

for(int i = 0; i< rows; i++)  {
sum2 = sum2+matrix[rows-1][i];
}

System.out.println("Sum of bottum row is" + sum2);

}
}


