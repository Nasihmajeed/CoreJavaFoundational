import java.util.Scanner;
public class Account
{
	int number,balence;
	String type;

	void details() 
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("enter the Ac number : ");
		number=scr.nextInt();
		System.out.print("enter the Ac type : ");
		type=scr.next();
		System.out.print("enter the Ac balence : ");
		balence=scr.nextInt();
	}
	void printdetail()
	{

		System.out.println("    Ac number :" +number);

		System.out.println("    Ac type :" +type);

		System.out.println("    Ac balence :" +balence);
		
	}
}