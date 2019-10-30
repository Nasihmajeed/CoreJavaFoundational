package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.view.Tdd;


public class ContactController
{
	ArrayList<Contact> array=new ArrayList<Contact>();
	Tdd t;

	public void setContact()
	{
		t=new Tdd();
		int n=t.inputContact();
		for (int i=0;i<n;i++)
		{
			String[] temp=t.scan(i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			array.add(i,contact);
		}
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
			case 4:t.displayContact();break;
		}
	}

	public void contactAdd()
	{
		int n=t.inputContact();
		for (int i=0;i<n;i++)
		{
			String[] temp=t.scan(i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			array.add(array.size(),contact);
		}
		t.displayContact();
	}

	public int contactSearch()
	{
		int i=0;int flag=0;
		String element=t.scanElement(0);
		for(Contact contact: array)
		{
			i++;
			if((contact.getName()).equals(element))
			{
				flag=1;
				t.elementFound(contact,i);
				return i;
			}
		}
		if(flag==0)
		{
			t.noContact();
			t.contactOptions();
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
		
		t.displayContact();
	}

	public void contactUpdate()
	{
		int i=contactSearch();
		int u=t.updateScan();
		Contact contact=new Contact();  
		String update=t.scanElement(1);
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
		t.displayContact();
	}

}


// public void print()
// 	{
		
// 		ArrayList<Contact> array;
// 		array=controller.setContact();
// 		for(Contact contact: array)
// 		{
// 			System.out.println("namell = " + contact.getName());
// 			System.out.println("Numberll = " + contact.getNumber());
// 		}
// 	}