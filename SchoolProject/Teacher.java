import java.util.*;
public class Teacher
{
	String teacherName;
	String subject;
	Scanner sc = new Scanner(System.in);
	void createTeacher()
	{
		
		System.out.println("Enter Name Of Teacher :");
		teacherName = sc.nextLine();
		System.out.println("Enter Name Of Subject :");
		subject = sc.nextLine();
	}


	void teacherDeatils()
	{
		System.out.println("Teacher Name:"+this.teacherName);
		System.out.println("Subject Name:"+this.subject);
	}

}