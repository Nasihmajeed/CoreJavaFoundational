import java.util.Scanner;
public class Student
{
	String name;
	String regNo;
	
	Integer total;

	Subject subject1;
	Subject subject2;
	Subject subject3;
	Subject subject4;

	public void studentDetails()
	{

		subject1=new Subject();
		subject2=new Subject();
		subject3=new Subject();
		subject4=new Subject();

		Scanner mystud=new Scanner(System.in);
		System.out.println("Enter student name");
		name=mystud.nextLine();
		
		Scanner regnum=new Scanner(System.in);
		System.out.println("Enter register number ");
		regNo=regnum.nextLine();
		
		subject1.subjectDetails();
		subject2.subjectDetails();
		subject3.subjectDetails();
		subject4.subjectDetails();




	}

	public void  readTotalMarks()
	{
		total=subject1.mark+subject2.mark+subject3.mark+subject4.mark;
	}

	public void printStudentDetails()
	{
		System.out.println("The student name is"+name);

		System.out.println("The register number is"+regNo);
	}
}