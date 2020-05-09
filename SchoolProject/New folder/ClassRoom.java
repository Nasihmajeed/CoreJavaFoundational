import java.util.Scanner;

public class ClassRoom
{
	Student[] students;
	Teacher[] teachers;
	String classNo;
	

	public void classRoomDetalis()
	{
		students=new Student[2];
		teachers=new Teacher[1];

		students[0]=new Student();
		students[1]=new Student();

		teachers[0]=new Teacher();
		
		 

		
		

		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter classno");
		classNo=myObj.nextLine();
		

		teachers[0].teacherDeatails();
		

		students[0].studentDetails();
		students[1].studentDetails();

		students[0].readTotalMarks();
		students[1].readTotalMarks();

		
	}

	public void printClassnumber()
	{
		System.out.println("The class number is"+classNo);



		

		students[0].printStudentDetails();
		students[1].printStudentDetails();

		students[0].readTotalMarks();
		students[1].readTotalMarks();

		teachers[0].printTeacherDetails();
		


	}

	
}