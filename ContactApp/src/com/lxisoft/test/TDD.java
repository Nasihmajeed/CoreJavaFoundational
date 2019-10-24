package com.lxisoft.test;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
public class TDD
{
	public static void main(String[] args)
	{
		ContactController control=new ContactController();
		List <Contact> contactsList=new ArrayList<Contact>();
		contactsList=control.getContacts();
		System.out.println("\t <-----CONTACT----->\n");
		for(int i=0;i<contactsList.size();i++)
		{
			System.out.println("\tid-->"+contactsList.get(i).getContactId()+"\t"+contactsList.get(i).getContactName());
			System.out.println("\t\t"+ contactsList.get(i).getContactNumber());
		}
		
	} 
}