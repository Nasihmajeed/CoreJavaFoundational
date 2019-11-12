package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
public class Repository implements Filerepository
{
	File file = new File(filename);
	FileWriter fw ;
	public void fileWrite()
	{ 
		
		try
		{
		FileReader f = new FileReader(file);
		BufferedReader buff = new BufferedReader(f);
	  	fw = new FileWriter(file); 
	  	fw.write("abhijith \n");
	  	fw.write("8768575435");
	  	fw.flush();
	  	String a ;
	  	while( (a= buff.readLine())!=null)
	  	System.out.println(a);

		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}