import java.util.Scanner;
public class Student
{
Mark mr=new Mark();	
int roll,n1;
String name;
Scanner input =new Scanner(System.in);
void CreateStudent()
	{
		System.out.println("Name of  Student  =");
		name=input.next();
		System.out.println("Roll no.=");
		roll=input.nextInt();
		mr.MarkCreat();
	}

void studentDetails() 
	{
		System.out.println("\n\nStudent name = "+this.name);
		
		System.out.println("roll number  ="+this.roll);
	mr.MarkDisplay();
		
	}
}