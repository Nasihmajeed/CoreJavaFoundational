package com.lxisoft.contactapp.Domain;
/**
 * pojo : Contact class for set and get contact details
 */
public class Contact
{
	/**
	 * instance variables id name and number.
	 */
	private String id;
	private String name;
	private String phno;
	/**
	 * set id in contacts
	 * @param id
	 */
	public void setId(String id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{ 
		this.name=name;
	}
	public void setNo(String phno)
	{
		this.phno=phno;
	}
	public String getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getNo()
	{
		return this.phno;
	}
	public boolean equals(Object obj)
	{
		Contact contact=(Contact)obj;
		if(this.name.equals(contact.getName()))
			return true;
		else return false;
	}
}