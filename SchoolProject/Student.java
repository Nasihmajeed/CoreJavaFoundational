import java.util.*;
public class Student
{
	String studentName;

	float maths,science,english,total ;
	
	Scanner sc=new Scanner(System.in);
	
	public void setName()
	{
		System.out.println("Enter the Student name:");
		studentName=sc.nextLine();
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
		
	}
	
	
	public void displayStudent(Student s)
	{
		System.out.println("Student name: "+s.getName());
		System.out.println("-------------------");
		System.out.println("Marks scored in Maths: "+s.maths);
		System.out.println("Marks scored in English: "+s.english);
		System.out.println("Marks scored in Science: "+s.science);
		System.out.println("-------------------");
		
	}
	
	public float totalMarks()
	{
		total=maths+science+english;
		System.out.println("Total marks obtained by the student is : "+total);
		return total;
	}
}