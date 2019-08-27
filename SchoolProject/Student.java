import java.util.Scanner; 
public class Student
{
	String studentName;
	int studentId;
	Subject[] subjects;
	public Student(String stName,int stId)
	{
		studentName=stName;
		studentId=stId;
	}
	public void setDetails()
	{
		Scanner sc=new Scanner(System.in);			
		System.out.println("enter the number of subjects");		
		int subjectNo=sc.nextInt();
		subjects=new Subject[subjectNo];

		for(int i=0;i<subjectNo;i++)
		{
			System.out.println("enter the subject name:");
			String subjectName=sc.next();
			System.out.println("enter the mark:");
			int mark=sc.nextInt();
			subjects[i]=new Subject(subjectName,mark);			
		}
	}
	public void printDetails()
	{	
		System.out.println(" student name is "+studentName);
		System.out.println(" student id is "+studentId);
		int subjectNo=subjects.length;
		for(int i=0;i<subjectNo;i++)
		{	
			subjects[i].printDetails();
		}
	}
}
    