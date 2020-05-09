import java.util.Scanner;
public class Subject
{
	String subjectName;
	Integer mark;
	

	public void subjectDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter subject name");
		subjectName=scanner.nextLine();
		

		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter subject mark ");
		mark=scanner1.nextInt();
	}

	public void printSubjectDetails()
	{
		System.out.println("The subject name is"+subjectName);

		System.out.println(" "+ mark);

	}
		
}