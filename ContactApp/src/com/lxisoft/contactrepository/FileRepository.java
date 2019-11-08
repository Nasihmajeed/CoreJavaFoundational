package com.lxisoft.contactrepository;
import java.io.*;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.view.Tdd;
import com.lxisoft.contactrepository.FileStorage;

public class FileRepository implements FileStorage
{
	Tdd t=new Tdd();
	File file=new File(directory);
	static int i=0;
	//Contact contact=new Contact();

	public void save(Contact contact)
	{
		try
		{
			if(file.exists())
			{
				System.out.println(" FILE ALREADY EXISTS  ");
				FileWriter fw1=new FileWriter(file,true);
				BufferedWriter bw1=new BufferedWriter(fw1);
				bw1.write(contact.getName()+","+contact.getNumber()+"\n");
				bw1.flush();
				bw1.close();
			}
			else
			{
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				System.out.println("NEW FILE CREATED");
				bw.write(" SL.NO , NAME , NUMBER\n"+contact.getName()+","+contact.getNumber()+"\n");
				bw.flush();
				bw.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}


	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> array=new ArrayList<Contact>();
		try
		{
			int j=0;
			FileReader fr=new FileReader(file);
			BufferedReader  br=new BufferedReader(fr);
			String details;
			while((details=br.readLine())!=null)
			{
				if(j!=0)
				{
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

	public void fileRead()
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

	public void syncFile(Contact contact,int j)
	{
		try
		{
			if(j==0)
			{
				FileWriter fwr1=new FileWriter(file);
				BufferedWriter bw1=new BufferedWriter(fwr1);
				bw1.write(" SL.NO , NAME , NUMBER\n");
				bw1.write((j+1)+","+contact.getName()+","+contact.getNumber()+"\n");
				bw1.flush();
				bw1.close();
			}
			else
			{
				FileWriter fwr1=new FileWriter(file,true);
				BufferedWriter bw1=new BufferedWriter(fwr1);
				bw1.write((j+1)+","+contact.getName()+","+contact.getNumber()+"\n");
				bw1.flush();
				bw1.close();
			}
			
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}