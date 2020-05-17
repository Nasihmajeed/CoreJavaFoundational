package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.User;
import java.util.Scanner;
import java.util.*;
public class Login
{
	
	User user;
	ArrayList<User>userDet=new ArrayList<User>();
	Scanner scr=new Scanner(System.in);
	ArrayList<String>logdet=new ArrayList<String>();

	final void setUserLogin()
	{
		System.out.println("Name : ");
		String name=scr.next();
		logdet.add(name);
		System.out.println("Password : ");
		String password=scr.next();
		logdet.add(password);
		

	
	}

	final ArrayList<String> getUserLogin()
	{
		return logdet;

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