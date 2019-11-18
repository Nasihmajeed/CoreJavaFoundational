package com.lxisoft.models;
import java.util.*;
import java.io.*;
import com.lxisoft.view.*;
import com.lxisoft.models.*;
import com.lxisoft.controllers.*;

public class ContactListModel
{
	private List<ContactModel>contactsList=new ArrayList<ContactModel>();
	public void setContactsList(ContactModel model)
	{
		contactsList.add(model);	
	}
	public List<ContactModel> getContactsList()
	{
		return contactsList;
	}
}