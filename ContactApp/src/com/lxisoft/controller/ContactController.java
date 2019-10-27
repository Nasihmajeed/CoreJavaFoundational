package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.view.Tdd;


public class ContactController
{
	ArrayList<Contact> array=new ArrayList<Contact>();
	

	public void setContact(int n)
	{
		Tdd t=new Tdd();
		for (int i=0;i<n;i++)
		{
			String[] temp=t.scan(i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			array.add(i,contact);
		}
	}
	
	public ArrayList<Contact> getContact()
	{
		return array;
	}
	

}


// public void print()
// 	{
		
// 		ArrayList<Contact> array;
// 		array=controller.setContact();
// 		for(Contact contact: array)
// 		{
// 			System.out.println("namell = " + contact.getName());
// 			System.out.println("Numberll = " + contact.getNumber());
// 		}
// 	}