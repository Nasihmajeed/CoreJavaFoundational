import java.util.Scanner;
public class Teacher
{
String name,subject;
Scanner input =new Scanner(System.in);
void CreateTeacher()
	{
		System.out.println("Teacher=");
		name=input.next();
		System.out.println("Subject=");
		subject=input.next();
	}
	
	
	
void teacherDetails() 
	{
		System.out.println("Teacher name = "+this.name);
	
		System.out.println("Subject ="+this.subject);

		
	}
}