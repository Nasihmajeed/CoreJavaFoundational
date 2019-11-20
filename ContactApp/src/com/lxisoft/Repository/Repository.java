package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;
/**
*file repository class
*/
public class Repository implements FileRepository
{
	File file=new File(fileName);
	ArrayList<Contact> contacts =new ArrayList<Contact>();
	static int id;
	/**
	*method to write the contact details to file
	*@param contact contact to write
	*@param write indication for new contact/editing 
	*/
	public void writeNewContact(Contact contact,boolean write)
	{
		try
		{
			FileWriter bf=new FileWriter(file,true);
			if(write)
			{
				bf.write(id+","+contact.getName()+","+contact.getNo()+"\n");
			}
			else
			{
				bf.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
			}
			bf.flush();
		}
		catch(Exception e)
		{
			System.out.println("error1");
		}id++;
	}
	/**
	*method to set id number
	*/
	public void setId()
	{
		id=getId();
	}
	/**
	*method to view all contact details in file
	*/
	public void viewAllContacts()
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	/**
	*method to get all contacts in an arraylist
	*@return return all contacts
	*/
	public ArrayList<Contact> getAllContacts()
	{
		try
		{
			FileWriter d=new FileWriter(file,true);
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			Contact contact=null;
			contacts.clear();
			while((str=bf.readLine())!=null)
			{
				contact=new Contact();
				String[] strln=str.split(",",3);
				
				contact.setId((Integer.parseInt(strln[0])));
				contact.setName(strln[1]);
				contact.setNo(strln[2]);
				contacts.add(contact);
			}
		}
		catch(Exception e)
		{
			System.out.println("error2");
		}
		return contacts;
	}
	/**
	*method to get id from the last existing contact
	*@return return id
	*/
	public int getId()
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				String[] strln=str.split(",",2);
				id=Integer.parseInt(strln[0]);				
				
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		return ++id;
	}
	/**
	*method to edit a contact detail 
	*/
	public void editFile(Contact contact, int i)
	{
		contacts=getAllContacts();
		contacts.set(i,contact);
		clearFile();
		resetFile();
	}
	/**
	*method for rewriting the conatcts to file
	*/
	public void resetFile()
	{ for(int i=0;i<contacts.size();i++)
		{
			writeNewContact(contacts.get(i),false);
		}
	}
	/**
	*method to delete a contact
	*/
	public void deleteContact(int i)
	{
		contacts=getAllContacts();
		contacts.remove(i);
		clearFile();
		resetFile();
	}
	/**
	*method to clear the file
	*/
	public void clearFile()
	{
		try
		{
			id=0;
			FileWriter fi=new FileWriter(file);
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}

}