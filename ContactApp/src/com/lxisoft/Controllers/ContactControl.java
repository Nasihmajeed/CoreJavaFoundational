package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import java.util.*;

public class ContactControl
{
	ArrayList<Contact> contacts =new ArrayList<Contact>();	
	

	public void setContactName(Contact model, String name)
	{
		model.setName(name);
	}
	public String getContactName(Contact model)
	{
		return model.getName();
	}
	public void setContactNo(Contact model,long no)
	{
		model.setNo(no);
	}
	public long getContactNo(Contact model)
	{
		return model.getNo();
	}

	public void updateContact(Contact model,String name, long no)
	{
		setContactName(model,name);
		setContactNo(model,no);
	}
	public void setNewContact(String name, Long no)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(no);
		contacts.add(contact);
	}
	public void getContactDetail()
	{

	}
	public int getContactsLength()
	{
		return contacts.size();
	}
}
