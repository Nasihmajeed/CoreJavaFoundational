package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.ArrayList;
import com.lxisoft.view.*;
import com.lxisoft.repository.FileStorage;

public class FileRepository implements FileStorage
{
	File file=new File(directory);
	View view=new View();

	public void save(Contact contact)
	{
		int id=index();
		++id;
		try
		{
			if(file.exists())
			{
				FileWriter fw1=new FileWriter(file,true);
				BufferedWriter bw1=new BufferedWriter(fw1);
				bw1.write(id+","+contact.getName()+","+contact.getNumber()+"\n");
				bw1.flush();
				bw1.close();
			}
			else
			{
				System.out.println("\nfile created and contact saved");
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				System.out.println("NEW FILE CREATED");
				bw.write(id+","+contact.getName()+","+contact.getNumber()+"\n");
				bw.flush();
				bw.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}

	public int index()
	{
		ArrayList<Contact> contactList=findAll();
		if(file.exists())
		{
			return contactList.size();
		}
		else
		{
			return 0;
		}
	}

	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		try
		{
			if(file.exists())
			{
				FileReader fr=new FileReader(file);
				BufferedReader  br=new BufferedReader(fr);
				String details;
				while((details=br.readLine())!=null)
				{
					String[] data=details.split(",");
					Contact contact=new Contact();
					contact.setId(data[0]);
					contact.setName(data[1]);
					contact.setNumber(data[2]);
					contactList.add(contactList.size(),contact);
				}
				br.close();
			}
			else
				System.out.println("\nfile not present");
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		return contactList;
	}	

	// public void findByName(String name)
	// {
	// 	int no=0;
	// 	ArrayList<Contact> contactList=findAll();
	// 	for(int i=0;i<contactList.size();i++)
	// 	{
	// 		if(contactList.get(i).getName().equals(name))
	// 		{
	// 			no=1;
	// 			view.displayContact(contactList.get(i));
	// 			System.out.print("\n");
	// 		}
	// 	}
	// 	if(no==0)
	// 		view.noContact();
	// }

	public ArrayList<Contact> delete(Contact contact)
	{
		ArrayList<Contact> contactList=findAll();
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(i).getName().equals(contact.getName()))
			{
				System.out.println("deleting conatact "+contactList.get(i).getName());
				contactList.remove(i);
			}
		}
		return contactList;
	} 

	public void syncFile(Contact contact,int id)
	{
		try
		{
			if(id==0)
			{
				file.delete();
			}
			FileWriter fwr1=new FileWriter(file,true);
			BufferedWriter bw1=new BufferedWriter(fwr1);
			bw1.write((++id)+","+contact.getName()+","+contact.getNumber()+"\n");
			bw1.flush();
			bw1.close();		
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}



























// public void save(Contact contact)
	// {
	// 	try
	// 	{
	// 		if(file.exists())
	// 		{
	// 			FileWriter fw1=new FileWriter(file,true);
	// 			BufferedWriter bw1=new BufferedWriter(fw1);
	// 			bw1.write(contact.getName()+","+contact.getNumber()+"\n");
	// 			bw1.flush();
	// 			bw1.close();
	// 		}
	// 		else
	// 		{
	// 			FileWriter fw=new FileWriter(file);
	// 			BufferedWriter bw=new BufferedWriter(fw);
	// 			System.out.println("NEW FILE CREATED");
	// 			bw.write(contact.getName()+","+contact.getNumber()+"\n");
	// 			bw.flush();
	// 			bw.close();
	// 		}
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("Exception: "+e);
	// 	}
	// }
