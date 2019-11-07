package com.lxisoft.repository;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import com.lxisoft.controllers.*; 
import java.io.File;
public class Repository
{
	public void createFile()
	{
	try
	{
		File file=new File("filename");
		if(file.createNewfile())
		{
			System.out.println("File created:"+file.getName());
			System.out.println("File created:"+file.getContactNo());
		}
		else
		{
			System.out.println("File already exist");
		}
	}
	catch(IOException e)
	{
		System.out.println("an error occured");
		e.printStackTrace();
	}	
	}	
}