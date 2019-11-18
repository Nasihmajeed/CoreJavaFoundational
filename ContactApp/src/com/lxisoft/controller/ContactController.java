package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.repository.*;
import com.lxisoft.view.View;
import com.lxisoft.domain.*;

public class ContactController
{
	View view=new View();
	FileRepository repository=new FileRepository();

	public void features()
	{
		while(true)
		{
			int option=view.optionsScaning();
			if(option==5)
				break;
			else
			{
				contactOptions(option);
				System.out.println("\n");
			}
		}
		System.out.println("\t\t\t\t THANK YOU");
	}

	public void contactOptions(int option)
	{
		switch(option)
		{
			case 1:saveContact();break;
			case 2:contactByName();break;
			case 3:contactSelect();break;
			case 4:allContacts();break;
		}
	}

	public void saveContact()
	{
		String[] tempSave=view.save();
		Contact contact=new Contact();
		SaveModel saveModel=new SaveModel();
		if(tempSave[2].equals("y"))
		{
			System.out.println("-contact saved-");
			contact.setName(tempSave[0]);
			contact.setNumber(tempSave[1]);
			saveModel.setContact(contact);
			repository.save(saveModel.getContact());
		}
	}

	public void allContacts()
	{
		ViewAllModel viewAllModel=new ViewAllModel();
		viewAllModel.setList(repository.findAll());
		view.findAllContacts(viewAllModel);
	}

	public void contactByName()
	{
		String[] tempSearch=view.byName();
		Contact temp=new Contact();
		ViewByNameModel viewByName=new ViewByNameModel();
		viewByName.setList(repository.findAll());
		int i=0;
		if(tempSearch[1].equals("y"))
		{
			System.out.println("-search details-");
			for(Contact contact: viewByName.getList())
			{
				i++;
				if(contact.getName().equals(tempSearch[0]))
				{
					view.printByName(contact,i);
					temp=contact;
				}
			}
		}
		String ch=view.choose();
		contactChoose(temp,ch);
	}

	public void contactChoose(Contact contact,String ch)
	{
		switch(ch)
		{
			case "e":editContact(contact);break;
			case "d":deleteContact(contact);break;
		}
	}

	public void contactSelect()
	{
		String name=view.select();
		Contact temp=new Contact();
		ViewSelectModel viewSelectModel=new ViewSelectModel();
		viewSelectModel.setList(repository.findAll());
		int i=0;
		System.out.println("-contact selected-");
		for(Contact contact: viewSelectModel.getList())
		{
			i++;
			if(contact.getName().equals(name))
			{
				view.printByName(contact,i);
				temp=contact;
			}
		}
		String ch=view.choose();
		contactChoose(temp,ch);
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

	public void deleteContact(Contact contact)
	{
		DeleteModel deleteModel=new DeleteModel();
		deleteModel.setContact(contact);
		String del=view.delete();
		if(del.equals("y"))
		{
			ArrayList<Contact> contactList=repository.delete(deleteModel.getContact());
			sync(contactList);
		}
	}

	public void editContact(Contact contact)
	{
		ArrayList<Contact> contactList=repository.findAll();
		String[] tempEdit=view.edit();
		if(tempEdit[2].equals("y"))
		{
			EditModel editModel=new EditModel();
			editModel.setContact(contact);
			for(int i=0;i<contactList.size();i++)
			{
				if(contactList.get(i).equals(deleteModel.getContact()))
				{
					System.out.println("updating conatact "+deleteModel.getContact().getName());
					contactList.set(i,setName(tempEdit[0]));
					contactList.set(i,setNumber(tempEdit[1]));
				}
			}
		}
	}

}
















	// public void editContact()
	// {
		
	// 	String name=view.scanElement(0);
	// 	int no=0,i=0;
	// 	int u=view.whatToUpdate(); 
	// 	String newData=view.scanElement(1);
	// 	for(Contact contact:contactList)														
	// 	{
	// 		if(contact.getName().equals(name))
	// 		{
	// 			no=1;
	// 			if(u==0)
	// 			{
	// 				contact.setName(newData);
	// 				contactList.set(i,contact);
	// 			}
	// 			else if(u==1)
	// 			{
	// 				contact.setNumber(newData);
	// 				contactList.set(i,contact);
	// 			}
	// 		}
	// 		++i;
	// 		System.out.println(contact.getName());
	// 	}
	// 	sync(contactList);
	// 	if(no==0)
	// 		view.noContact();
	// }