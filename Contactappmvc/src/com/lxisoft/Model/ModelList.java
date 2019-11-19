package com.lxisoft.Model;
import java.util.ArrayList;
public class ModelList
{
	private ArrayList <Model1> modelslist = new ArrayList <Model1>();

	public void setContactsList(Model1 model)
	{
     modelslist.add(model);
	}
	public ArrayList <Model1> getContactsList()
	{
		return modelslist;
	}

}