public class Subject
{
	String subjectName;
	int mark;
	public Subject(String subName,int subMark)
	{
		subjectName=subName;
		mark=subMark;
	}
	public void print()
	{
		System.out.println("mark in "+subjectName+" is "+mark);
		
	}
}