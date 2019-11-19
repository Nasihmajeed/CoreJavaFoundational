package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.domain.*;
public class Repository implements FileDataSource
{
	static int in=1;
	File contactFile=new File(fileName);
	FileWriter fw=null;
	BufferedWriter bw=null;
	FileWriter f=null;
	BufferedWriter b=null;
	
	// public int checkFile(int v)
	// {
	// 	String s=null;
	// 	try
	// 	{
	// 		fw=new FileWriter(contactFile,true);
	// 		bw=new BufferedWriter(fw);
	// 		// FileReader fr=new FileReader(contactFile);
			
	// 		{
	// 			v=1;
	// 		}
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println(""+e);
	// 	}
	// 	return v;
	// }
	public void setFile()
	{
		// String s=null;
		try
		{
			// BufferedReader br=new BufferedReader(new FileReader(contactFile));
			// contactFile=new File(fileName);
			fw=new FileWriter(contactFile,true);
			bw=new BufferedWriter(fw);
		 	bw.write("ID"+","+"NAME"+","+"Number\n");
			bw.flush();
		}
		catch(Exception e)
		{
			System.out.println(" file is not present"+e);
		}
		// return v;
	}
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
	public void writeFile(Contact contact)
	{
		try
		{
			fw=new FileWriter(contactFile,true);
			bw=new BufferedWriter(fw);
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
	public List <Contact> readFile()
	{
	
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
	public void resetFile()
	{
		try
		{
			f=new FileWriter(contactFile);
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
	}
	public void rewriteFile(Contact contact)
	{
		try
		{
			f=new FileWriter(contactFile,true);
			b=new BufferedWriter(f);
			// in++;
			// String id=String.valueOf(in);
			b.write(contact.getContactId()+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
			b.flush();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
	}
}