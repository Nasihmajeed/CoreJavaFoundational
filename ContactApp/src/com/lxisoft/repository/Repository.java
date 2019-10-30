package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.contactmodel.*;
public class Repository implements FileDataSource
{
	File contactFile=new File(fileName);
	public void createFile(List <Contact> contactList)
	{
		try
		{
			contactFile.createNewFile();
			FileWriter fw=new FileWriter(contactFile);
			System.out.println(contactFile.exists());
			fw.write("ID");
			fw.write(",");
			fw.write("Name");
			fw.write(",");
			fw.write("Number\n");
			for(int k=0;k<contactList.size();k++)
			{
				int index=contactList.indexOf(contactList.get(k));
				String id=String.valueOf(index);
				fw.write(id);
				fw.write(",");
				fw.write(contactList.get(k).getContactName());
				fw.write(",");
				fw.write(contactList.get(k).getContactNumber());
				fw.write("\n");
			}
			fw.flush();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
		readFile(contactList);
	}
	// public void readFile(List <Contact> contactList)
	// {
	// 	try
	// 	{
	// 		FileReader fr=new FileReader(contactFile);
	// 		fr.read();
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println(" error"+e);
	// 	}
	// }
}