package com.lxisoft.ContactApp;
import com.lxisoft.ContactApp.*;
import java.util.Scanner;
public class Contact
{
	String name;
    long number;
   
    public Contact(String name,long number)
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