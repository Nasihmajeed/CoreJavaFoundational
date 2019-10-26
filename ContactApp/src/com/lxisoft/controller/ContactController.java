package com.lxisoft.controller;
import com.lxisoft.model.Contact;
import java.util.*;
public class ContactController
{
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	public void addContact(String name,long number)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		contacts.add(contact);
		
	}
	public void searchContact(){}
	public void updateContact(){}
	public void deleteContact(){}
	
	public void getContact()
	{
		Contact contact=new Contact();
		System.out.println("Name: "+contact.getName()+"\n"+"phno: "+contact.getNo());
	}


	

}