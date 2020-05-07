import java.util.Scanner;

public class School
{
	ClassRoom c1=new ClassRoom();
	ClassRoom c2=new ClassRoom();

	String schoolName;


	public void schoolDetail()
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter schoolName");
		schoolName=myObj.nextLine();
		System.out.println("The school name is"+schoolName);

		c1.classRoomDetalis();
		c2.classRoomDetalis();

	} 
}