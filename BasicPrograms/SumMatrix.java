import java.util.Scanner;

public class Summatrix  {

public static void main(String [] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the rows:");
int rows = sc.nextInt();

System.out.println("Enter the column:");
int column = sc.nextInt();

int matrix1[][]=new int[rows][column];
int matrix2[][]=new int[rows][column];
int matrix3[][]=new int[rows][column];
  

  System.out.println("Enter the elements of first matrix:");

  for (int i = 0; i < rows; i++) {
   
    for (int j = 0; j < column; j++) {
     matrix1[i][j]=sc.nextInt();
    
    }
    
  }
  

  System.out.println("enter the element of second matrix:");
  for (int i = 0; i < rows; i++) {
    
    for (int j = 0; j <column ; j++) {
    matrix2[i][j] = sc.nextInt();
        
    }
   
  }
  	
  for (int i = 0; i < rows; i++) {
    
    for (int j = 0; j < column; j++) {
    matrix3[i][j]=matrix1[i][j]+matrix2[i][j]; 
    }
    
  }
  System.out.println("sum of given matrix is");
for(int i = 0; i < rows; i++)  {
for(int j= 0; j < column; j++)  {
System.out.println(matrix3[i][j]);
}
}
}
}