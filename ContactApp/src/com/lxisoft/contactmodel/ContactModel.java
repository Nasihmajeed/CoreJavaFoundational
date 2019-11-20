package com.lxisoft.contactmodel;																													
import com.lxisoft.contactcontroller.*;
/**
 *model class:contact model with contact id and contact name
 */
public class ContactModel
{
	/**
	 *instance variable id and name
	 */
	private String id;
	private String name;
	/**
	 *to set id for contact
	 *
	 *@param id contact id
	 */
	public void setId(String id)
	{
		this.id=id;
	}
	/**
	 *to get id for contact
	 *
	 *@return id
	 */
	public String getId()
	{
		return id;
	}
	/**
	 *to set name for contact
	 *@param name contact name
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 *@return contact name
	 */
	public String getName()
	{
		return name;
	}

}