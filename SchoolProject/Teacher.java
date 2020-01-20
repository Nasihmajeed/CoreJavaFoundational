import java.util.*;
public class Teacher
{
	String teacherName,teacherSub;


	void createTeacher()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Teacher Name :");
		teacherName = sc.nextLine();
		System.out.println("Subject Name :");
		teacherSub = sc.nextLine();
	}

	void teacherDetails()
	{
		System.out.println("Teacher Name : "+this.teacherName);
		
		System.out.println("Subject Name : "+this.teacherSub);
					
	}

}