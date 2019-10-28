package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.Contact;
import java.util.*;
public class Tdd
{
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		ContactController control=new ContactController();
		int default_option=0;
		char continueOpt='\0';
		do
		{  
		
			System.out.println(" select your option	");
			System.out.println(" 1:Add  \n 2:Search  \n 3:update  \n 4:Delete \n 5:View");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:		createNewContact(control);break;
				case 2:		searchContact(control);break;
				case 3:		updateContact(control);break;
				case 4:		deleteContact(control);break;
				case 5:		readContacts(control);break;
				default:	System.out.println("Enter the correct option!");
							default_option=1;
							break;
			}
			System.out.println("Do you want to continue ? Y/N");
			continueOpt=sc.next().charAt(0);
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
	}
	public static void readContacts(ContactController control)
	{
		int length=control.getLength();
		System.out.println("Name \t ContactNo");
		for(int i=0;i<length;i++)
			control.getContactDetails(i);
	}
	public static void createNewContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("contact Name:	");
		String name=sc.next();
		System.out.println("number ");
		long number=sc.nextLong();
		control.addContact(name,number);
	}
	public static void searchContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		System.out.println(" Enter the name to search:");
		String name=sc.next();
		for(int i=0;i<length;i++)
		control.searchContact(i,name);
	}
	public static void updateContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		System.out.println("contact List \n.................");
		System.out.println("  Name \t ContactNo");
		for(int i=0;i<length;i++)
		{
			System.out.print((i)+" ");
			control.getContactDetails(i);
		}
			System.out.println("enter the location to edit");
			int position=sc.nextInt();
			control.getContactDetails(position);
			System.out.println("1:Edit Name \n2:Edit ContactNo ");
			int select=sc.nextInt();
			String name;long num;
			switch(select)
			{
				case 1:	System.out.println("Enter the new name");name=sc.next();
						num=control.getNo(position);control.updateContact(position,name,num);System.out.println("updated!");break;
				case 2: System.out.println("Enter the new number");num=sc.nextLong();
						name=control.getName(position);control.updateContact(position,name,num);System.out.println("updated!");break;			
			}	
		
		
	}
	public static void deleteContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		System.out.println("contact List \n.................");
		System.out.println("  Name \t ContactNo");
		for(int i=0;i<length;i++)
		{
			System.out.print((i)+" ");
			control.getContactDetails(i);
		}
		System.out.println("enter the contact to delete");
		int number=sc.nextInt() ;
		control.deleteContact(number);
	}


}
	
		


	


