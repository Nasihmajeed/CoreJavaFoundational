package com.lxisoft.contactapp.Domain;
import  java.lang.Comparable;
/**
 * pojo : Contact class for set and get contact details that implements Comparable
 */
public class Contact implements Comparable<Contact>
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
	/**
	 * set name in contacts
	 * @param name
	 */
	public void setName(String name)
	{ 
		this.name=name;
	}
	/**
	 * set number in contacts
	 * @param phno
	 */
	public void setNo(String phno)
	{
		this.phno=phno;
	}
	/**
	 * get id in contacts
	 * @return id
	 */
	public String getId()
	{
		return this.id;
	}

	/**
	 * get name in contacts
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * get number in contacts
	 * @return number
	 */
	public String getNo()
	{
		return this.phno;
	}
	/**
	 * @override equal method to check whether object equals or not
	 *@param object
	 * @return boolean true or false.
	 */
	public boolean equals(Object obj)
	{
		Contact contact=(Contact)obj;
		if(this.name.equals(contact.getName()))
			return true;
		else return false;
	}
	/**
	 * @override compareTo method to check whether object equals or not
	 *@param object
	 */
	public int compareTo(Contact contact)
	{int val=0;
		return val; 
	}
}