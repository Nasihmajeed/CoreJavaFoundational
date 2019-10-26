package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.Contact;
import java.util.*;
public class Tdd
{
	
	public static void main(String []args)
	{
		//Contact contact=getContact();
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
				case 1:		System.out.println("contact Name:	");
							String name=sc.next();
							System.out.println("number ");
							long number=sc.nextLong();
							control.addContact(name,number);
							break;

				case 2:		control.searchContact();break;

				case 3:		control.updateContact();break;

				case 4:		control.deleteContact();break;

				case 5:		control.getContact(); break;

				default:	System.out.println("Enter the correct option!");
							default_option=1;
							System.out.println("Do you want to continue ? Y/N");
							continueOpt=sc.next().charAt(0);
							break;
			}
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
		

	}
	
		
	
	// public static Contact getContact()
	// {
	// 	Scanner sc=new Scanner(System.in);
	// 	Contact contact=new Contact();
	// 	System.out.println("contact Name:	");
	// 	contact.setName(sc.next());
	// 	System.out.println("number ");
	// 	contact.setNo(sc.nextLong());
	
	// 	return contact;

	// }

	
}

