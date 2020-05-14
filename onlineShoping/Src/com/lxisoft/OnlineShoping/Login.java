package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.User;
import java.util.Scanner;
import java.util.*;
public class Login
{
	
	User user;
	ArrayList<User>userDet=new ArrayList<User>();
	Scanner scr=new Scanner(System.in);
	ArrayList<String>log=new ArrayList<String>();

	final void setUserLogin(ArrayList<String> log)
	{
		System.out.println("Name : ");
		String name=scr.next();
		log.add(name);
		System.out.println("Password : ");
		String password=scr.next();
		log.add(password);
		this.log=log;

	
	}

	final ArrayList<String> getUserLogin()
	{
		return log;

	}

	
	final void setUserSignup()
	{
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

		userDet.add(user);

		
	}
	final ArrayList<User> getUserSignup()
	{
		return userDet;
	}
	
}