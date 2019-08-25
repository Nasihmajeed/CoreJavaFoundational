import java.util.Scanner; 

public class Classroom
{
	int std;
	Teacher teacher;
	Student student;
	Subject subject;
	public Classroom(int cStd)
	{
		std=cStd;
	}

	public void scan()
	{
		Scanner read=new Scanner(System.in);
		System.out.println(" enter teacher name ");
		String teacherName=read.nextLine();
		System.out.println(" enter student name");
		String studentName=read.nextLine();
		System.out.println(" enter student rollno");
		int rollNo=read.nextInt();
		System.out.println(" enter subject name");
		String subjectName=read.next();
		System.out.println(" enter marks");
		int subMarks=read.nextInt();

		teacher=new Teacher(teacherName);
		student=new Student(studentName,rollNo);
		subject=new Subject(subjectName,subMarks);
	}

	public void print()
	{
		System.out.println(" standard :- "+std);
		teacher.print();
		student.print();
		subject.print();
	}
	
}
