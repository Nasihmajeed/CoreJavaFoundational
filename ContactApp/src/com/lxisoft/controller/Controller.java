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
}