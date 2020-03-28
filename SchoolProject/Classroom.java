import java.util.*;
public class Classroom
{
	String cName;
	int totStudent;
	Student[] st;
	Teacher t = new Teacher();
	 
	public void setClassroomDetails()
	{
		Scanner in = new Scanner(System.in);
		totStudent = in.nextInt();
		in.nextLine();
		System.out.println("Class Name :\t");
		cName = in.nextLine();	
		
		//********Student Details**************
		st = new Student[this.totStudent];
		for(int i=0;i<this.totStudent;i++)
		{
			st[i] = new Student();
			System.out.println("Enter Student " + (i+1) +" Details") ;
			st[i].setStudentDetails();
		}
		//**********Teacher******
		t.setTeacherDetails();
		

	}
	
	
	
	void printClassDetails()
	{
		
		System.out.println("Class Name : "+this.cName);
		System.out.println("Number Of Students = "+this.totStudent+"\n");
		System.out.println("Student Info\n");
		System.out.println("*****************************");
		System.out.println("Student Name     -     Roll Number     -     Total Mark     -     percentage     -     Reslut");
		for(int i=0;i<totStudent;i++)
		{
			st[i].printStudentDetails();
		}
		
		
		
	}
	void printTeacherDetails()
	{
		
		System.out.println("\n\nFaculty Info");
		System.out.println("*****************************");
		t.printTeacher();
		System.out.println("*****************************");

	}
}