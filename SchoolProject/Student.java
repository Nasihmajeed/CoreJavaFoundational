import java.util.Scanner; 

public class Student
{
	String stName;
	int rNo;
	public Student(String studentName,int rollNo)
	{
		stName=studentName;
		rNo=rollNo;
	}

	public void print()
	{
		System.out.println(" rollno of the student is "+rNo+" and name is "+stName);
	}
	
}