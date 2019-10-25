package com.lxisoft.view;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ContactControl control=new ContactControl();
		List<Contact>contactList=new ArrayList<Contact>();
		System.out.println("CONTACT APP\n***************");
		contactList=control.getContactDetails();
		for(int i=0;i<contactList.size();i++)
		{
			System.out.println("Name= "+contactList.get(i).getName());
			System.out.println("Number= "+contactList.get(i).getContactNo());
		}
		System.out.println("\nDo you want to perform any operations?\n0-Add\n1-Remove\n2-Edit\n3-Exit");
		int x=sc.nextInt();
		switch(x)
		{
			case 0:addContact(control);break;
		}
	}
	public static void addContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter contact number:");
		String contactNo=sc.next();
		control.addDetails(name,contactNo);
	}
}