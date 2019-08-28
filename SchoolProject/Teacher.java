import java.util.Scanner;
public class Teacher
{
	String teachername;
	String subject;
	public Teacher(String tname,String sub)
	{
		teachername=tname;
		subject=sub;
			
	}
	public void printdetail()
	{
		System.out.println("teacher name :"+teachername);
		System.out.println("teacher name :"+subject);

	}
}