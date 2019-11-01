import java.util.Scanner;
public class School
{
static Scanner scanner = new Scanner(System.in);
String name,classRoom;
int code,noOfStudents;
Student[] students = new Student[5];
Teacher teacher = new Teacher();
void details()
 { 
	System.out.println("Enter School Name");
	name = scanner.next();
	System.out.println("Enter School Code");
	code = scanner.nextInt();
	System.out.println("Enter ClassRoom");
	classRoom = scanner.next();
	setTeacher();
	System.out.println("How Many Students");
    noOfStudents = scanner.nextInt();
	setDetails();
	System.out.println("School Name     : "+name);
	System.out.println("School Code     : "+code);
	System.out.println("ClassRoom       : "+classRoom);
	getTeacher();
	System.out.println("No Off Students : "+noOfStudents);
	getDetails();
 }
 void setDetails()
 {
	 for(int i=0;i<noOfStudents;i++)
      {
	    students[i] = new Student();
      }
	  for(int i=0;i<noOfStudents;i++)
      {
	   System.out.println("Enter Student Name");
	   students[i].name=scanner.next();
	   System.out.println("Enter Register Number");
	   students[i].regNo=scanner.nextInt(); 
	   System.out.println("Enter Physics Mark");
	   students[i].physics=scanner.nextInt();
	   System.out.println("Enter Chemistry Mark");
	   students[i].chemistry=scanner.nextInt();
	   System.out.println("Enter Maths Mark");
	   students[i].maths=scanner.nextInt();
      }
 }
 void getDetails()
 {
	 Student student = new Student();
   for(int i=0;i<noOfStudents;i++)
    {
	   System.out.println("Name        : "+students[i].name);
	   System.out.println("Register No : "+students[i].regNo);
	   System.out.println("Physics     : "+students[i].physics);
	   System.out.println("Chemistry   : "+students[i].chemistry);
	   System.out.println("Maths       : "+students[i].maths);
	   student.totalMark(students[i].physics,students[i].chemistry,students[i].maths);
    }
  }
void setTeacher()
    {
	  System.out.println("Enter Teacher Name : ");
	  teacher.name = scanner.next();
    }	
void getTeacher()
    {
	  System.out.println("Teacher Name   : "+teacher.name);
    }
}