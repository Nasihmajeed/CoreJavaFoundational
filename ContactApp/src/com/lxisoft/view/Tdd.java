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
			String name;long number;
			System.out.println(" select your option	");
			System.out.println(" 1:Add  \n 2:Search  \n 3:update  \n 4:Delete \n 5:View");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:		System.out.println("contact Name:	");
							name=sc.next();
							System.out.println("number ");
							number=sc.nextLong();
							control.addContact(name,number);
							break;

				case 2:		System.out.println(" Enter the name to search:");
							name=sc.next();
							control.searchContact(name);break;

				case 3:		System.out.println("enter the contact to edit");

							control.updateContact();break;

				case 4:		System.out.println("enter the contact to delete");
							name=sc.next();
							control.deleteContact(name);break;

				case 5:		getContacts(control);break;
				default:	System.out.println("Enter the correct option!");
							default_option=1;
							break;
			}
			System.out.println("Do you want to continue ? Y/N");
			continueOpt=sc.next().charAt(0);
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
		
		public static void getContacts(ContactController control)
		{
	
			int length=control.getLength();
			for(int i=0;i<;i++)
			{

			// 	System.out.println("Name: "+contacts.get(i).getName()+"\n"+"phno: "+contacts.get(i).getNo()); 	
			}
			

		}

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

