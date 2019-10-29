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
		for (int i=0;i<n;i++) 
		{
		c[i].printdetail();
		System.out.println("\n");

		}
	}
}