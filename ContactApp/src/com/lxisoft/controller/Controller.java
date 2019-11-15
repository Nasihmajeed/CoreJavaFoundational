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
	public void addContact(String name,String number)
	{ 
		contact = new Contact();
        contact.setName(name);
        contact.setNumber(number);
        rep.fileWrite(contact);
	}
	public int getArraySize()
	{
		rep.getArraySize();
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
	public void display()
	{
		rep.fileRead();
	}
	public void arraylistSearch(String name)
	{
		// for(int i=0;i<array.size();i++)
		// {
		// 	if(name.equals(array.get(i).getName()))
		// 	 {
		// 	 	view.search()

		// 	 }
	 //    }	
	}
 
}