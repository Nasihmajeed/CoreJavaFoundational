import java.util.Scanner;
public class Subject
{
	String subName;
	int sum,mark;
	public Subject(String subname,int mrk )
	{
		subName=subname;
		mark=mrk;
	}
	public void printdetail()
	{

		System.out.println("subject :" +subName);
		System.out.println("mark :" +mark);
	}
}