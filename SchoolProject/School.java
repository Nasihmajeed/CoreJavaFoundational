import java.util.Scanner;

public class School
{
	Classroom classroom = new Classroom();
	Scanner scanner;
	
	public void printName()
	{
		System.out.println(" \n KANNADI HIGHER SECONDARY SCHOOL");
		System.out.println(" \n ");
	}

	public void setClassroom()
	{
	  scanner = new Scanner(System.in);
	  System.out.println("enter the division: ");
	  classroom.division = scanner.nextInt();
	  System.out.println("enter the department: ");
	  classroom.dept = scanner.next();
	  System.out.println("enter the name of class teacher: ");
	  classroom.teacher = scanner.next();
	  System.out.println(" \n ");
	}

	 public void getClassroom()
     {
     	System.out.println("division: "+classroom.division);
    	System.out.println("department: "+classroom.dept);
    	System.out.println("class teacher: "+classroom.teacher);
    	System.out.println(" \n ");
    }
		
	public void getSchool()
	{	

		classroom.setStudents();
		classroom.getStudents();
	}
	
}

