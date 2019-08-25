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
		teacher=new Teacher("radha");
		student=new Student("arun",10);
		subject=new Subject("maths",99);
	}

	public void print()
	{
		System.out.println(" standard :- "+std);
		teacher.print();
		student.print();
		subject.print();
	}
	
}