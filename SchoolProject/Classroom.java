import java.util.Scanner;
public class Classroom
{
	String standard;
	Teacher teacher;
	Student[] students;
	public Classroom(String std)
	{
		standard=std;
	}
	public void setDetails()
    {
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter the number of students"); 
	int studentNo=sc.nextInt();
	System.out.println("enter teachers name"); 
	String teacherName=sc.next();
	teacher=new Teacher(teacherName);
	students=new Student[studentNo];
	for(int i=0;i<studentNo;i++)
		{
			System.out.println("enter students id "); 
			int studentId=sc.nextInt();
			System.out.println("enter students name "); 
			String studentName=sc.next();
			students[i]=new Student(studentName,studentId);
			students[i].setDetails();
		}
		
		
	} 	
		
	public void printDetails()
	{		
		System.out.println("standard is : "+standard);
		teacher.printDetails();
		int studentNo=students.length;
		for(int i=0;i<studentNo;i++)
		{
			students[i].printDetails();
		}
	}
}	
