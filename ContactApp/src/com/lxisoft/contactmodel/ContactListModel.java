package com.lxisoft.contactmodel;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
/**
 *class: contactListModel for setting and getting arraylist
 */
public class ContactListModel
{
	/**
	 *instance variable contactListModel
	 */
	private List<ContactModel> contactListModel=new ArrayList<ContactModel>();
	/**
	 *to set arraylist
	 *
	 *@param model
	 */
	public void setContactListModel(ContactModel model)
	{
		contactListModel.add(model);
	}
	/**
	 *to get arraylist
	 *
	 *@return contactListModel
	 */
	public List<ContactModel> getContactListModel()
	{
		return contactListModel;
	}
}