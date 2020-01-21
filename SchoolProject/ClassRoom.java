import java.util.Scanner;
import java.util.Arrays;
public class ClassRoom
{
	Student student[];
	Teacher teacher=new Teacher();
	int num;
	
	
static Scanner input =new Scanner(System.in);
	
	
void classCreat()
{
	
	System.out.println("Number of  Student  =");
	int students=input.nextInt();
	num=num+students;
	student=new Student[students];
	for(int j=0;j<student.length;j++)
	{
		student[j]=new Student();
		student[j].CreateStudent();
		
	}

	teacher.CreateTeacher();
}	

void studentSorting()
{
	for (int i=0;i<student.length;i++)
	{
		for (int j=i+1;j<student.length;j++)
		{
		if(student[i].totalmark<student[j].totalmark)
		{
		Student temp=new Student();
		temp=student[i];
		student[i]=student[j];
		student[j]=temp;
		}
		}
	
	}
}


	
	void printDetails() 
	{
		
		teacher.teacherDetails() ;
		for(int i=0;i<student.length;i++)
		{
			student[i].studentDetails();
		}
	}
}