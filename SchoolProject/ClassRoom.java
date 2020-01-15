import java.util.Scanner;
public class ClassRoom
{
	int n1;
	Student ss[]=new Student [5];
	Teacher t1;
	Scanner input =new Scanner(System.in);
	void CreateStudent()
	{
		for(int i=1;i<=n1;i++)
		{
		ss[i]=new Student();
		
		System.out.println("Name of "+i+"st Student  =");
		ss[i].name=input.next();
		System.out.println("Roll no.=");
		ss[i].roll=input.nextInt();
		}
	}
	void CreateTeacher()
	{
		t1=new Teacher();
		System.out.println("Teacher=");
		t1.name=input.next();
		System.out.println("Subject=");
		t1.subject=input.next();
	}
	
	void printDetails() 
	{
		
		
		
		t1.teacherDetails() ;
		for(int i=1;i<=n1;i++)
		{
		ss[i].studentDetails();
		}
	}
}