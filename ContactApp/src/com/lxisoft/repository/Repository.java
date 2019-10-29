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
			for(int k=0;k<contactList.size();k++)
			{
				fw.write(contactList.get(k).getContactName());
				fw.write("----");
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
	}
	// public void readFile()
	// {
	// 	FileReader fr=new FileReader(contactFile);
	// 	size=fr.read(in);
	// 	System.out.print(size + " ");   
	// 	for()
	// 	{
	// 		System.out.print(c);
	// 	}
	// 	fr.close();
	// }
}