package com.lxisoft.user;
import java.util.*;
public class Manager
{
	String managerName;
	String username;
	public String MangerPassword;

	public void createManager()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Manager Name:");
		managerName = sc.nextLine();

		System.out.print("Manager Password");
		mangerPassword = sc.nextLine();		
	}


	public void displayManagerDetails()
	{
		System.out.println("***ADMIN***");
		System.out.println("Name:" +adminName);
		
	}
}