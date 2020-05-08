import java.util.Scanner;

public class School
{

		ClassRoom classroom1;
		ClassRoom classroom2;

		String schoolName;

	

	public void schoolDetail()
	{

		 classroom1=new ClassRoom();
		 classroom2=new ClassRoom();

		


		Scanner myObj3=new Scanner(System.in);
		System.out.println("Enter schoolName");
		schoolName=myObj3.nextLine();
		
		

		classroom1.classRoomDetalis();
		classroom2.classRoomDetalis();

	} 

	public void printDetails()
	{
		System.out.println("The school name is"+schoolName);

		
	}

		
}