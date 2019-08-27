import java.util.Scanner; 
public class Subject
{
	String subjectName;
	int mark;
	public Subject(String subName,int subMark)
	{
		subjectName=subName;
		mark=subMark;			
	}
	public void printDetails()
	{
		System.out.println(" subject name is "+subjectName);
		System.out.println(" mark is "+mark);
		
	}
}
	