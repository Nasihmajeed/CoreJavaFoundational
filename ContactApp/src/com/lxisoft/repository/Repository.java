package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.contactmodel.*;
public class Repository implements FileDataSource
{
	static int in=0;
	File contactFile=new File(fileName);
	FileWriter fw=null;
	BufferedWriter bw=null;
	FileWriter f=null;
	BufferedWriter b=null;
	public int checkFile(int v)
	{
		String s=null;
		try
		{
			fw=new FileWriter(contactFile,true);
			bw=new BufferedWriter(fw);
			FileReader fr=new FileReader(contactFile);
			BufferedReader br=new BufferedReader(fr);
			if((s=br.readLine())==null)
			{
				v=1;
			}
			else
			{
				while((s=br.readLine())!=null)
				{
					in++;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(" file is not present"+e);
		}
		return v;
	}
	public void setFile(int v)
	{
		
		try
		{
			fw=new FileWriter(contactFile,true);
			bw=new BufferedWriter(fw);
			if(v==1)
			{
				bw.write("ID"+","+"NAME"+","+"Number\n");
				bw.flush();
			}
		}
		catch(Exception e)
		{
			System.out.println(" file is not present"+e);
		}
		
	}
	public void writeFile(Contact contact)
	{
		try
		{
			fw=new FileWriter(contactFile,true);
			bw=new BufferedWriter(fw);
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
	public List <Contact> readFile()
	{
	
		List <Contact> contactList=new ArrayList<Contact>();
		try
		{
			String contacts;
			FileReader fr=new FileReader(contactFile);
			BufferedReader br=new BufferedReader(fr);
			contacts=br.readLine();
			while((contacts=br.readLine())!=null)
			{
				String[] cont=contacts.split(",",3);
				String id=cont[0];
				Contact c=new Contact();
				c.setContactName(cont[1]);	
				c.setContactNumber(cont[2]);
				in++;			
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
			f=new FileWriter(contactFile);
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
		in=0;
	}
	public void rewriteFile(Contact contact)
	{
		try
		{
			f=new FileWriter(contactFile,true);
			b=new BufferedWriter(f);
			in++;
			String id=String.valueOf(in);
            
			b.write(id+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
			b.flush();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
	}
}