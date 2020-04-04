package com.lxisoft.Person;
import java.util.*;
public class User
{
	public String userName;
	public void userDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Eneter Your Name");
		userName = in.nextLine();
		System.out.println("\nWelcome  to A2B  " + userName );
		
	}
	void printUser()
	{
		System.out.println("Thank you "+ userName);
	}
}