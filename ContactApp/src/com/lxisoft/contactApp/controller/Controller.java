package com.lxisoft.contactApp.controller;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import com.lxisoft.contactApp.model.Contact;
public class Controller 
{
	private ArrayList<Contact> contacts=new ArrayList<Contact>();
	public void setInitialContacts()
	{
		contacts.add(new Contact(1,"athulya",9633400720l));
		contacts.add(new Contact(2,"josemon",9633400720l));
		contacts.add(new Contact(3,"ruhail",9633400720l));
	}

	public void setContacts(ArrayList<Contact> contacts)
	{
		this.contacts=contacts;
	}
	public ArrayList<Contact> getContacts()
	{
		return contacts;
	}

	public void newContact(String name,long number)
	{
		Contact lastContact=null;
		lastContact=contacts.get(contacts.size()-1);
		int id=lastContact.getId()+1;
		contacts.add(new Contact(id,name,number));

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

	public void createPhoneData()
	{
		File contactDetails=new File("ContactDetails.txt");
		try
		{
			if(contactDetails.createNewFile())
			{
				System.out.println("Contact details file created "+contactDetails.getName());
			}
			else
			{
				System.out.println("Contact File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("contact details error");
		}
	}

	public void writeToFile()
	{
		try
		{
		  PrintWriter printer = null;
          printer = new PrintWriter(new FileWriter("ContactDetails.txt",false));
            printer.flush();
          
            for (Contact contact : contacts) 
            {
          		printer.print(contact.getId()+","+contact.getName()+","+contact.getNumber() );
				printer.println();
            }
            printer.close();
        }
		catch ( Exception e ) 
		{
		    e.printStackTrace();
		}
		
	}
}