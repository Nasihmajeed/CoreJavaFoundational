package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;

public class Repository implements Filerepository
{
	
	//FileWriter fw ;
	//BufferedWriter bw;
	public void fileWrite(Contact contact)
	{ 		
		try
		{
		File file = new File(filename);
		FileWriter fw = new FileWriter(file);
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw= new BufferedWriter(fw);

	  	bw.write(contact.getName()+","+contact.getNumber()+"\n");
	  	bw.flush();
	  	String a ;
	  	while( (a= br.readLine())!=null)
	  	System.out.println(a);

		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}