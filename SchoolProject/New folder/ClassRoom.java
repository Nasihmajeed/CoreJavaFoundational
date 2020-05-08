import java.util.Scanner;

public class ClassRoom
{
	Student s1;
	Student s2;

	Teacher t1;
	Teacher t2;

	String classNo;
	

	public void classRoomDetalis()
	{
		 s1=new Student();
		 s2=new Student();

		 t1=new Teacher();
		 t2=new Teacher();

		
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter classno");
		classNo=myObj.nextLine();
		

		t1.teacherDeatails();
		t2.teacherDeatails();

		s1.studentDetails();
		s2.studentDetails();

		s1.readTotalMarks();
		s2.readTotalMarks();

	}

	public void printClassnumber()
	{
		System.out.println("The class number is"+classNo);

	}

	
}