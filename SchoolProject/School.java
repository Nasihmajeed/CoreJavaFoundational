public class School
{
String schoolName;

Student []s=new Student[3];
Student []s1=new Student[3];

	public void school()
	{	
		
		System.out.println("The School name is: "+schoolName);
	}

	public void schoolTopper()
	{	
		
		if(s.topperMarks>s1.topperMarks)
		{
			System.out.println("School Topper :"+s.topperName);
		}
		else
		{
			System.out.println("School Topper :"+s1.topperName);
		}
	}

}