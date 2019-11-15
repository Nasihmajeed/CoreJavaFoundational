package com.lxisoft.contactmodel;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
public class ContactListModel
{
	private List<ContactModel> contactListModel=new ArrayList<ContactModel>();
	public void setContactListModel(List<ContactModel> contactListModel)
	{
		this.contactListModel=contactListModel;
	}
	public List<ContactModel> getContactListModel()
	{
		return contactListModel;
	}
}