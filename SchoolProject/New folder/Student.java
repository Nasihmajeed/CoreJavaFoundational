import java.util.Scanner;
public class Student
{
	String name;
	String regNo;
	
	Integer total;

	Subject[] subjects;

	public void studentDetails()
	{

		subjects=new Subject[2];

		Scanner mystud=new Scanner(System.in);
		System.out.println("Enter student name");
		name=mystud.nextLine();
		
		Scanner regnum=new Scanner(System.in);
		System.out.println("Enter register number ");
		regNo=regnum.nextLine();
		
		subjects[0]=new Subject();
		subjects[1]=new Subject();
		



		subjects[0].subjectDetails();
		subjects[1].subjectDetails();
		





	}


	

		

	public void  readTotalMarks()
	{
		total=subjects[0].mark+subjects[1].mark;
	}
	public void printStudentDetails()
	{
		System.out.println("The student name is"+name);

		System.out.println("The register number is"+regNo);



		subjects[0].printSubjectDetails();
		subjects[1].printSubjectDetails();
		

		
		
		



		

	}
}