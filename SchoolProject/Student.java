public class Student
{
	String studentName;
	//float marks;

	float maths,science,english,total ;
	
	
	
	
	public void setName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public String getName()
	{
		return studentName;
		
	}
	public void setMarks(float maths,float science,float english)
	{
		this.maths=maths;
		this.science=science;
		this.english=english;
		
		
	}
	
	
	public void displayStudentDetails(Student s)
	{
		System.out.println("Student name: "+s.getName());
		System.out.println("-------------------");
		System.out.println("Marks in Maths: "+s.maths+"English: "+s.english+"Science: "+s.science);
		System.out.println("-------------------");
		
	}
	
	
	
	
	public void marksTotal()
	{
		total=maths+science+english;
		System.out.println("-------------------");
		System.out.println("Total Marks: "+total);
	}
	
	
	
	
	
}