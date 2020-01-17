import java.util.Scanner;
import java.util.Arrays;
public class ClassRoom
{
	Student ss[]=new Student[10];
	Teacher t1=new Teacher();
	int n1;
	Student temp;

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

void sorting()
{
	for (int i=1;i<=n1;i++)
	{
		for (int j=i+1;j<=n1;j++)
		{
		if(ss[i].total<ss[j].total)
		{
		temp=new Student();
		temp=ss[i];
		ss[i]=ss[j];
		ss[j]=temp;
		}
		}
	
	}
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