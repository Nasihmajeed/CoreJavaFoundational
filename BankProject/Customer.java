import java.util.Scanner;
public class Customer
{
	int n;
	Account[] ac;
	void details()
	{   
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no of Customer :");
		n=scr.nextInt();
	
		
		Account account=new Account();
		ac=new Account[n];
		for (int i=0;i<n;i++) 
		{
			ac[i]=new Account();
			ac[i].details();


		}
		System.out.println("\n");
	}
		void printdetail()
		{
			for (int i=0;i<n;i++) 
			{
				ac[i].printdetail();

			}
		
		}


}