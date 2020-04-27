package com.lxisoft.Person;
import java.text.SimpleDateFormat;
import com.lxisoft.File.*;
import com.lxisoft.Hotel.*;
import com.lxisoft.Person.*;
import java.util.*;
public class User
{
	FileManager fm = new FileManager();
	public int rat=-1;
	public String userName;
	public int totalAmount,var=0;
	public void userDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE NAME");
		userName = in.nextLine();
		Clear.cls();
		System.out.println("\n WELCOME TO A2B  " + userName );
		
	}
	public void printUser()
	{
		System.out.println("\t THANK YOU "+ userName);
	}

	public int rating()
	{
		Scanner  in = new Scanner(System.in);
		do
		{
			System.out.println("PLEASE RATE OUR SERVICES (Choose a value between 0 and 5)");
			try
			{
				rat=in.nextInt();	
			}
			catch(Exception e)
			{
				in.nextLine();
				System.out.println("Error");
				rat=-1;
			}
		}while(rat==-1);
		return rat;

	}
	public void userAction(Menu menu,OrderDetails od[])
	{
		Date date = new Date();  
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
    	String strDate= formatter.format(date);  
		menu.printMenu();
		menu.ordering(menu.ind);
		od[var].name=this.userName;
		od[var].total=menu.ord.total;
		od[var].date=strDate;
		setTotalAmount(od[var].total);
		od[var].ratings=this.rating();
		fm.storeToFile(od,var);
		this.printUser();
		var=var+1;

	}
	public void setTotalAmount(int total)
	{
	
		this.totalAmount=this.totalAmount+total;
	
	}
}