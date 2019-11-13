package com.lxisoft.Models;

import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public class ViewList
{

	public ArrayList<ViewListModel> viewList =new ArrayList<ViewListModel>();
	
	public void setAllContacts(ArrayList<Contact> contacts)
	{
		for(int i=0;i<contacts.size();i++)
		{
			ViewListModel list=new ViewListModel();
			list.setId(contacts.get(i).getId());
			list.setName(contacts.get(i).getName());
			viewList.add(list);
		}
		
	}
	public ArrayList<ViewListModel> getAllContacts()
	{
		return viewList;
	}
}
