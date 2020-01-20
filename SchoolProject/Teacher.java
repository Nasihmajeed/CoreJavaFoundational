import java.util.Scanner;
public class Teacher
{
String name;
static Scanner input =new Scanner(System.in);
void CreateTeacher()
	{
		System.out.println("Teacher=");
		name=input.next();
		
	}
	
	
	
void teacherDetails() 
	{
		System.out.println("Teacher name = "+this.name);
	
	}
}