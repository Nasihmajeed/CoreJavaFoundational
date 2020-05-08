import java.util.Scanner;
public class Teacher
{
	String teacherName;
	String subject;

	public void teacherDeatails()
	{
		Scanner mytech=new Scanner(System.in);
		System.out.println("Enter teacher name");
		teacherName=mytech.nextLine();
		
		Scanner mytech1=new Scanner(System.in);
		System.out.println("Enter subject name");
		subject=mytech1.nextLine();
		

	}

	public void printTeacherDetails()
	{
		System.out.println("The teacher name is"+teacherName);

		System.out.println("The subject is"+subject);
	}
}