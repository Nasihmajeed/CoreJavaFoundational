import java.util.Scanner;

public class Classroom
{
	int division;
	String dept;
	Student student1 = new Student();
	Scanner scanner = new Scanner();

	public void printName()
	{
		System.out.println("KANNADI HIGHER SECONDARY SCHOOL");
		
	}

	public void setClassroom()
	{
	  System.out.println("enter the division: ");
	  classroom.division = scanner.nextInt();
	  System.out.println("enter the department: ");
	  classroom.dept = scanner.next();
      System.out.println("enter the name of the student: ");
      student1.name = scanner.next();
      System.out.println("enter the register number: ");
      student1.regNo = scanner.nextInt();
    }
      
     public void getClassroom()
     {
     	System.out.println("division: "+classroom.division);
    	System.out.println("department: "+classroom.dept);
        System.out.println("name: "+student1.name);
        System.out.println("department: "+student1.dept);
     }
}