import java.util.*;
public class Teacher
{
	String tName;
	Subject s = new Subject();
	void setTeacherDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Teacher's Name : ");
		tName = in.nextLine();
		System.out.println("Enter the Subject Name : ");
		s.subName = in.nextLine();
	}
	void printTeacher()
	{
		System.out.println("Teacher's Name - Teacher Subject");
		System.out.println("--------------------------------");
		System.out.println(this.tName +"\t\t\t"+ s.subName);
	}
	
}