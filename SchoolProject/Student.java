import java.util.Scanner;
public class Student
{
	int rollno;
	String name;
    Subject subject;

	public Student(int stRollno,String stName)
	{
		rollno=stRollno;
		name=stName;
	}
	void getStudentDetails()
	{   
		subject=new Subject(40,"Chemistry");
		System.out.println("Rollno:	"+rollno);
		System.out.println("Name:	"+name);
		subject.getSubDetails();	
		System.out.println("\n");
	}
}


