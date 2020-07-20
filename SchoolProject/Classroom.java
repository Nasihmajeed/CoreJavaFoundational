import java.util.Scanner;

public class Classroom
{
	int division;
	String dept;
	Student student1 = new Student();
	Student student2 = new Student();
	Student student3 = new Student();
	Scanner scanner;
	

	public void setStudents()
	{
	  scanner = new Scanner(System.in);
      System.out.println("enter the name of the student1: ");
      student1.name = scanner.next();
      System.out.println("enter the register number: ");
      student1.regNo = scanner.nextInt();
      System.out.println("enter the name of the student2: ");
      student2.name = scanner.next();
      System.out.println("enter the register number: ");
      student2.regNo = scanner.nextInt();
      System.out.println("enter the name of the student3: ");
      student3.name = scanner.next();
      System.out.println("enter the register number: ");
      student3.regNo = scanner.nextInt();
    }
      
     public void getStudents()
     {
        System.out.println("name: "+student1.name);
        System.out.println("register number: "+student1.regNo);
        System.out.println("name: "+student2.name);
        System.out.println("register number: "+student2.regNo);
        System.out.println("name: "+student3.name);
        System.out.println("register number: "+student3.regNo);
     }
}