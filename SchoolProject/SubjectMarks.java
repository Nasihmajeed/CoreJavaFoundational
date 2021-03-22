class SubjectMarks
{
	float maths,science,english,total;
	
	public void checkMarks(Student s)
	{
		if(s[].maths>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in Maths");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in maths");
			
		}
		if(s[].science>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in Science");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in Science");
			
		}
		if(s[].english>=35)
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
		System.out.println("--------------------------")
		System.out.println("Total Marks: "+total);
	}
	
}