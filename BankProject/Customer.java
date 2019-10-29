import java.util.Scanner;
public class Customer
{
	String name;
	Account account=new Account();
	void details()
	{   
		Scanner scr=new Scanner(System.in);
		System.out.print("enter Customer name : ");
		name=scr.next();
		account.details();
		System.out.println("\n");
		
	}

	void printdetail()
	{

		System.out.println("    Customer :"+name);	
		account.printdetail();
		
	}


}