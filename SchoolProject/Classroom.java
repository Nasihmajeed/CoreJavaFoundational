import java.util.Scanner;
public class Classroom
{
	String standard;
	Teacher teacher;
	Student students;
	public Classroom(String std)
	{
		standard=std;
	}
	public void setDetails()
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter teachers name"); 
	String teacherName=sc.nextLine();
	teacher=new Teacher(teacherName);	

	System.out.println("enter students name and id "); 
	String studentName=sc.nextLine();	
	int studentId=sc.nextInt();
	students=new Student(studentName,studentId);
	students.setDetails();	
	} 	
	public void printDetails()
	{		
		System.out.println("standard is : "+standard);
		students.printstudentDetails();
		teacher.printteacherDetails();
	}
}	
