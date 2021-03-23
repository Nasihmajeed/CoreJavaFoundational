import java.util.*;
public class Standard
{
	String standard;
	
	String classTopper;	
	
	float topMarks;
	
	Scanner sc=new Scanner(System.in);
	
	
	
	ClassTeacher c=new ClassTeacher();
	Student s=new Student();  
	
	Student s1[]=new Student[3];
	
//ArrayList<Student> st=new ArrayList<>();


public void initializeArray()
{
	
	s1[0] =new Student();	
	s1[1] =new Student();	
	s1[2] =new Student();
}	
		

public void setStandard()
{
System.out.println("Enter the Standard: ");
		standard=sc.nextLine();
			
}

	public void setStudent()
	{
		
		initializeArray();
		
			s1[0].setName();
		s1[0].setMarks();
		
		s1[1].setName();
		s1[1].setMarks();
		
		s1[2].setName();
		s1[2].setMarks();
		
		c.teacherName();
		
	}
	
	public void displayStandard()
	{
		
		System.out.println("-------------------");
		System.out.println(standard+" th Standard");
		System.out.println("-------------------");
		s1[0].displayStudentDetails(s1[0]);
		c.checkMarks(s1[0]);
		s1[0].marksTotal();	
		
		s1[1].displayStudentDetails(s1[1]);
		c.checkMarks(s1[1]);
		s1[1].marksTotal();	
		
		s1[2].displayStudentDetails(s1[2]);
		c.checkMarks(s1[2]);
		s1[2].marksTotal();	
		
		
		c.classTeacherDisplay();	
			
			
		
	}
	
	public void findClassToppers()
	{	
		System.out.println("----------Class Topper---------");
		classTopper=c.topper(s1);
		
			topMarks=c.topperMarks;
		System.out.println("Topper of class :"+standard+" classTopper: "+classTopper+" with "+topMarks);
		System.out.println("-------------------");
		
		
		
		
		
	}
	
	
	
	
	
	
}