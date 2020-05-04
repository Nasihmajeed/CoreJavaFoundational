package com.lxisoft.repository;

import java.io.*;
import java.util.*;

import com.lxisoft.movie.Dialouge;

public class FileRepositoryImp implements FileRepository {

	public static FileRepositoryImp fileReppo;
	
	private FileRepositoryImp()
	{
		
	}
	
	public static FileRepositoryImp getInstance()
	{
		if(fileReppo == null)
		{
			return fileReppo = new FileRepositoryImp();
		}
		else
		{
			return fileReppo;
		}
	}
	
//	@Override
//	public String toString()
//	{
//		return "reppo";
//	}
	
	@Override
	public void writeToFile(List<Dialouge> dialouge)
	{
		
	}
	
	public List<Dialouge> readFromFile(List<Dialouge> dialouge)
	{
		//FileReader fr = new FileReader();
		return dialouge;
	}
}
