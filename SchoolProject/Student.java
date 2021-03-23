import java.util.*;
public class Student
{
	String studentName;
	//float marks;

	float maths,science,english,total ;
	
	
	
	Scanner sc=new Scanner(System.in);
	
	
	public void setName()
	{
		System.out.println("Enter the Student name:");
		studentName=sc.nextLine();
		
		
		//this.studentName=studentName;
	}
	
	public String getName()
	{
		return studentName;
		
	}
	public void setMarks()
	{
	System.out.println("Enter the Marks in Maths:");
	maths=sc.nextFloat();
	System.out.println("Enter the Marks in Science:");
	science=sc.nextFloat();
	System.out.println("Enter the Marks in English:");
	english=sc.nextFloat();	
		
	/*this.maths=maths;
		this.science=science;
		this.english=english;
		*/
		
	}
	
	
	public void displayStudentDetails(Student s)
	{
		System.out.println("Student name: "+s.getName());
		System.out.println("-------------------");
		System.out.println("Marks scored in Maths: "+s.maths);
		System.out.println("Marks scored in English: "+s.english);
		System.out.println("Marks scored in Science: "+s.science);
		System.out.println("-------------------");
		
	}
	
	
	
	
	public float marksTotal()
	{
		total=maths+science+english;
		System.out.println("-------------------");
		System.out.println("Total Marks: "+total);
		System.out.println("-------------------");
		return total;
	}
	
	
	
	
	
}