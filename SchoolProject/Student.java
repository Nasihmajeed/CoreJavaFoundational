import java.util.Scanner; 
public class Student
{
	String studentName;
	Subject[] subjects;	
	int tmark;
	public Student(String sname)
	{	
		studentName=sname;
	}
	public void getDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter count of subjects: ");
		int limit=scan.nextInt();
			
		
		subjects=new Subject[limit];

		
		for(int i=0;i<limit;i++)
		{
			System.out.println("enter the subject"+(i+1)+" name: ");
			String name=scan.next();
			System.out.println("enter the mark: ");
			int mark=scan.nextInt();
			tmark+=mark;
			
			subjects[i]=new Subject(name,mark); 
			
			
		}

		

		
		
	}
	public void printDetails()
	{
		int n=subjects.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(subjects[i].subName+"\n"+subjects[i].mark);
		}
		
		
		
				
	}
}