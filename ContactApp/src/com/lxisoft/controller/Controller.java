package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import java.util.*;

public class Controller
{
	Contact contact = new Contact();
	ArrayList<Contact> array = new ArrayList<Contact>();
	public void addContact(String name,String number)
	{
        contact.setName(name);
        contact.setNumber(number);
        array.add(contact);    
	}
	public void search()
	{

	}
}