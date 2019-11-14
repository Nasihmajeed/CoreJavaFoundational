package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;

public class Repository implements Filerepository
{
	File file = new File(filename);

	public void fileWrite(Contact contact)
	{ 		
	
		try
		{
		
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw= new BufferedWriter(fw);

	  	bw.write(contact.getName()+", "+contact.getNumber()+"\n");
	  	bw.flush();
	  		}
		catch (IOException e)
		{
			System.out.println(e);
		}

	}
	public void fileRead()
	{
		try
		{
		  	FileReader fr = new FileReader(file);
		  	BufferedReader br = new BufferedReader(fr);
		  	String a ;
	  		while( (a= br.readLine())!=null)
	  		System.out.println(a +"\n");

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	public void fileDelete()
	{
			FileReader fr = new FileReader(file);
		  	BufferedReader br = new BufferedReader(fr);
		  	String a ;
	  		while( (a= br.readLine())!=null)
	  		System.out.println(a +"\n");
	}
}