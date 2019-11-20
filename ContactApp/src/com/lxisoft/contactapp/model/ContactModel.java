package com.lxisoft.contactapp.model;
	/**
	 * class contact model to set and get contact id and name
	 */
public class ContactModel
{
	/**
	 * instance variables name and id.
	 */
	private String name;
	private String id;
	/**
	 * setid of contact
	 *@param id
	 */
	public void setId(String id)
	{
		this.id=id;
	}
	/**
	 * set name of contact
	 *@param name
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 * getname of contact
	 *@return name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * getid of contact
	 *@return id
	 */
	public String getId()
	{
		return this.id;
	}
}