package com.lxisoft.authentication;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.repository.Fileoperation;
import java.util.Scanner;
import java.util.*;
public class Login
{
	
	Customer user;
	ArrayList<Customer>userDet=new ArrayList<Customer>();
	Scanner scr=new Scanner(System.in);
	ArrayList<String>logdets=new ArrayList<String>();
	Fileoperation fo;
	public void setUserLogin()
	{
		System.out.println("Name : ");
		String name=scr.next();
		logdets.add(name);
		System.out.println("Password : ");
		String password=scr.next();
		logdets.add(password);
		

	
	}

	public ArrayList<String> getUserLogin()
	{
		return logdets;

	}

	
	
	
}