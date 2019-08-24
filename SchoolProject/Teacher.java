import java.util.Scanner;
public class Teacher
{
	
	String name;
	String sub;
	void getDetails()
	{
		Scanner word=new Scanner(System.in);
		System.out.println("enter teacher name");
		name=word.nextLine();
		// System.out.println("enter the subject");
		// sub=word.nextLine();
	}
	void printDetails()
	{
		System.out.println(name);
		// System.out.println(sub);
	}
}