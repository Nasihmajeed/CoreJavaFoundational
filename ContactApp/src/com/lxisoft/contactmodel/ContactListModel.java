package com.lxisoft.contactmodel;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
public class ContactListModel
{
	private List<ContactModel> contactListModel=new ArrayList<ContactModel>();
	public void setContactListModel(ContactModel model)
	{
		contactListModel.add(model);
	}
	public List<ContactModel> getContactListModel()
	{
		return contactListModel;
	}
}