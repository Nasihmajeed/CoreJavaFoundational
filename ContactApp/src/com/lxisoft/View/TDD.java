package com.lxisoft.View;

import java.util.Scanner;

import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;


public class TDD
{
	public static void main(String[] args) 
	{
		Contact contact=getNewContactModel();
		ContactControl control= new ContactControl(contact);
		ArrayList<Contact> contacts=new ArrayList<Contact> ();  
		System.out.println("Name :" +(control.getContactName() )+" no :"+(control.getContactNo()));
		System.out.println()
		
	}
	public static Contact getNewContactModel()
	{
		Scanner sc=new Scanner(System.in);
		Contact contact =new Contact();
		contact.setName(sc.next());
		contact.setNo(sc.nextLong());
		return contact;


	}
	 

}