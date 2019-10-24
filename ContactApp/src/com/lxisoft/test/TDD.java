package com.lxisoft.test;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		ContactController control=new ContactController();
		List <Contact> contactsList=new ArrayList<Contact>();
		
		System.out.println("\t <-----CONTACT----->\n");
		System.out.println("do you want to add a contact(1-yes or 2-no)?");
		int a=s.nextInt();
		if(a==1)
		{
			System.out.println("Enter contact name");
			String name=s.next();
			System.out.println("Enter contact number");
			long num=s.nextInt();
			control.addContact(name,num);
		}
		contactsList=control.getContacts();
		for(int i=0;i<contactsList.size();i++)
		{
			System.out.println("\tid-->"+contactsList.get(i).getContactId()+"\t"+contactsList.get(i).getContactName());
			System.out.println("\t\t"+ contactsList.get(i).getContactNumber());
		}
		
	} 
}