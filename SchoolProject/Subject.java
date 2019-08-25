public class Subject
{
	String subName;
	int mark;
	public Subject(String sname, int smark)
	{
		subName=sname;
		mark=smark;		
	}
	public void print()
	{
		System.out.println(" subject name is "+subName);
		System.out.println(" mark is "+mark);
		
	}
}
