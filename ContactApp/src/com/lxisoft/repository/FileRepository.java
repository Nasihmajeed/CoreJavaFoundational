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


	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader  br=new BufferedReader(fr);
			String details;
			while((details=br.readLine())!=null)
			{
				String[] data=details.split(",");
				Contact contact=new Contact();
				contact.setName(data[0]);
				contact.setNumber(data[1]);
				contactList.add(contactList.size(),contact);
			}
			br.close();
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

	// public ArrayList<Contact> delete(String name)
	// {
	// 	int no=0;
	// 	ArrayList<Contact> contactList=findAll();
	// 	for(int i=0;i<contactList.size();i++)
	// 	{
	// 		if(contactList.get(i).getName().equals(name))
	// 		{
	// 			no=1;
	// 			contactList.remove(i);
	// 		}
	// 	}
	// 	if(no==0)
	// 		view.noContact();
	// 	return contactList;
	// } 

	// public void syncFile(Contact contact,int j)
	// {
	// 	try
	// 	{
	// 		if(j==0)
	// 		{
	// 			file.delete();
	// 		}
	// 		FileWriter fwr1=new FileWriter(file,true);
	// 		BufferedWriter bw1=new BufferedWriter(fwr1);
	// 		bw1.write(contact.getName()+","+contact.getNumber()+"\n");
	// 		bw1.flush();
	// 		bw1.close();		
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("Exception: "+e);
	// 	}
	// }
}