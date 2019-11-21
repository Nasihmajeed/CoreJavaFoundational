package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import com.lxisoft.domain.*;
/**
 *class: repository for file operation
 */
public class Repository implements FileDataSource
{
	static int in=1;
	File contactFile=new File(fileName);
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
	public void writeFile(Contact contact)
	{
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
	 *to read date from file
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> readFile()
	{
		Set<Contact> contactSet=new TreeSet<Contact>();
		List <Contact> contactList=new ArrayList<Contact>();
		try
		{
			if(contactFile.exists())
			{
				String contacts;
				FileReader fr=new FileReader(contactFile);
				BufferedReader br=new BufferedReader(fr);
				contacts=br.readLine();
				while((contacts=br.readLine())!=null)
				{
					String[] cont=contacts.split(",",3);
					Contact c=new Contact();
					c.setContactId(cont[0]);
					c.setContactName(cont[1]);	
					c.setContactNumber(cont[2]);			
					// contactList.add(c);
					contactSet.add(c);
				}
				contactList.addAll(contactSet);
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
	public void sortFile()
	{

	}
	/**
	 *to clear file
	 */
	public void resetFile()
	{
		try
		{
			FileWriter f=new FileWriter(contactFile);
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