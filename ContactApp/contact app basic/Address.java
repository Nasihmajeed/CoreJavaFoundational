import java.util.Scanner;
public class Address
{
	String address;
	int pin;
	public void getdetails()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter address :");
		address=scr.next();
		System.out.println("Enter pin :");
		pin=scr.nextInt();
	}
	public void printdetails()
	{
		System.out.println("Address :"+address);
		System.out.println("Pin :"+pin);

	}
}