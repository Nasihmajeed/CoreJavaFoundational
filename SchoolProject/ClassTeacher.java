class ClassTeacher
{
	String classTeacherName,topperName;
	float topperMarks;
	
	
	Student s=new Student();
		
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
	
	
	
	public String topper(Student s[])
	{		String studentName;
			studentName=s[0].studentName;
			float large=s[0].total;
		
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


	
	public void classTeacherDisplay()
	{	System.out.println("----------------");
		System.out.println("Class Teacher of the class is "+classTeacherName );
	}
	
	
	
		

}