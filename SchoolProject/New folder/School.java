import java.util.Scanner;

public class School
{

		ClassRoom[] classRooms; 

		String schoolName;



	public void schoolDetail()
	{
		Scanner myObj3=new Scanner(System.in);
		System.out.println("Enter schoolName");
		schoolName=myObj3.nextLine();

		
		System.out.println("Classroom count");
		int count=myObj3.nextInt();

		classRooms=new ClassRoom[count];


		for(int i=0;i<classRooms.length;i++)
		{

		classRooms[i]=new ClassRoom();
		
		}
		
		for(int i=0;i<classRooms.length;i++)
		{
		classRooms[i].classRoomDetalis();
		}
	} 

	public void printDetails()
	{
		System.out.println("The school name is"+schoolName);

		for(int i=0;i<classRooms.length;i++)
		{
			classRooms[i].printClassnumber();
			classRooms[i].printRankDetails();
		}
		
	}



		
}