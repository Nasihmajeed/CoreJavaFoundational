import java.util.Scanner;
public class Contact
{
	String name;
	String email;
	String number;
	Address address;
	public void details()
	{
		address=new Address();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter name :");
		name=scr.next();
		System.out.println("Enter number :");
		number=scr.next();
		System.out.println("Enter email :");
		email=scr.next();
		address.getdetails();
	}
	public void printdetails()
	{
		System.out.println("name   :"+name);
		System.out.println("number :"+number);
		System.out.println("email  :"+email);
		address.printdetails();
	}

}