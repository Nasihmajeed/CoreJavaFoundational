package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.contactrepository.*;
import com.lxisoft.view.View;

public class ContactController
{
	View view=new View();
	FileRepository repository=new FileRepository();
	ArrayList<Contact> contactList=new ArrayList<Contact>();

	public void features(int option)
	{
		switch(option)
		{
			case 1:saveContact();break;
			case 2:contactByName();break;
			case 3:deleteContact();break;
			case 4:editContact();break;
			case 5:allContacts();break;
		}
	}

	public void saveContact()
	{
		String[] temp=view.scan();
		Contact contact=new Contact();
		contact.setName(temp[0]);
		contact.setNumber(temp[1]);
		repository.save(contact);
	}

	public void allContacts()
	{
		contactList=repository.findAll();
		view.displayAll(contactList);
	}

	public void contactByName()
	{
		String name=view.scanElement(0);
		repository.findByName(name);
	}

	public void deleteContact()
	{
		String name=view.scanElement(0);
		contactList=repository.delete(name);
		sync(contactList);
	}

	public void sync(ArrayList<Contact> contactList)
	{
		int j=0;
		for(Contact contact: contactList)
		{
			//System.out.print(j+"sync Name- " +contact.getName());
			repository.syncFile(contact,j);
			j++;
		}
	}

	public void editContact()
	{
		ArrayList<Contact> contactList=repository.findAll();
		String name=view.scanElement(0);
		int no=0,i=0;
		int u=view.whatToUpdate(); 
		String newData=view.scanElement(1);
		for(Contact contact:contactList)														//int i=0;i<contactList.size();i++
		{
			if(contact.getName().equals(name))
			{
				no=1;
				if(u==0)
				{
					contact.setName(newData);
					contactList.set(i,contact);
				}
				else if(u==1)
				{
					contact.setNumber(newData);
					contactList.set(i,contact);
				}
			}
			++i;
			System.out.println(contact.getName());
		}
		sync(contactList);
		if(no==0)
			view.noContact();
	}
}















	// 	int[] ret=contactSearch(contactList);
	// 	int i=ret[0];
	// 	int flag=ret[1];
	// 	if(flag==0)
	// 	{
	// 		view.noContact();
	// 	}
	// 	else if(flag==1)
	// 	{
	// 		int u=view.updateScan(); 
	// 		String update=view.scanElement(1);
	// 		if(u==0)
	// 		{
	// 			Contact contact=new Contact(); 
	// 			contact=array.get((i-1));
	// 			contact.setName(update);
	// 			array.set((i-1),contact);
	// 		}
	// 		else if(u==1)
	// 		{
	// 			Contact contact=new Contact(); 
	// 			contact=array.get((i-1));
	// 			contact.setNumber(update);
	// 			array.set((i-1),contact);
	// 		}
	// 	}
	// 	sync(array);
	// 	return array;
	// }





// public ArrayList<Contact> contactAdd(ArrayList<Contact> array)
// 	{
// 		int n=view.inputContact();
// 		for (int i=0;i<n;i++)
// 		{
// 			String[] temp=view.scan(i);
// 			Contact contact=new Contact();
// 			contact.setName(temp[0]);
// 			contact.setNumber(temp[1]);
// 			array.add(array.size(),contact);
// 		}
// 		view.displayContact(array);
// 		return array;
// 	}

// 	public int[] contactSearch(ArrayList<Contact> array)
// 	{
// 		int i=0,flag=0,j=1;
// 		int[] ret=new int[2];
// 		String element=view.scanElement(0);
// 		for(Contact contact: array)
// 		{
// 			if((contact.getName()).equals(element))
// 			{
// 				flag=1;
// 				view.elementFound(contact,j);
// 				i++;
// 			}
// 			j++;
// 		}
// 		ret[0]=i;
// 		ret[1]=flag;
// 		return ret;
// 	}

// 	public ArrayList<Contact> contactDelete(ArrayList<Contact> array)
// 	{
// 		int[] ret=contactSearch(array);
// 		int i=ret[0];
// 		int flag=ret[1];
// 		if(flag==0)
// 		{
// 			view.noContact();
// 		}
// 		else if(flag==1)
// 		{
// 			if(i!=0)
// 			{
// 				array.remove(i-1);
// 			}
// 		}
// 		view.displayContact(array);
// 		return array;
// 	}

// 	public ArrayList<Contact> contactUpdate(ArrayList<Contact> array)
// 	{
// 		int[] ret=contactSearch(array);
// 		int i=ret[0];
// 		int flag=ret[1];
// 		if(flag==0)
// 		{
// 			view.noContact();
// 		}
// 		else if(flag==1)
// 		{
// 			int u=view.updateScan(); 
// 			String update=view.scanElement(1);
// 			if(u==0)
// 			{
// 				Contact contact=new Contact(); 
// 				contact=array.get((i-1));
// 				contact.setName(update);
// 				array.set((i-1),contact);
// 			}
// 			else if(u==1)
// 			{
// 				Contact contact=new Contact(); 
// 				contact=array.get((i-1));
// 				contact.setNumber(update);
// 				array.set((i-1),contact);
// 			}
// 		}
// 		view.displayContact(array);
// 		return array;
// 	}

// 	public void merge(ArrayList<Contact> array)
// 	{
// 		int i,j;
// 		for(i=0;i<array.size();i++)
// 		{
				
// 			for(j=0;j<array.size();j++)
// 			{
// 				if((i!=j) && (array.get(i).getNumber()).equals(array.get(j).getNumber()))
// 				{
// 						System.out.println(" i1 "+i); 
// 						System.out.println(" j2 "+j);   
// 					System.out.println(" duplictes "+(array.get(i).getNumber()));
// 					break;
// 				}
// 			}
// 		}
// 	}
