package com.lxisoft.onlineshoping;
public class Customer
{
	private String name;
	private String password;
	private String address;
	private int pincode;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public int getPincode()
	{
		return this.pincode;
	}

	public boolean equals(Object obj)
	{
		if((((Customer)obj).name==this.name) && (((Customer)obj).password==this.password) && (((Customer)obj).address==this.address) && (((Customer)obj).pincode==this.pincode))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int hashCode() 
    { 
		return Object;
	}

}