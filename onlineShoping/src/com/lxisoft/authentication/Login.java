package com.lxisoft.authentication;
import com.lxisoft.OnlineShoping.User;
import com.lxisoft.OnlineShoping.FileOperation;
import java.util.Scanner;
import java.util.*;
public class Login
{
	
	User user;
	ArrayList<User>userDet=new ArrayList<User>();
	Scanner scr=new Scanner(System.in);
	ArrayList<String>logdets=new ArrayList<String>();
	FileOperation fo;
	final void setUserLogin()
	{
		System.out.println("Name : ");
		String name=scr.next();
		logdets.add(name);
		System.out.println("Password : ");
		String password=scr.next();
		logdets.add(password);
		

	
	}

	final ArrayList<String> getUserLogin()
	{
		return logdets;

	}

	
	final void userSignup()
	{
		fo=new FileOperation();	
		user=new User();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String name=scr.next();
		user.setName(name);

		System.out.println("Enter User Password : ");
		String password=scr.next();
		user.setPassword(password);

		System.out.println("Enter User Address : ");
		String address=scr.next();
		user.setAddress(address);

		System.out.println("Enter User Pincode : ");
		int pincode=scr.nextInt();
		user.setPincode(pincode);

		fo.addUserId(user);

		
	}
	
}