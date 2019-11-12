package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;

public class Repository implements Filerepository
{
	File file = new File(filename);
	FileWriter fw ;
	public void fileWrite()
	{ 		
		try
		{
		FileReader f = new FileReader(file);
		BufferedReader br = new BufferedReader(f);
	  	fw = new FileWriter(file); 
	  	fw.write("abhijith \n");
	  	fw.write("8768575435");
	  	fw.flush();
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