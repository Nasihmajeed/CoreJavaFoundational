package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
public class Repository implements Filerepository
{
	File file = new File(filename);
	FileWriter fw ;
	public void fileWrite()
	{ try
		{
		FileReader f = new FileReader(file);
	  	fw = new FileWriter(file); 
	  	fw.write("abhijith");
	  	fw.flush();
	  	String a= f.readLine();
	  	System.out.println(a);

		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}