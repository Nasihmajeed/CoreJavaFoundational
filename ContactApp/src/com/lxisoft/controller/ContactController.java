package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.view.Tdd;
import com.lxisoft.contactrepository.*;

public class ContactController
{
	Tdd t=new Tdd();
	Repository repository=new Repository();
	ArrayList<Contact> array=new ArrayList<Contact>();

	public ArrayList<Contact> checkFile()
	{
		array=repository.check(array);
		t.displayContact(array);
		return array;
	}
	
	public void features(ArrayList<Contact> array,int option)
	{
		switch(option)
		{
			case 0:array=contactAdd(array);repository.syncFile(array);break;
			case 1:contactSearch(array);repository.syncFile(array);break;
			case 2:array=contactDelete(array);repository.syncFile(array);break;
			case 3:array=contactUpdate(array);repository.syncFile(array);break;
			case 4:t.displayContact(array);break;
			case 5:repository.fileRead(array);break;
		}
	}

	public ArrayList<Contact> setContact(ArrayList<Contact> array)
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
		return array;
	}

	public ArrayList<Contact> contactAdd(ArrayList<Contact> array)
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
		t.displayContact(array);
		return array;
	}

	public int[] contactSearch(ArrayList<Contact> array)
	{
		int i=0;int flag=0;
		int[] ret=new int[2];
		String element=t.scanElement(0);
		for(Contact contact: array)
		{
			i++;
			if((contact.getName()).equals(element))
			{
				flag=1;
				t.elementFound(contact,i);
			}
		}
		ret[0]=i;
		ret[1]=flag;
		return ret;
	}

	public ArrayList<Contact> contactDelete(ArrayList<Contact> array)
	{
		int[] ret=contactSearch(array);
		int i=ret[0];
		int flag=ret[1];
		if(flag==0)
		{
			t.noContact();
		}
		else if(flag==1)
		{
			if(i!=0)
			{
				array.remove(i-1);
			}
		}
		t.displayContact(array);
		return array;
	}

	public ArrayList<Contact> contactUpdate(ArrayList<Contact> array)
	{
		int[] ret=contactSearch(array);
		int i=ret[0];
		int flag=ret[1];
		if(flag==0)
		{
			t.noContact();
		}
		else if(flag==1)
		{
			int u=t.updateScan(); 
			String update=t.scanElement(1);
			if(u==0)
			{
				Contact contact=new Contact(); 
				contact=array.get((i-1));
				contact.setName(update);
				//contact.setNumber(number);
				array.set((i-1),contact);
			}
			else if(u==1)
			{
				Contact contact=new Contact(); 
				contact=array.get((i-1));
				contact.setNumber(update);
				array.set((i-1),contact);
			}
		}
		t.displayContact(array);
		return array;
	}

}

