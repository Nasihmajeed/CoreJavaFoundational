package com.lxisoft.Domain;
import com.lxisoft.Controller.Controller;
public class Contact
{ 
  private String name;
	private String number;
	private String id;
	public void setName(String n)
	{
      this.name = n;
	}
	public String getName()
   {
     return this.name;
   }  
   public void setNumber(String no)
   {
    this.number = no;
   }
   public String getNumber()
   {
     return this.number;
   }
     public void setId(String id)
   {
    this.id = id;
   }
   public String getId()
   {
     return this.id;
   }
}