import java.util.Scanner;
public class Bank
{
	int n;
	Customer[] c;
	void details() 
	{


		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no of Customer :");
		n=scr.nextInt();
		c=new Customer[n];
		for (int i=0;i<n;i++) 
		{
			c[i]=new Customer();
			c[i].details();
		}
	
	}
	
	void printdetail()
	{
		System.out.println("    ---BANK OF LXI---");
				System.out.println("\n");
		System.out.println("    Bank   details");
				System.out.println("\n");
		for (int i=0;i<n;i++) 
		{
		c[i].printdetail();
		System.out.println("\n");

		}
	}
}