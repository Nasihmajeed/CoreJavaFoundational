import java.util.Scanner;

public class School
{

		ClassRoom[] classRooms; 

		String schoolName;

	public void schoolDetail()
	{


		classRooms=new ClassRoom[2];


		classRooms[0]=new ClassRoom();
		classRooms[1]=new ClassRoom();

		


		Scanner myObj3=new Scanner(System.in);
		System.out.println("Enter schoolName");
		schoolName=myObj3.nextLine();
		
		

		classRooms[0].classRoomDetalis();
		classRooms[1].classRoomDetalis();

	} 

	public void printDetails()
	{


		

		System.out.println("The school name is"+schoolName);
		classRooms[0].printClassnumber();
		classRooms[1].printClassnumber();

			



		
	}



		
}