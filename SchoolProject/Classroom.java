import java.util.Scanner;
public class Classroom
{
	int std;
	String div;
	Teacher teacher;
	public Student[] student;
	public void scan()
	{
		int i,t;	
		Scanner s=new Scanner(System.in);
		System.out.println("enter division");
		div=s.nextLine();
		System.out.println("enter standard");
		std=s.nextInt();
		teacher=new Teacher();
		teacher.scan();
		System.out.println("enter number of student");
		t=s.nextInt();
		student=new Student[t];
		for(i=0;i<t;i++)
		{
			student[i]=new Student();
			student[i].scan();
		}
	}
	public void print()
	{
		int i,t;
		t=student.length;
		System.out.println("------------");
		System.out.println("standard:-"+std);
		System.out.println("division:-"+div);
		teacher.print();
		
		for(i=0;i<t;i++)
		{
			student[i].print();
		}
	}
	public void rankList()
	{
		int i,j,t;
		t=student.length;
		Student[] studentTemp=new Student[t];
		Student[] studentRank=new Student[t];
		
		
		for(i=0;i<t;i++)
		{
			studentTemp[i]=student[i];
		}
		for(i=0;i<t;i++)
		{
			for(j=0;j<t;j++)
			{
				if(studentTemp[i].totalMark>studentTemp[j].totalMark)
				{
					studentRank[1]=studentTemp[i];
					studentTemp[i]=studentTemp[j];
					studentTemp[j]=studentRank[1];
				}
			}
		}
		for(i=0;i<t;i++)
		{
			studentRank[i]=studentTemp[i];
		}
		for(i=0;i<t;i++)
		{
			System.out.println("total mark of "+studentRank[i].name+" ="+studentRank[i].totalMark);
		}
	}
}	
