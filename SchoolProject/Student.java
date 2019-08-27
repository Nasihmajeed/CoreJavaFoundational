import java.util.Scanner;
public class Student
{
	int rollNo;
	String name;
    Subject[] subject;
	int total;
	
	public Student()
	{
		
	}
	public Student(int rNo,String sname)
	{
		rollNo=rNo;
		name=sname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Details of Subject");
		System.out.println("Enter no.of subjects");
		int n=sc.nextInt();
		subject=new Subject[n];
		for(int i=0;i<n;i++)
			{
			System.out.println("Enter subject Name:	");
			String sName=sc.next();
			System.out.println("Enter mark:	");
			int marks=sc.nextInt();
				subject[i]=new Subject(marks,sName);
				
			}
			System.out.println("\n");
	}
	void getStudentDetails()
	{   
		total=0;
		System.out.println("Rollno:	"+rollNo);
		System.out.println("Name:	"+name);
		for(int i=0;i<subject.length;i++)
		   {
		   		subject[i].getSubDetails();	
		   		total=total+subject[i].mark;
		   }
		   System.out.println("Total :" +total);
		   System.out.println("\n");
	}
}	