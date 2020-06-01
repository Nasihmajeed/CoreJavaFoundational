package com.lxisoft.authentication;
import com.lxisoft.onlineshoping.Customer;
import java.util.Scanner;
import java.util.*;
public class Login
{
	private Customer user;
	private List<Customer>userDet; 
	private List<String>logdets;
	public void setUserLogin()
	{
		System.out.println("          ----LOGIN----");
		System.out.println("        =================");
		System.out.printn("\n");
		userDet=new ArrayList<Customer>();
		logdets=new ArrayList<String>();
		Scanner scr=new Scanner(System.in);
		System.out.println("       Name : ");
		String name=scr.next();
		logdets.add(name);
		System.out.println("       Password : ");
		String password=scr.next();
		logdets.add(password);
		System.out.println("\n");
	}
	public List<String> getUserLogin()
	{
		return logdets;

	}
}