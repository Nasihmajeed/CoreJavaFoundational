import java.util.*;
public class Classroom
{
	String cName;
	int totStudent;
	Student[] st;
	Teacher[] t = new Teacher[3];
	 
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
		setTeacherDetails();

	}
	
	public void  setTeacherDetails()
	{
		t[0] = new Teacher("smitha","Chemistry");
		t[1] = new Teacher("Subin","Physics");
		t[2] = new Teacher("jisha" , "Maths");
	}
	void printClassDetails()
	{
		
		System.out.println("Class Name : "+this.cName);
		System.out.println("Number Of Students = "+this.totStudent+"\n");
		System.out.println("Student Info\n");
		System.out.println("*****************************");
		for(int i=0;i<totStudent;i++)
		{
			st[i].printStudentDetails();
		}
		
		
		
	}
	void printTeacherDetails()
	{
		
		System.out.println("\n\nFaculty Info");
		System.out.println("*****************************");
		for(int i=0;i<3;i++)
		{
			System.out.println("\nTeacher Name : "+t[i].tName);
			System.out.println("\nTeacher's Subject : "+t[i].tSub);
		}
		System.out.println("*****************************");

	}
}