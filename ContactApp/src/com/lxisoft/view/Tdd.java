package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.Contact;
import java.util.*;
public class Tdd
{
	static ContactController control=new ContactController();
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int default_option=0;
		char continueOpt='\0';
		do
		{  
			System.out.println(" <---Contact App Menu--->");
			System.out.println(" 1:Add  \n 2:Search  \n 3:View \n 4:Exit");
			System.out.println(" select your option	");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:		createNewContact(control);break;
				case 2:		searchContact(control);break;
				case 3:		readContact(control);break;
				case 4:		continueOpt='n';break;
				default:	System.out.println("Enter the correct option!");
							default_option=1;break;
			}
			System.out.println("Do you want to continue ? Y/N");
			continueOpt=sc.next().charAt(0);
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
	}
	public static void readContact(ContactController control)
	{	
		int i;
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		System.out.println("contact List \n.................");
		System.out.println("  Name \t ContactNo");
		for( i=0;i<length;i++)
		{
			System.out.print((i)+" ");
			control.getContactDetails(i);
		}
		System.out.println("Select an option to continue \n 1:search \n2:Back to menu");
		int option=sc.nextInt();
		int val=0;
		String[] array=new String[5];
		switch(option)
		{
			case 1:searchContact(control);break;
			case 2:val=1;break;
		}
		if(val==1)
			System.out.println("Do you want to exit ? 1-yes 0-No  ");
			int opt=sc.nextInt();
			main(array);

	}
	public static void updateContact(ContactController control,int i)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option to continue \n 1:Edit \n2:Delete \n3:Main menu");
		int select=sc.nextInt();
		switch(select)
		{
			case 1: editContact(control,i);break;
			case 2: deleteContact(control,i);break;
			case 3: String[] array=new String[5];main(array);break; 
		}
	}
	public static void createNewContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("contact Name:	");
		String name=sc.next();
		System.out.println("number ");
		String number=sc.next();
		control.addContact(name,number);
	}
	public static void search(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		System.out.println(" Enter the name to search:");
		String name=sc.next();
		int value=0,i;
		for(i=0;i<length;i++)
		{
			value=control.searchContact(i,name);
			updateContact(control,i);
		}
	}
	public static void searchContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		System.out.println(" Enter the name to search:");
		String name=sc.next();
		int value=0;
		for(int i=0;i<length;i++)
		{
			value=control.searchContact(i,name);
			updateContact(control,i);
		}
	     if(value==0)
				contactNotFound();
		
	}
	public static void contactNotFound()
	{
		System.out.println(" There is no such contacts..! ");
		String[] array=new String[5];main(array);	
	}
	public static void editContact(ContactController control,int i)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Edit Name \n2:Edit ContactNo \n3:Main menu ");
		int select=sc.nextInt();
		String name;String num;
		switch(select)
		{
			case 1:	System.out.println("Enter the new name");name=sc.next();
					num=control.getNo(i);control.updateContact(i,name,num);System.out.println("updated!");break;
			case 2: System.out.println("Enter the new number");num=sc.next();
					name=control.getName(i);control.updateContact(i,name,num);System.out.println("updated!");break;	
			case 3:	String[] array=new String[5];main(array);break;	
		}		
	}
	public static void deleteContact(ContactController control,int i)
	{
		control.deleteContact(i);
	}
}