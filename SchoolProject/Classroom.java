import java.util.Scanner;
public class Classroom
{
	int std;
    Teacher teacher;
	Student student;
	
	public Classroom(int standard)
	{
		std=standard;
	}

	 public void scan()
  	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Tr name:");
    String tName=sc.nextLine();
    teacher=new Teacher(tName);
    System.out.println("Enter Rollno:");
    int rollno=sc.nextInt();
    System.out.println("Enter Name:");
    String sName=sc.next();
    student=new Student(rollno,sName);
    student.scan();
  	}

    public void getClassroomDetails()
	{ 
		System.out.println("\nStandard "+std);
		
		teacher.getTeacherDetails();
	    student.getStudentDetails();
	}
}


