package com.lxisoft.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.contactmodel.*;
public class Repository implements FileDataSource
{
	File contactFile=new File(fileName);
	public void writeFile(List <Contact> contactsList)
	{
		try
		{
			contactFile.createNewFile();
			FileWriter fw=new FileWriter(contactFile);
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println(contactFile.exists());
			bw.write("ID"+","+"NAME"+","+"Number\n");

			for(int k=0;k<contactsList.size();k++)
			{
				int index=contactsList.indexOf(contactsList.get(k));
				int in=(index+1);
				String id=String.valueOf(in);
				bw.write(id+","+contactsList.get(k).getContactName()+","+contactsList.get(k).getContactNumber()+"\n");
			}
			bw.flush();
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}	
		readFile();
	}
	public void readFile()
	{
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
		editFile();
	}
	public void editFile()
	{
		String contacts;
		List <Contact> contList=new ArrayList<Contact>();
		try
		{
			FileReader fr=new FileReader(contactFile);
			BufferedReader br=new BufferedReader(fr);
			while((contacts=br.readLine())!=null)
			{
				Contact c=new Contact();
				String[] cont=contacts.split(",");
				for(int i=0;i<(cont.length+1);i++)
				{
					switch(i)
					{
						case 1:c.setContactName(cont[i]);	
						case 2:c.setContactNumber(cont[i]);			
					}
					if(i==3)
					{
						contList.add(c);
					}
				}
			}
			int i = 0;
			for(Contact con:contList)
			{
				System.out.println("\t "+i+"\t"+con.getContactName()+"\t\t"+ con.getContactNumber());
				i++;
			}
		}
		catch(IOException e)
		{
			System.out.println(" error"+e);
		}
	}
}