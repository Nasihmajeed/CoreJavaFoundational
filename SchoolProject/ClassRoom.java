import java.util.Scanner;
public class ClassRoom
{
	Student ss[]=new Student[10];
	Teacher t1=new Teacher();
	int n1;

	Scanner input =new Scanner(System.in);
	
	
void classCreat()
{
	System.out.println("Number of  Student  =");
	n1=input.nextInt();
	for(int j=1;j<=n1;j++)
	{
		ss[j]=new Student();
		ss[j].CreateStudent();
	}
	t1.CreateTeacher();
}	
	
	
	void printDetails() 
	{
		
		t1.teacherDetails() ;
		for(int i=1;i<=n1;i++)
		{
			//ss[i]=new Student();
			ss[i].studentDetails();
		}
	}
}