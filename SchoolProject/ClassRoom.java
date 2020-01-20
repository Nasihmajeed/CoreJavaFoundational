import java.util.Scanner;
import java.util.Arrays;
public class ClassRoom
{
	Student ss[];
	Teacher t1=new Teacher();
	
	static int grandtotal=0; 


static Scanner input =new Scanner(System.in);
	
	
void classCreat()
{
	
	System.out.println("Number of  Student  =");
	int students=input.nextInt();
	ss=new Student[students];
	for(int j=0;j<ss.length;j++)
	{
		ss[j]=new Student();
		ss[j].CreateStudent();
		grandtotal=grandtotal+ss[j].totalmark;

	}

	t1.CreateTeacher();
}	

void studentSorting()
{
	for (int i=0;i<ss.length;i++)
	{
		for (int j=i+1;j<ss.length;j++)
		{
		if(ss[i].totalmark<ss[j].totalmark)
		{
		Student temp=new Student();
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
		for(int i=0;i<ss.length;i++)
		{
			ss[i].studentDetails();
		}
	}
}