package com.lxisoft.Person;
import com.lxisoft.Hotel.*;
import java.util.*;
public class User
{
	public int rat;
	public String userName;
	public int totalAmount,var=0;
	public void userDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE NAME");
		userName = in.nextLine();
		System.out.println("\n WELCOME TO A2B  " + userName );
		
	}
	public void printUser()
	{
		System.out.println("\t THANK YOU "+ userName);
	}

	public int rating()
	{
		Scanner  in = new Scanner(System.in);
		System.out.println("PLEASE RATE OUR SERVICES (Choose a value between 0 and 5)");
		rat=in.nextInt();
		return rat;
	}
	public void userAction(Menu menu,OrderDetails od[])
	{
		menu.printMenu(0);
		menu.ordering(menu.ind);
		od[var].name=this.userName;
		od[var].total=menu.ord.total;
		setTotalAmount(od[var].total);
		od[var].ratings=this.rating();
		this.printUser();
		var=var+1;

	}
	public void setTotalAmount(int total)
	{
		this.totalAmount=this.totalAmount+total;
	}
}