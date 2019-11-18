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

	private ArrayList<ViewListModel> viewList =new ArrayList<ViewListModel>();
	
	public void setContact(Contact contact)
	{
		ViewListModel list=new ViewListModel();
		list.setId(contact.getId());
		list.setName(contact.getName());
		viewList.add(list);
	}
	public ArrayList<ViewListModel> getAllContacts()
	{
		return viewList;
	}
	public void clearArray()
	{
		viewList.clear();
	}
}
