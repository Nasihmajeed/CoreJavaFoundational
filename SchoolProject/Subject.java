
public class Subject
{	
	String subName;
	int marks;
	public Subject(String subjectName,int subMarks)
	{
	 subName=subjectName;
	 marks=subMarks;	
	}
	
	public void print()
	{
		System.out.println(" mark obtained in "+subName+" is "+marks);
	}
	
}

