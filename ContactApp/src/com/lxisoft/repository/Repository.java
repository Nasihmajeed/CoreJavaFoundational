package com.lxisoft.repository;
import com.lxisoft.controllers.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import java.util.*;
import java.io.*;

public class Repository implements FileRepository
{
	File file=new File(fileName);
	
	public void createFile(Contact c)
	{
	try
	{
		FileWriter fw=new FileWriter(file);
		fw.write("Id,"+c.getName()+","+c.getContactNo());

		fw.flush();
	}
	catch(IOException e)
	{
		System.out.println("an error occured");
	}	
	}	
}