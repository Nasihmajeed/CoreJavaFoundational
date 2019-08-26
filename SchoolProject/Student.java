import java.util.Scanner; 
public class Student
{
	String studentName;
	int studentId;
	Subject subjects;
	public Student(String stName,int stId)
	{
		studentName=stName;
		studentId=stId;
	}
	public void setDetails()
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter the subject name:");
		String subjectName=sc.nextLine();
		System.out.println("enter the mark:");
		int mark=sc.nextInt();
		subjects=new Subject(subjectName,mark);
	}
	public void printstudentDetails()
	{	
		System.out.println(" student name is "+studentName);
		System.out.println(" student id is "+studentId);
		subjects.printsubDetails();
	}
}
    