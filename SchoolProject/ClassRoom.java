import java.util.Scanner;
public class ClassRoom
{
	int n1,n2;
	Student ss1,ss2;
	Teacher t1;
	Scanner input =new Scanner(System.in);
	void CreateStudent()
	{
		ss1=new Student();
		ss2=new Student();
		System.out.println("Name of 1st Student  =");
		ss1.name=input.next();
		System.out.println("Roll no.=");
		ss1.roll=input.nextInt();
		System.out.println("Name of 2nd student =");
		ss2.name=input.next();
		System.out.println("Roll no.=");
		ss2.roll=input.nextInt();
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
		ss1.studentDetails();
		ss2.studentDetails();
	}
}