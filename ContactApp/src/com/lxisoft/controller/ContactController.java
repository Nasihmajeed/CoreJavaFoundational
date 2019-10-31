package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.view.ContactView;
import com.lxisoft.repository.*;

public class ContactController
{
	ArrayList<Contact> array=new ArrayList<Contact>();
	ContactView contactview;
	ContactRepository repository;

	public void setContact()
	{
		repository=new ContactRepository();
		contactview=new ContactView();
		int n=contactview.inputContact();
		for (int i=0;i<n;i++)
		{
			String[] temp=contactview.scan(i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			System.out.print("cjkdscds "+temp[0]+temp[1]);
			array.add(i,contact);
		}
		contactview.displayContact();
		// repository.setContact(array);
		// contactview.displayContact();
	}
	
	public ArrayList<Contact> getContact()
	{
		return array;
	}
	
	public void features(int option)
	{
		switch(option)
		{
			case 0:contactAdd();break;
			case 1:contactSearch();break;
			case 2:contactDelete();break;
			case 3:contactUpdate();break;
			case 4:contactview.displayContact();break;
		}
	}

	public void contactAdd()
	{
		int n=contactview.inputContact();
		for (int i=0;i<n;i++)
		{
			String[] temp=contactview.scan(i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			array.add(array.size(),contact);
		}
		contactview.displayContact();
	}

	public int contactSearch()
	{
		int i=0;int flag=0;
		String element=contactview.scanElement(0);
		for(Contact contact: array)
		{
			i++;
			if((contact.getName()).equals(element))
			{
				flag=1;
				contactview.elementFound(contact,i);
				return i;
			}
		}
		if(flag==0)
		{
			contactview.noContact();
			contactview.contactOptions();
		}
		return i;
	}

	public void contactDelete()
	{
		int i=contactSearch();
		if(i!=0)
		{
			array.remove(i-1);
		}
		
		contactview.displayContact();
	}

	public void contactUpdate()
	{
		int i=contactSearch();
		int u=contactview.updateScan();
		Contact contact=new Contact();  
		String update=contactview.scanElement(1);
		if(u==0)
		{
			contact=array.get((i-1));
			contact.setName(update);
			//contact.setNumber(number);
			array.set((i-1),contact);
		}
		else if(u==1)
		{
			contact=array.get((i-1));
			contact.setNumber(update);
			array.set((i-1),contact);
		}
		contactview.displayContact();
	}

}
