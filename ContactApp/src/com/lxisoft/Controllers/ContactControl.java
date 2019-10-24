package com.lxisoft.Controllers;

import com.lxisoft.Models.*;

public class ContactControl
{
	private Contact model;
	
	public ContactControl(Contact contact)
	{
		
		this.model=contact;

	}

	public void setContactName(String name)
	{
		model.setName(name);
	}
	public String getContactName()
	{
		return model.getName();
	}
	public void setContactNo(long no)
	{
		model.setNo(no);
	}
	public long getContactNo()
	{
		return model.getNo();
	}

	public void updateContact(String name, long no)
	{
		setContactName(name);
		setContactNo(no);
	}
}
