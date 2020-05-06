import java.util.*;
public class Subject
{
	String subjectName;
	int subjectMark;

	void markCreate()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Subject Name : ");
		subjectName = sc.nextLine(); 
		System.out.println("Enter "+ subjectName  +" Mark : ");
		subjectMark = sc.nextInt();
	}


	void printSubjectDetails()
	{
		System.out.println(this.subjectName +"\t"+this.subjectMark+"\n");

	}

}