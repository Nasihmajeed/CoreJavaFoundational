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
				fw.write(id+","+contactsList.get(k).getContactName()+","+contactsList.get(k).getContactNumber()+"\n");
			}
			fw.flush();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
		readFile();

	}
	public void readFile()
	{
		int size=0;
		String contacts;
		try
		{
			FileReader fr=new FileReader(contactFile);
			BufferedReader br=new BufferedReader(fr);
			while((contacts=br.readLine())!=null)
			{
				System.out.println(contacts);
			}
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
	}
}