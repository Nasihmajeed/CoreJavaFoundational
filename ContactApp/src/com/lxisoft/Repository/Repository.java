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
			FileWriter newFile=new FileWriter(contactFile);
			newFile.write(" ID , NAME , NUMBER \n");
			newFile.flush();
			saveFile(contacts);
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}
	public void saveFile(ArrayList<Contact> contacts)
	{
		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);
			for(int i=0;i<contacts.size();i++)
			{  
				Contact x=contacts.get(i);
				int index=((contacts.indexOf(x))+1);
				String id=String.valueOf(index);
				br.write(id +","+contacts.get(i).getName()+","+contacts.get(i).getNo()+"\n");
			}
			br.flush();
			br.close();
			//FileReader fr=new FileReader(contactFile);
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}

}