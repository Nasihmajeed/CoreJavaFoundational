import java.util.Scanner;
public class Classroom
{
	String standard;
	Teacher teacher=new Teacher("deepa");
	Student students=new Student("rinu",101);
	public Classroom(String std)
	{
		standard=std;
	} 	
	public void printDetails()
	{		
		System.out.println("standard is : "+standard);
		students.printstudentDetails();
		teacher.printteacherDetails();
	}
}	