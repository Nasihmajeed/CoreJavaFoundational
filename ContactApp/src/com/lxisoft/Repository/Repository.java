package com.lxisoft.repository;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.Contact;
import java.util.*;
import java.io.*;
public class Repository implements FileStorage
{  
	static File contactFile=new File(fileName) ;
	static int id=1; 
	public ArrayList<Contact> getFileDetails(Contact contact,ArrayList<Contact> contacts)
	{
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=read.readLine();
			while((str=read.readLine())!=null) 
			{
				String[] st=str.split(",",3);
				contact=new Contact();
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
	// public void updateFileData(Contact contact,int i)
	// {
	// 	try
	// 	{
	// 		BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// 		String str=read.readLine();
	// 		while((str=read.readLine())!=null) 
	// 		{
	// 			//String[] st=str.split(",",3);
	// 			//contact=new Contact();
	// 			// contact.setName(st[1]);
	// 			// contact.setNo(st[2]);
	// 			// contacts.set(i,contact);
	// 			FileWriter fw= new FileWriter(contactFile,true);
	// 			BufferedWriter br = new BufferedWriter(fw);
	// 			//BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// 			br.write(index+","+contacts.getName()+","+contacts.getNo()+"\n");
	// 			br.flush();
	// 			br.close();
	// 		}	
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("File exception "+e);
	// 	}return contacts;
	// }

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
	public void addContactDetails(Contact contacts)
	{
		try
		{
			System.out.println(contactFile.exists());
			if(contactFile.exists())
			{
				FileWriter fw= new FileWriter(contactFile,true);
				BufferedWriter br = new BufferedWriter(fw);
				//BufferedReader read=new BufferedReader(new FileReader(contactFile));
				br.write(id+","+contacts.getName()+","+contacts.getNo()+"\n");
				id++;
				br.flush();
				br.close();
			}
			else
			{
				FileWriter newFile=new FileWriter(contactFile);
				BufferedWriter br = new BufferedWriter(newFile);
				br.write("ID , NAME , NUMBER \n");
				br.write(id+","+contacts.getName()+","+contacts.getNo()+"\n");
				id++;
				br.flush();
				br.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
		readFileData();
	}
	public void readFileData()
	{
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str="";
			while((str=read.readLine())!=null) 
			{
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}

}