import java.util.Scanner; 
public class Student
{
	String stName;
	int rNo;
	Subject[] subject;

	public Student(String studentName,int rollNo)
	{
		stName=studentName;
		rNo=rollNo;
	}
	
	public void scan()
	{
		Scanner read=new Scanner(System.in);
		System.out.println(" enter no of subjects");
		int p=read.nextInt();
		subject=new Subject[p];
		for(int i=0;i<p;i++)
		{
			System.out.println(" enter subject name");
			String subjectName=read.next();
			System.out.println(" enter marks");
			int subMarks=read.nextInt();
			subject[i]=new Subject(subjectName,subMarks);
		}
	}

	public void print()
	{
		System.out.println(" rollno of the student is "+rNo+" and name is "+stName);
		int p=subject.length;
		for(int i=0;i<p;i++)
		{
			subject[i].print();
		}
	}
	
}
