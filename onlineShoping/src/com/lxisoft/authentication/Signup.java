package com.lxisoft.authentication;
import com.lxisoft.onlineshoping.Displaypage;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.repository.Fileoperation;
import java.util.*;

public class Signup
{
	Fileoperation fileoperation;
	Customer customer;
	List<Customer>userDet=new ArrayList<Customer>();
	public void userSignup()
	{
		fileoperation=new Fileoperation();	
		customer=new Customer();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter customer Name : ");
		String name=scr.next();
		customer.setName(name);

		System.out.println("Enter customer Password : ");
		String password=scr.next();
		customer.setPassword(password);

		System.out.println("Enter customer Address : ");
		String address=scr.next();
		customer.setAddress(address);

		System.out.println("Enter customer Pincode : ");
		int pincode=scr.nextInt();
		customer.setPincode(pincode);

		fileoperation.addCustomerId(customer);

		System.out.println("Signup Successfully Completed ");
	}
	
}