import java.util.Scanner; 

public class Classroom
{
	int std;
	Teacher teacher;
	Student[] student;
	
	public Classroom(int cStd)
	{
		std=cStd;
	}

	public void scan()
	{
		Scanner read=new Scanner(System.in);
		System.out.println(" enter teacher name ");
		String teacherName=read.nextLine();

		System.out.println(" enter no of student in class ");
		int o=read.nextInt();
		student=new Student[o];
		for(int i=0;i<o;i++)
		{
			System.out.println(" enter student name");
			String studentName=read.next();
			System.out.println(" enter student rollno");
			int rollNo=read.nextInt();
			student[i]=new Student(studentName,rollNo);	
			student[i].scan();
		}
			
		teacher=new Teacher(teacherName);
	}

	public void print()
	{
		System.out.println(" standard :- "+std);
		teacher.print();
		int o=student.length;
		for(int i=0;i<o;i++)
		{
			student[i].print();
		}
		System.out.println("\n");
	}
	
}
