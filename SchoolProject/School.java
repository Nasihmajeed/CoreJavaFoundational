import java.util.Scanner;

public class School
{
	Classroom classroom = new Classroom();
	Scanner scanner;
	
	public void printName()
	{
		System.out.println("KANNADI HIGHER SECONDARY SCHOOL");
		
	}

	public void setClassroom()
	{
	  scanner = new Scanner(System.in);
	  System.out.println("enter the division: ");
	  classroom.division = scanner.nextInt();
	  System.out.println("enter the department: ");
	  classroom.dept = scanner.next();
	}

	 public void getClassroom()
     {
     	System.out.println("division: "+classroom.division);
    	System.out.println("department: "+classroom.dept);
    }
		
	public void getSchool()
	{	

		classroom.setStudents();
		classroom.getStudents();
	}
	
}

