public class Student
{
	String studentName,topperName;
	//float marks;

	float maths,science,english,total,topperMarks;
	
	
	public void display(Student s)
	{
		System.out.println("Student name: "+s.studentName);
		System.out.println("-------------------");
		System.out.println("Marks in Maths: "+s.maths+"English: "+s.english+"Science: "+s.science);
		System.out.println("-------------------");
		
	}
	
	
	public void checkMarks(Student s)
	{
		if(s.maths>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in Maths");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in maths");
			
		}
		if(s.science>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in Science");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in Science");
			
		}
		if(s.english>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in English");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in English");
			
		}
	}
	
	public void marksTotal()
	{
		total=maths+science+english;
		System.out.println("-------------------");
		System.out.println("Total Marks: "+total);
	}
	
	
	public String findTopper(Student []s)
	{	float large=s[0].total;
		
		if(s[1].total>large)
		{	if(s[1].total>s[2].total)
			{	System.out.println("-------------------");
				
				//topper name
				topperMarks=s[1].total;
				topperName=s[1].studentName;
				
			System.out.println("Topper of the class is: "+s[1].studentName);
			}
			/*else if(s[2].total>s[1].total)
			{System.out.println("-------------------");
				System.out.println("Topper of the class is: "+s[2].studentName);
			}*/
		
			
		}
		if(s[2].total>large)
		{	if(s[2].total>s[1].total)
			{	System.out.println("-------------------");
				topperName=s[2].studentName;
				topperMarks=s[2].total;
			System.out.println("Topper of the class is: "+s[2].studentName);
			}
			else if(s[1].total>s[2].total)
			{	System.out.println("-------------------");
				topperName=s[1].studentName;
				topperMarks=s[1].total;
				System.out.println("Topper of the class is: "+s[1].studentName);
			}
		
			
		}
		else{
			System.out.println("-------------------");
			topperName=s[0].studentName;
			topperMarks=s[0].total;
		System.out.println("Topper of the class is: "+s[0].studentName);
		}
		
		return topperName;	
		
	}
	
	
}