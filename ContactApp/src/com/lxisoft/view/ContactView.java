package com.lxisoft.view;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import java.util.*;
public class ContactView
{
	public  int disply()
	{
		// int c=0;
		Scanner sc=new Scanner(System.in);
		ContactControl control=new ContactControl();
		System.out.println("        CONTACT APP\n        ***************");
		// viewName(control);
		System.out.println("Enter your choice\n 1-getContacts");
		int choice=sc.nextInt();
		// do
		// {
		// 	c=0;
		// 	System.out.println("\nDo you want to perform any operations?\n0-Add\n1-Select\n2-Search");
		// 	int x=sc.nextInt();
		// 	switch(x)
		// 	{
		// 		case 0:addContact(control);break;a
		// 		case 1:selectContact(control);break;
		// 		case 2:searchContact(control);break;
		// 		default:System.out.println("Invalid Selection");
		// 	}
		// 	System.out.println("Continue...?\n0-No   1-Yes");
		// 	c=sc.nextInt();
	 //    }while(c==1);
	      // getContact(control);
	      return choice;
	}
    public void getContact(ArrayList<ContactModel>contacts)
    {
	 	System.out.println("Contact List\n----------------");
	// 	for(int i=0;i<contacts;i++)
	// 	{
	// 		System.out.println(" Name= "+control.viewDetails(i).getName());
	// 		System.out.println("Number= "+control.viewDetails(i).getContactNo()+"\n");
		// }
	}
	// public static void viewName(ContactControl control)
 //    {
	// 	for(int i=0;i<control.getArraySize();i++)
	// 	{
	// 		System.out.println("id="+control.viewDetails(i).getId());
	// 		System.out.println(" Name= "+control.viewDetails(i).getName());
	// 	}
	// }
// 	public void addContact(ContactControl control)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("\nEnter Contact name:");
// 		String name=sc.next();
// 		System.out.println("\nEnter contact number:");
// 		String contactNo=sc.next();
// 		control.addDetails(name,contactNo);
// 		viewContact(control);
// 	}
// 	public void selectContact(ContactControl control)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		viewName(control);
// 		System.out.println("Select a contact by number");
// 		int no=sc.nextInt();
// 		control.selectDetails(no);
// 		System.out.println("0-delete     1-Edit");
// 		int y=sc.nextInt();
// 		switch(y)
// 		{
// 			case 0:deleteContact(control,no);break;
// 			case 1:updateContact(control,no);break;
// 			default:System.out.println("Invalid selection");
// 		}
// 	}
// 	public void deleteContact(ContactControl control,int no)
// 	{
// 		control.deleteDetails(no);
// 		viewContact(control);
// 	}
// 	public void updateContact(ContactControl control,int no)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("\nEnter new contact number:");
// 		String contactNo=sc.next();
// 		control.updateDetails(contactNo,no);
// 		viewContact(control);	
// 	}
// 	public void searchContact(ContactControl control)
// 	{
// 		Contact contact;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("\nEnter Name to search");
// 		String name=sc.next();
// 		contact=control.searchDetails(name);
// 		System.out.println("\n Name="+contact.getName());
// 		System.out.println(" Number="+contact.getContactNo());		
// 	}
} 
