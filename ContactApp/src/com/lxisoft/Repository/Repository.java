package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public class Repository implements FileRepository
{
	static File file=new File(fileName);
	static FileWriter fw=null;
	static int count=0;

	public void clearAll()
	{
		try
		{
			FileWriter fy=new FileWriter(file);
			count=0;
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public ArrayList<Contact> initialization(ArrayList<Contact> contacts, Contact contact)
	{
		try
		{
			fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String str=br.readLine();
			if(str!=null)
			{	while((str=br.readLine())!=null)
				{
					count++;
					String[] strln=str.split(",",3);
					contact=new Contact();
					contact.setName(strln[1]);
					contact.setNo (strln[2]) ;
					contacts.add(contact);
				}
			}
			
		}catch(Exception e)
		{
			System.out.println("error");
		}
		return contacts;
	} 

	public void updateFile(Contact contact)
	{
		try
		{
			fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String str=null;
			if((str=br.readLine())==null)
			{
				fw=new FileWriter(file);
				fw.write("ID,Name,Number \n");
				fw.flush();
			}			
			count++;
			fw.write(count +","+contact.getName()+","+contact.getNo()+"\n");
			fw.flush();
			
		}catch(Exception e)
		{
			System.out.println("error occure : "+e);
		}
	}
	public boolean viewAllContacts()
	{
		boolean add=false;
		try
		{
			FileReader fr=new FileReader( file);
			BufferedReader br =new BufferedReader(fr);
			String str=null;
			if((str=br.readLine())!=null)
			{
				do
				{
					String[] strln=str.split(",",3);
					for(String a: strln)
						System.out.print(a+"\t");
						System.out.println("");
				}while((str=br.readLine())!=null);
			}
			else add=true; 
		}catch(Exception e)
		{
			System.out.println("error");
		}
		return add;
	}
}