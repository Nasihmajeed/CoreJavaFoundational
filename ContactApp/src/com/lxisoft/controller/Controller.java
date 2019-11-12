package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.*;
import com.lxisoft.test.*;

public class Controller
{
	Contact contact ;
	Repository rep = new Repository();
	public ArrayList<Contact> array = new ArrayList<Contact>();
	public void addContact(String name,String number)
	{ 
		rep.fileWrite();
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
	public void editContact(int i,String name,String number)
	{	
		 contact = new Contact();
		 contact.setName(name);
         contact.setNumber(number);
         array.remove(i);
		 array.add(i,contact);
	}
	public void deleteContact(int i)
	{
		array.remove(i);
	}
 
}