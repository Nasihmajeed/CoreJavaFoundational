package com.lxisoft.ContactApp;
import com.lxisoft.ContactApp.*;
import java.util.Scanner;
public class Contact
{
	String name;
    String number;

    public Contact(String name,String number)
    {
    	this.name=name;
    	this.number=number;
   }
   public Contact()
   {
   	
   }
	public void display()
	{
		System.out.println(" "+this.name+" "+this.number);
	}
}