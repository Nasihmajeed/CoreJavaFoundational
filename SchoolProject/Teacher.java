import java.util.*;
public class Teacher
{
	String teacherName;
	Subject subject = new Subject();

	void createTeacher()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Teacher Name :");
		teacherName = sc.nextLine();
		System.out.println("Subject Name :");
		subject.subjectName= sc.nextLine();
	}

	void printTeacherDetails()
	{
		System.out.println("Teacher Name : "+this.teacherName);
		
		System.out.println("Subject Name : "+this.subject.subjectName);
					
	}

}