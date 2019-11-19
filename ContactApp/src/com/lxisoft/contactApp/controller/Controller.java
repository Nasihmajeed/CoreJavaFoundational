package com.lxisoft.contactApp.controller;
import java.util.ArrayList;
import com.lxisoft.contactApp.domain.Contact;
import com.lxisoft.contactApp.repository.Repository;
import com.lxisoft.contactApp.view.View;
public class Controller 
{
	Repository repo=new Repository();
	public View view=new View();
	private ArrayList<Contact> contacts=new ArrayList<Contact>();

	public void setContacts(ArrayList<Contact> contacts)
	{
		this.contacts=contacts;
	}
	public ArrayList<Contact> getContacts()
	{
		return contacts;
	}

	public void initial()
	{
		view.start();
	}

	public void printMenu()
	{
		while(true)
		{
			switch(view.printMenu())
			{
				case 1:
				create();
				break;
			
				case 2:
				show();
				break;
				
				case 3:
				update();
				break;

				case 4:
				delete();
				break;

				case 5:
				search();
				break;

				case 6:
				repo.store();
				return;

			}
		}

	}

	public void newContact(String name,long number)
	{
		int id=0;
		Contact lastContact=null;
		if(contacts.size()<=0)
		{
			id=1;
		}
		if(contacts.size()>=1)
		{
			lastContact=contacts.get(contacts.size()-1);
			id=lastContact.getId()+1;
		}
		contacts.add(new Contact(id,name,number));

	}

	public void show()
	{
		view.show(contacts);
	}

	public void create()
	{
		controller.newContact(name,number);
		show();
	}

	public void updateContact(int upId,String name)
	{
		contacts.get(upId-1).setName(name);
	}

	public void updateContact(int upId,long number)
	{
		contacts.get(upId-1).setNumber(number);
	}

	public void deleteContact(int delId)
	{
		contacts.remove(delId-1);
	}
	
	public Contact searchContact(String name)
	{
		Contact contact=null;
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getName().equals(name))
			{
				contact=contacts.get(i);
			}

		}
		return contact;
	}


	/*public void fileCreation()
	{
		repo.createPhoneData(contacts);

	}*/

	public void store()
	{
		repo.writeToFile(contacts);
		repo.storeData(contacts);
	}
	
}