import java.util.Scanner;
public class Contactdetail
{
	String name,email,number;
	int no;
	void details()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter no :");
		no=scr.nextInt();
		System.out.println("Enter name :");
		name=scr.next();
		System.out.println("Enter number :");
		number=scr.next();
		System.out.println("Email :");
		email=scr.next();
	}
	void printdetail()
	{
		System.out.println("no :"+no);
		System.out.println("Name :"+name);
		System.out.println("Number :"+number);
		System.out.println("Email :"+email);

	}
}