import java.util.Scanner;
public class TDD
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in) ;
System.out.println("Enter the number of cars to be created") ;
int num=sc.nextInt() ;

for(int i=1;i<=num;i++) 
{
Car C=new Car() ;
Tyre T1=new Tyre() ;
Tyre T2=new Tyre() ;
Tyre T3=new Tyre() ;
Tyre T4=new Tyre() ;

C. t1=T1;
C. t2=T2;
C. t3=T3;
C. t4=T4;

C. cardetails() ;
C. printdetails() ;
}
}
}