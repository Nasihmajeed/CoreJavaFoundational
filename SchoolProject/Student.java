import java.util.Scanner;

public class Student
{
	String sname;
	
	float physics,chemistry,maths,total;
	
public void studentName()
  {
	System.out.println("Enter the name of Student : ");
	Scanner sc=new Scanner(System.in);
	sname=sc.nextLine();
	System.out.println("Name of Student is : "+sname);
   }	

	
	
public void totalMarks()
	
	{		
	System.out.println("Enter the marks of student in Physics ");
	physics=sc.nextFloat();
	
	System.out.println("Enter the marks of student in Chemistry ");
	chemistry=sc.nextFloat();
	
	System.out.println("Enter the marks of student in Maths ");
	maths=sc.nextFloat();
	
	System.out.println("Marks of the Student "+sname+" in Physics is "+physics);
	
	System.out.println("Marks of the Student " +sname+" in Chemistry is "+chemistry);
	
	System.out.println("Marks of the Student "+sname+" in Maths is "+maths);

    total=physics+chemistry+maths;
		
		
	System.out.println("Total marks obtained by the "+sname+" is : "+total);

if(physics>35)
		{
			System.out.println("Student has passed in Physics");
		}
		else
		{
			System.out.println("Student failed in Physics");
		}			
		
		if(chemistry>35)
		{
			System.out.println("Student has passed in Chemistry");
		}
		else
		{
			System.out.println("Student failed in Chemistry");
		}			
		
		if(maths>35)
		{
			System.out.println("Student has passed in Maths");
		}
		else
		{
			System.out.println("Student failed in Maths");
		}			
	}	
}

