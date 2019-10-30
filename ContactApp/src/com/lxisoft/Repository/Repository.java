package com.lxisoft.repository;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.Contact;
import java.util.*;
import java.io.*;
public class Repository implements FileStorage
{  
	File contactFile=new File(fileName) ;
	public void createNewFile(ArrayList<Contact> contacts)
	{
		try
		{
		contactFile.createNewFile();
		FileWriter fw=new FileWriter(contactFile);
		System.out.println(contactFile.exists());
		fw.write(" ID "+","+" NAME "+","+ "NUMBER \n");
		// for(int i=0;i<contacts.size();i++)
		// {
			
		// }
		fw.flush();
		fw.close();
		//FileReader fr=new FileReader(contactFile);
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}

}