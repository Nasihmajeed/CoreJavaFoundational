package com.lxisoft.movie;

import java.util.*;

import com.lxisoft.repository.*;

public class Script {
	
 private List<Dialouge> dialouge = new ArrayList<>();
 private FileRepositoryImp fileReppo = FileRepositoryImp.getInstance();
	
	public void setDialouge()
	{
		for(int i =0;i<10;i++)
		{
			dialouge.add(new Dialouge());
			System.out.println("Object Name : "+dialouge.get(i));
		}
	}
	public void getDialouge()
	{
		dialouge = fileReppo.readFromFile(dialouge);
	}
}
