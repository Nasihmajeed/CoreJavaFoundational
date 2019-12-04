package com.lxisoft.repository;
import java.io.*;
import java.util.*;
import com.lxisoft.domain.Contact;
import com.lxisoft.contactmodel.*;
import com.lxisoft.repository.*;
/**
 *class: repository for file operation
 */
public class FileRepository implements Repository
{
	static int in=1;
	File contactFile=new File("G:git.CoreJavaFoundational.ContactApp.src.com.lxisoft.repository.contact.csv");
	List <Contact> contactList=new ArrayList<Contact>();
	/**
	 *to set file
	 */
	public void setFile()
	{
		try
		{
			FileWriter fw=new FileWriter(contactFile,true);
			BufferedWriter bw=new BufferedWriter(fw);
		 	bw.write("ID"+","+"NAME"+","+"Number\n");
			bw.flush();
		}
		catch(Exception e)
		{
			System.out.println(" file is not present"+e);
		}
	}
	/**
	 *to read all contact from file
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> findAllContact()
	{
		try
		{
			if(contactFile.exists())
			{
				contactList.clear();
				String contacts;
				FileReader fr=new FileReader(contactFile);
				BufferedReader br=new BufferedReader(fr);
				contacts=br.readLine();
				while((contacts=br.readLine())!=null)
				{
					String[] cont=contacts.split(",",3);
					Contact c=new Contact();
					int in=Integer.parseInt(cont[0]);
					c.setContactId(in);
					c.setContactName(cont[1]);	
					c.setContactNumber(cont[2]);			
					contactList.add(c);
				}
			}
			else
			{
				System.out.println(" \n contact app is empty!!!!!");
				setFile();
			}
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
		return contactList; 
	}
	/**
	 *to get contact id
	 *
	 *@return contact id
	 */
	public int getContactId()
	{
		String s=null;
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(contactFile));
			s=br.readLine();
			while((s=br.readLine())!=null)
			{	
				String[] c=s.split(",",3);
				in=Integer.parseInt(c[0]);
				in++;
			}
		}
		catch(IOException e)
		{
			System.out.println(""+e);
		}
		return in;
	}
	/**
	 *to write in to file
	 *
	 *@param contact contact containing name and number
	 */
	public void saveContact(Contact contact)
	{
		// contactList.add(contact);
		try
		{
			FileWriter fw=new FileWriter(contactFile,true);
			BufferedWriter bw=new BufferedWriter(fw);
			int i=getContactId();
			String id=String.valueOf(i);
			bw.write(id+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
			bw.flush();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
	}
	/**
	 *to read contact from file with the desired id
	 *
	 *@return contact
	 */
	public Contact findContactById(int n)
	{
		contactList=findAllContact();
		Contact contact=new Contact();
		for(int i=0;i<contactList.size();i++)
		{
			if((contactList.get(i).getContactId())==(n))
			{
				contact=contactList.get(i);
			}
		}
		return contact;
	}
	/**
	 *to delete contact
	 *
	 *@param n integer value
	 */
	public void deleteContact(int n)
	{
		contactList=findAllContact();
		for(int i=0;i<contactList.size();i++)
		{
			if((n)==(contactList.get(i).getContactId()))
			{
				contactList.remove(i);
			}	
		}
		resetFile();
		setFile();
		for(int j=0;j<contactList.size();j++)
		{
			rewriteFile(contactList.get(j));
		}
	}
	/**
	 *to update contact
	 *
	 *@param n integer value
	 *@param con contact
	 */
	public void updateContact(int n,Contact con)
	{
		contactList=findAllContact();
		for(int i=0;i<contactList.size();i++)
		{
			if((n)==(contactList.get(i).getContactId()))
			{
				Contact c=contactList.get(i);
				c.setContactName(con.getContactName());
				c.setContactNumber(con.getContactNumber());
				contactList.set(i,c);
			}	
		}
		resetFile();
		setFile();
		for(int j=0;j<contactList.size();j++)
		{
			rewriteFile(contactList.get(j));
		}
	}
	/**
	 *to delete all contact
	 */
	public void deleteAllContact()
	{
		resetFile();
		setFile();
	}
	/**
	 *to sort contact by number
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> sortByNumber()
	{
		contactList.clear();
		contactList=findAllContact();
		Collections.sort(contactList, new SortByNumber());
		return contactList;
	}
	/**
	 *to sort contact by name
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> sortByName()
	{
		contactList.clear();
		contactList=findAllContact();
		Collections.sort(contactList, new SortByName());
		return contactList;
	}
	/**
	 *to sort contact by id
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> sortById()
	{
		contactList.clear();
		contactList=findAllContact();
		Collections.sort(contactList, new SortById());
		return contactList;
	}
	
	/**
	 *to clear file
	 */
	public void resetFile()
	{
		try
		{
			FileWriter f=new FileWriter(contactFile);
			in=1;
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
	}
	/**
	 *to rewrite in to file after clearing file
	 *
	 *@param contact contact with id, name and number.
	 */
	public void rewriteFile(Contact contact)
	{
		try
		{
			FileWriter f=new FileWriter(contactFile,true);
			BufferedWriter b=new BufferedWriter(f);
			b.write(contact.getContactId()+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
			b.flush();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
	}
}