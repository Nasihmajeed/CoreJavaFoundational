package com.lxisoft.contactApp.model;
import java.util.ArrayList;
import com.lxisoft.contactApp.domain.Contact;
public class ViewContactModel 
{
	private ArrayList<Contact> contactList=new ArrayList<Contact>();

	public void setContactList(ArrayList<Contact> contacts)
	{
		this.contactList=contactList;
	}
	public ArrayList<Contact> getContactList()
	{
		return contactList;
	}
	

}