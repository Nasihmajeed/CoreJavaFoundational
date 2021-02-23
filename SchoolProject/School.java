import java.util.Scanner;
public class School
{
	Classroom classroom = new Classroom();
	Scanner scanner;
	
	public void printName()
	{
		System.out.println(" \n GVHSS CHERPULASSERY");
		System.out.println(" \n -------------------");
		System.out.println(" \n ");
	}

	public void setClassroom()
	{
	  scanner = new Scanner(System.in);
	  System.out.println("Enter the Class: ");
	  classroom.clas = scanner.nextInt();
	  System.out.println("Enter the Division: ");
	  classroom.division = scanner.next();
	  System.out.println("Enter the name of class teacher: ");
	  classroom.teacher = scanner.next();
	  System.out.println(" \n ");
	}

	 public void getClassroom()
     {
     	System.out.println("Class: "+classroom.clas);
    	System.out.println("Divisiont: "+classroom.division);
    	System.out.println("Class teacher: "+classroom.teacher);
    	System.out.println(" \n ");
    }
		
	public void getSchool()
	{	

		classroom.setStudents();
		classroom.getStudents();
		classroom.topper();
	}
	
}