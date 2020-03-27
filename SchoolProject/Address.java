import java.util.*;
public class Address
{
	String city;
	String district;
	String state;
	int pin;
	public void setAddress()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("School Address :\t");
		System.out.println("CITY :\t");
		this.city=in.nextLine();
		System.out.println("DISTRICT :\t");
		this.district=in.nextLine();
		System.out.println("STATE : \t");
		this.state = in.nextLine();
		System.out.println("PINCODE :\t");
		this.pin=in.nextInt();
	}
	public void printAddress()
	{
		System.out.println("School Address: \n"+this.city+"\n"+this.district+"\n"+this.state+"\n"+this.pin+"\n");
	}

}