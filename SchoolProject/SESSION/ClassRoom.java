import java.util.Scanner;

public class ClassRoom
{
	Student s1=new Student();
	Student s2=new Student();

	Teacher t1=new Teacher();
	Teacher t2=new Teacher();

	String classNo;

	public void classRoomDetalis()
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter classno");
		classNo=myObj.nextLine();
		System.out.println("The school name is"+classNo);
	}
}