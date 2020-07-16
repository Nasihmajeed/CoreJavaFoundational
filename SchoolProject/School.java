import java.util.Scanner;

public class School
{
    System.out.println("KANNADI HIGHER SECONDARY SCHOOL");
	Scanner in = new Scanner(System.in);
	classroom classroom = new Classroom();
	System.out.println("enter the division: ");
	school.classroom.division = in.nextInt();
	System.out.println("enter the department name: ");
	school.classroom.dept = in.next();

	school.classroom.student1 = new Student();
	System.out.println("enter the name of the student: ");
	school.classroom.student1.name = in.next();
	System.out.println("enter the register number: ");
	school.classroom.student1.regNo = in.nextInt();

	school.classroom.student2 = new Student();
	System.out.println("enter the name of the student: ");
	school.classroom.student2.name = in.next();
	System.out.println("enter the register number: ");
	school.classroom.student2.regNo = in.nextInt();

	System.out.println("division: "+school.classroom.division);
	System.out.println("department: "+school.classroom.dept);

	System.out.println("student name: "+school.classroom.student1.name);
	System.out.println("register number: "+school.classroom.student1.regNo);

	System.out.println("student name: "+school.classroom.student2.name);
	System.out.println("register number: "+school.classroom.student2.regNo);

}