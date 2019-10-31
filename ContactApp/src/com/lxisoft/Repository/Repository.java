package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public class Repository implements FileRepository
{
	static File file=new File(fileName);
	static FileWriter fw=null;

	static 
	{
		try{
		fw=new FileWriter(file);
		fw.write("Name ,");
		fw.flush();
		fw.write("number \n");
		fw.flush();
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public void updateFile(ArrayList<Contact> contacts)
	{
		try
		{
			fw=new FileWriter(file,true);
			for(int i=0; i<contacts.size(); i++)
			{
				fw.write(contacts.get(i).getName());
				fw.write(",");
				fw.write((String.valueOf( contacts.get(i).getNo())));
				fw.write("\n");
				fw.flush();

			}
		}catch(Exception e)
		{
			System.out.println("error occure : "+e);
		}
	}
	public void restoreContacts()
	{
		try
		{
			FileReader fr=new FileReader( file);
			BufferedReader br =new BufferedReader(fr);
			String str=null;
			while((str=br.readLine())!=null)
			{
				System.out.println("12345"+ 	str);
			}
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
}