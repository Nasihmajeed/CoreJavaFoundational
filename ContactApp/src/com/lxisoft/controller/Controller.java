package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import java.util.*;

public class Controller
{
	Contact contact ;
	public ArrayList<Contact> array = new ArrayList<Contact>();
	public void addContact(String name,String number)
	{
		contact = new Contact();
        contact.setName(name);
        contact.setNumber(number);
        array.add(contact);    
	}
	public int getArraySize()
	{
		return array.size();
	}
	public String getName()
	{
		return contact.getName();
	}
	public String getNumber()
	{
		return contact.getNumber();
	}
	public String search()
	{
		return contact.getName();
	}
	public void editContact(String name,String number)
	{
		 System.out.println("ENTER THE NEW NAME");
		 Scanner read= new Scanner(System.in);
		 String name= read.nextLine();
		 System.out.println("ENTER THE NEW NUMBER");
		 String number = read.nextLine();
		 con.editContact(name,number);
	}
 System.out.println("ENTER THE NEW NAME");
		 Scanner read= new Scanner(System.in);
		 String name= read.nextLine();
		 System.out.println("ENTER THE NEW NUMBER");
		 String number = read.nextLine();
		 con.editContact(name,number);
}