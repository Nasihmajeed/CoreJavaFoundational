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
		FileReader fileread = new FileReader();
	  	fw = new FileWriter(file); 
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}