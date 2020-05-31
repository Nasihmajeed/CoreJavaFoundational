package com.lxisoft.authentication;
import com.lxisoft.onlineshoping.Displaypage;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.repository.FileRepository;
import java.util.*;

public class Signup
{
	private FileRepository fileRepository;
	private	Customer customer;
	public void userSignup()
	{
		
		fileRepository=new FileRepository();	
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

		fileRepository.addCustomerId(customer);

		System.out.println("Signup Successfully Completed ");
	}
	
}