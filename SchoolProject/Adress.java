import java.util.*;
public class Adress
{
	String state;
	String district;
	String place;
	String pincode;
	
	void createAdress()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("School Address::\t");
		System.out.println("State::\t");
		state = sc.nextLine();
		System.out.println("District::\t");
		district = sc.nextLine();
		System.out.println("Place::\t");
		place = sc.nextLine();
		System.out.println("Pin Code::\t");
		pincode = sc.nextLine();
		
	}
	void dispayAddress()
	{
		System.out.println(this.state);
		System.out.println(this.district);
		System.out.println(this.place);
		System.out.println(this.pincode);
	}

}