package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.contactmodel.*;
public class Repository implements FileDataSource
{
	static int in=0;
	static File contactFile=new File(fileName);
	public List <Contact> getFileDetails(List <Contact> contactList)
	{
		String contacts;
		try
		{
			FileReader fr=new FileReader(contactFile);
			BufferedReader br=new BufferedReader(fr);
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
		catch(Exception e)
		{
			System.out.println(" file is not present"+e);
		}
		return contactList;
	}
	public void writeFile(Contact contact)
	{
		String contacts;
		try
		{
			System.out.println(contactFile.exists());
			if(contactFile.exists())
			{
				FileWriter fw=new FileWriter(contactFile,true);
				BufferedWriter bw=new BufferedWriter(fw);
				// for(int k=0;k<contactsList.size();k++)
				// {
				// int index=contactsList.indexOf(contactsList.get(k));
				// int in=(index+1);
				
					String id=String.valueOf((in+1));
					bw.write(id+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
				// }
				bw.flush();
				bw.close();
			}
			else
			{
				FileWriter fw=new FileWriter(contactFile);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("ID"+","+"NAME"+","+"Number\n");
				String id=String.valueOf((in+1));
				bw.write(id+","+contact.getContactName()+","+contact.getContactNumber()+"\n");
			}
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
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