package com.lxisoft.contactApp.model;
import java.util.ArrayList;
public class ViewContactModel 
{
	private ArrayList<Contcat> contactList=new ArrayList<Contact>();

	public void setContactList(ArrayList<Contact> contacts)
	{
		this.contacts=contacts;
	}
	public ArrayList<Contact> getContactList()
	{
		return contacts;
	}
	

}