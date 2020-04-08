package com.lxisoft.Person;
import java.util.*;
public class User
{
	public int rat;
	public String userName;
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
}