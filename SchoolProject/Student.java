import java.util.Scanner;

public class Student
{
	String sname;
	
	float physics,chemistry,maths;
	
public void studentName()
  {
	System.out.println("Enter the name of the Student : ");
	Scanner sc=new Scanner(System.in);
	sname=sc.nextLine();
	System.out.println("Name of Student is : "+sname);
   }	
	
	
public void studentMarks()
	
	{		
	
	System.out.println("Enter the Marks obtained by the student in PHYSICS : ");
	Scanner sc=new Scanner(System.in);
	physics=sc.nextFloat();
	System.out.println("Marks of student in Physics is "+physics);
	
	System.out.println("Enter the Marks obtained by the student in CHEMISTRY : ");
	Scanner sc1=new Scanner(System.in);
	chemistry=sc1.nextFloat();
	System.out.println("Marks of student in Chemistry "+chemistry);
	
	System.out.println("Enter the Marks obtained by the student in MATHEMATICS : ");
	Scanner sc2=new Scanner(System.in);
	maths=sc2.nextFloat();
	System.out.println("Marks of student in Maths "+maths);
   }	
}


