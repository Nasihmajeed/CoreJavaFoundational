package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.contactmodel.*;
public class Repository implements FileDataSource
{
	static int in=0;
	static File contactFile=new File(fileName);
	public void setFile(int v)
	{
		if(v==1)
		{
			try
			{
				PrintWriter pw=new PrintWriter(contactFile);
				pw.write("ID"+","+"NAME"+","+"Number\n");
				pw.flush();
				pw.close();
			}
			catch(Exception e)
			{
				System.out.println(" file is not present"+e);
			}
		}
	}

	// public List <Contact> getFileDetails(List <Contact> contactList)
	// {
	// 	try
	// 	{
	// 		String contacts;
	// 		System.out.println("lengt "+contactFile.length());
	// 		FileReader fr=new FileReader(contactFile);
	// 		BufferedReader br=new BufferedReader(fr);
	// 		if((contacts=br.readLine())==null)
	// 		{
	// 			// FileWriter fw=new FileWriter(contactFile);
	// 			// BufferedWriter bw=new BufferedWriter(fw);
	// 			PrintWriter pw=new PrintWriter(contactFile);
	// 			pw.write("ID"+","+"NAME"+","+"Number\n");
	// 			pw.flush();
	// 			pw.close();
	// 			contactList=firstRead(contactList);
	// 		}
	// 		else
	// 		{
	// 			contactList=firstRead(contactList);
	// 		}	
	// 	}
	// 	catch(Exception e)
	// 	{
	// 		System.out.println(" file is not present"+e);
	// 	}
	// 	return contactList;
	// }
	public void writeFile(Contact contact)
	{
		String contacts;
		try
		{
			FileWriter fw=new FileWriter(contactFile,true);
			BufferedWriter bw=new BufferedWriter(fw);
			in++;
			String id=String.valueOf(in);
			bw.write(id+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
			bw.flush();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
	}
	public List <Contact> firstRead(List <Contact> contactList)
	{
		try
		{
			String contacts;
			FileReader fr=new FileReader(contactFile);
			BufferedReader br=new BufferedReader(fr);
			contacts=br.readLine();
			while((contacts=br.readLine())!=null)
			{
				Contact c=new Contact();
				System.out.println("c  "+contacts);
				String[] cont=contacts.split(",",3);
				c.setContactName(cont[1]);	
				c.setContactNumber(cont[2]);			
				contactList.add(c);
			}
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
		return contactList; 
	}
	public void resetFile()
	{
		try
		{
			FileWriter fw=new FileWriter(contactFile);
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
		in=0;
	}
	// public void readFile()
	// {
	// 	String contacts;
	// 	try
	// 	{
	// 		FileReader fr=new FileReader(contactFile);
	// 		BufferedReader br=new BufferedReader(fr);
	// 		while((contacts=br.readLine())!=null)
	// 		{
	// 			System.out.println(contacts);
	// 		}
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println(" error"+e);
	// 	}
		
	// }
}