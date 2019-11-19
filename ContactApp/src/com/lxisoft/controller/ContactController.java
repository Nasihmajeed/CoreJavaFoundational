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
			if(option==6)
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
			case 3:contactById();break;
			case 4:contactSelect();break;
			case 5:allContacts();break;
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
				if(contact.getName().equals(tempSearch[0]))
				{
					i=1;
					view.printByName(contact);
					temp=contact;
				}
			}
		}
		if(i==1)
		{
			String ch=view.choose();
			contactChoose(temp,ch);
		}
		else
			view.noContact();
	}

	public void contactById()
	{
		int i=0;
		String[] tempSearch=view.byId();
		ArrayList<Contact> contactList=repository.findAll();
		ViewByIdModel viewByIdModel=new ViewByIdModel();
		if(tempSearch[1].equals("y"))
		{
			System.out.println("-id search details-");
			for(Contact contact: contactList)
			{
				if(contact.getId().equals(tempSearch[0]))
				{
					i=1;
					viewByIdModel.setContact(contact);
					view.printByName(viewByIdModel.getContact());
				}
			}
		}
		if(i==1)
		{
			String ch=view.choose();
			contactChoose(viewByIdModel.getContact(),ch);
		}
		else
			view.noContact();
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
		SelectModel selectModel=new SelectModel();
		selectModel.setList(repository.findAll());
		int i=0;
		System.out.println("-contact selected-");
		for(Contact contact: selectModel.getList())
		{
			if(contact.getName().equals(name))
			{
				i=1;
				view.printByName(contact);
				temp=contact;
			}
		}
		if(i==1)
		{
			String ch=view.choose();
			contactChoose(temp,ch);
		}
		else
			view.noContact();
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
				if(contactList.get(i).getName().equals(editModel.getContact().getName()))
				{
					System.out.println("updating conatact "+editModel.getContact().getName());
					editModel.getContact().setName(tempEdit[0]);
					editModel.getContact().setNumber(tempEdit[1]);
					contactList.set(i,editModel.getContact());
				}
			}
			sync(contactList);
		}
	}
}