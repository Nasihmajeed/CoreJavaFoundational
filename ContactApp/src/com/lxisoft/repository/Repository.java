package com.lxisoft.repository;
import com.lxisoft.controllers.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.view.*;
import java.util.*;
import java.io.*;
 /**
 * class Repository
 */
public class Repository implements FileRepository
{
	File file=new File(fileName);
	FileWriter fw=null;
	FileWriter f=null;
	BufferedWriter bw=null;
	static int id=0;
	private List<Contact>contactList=new ArrayList<Contact>();
	 /**
 * set arraylist
 */
	 /**
 * @param contactList  is arraylist
 */
	public void setContactList(List<Contact>contactList)
	{
		this.contactList=contactList;
	}
	 /**
 * get contactlist
 */
	  /**
 * @return arraylist
 */
	public List<Contact> getContactList()
	{
		return contactList;
	}
 /**
 * @return size of arraylist
 */
	public int getContactListSize()
	{
		return contactList.size();
	}

 /**
 * file write
 */
  /**
 * @param c contact
 */
   /**
 * @return arraylist
 */
	public List<Contact> createFile(Contact c)
	{
		try
		{
			fw=new FileWriter(file,true);
			count();
			fw.write(id+","+c.getName()+","+c.getContactNo()+"\n");
			fw.flush();
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
		}
		return contactList;	
	}
	// public List<Contact> readFile()
	// {
	// 	try
	// 	{
	// 		FileReader fr=new FileReader(file);
	// 		BufferedReader br=new BufferedReader(fr);
	// 		String read;
	// 		while((read=br.readLine())!=null)
	// 		{
	// 			System.out.println(read+"\n");
	// 		}
			
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("an error ");
	// 	}
	// 	return contactList; 	
	// }

	 /**
 * 
 */
	  /**
 * @return arraylist
 */
	public List<Contact> arrayWrite()
	{
		Set<Contact> ts=new TreeSet<Contact>();
		try
		{
			// fw=new FileWriter(file,true);
			contactList.clear();
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;       
			while((read=br.readLine())!=null)
			{
				String[] str=read.split(",",3);
				Contact c=new Contact();
				c.setId(str[0]);
				c.setName(str[1]);
				c.setContactNo(str[2]);
				// System.out.println(read+"\n");
				ts.add(c);
				
			}
			contactList.addAll(ts);
		}
		catch(IOException e)
		{
			System.out.println(" contact list empty!!!!");
		}	
		return contactList;
	}
	 /**
 * to set id
 */
	public void count()
	{
		try
		{
			id=0;
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;
			while((read=br.readLine())!=null)
			id++;
		}
		catch(IOException e)
		{
			System.out.println("an error ");
		}	
	}
	 /**
 * reset file
 */
	public void resetFile()
	{
		try
		{
			f=new FileWriter(file);
			id=0;
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
		}
	}
	 /**
 * file rewritej
 */
	public void rewriteFile(Contact c)
	{
		try
		{
			FileWriter r=new FileWriter(file,true);
			bw=new BufferedWriter(r);
			bw.write(c.getId()+","+c.getName()+","+c.getContactNo()+"\n");
			bw.flush();
		}
		catch(IOException e)
		{
			System.out.println("an error"+e);
		}	
	}
}