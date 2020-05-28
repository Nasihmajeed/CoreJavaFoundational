package com.lxisoft.authentication;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.repository.Fileoperation;
import java.util.Scanner;
import java.util.*;
public class Login
{
	
	private Customer user;
	private List<Customer>userDet=new ArrayList<Customer>(); 
	private List<String>logdets=new ArrayList<String>();
	private Fileoperation fo;
	
	public void setUserLogin()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Name : ");
		String name=scr.next();
		logdets.add(name);
		System.out.println("Password : ");
		String password=scr.next();
		logdets.add(password);
		

	
	}

	public List<String> getUserLogin()
	{
		return logdets;

	}

	
	
	
}