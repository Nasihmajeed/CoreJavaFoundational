import java.util.*;
public class Classroom
{
	Scanner scan=new Scanner(System.in);
	String name;
	Student s1=new Student();
     
    	
	

	Teacher t=new Teacher();
	public void setDetails()
	{

		System.out.println("Enter the batch: ");
		name=scan.next();
		System.out.println("Enter the teacher name : ");
		t.name=scan.next();
		s1.setDetails();
			
	}
	public void getDetails()
	{
		System.out.println("The batch is "+name);
		System.out.println("Teacher name is "+t.name);
		s1.getDetails();
		
		
		
	}
}