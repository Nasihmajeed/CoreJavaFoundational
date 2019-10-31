package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.contactmodel.*;
public class Repository implements FileDataSource
{
	File contactFile=new File(fileName);
	public void createFile(List <Contact> contactsList)
	{
		try
		{
			contactFile.createNewFile();
			FileWriter fw=new FileWriter(contactFile);
			System.out.println(contactFile.exists());
			fw.write("ID"+","+"NAME"+","+"Number\n");

			for(int k=0;k<contactsList.size();k++)
			{
				int index=contactsList.indexOf(contactsList.get(k));
				int in=(index+1);
				String id=String.valueOf(in);
				fw.write(id);
				fw.write(",");
				fw.write(contactsList.get(k).getContactName());
				fw.write(",");
				fw.write(contactsList.get(k).getContactNumber());
				fw.write("\n");
			}
			fw.flush();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
		readFile(contactsList);

	}
	public void readFile(List <Contact> contactsList)
	{
		int size=0;
		System.out.println("size=="+contactsList.size());
		char[] contacts=new char[100];
		try
		{
			FileReader fr=new FileReader(contactFile);
			fr.read(contacts);
			// System.out.println(size+" ");
			for(char c:contacts)
			{
				System.out.print(c);
			}
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
	}
}