package com.lxisoft.contactrepository;
import java.io.*;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.view.Tdd;
import com.lxisoft.contactrepository.FileStorage;

public class Repository implements FileStorage
{
	Tdd t=new Tdd();
	File file=new File(directory);
	static int i=0;
	//Contact contact=new Contact();

	public ArrayList<Contact> check(ArrayList<Contact> array)
	{
		try
		{
			if(file.exists())
			{
				array=initialFileRead();
				System.out.println(" data already in contact file");
			}
			else
			{
				FileWriter fw=new FileWriter(file);
				BufferedWriter br=new BufferedWriter(fw);
				br.write(" SL.NO , NAME , NUMBER\n");
				br.flush();
				br.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		return array;
	}

	public ArrayList<Contact> addToFile(ArrayList<Contact> array)
	{
		try
		{
			FileWriter fwr=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fwr);
			for(Contact contact: array)
			{
				i++;
				bw.write((i)+","+contact.getName()+","+contact.getNumber()+"\n");
			}
			bw.flush();
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		return array;
	}

	public ArrayList<Contact> initialFileRead()
	{
		ArrayList<Contact> array=new ArrayList<Contact>();
		try
		{
			int j=0;
			FileReader fr=new FileReader(file);
			BufferedReader  br=new BufferedReader(fr);
			String details;
			System.out.println("THE FILE IS ");
			System.out.println("SL.NO, NAME, NUMBER");
			while((details=br.readLine())!=null)
			{
				if(j!=0)
				{
					System.out.println(details);
					String[] data=details.split(",");
					Contact contact=new Contact();
					contact.setName(data[1]);
					contact.setNumber(data[2]);
					array.add(array.size(),contact);
				}
				j++;
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		return array;
	}	

	public void fileRead(ArrayList<Contact> array)
	{
		try
		{
			System.out.println("THE FILE IS ");
			FileReader fr1=new FileReader(file);
			BufferedReader  br1=new BufferedReader(fr1);
			String details;
			while((details=br1.readLine())!=null)
			{
				System.out.println(details);
			}
			br1.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}	

	public void syncFile(ArrayList<Contact> array)
	{
		try
		{
			int j=0;
			FileWriter fwr1=new FileWriter(file);
			BufferedWriter bw1=new BufferedWriter(fwr1);
			bw1.write(" SL.NO , NAME , NUMBER\n");
			for(Contact contact: array)
			{
				j++;
				bw1.write((j)+","+contact.getName()+","+contact.getNumber()+"\n");
			}
			bw1.flush();
			bw1.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}