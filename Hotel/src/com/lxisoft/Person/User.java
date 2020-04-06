package com.lxisoft.Person;
import java.util.*;
public class User
{
	public int rat;
	public String userName;
	public void userDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Eneter Your Name");
		userName = in.nextLine();
		System.out.println("\nWelcome  to A2B  " + userName );
		
	}
	public void printUser()
	{
		System.out.println("Thank you "+ userName);
	}

	public int rating()
	{
		Scanner  in = new Scanner(System.in);
		System.out.println("Please rate our services (Choose a value between 0 and 5)");
		rat=in.nextInt();
		return rat;
	}
}