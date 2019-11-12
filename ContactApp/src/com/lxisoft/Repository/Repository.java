package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public class Repository implements FileRepository
{
	File file=new File(fileName);
	
	public void writeNewContact(Contact contact)
	{
		try
		{
			FileWriter bf=new FileWriter(file,true);
			bf.write(","+contact.getName()+","+contact.getNo()+"\n");
			bf.flush();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public void viewAllContacts()
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public ArrayList<Contact> getAllContacts()
	{
		
	}
}