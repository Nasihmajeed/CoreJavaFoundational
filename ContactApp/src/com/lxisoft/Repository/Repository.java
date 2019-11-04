package com.lxisoft.repository;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.Contact;
import java.util.*;
import java.io.*;
public class Repository implements FileStorage
{  
	static File contactFile=new File(fileName) ;
	public ArrayList<Contact> getFileDetails(Contact contact,ArrayList<Contact> contacts)
	{

		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=read.readLine();
			while((read.readLine())!=null) 
			{
				contact=new Contact();
				String[] st=str.split(",",3);
				contact.setName(st[1]);
				contact.setNo (st[2]);
				contacts.add(contact);
			}	
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
		return contacts;
	}
	public void deleteAllContacts()
	{
		try
		{
			FileWriter fr= new FileWriter(contactFile);
		}	
		catch(IOException e)
		{
			System.out.println("Exception!!! "+e);
		}
	}
	public void saveContacts(Contact contacts)
	{
		try
		{
			int index=0;
			System.out.println(contactFile.exists());
			if(contactFile.exists())
			{
				//BufferedReader br=new BufferedReader(new FileReader(contactFile));
				//String index=String.(br.readLine(index));
				index=saveFile(contacts,index);
			}
			else
			{
				FileWriter newFile=new FileWriter(contactFile);
				BufferedWriter br = new BufferedWriter(newFile);
				br.write(" ID , NAME , NUMBER \n");
				br.flush();
				br.close();
				index=saveFile(contacts,index);
			}
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
		readFile();
	}
	public int saveFile(Contact contacts,int count)
	{
		try
		{	
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			count++;
			String index=String.valueOf(count);
			br.write(index+","+contacts.getName()+","+contacts.getNo()+"\n");
			br.flush();
			br.close();

		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
		return count;
	}
	public void readFile()
	{
		
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str;//=read.readLine();
			while((str=read.readLine())!=null) 
			{
				// String [] strln=str.split(",",3);
				// System.out.println(strln[0]);
				// System.out.println(strln[1]);
				// System.out.println(strln[2]);
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}

}