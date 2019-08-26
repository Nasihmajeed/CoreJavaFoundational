import java.util.Scanner; 
public class Student
{
	String studentName;
	int studentId;
	Subject subjects=new Subject("maths",26);
	public Student(String stName,int stId)
	{
		studentName=stName;
		studentId=stId;
	}
	public void printstudentDetails()
	{	
		System.out.println(" student name is "+studentName);
		System.out.println(" student id is "+studentId);
		subjects.printsubDetails();
	}
}
    