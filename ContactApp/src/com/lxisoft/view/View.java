package com.lxisoft.view;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.domain.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class View
{
	static Scanner s=new Scanner(System.in);
	// ContactController control=new ContactController();
	// public void viewContact()
	// {
	// 	ContactController control=new ContactController();
	// 	int a=0;
	// 	System.out.println("\t <-----CONTACT APP MENU----->\n");
		
	// 	do
	// 	{
	// 		System.out.println("<---Enter your choice--->");
	// 		System.out.println("\n 1-Add\t\t 2-Search\t 3-DeleteAll \t4-Exit");
	// 		a=s.nextInt();
	// 		switch(a)
	// 		{
	// 			case 1: addContact(control); break;
	// 			case 2: searchContact(control); break;
	// 			case 3: deleteAllContact(control); break;
	// 		}
	// 	}while(a!=4);
	// 	getContact(control);
	// 	displayContacts(control);
	// }
	public void getAllContacts(List<ContactModel> listModel)
	{
		if((listModel.size()!=0))
		{
			System.out.println("\t <-------CONTACT LIST------>\n");
			System.out.println("\t ID \t NAME \n\t-----\t------");
			int i = 1;
			for(int j=0;j<listModel.size();j++)
			{
				System.out.println("\t"+listModel.get(j).getId()+"\t"+listModel.get(j).getName());
				i++;
			}
		}
		else
		{
			System.out.println(" contact list is empty!!!!!");
		}
		display();
	}
	public void display()
	{
		System.out.println("<---Enter your choice--->");
		System.out.println("1-select \t\t 2-add\t");
		int a=s.nextInt();
		switch(a)
	    {
	    	case 1: getContactById();
	    }
	}
	public void getContactById()
	{
		ContactController control=new ContactController();
		System.out.println("Enter contact id to search");
		String n=s.next();
 		Contact c=control.getContactById(n);
		int a=0;
		if((c.getContactName())!=null)
		{
			System.out.println("contact name--->"+c.getContactName());
			System.out.println("contact no  --->"+c.getContactNumber());
		}
		else	
		{
			System.out.println(" contact with id "+n+" is not present");
		}
		
		
			
			// do
			// {
			// 	System.out.println("\n\n 1-Update\t 2-Delete \t 3-Exit");
			// 	a=s.nextInt();
			// 	switch(a)
			// 	{
			// 		case 1: updateContact(control,n); break;
			// 		case 2: deleteContact(control,n); break;
			// 	}
			// }while(a!=3);
		
		
	}
	// public void addContact(ContactController control)
	// {
	// 	control.setFile();
	// 	System.out.println("Enter number of contact to add->");
	// 	int n=s.nextInt();

	// 	for(int j=0;j<n;j++)
	// 	{
	// 		System.out.println("Enter contact name");
	// 		String name=s.next();
	// 		System.out.println("Enter contact number");
	// 		String num=s.next();
	// 		control.addContact(name,num);
	// 	}
	// }
	// public void searchContact(ContactController control)
	// {
	// 	System.out.println("Enter contact id--");
	// 	int n=s.nextInt();
	// 	if((control.searchContact(n).getContactName()==null)&(control.searchContact(n).getContactNumber()==null))
	// 	{
	// 		System.out.println(" contact is not present");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("contact name--->"+control.searchContact(n).getContactName());
	// 		System.out.println("contact no  --->"+control.searchContact(n).getContactNumber());
	// 	}
	// }
	// public void deleteContact(ContactController control,int n)
	// {
	// 	System.out.println(" deleted successfully");
	// 	control.deleteContact(n);
	// }
	// public void updateContact(ContactController control,int n)
	// {
	// 	System.out.println("Enter new contact number");
	// 	String num=s.next();
	// 	control.updateContact(num,n);
	// }
	// public void deleteAllContact(ContactController control)
	// {
	// 	control.deleteAllContact();
	// }
}