package com.lxisoft.contactApp.view;
import com.lxisoft.contactApp.model.ViewContactModel;
import com.lxisoft.contactApp.controller.Controller;
import java.util.Scanner;
import java.io.Console;
import com.lxisoft.contactApp.model.Contact;
public class View 
{
 	Scanner scan=new Scanner(System.in);
	Console console = System.console();
	public Controller controller;
	public ViewContactModel viewContacts=new ViewContactModel();
	public void start()
	{
		controller=new Controller();
		System.out.println("********CONTACT BOOK*********\n");
		controller.fileCreation();
		//controller.fileFunctions();
		//controller.createPhoneData();
		//controller.writeToFile();
		printMenu();
	}

	public void printMenu()
	{
		while(true)
		{
			System.out.println("\nChoose your options\n==> 1.Create\t2.Show\t3.Update\t4.Delete\t5.Search\t6.Exit");
			int menu=scan.nextInt();
			switch(menu)
			{
				case 1:
				create();
				break;
			
				case 2:
				show();
				break;
				
				case 3:
				update();
				break;

				case 4:
				delete();
				break;

				case 5:
				search();
				break;

				case 6:
				controller.store();
				return;

			}
		}

	}

	public void show()
	{
		System.out.println("ID\tNAME\t\t\tNUMBER\n");
		for(Contact contact:controller.getContacts())
		{
			System.out.println(contact.getId()+"\t"+contact.getName()+"\t\t\t"+contact.getNumber());
		}
		System.out.println();
	}

	public void create()
	{
		
		System.out.println("Enter contact name:");
		String name=console.readLine();
		System.out.println("Enter contact phone number:");
		long number=scan.nextLong();
		controller.newContact(name,number);
		show();
	}

	public void update()
	{
		System.out.println("Enter id to update");
		int upId=scan.nextInt();
		System.out.println("edit 1.name or 2.number");
		int upChoice=scan.nextInt();
		if(upChoice==1)
		{
			System.out.println("Enter edited name:");
			String upName=console.readLine();
			controller.updateContact(upId,upName);
		}
		if(upChoice==2)
		{
			System.out.println("Enter edited phone number:");
			long upNumber=scan.nextLong();
			controller.updateContact(upId,upNumber);
		}
		show();
	}

	public void delete()
	{
		System.out.println("Enter id to delete:");
		int delId=scan.nextInt();
		controller.deleteContact(delId);
		show();

	}

	public void search()
	{
		Contact searchedContact=null;
		System.out.println("Enter name to search");
		String sName=console.readLine();
		searchedContact=controller.searchContact(sName);
		if(searchedContact!=null)
		{
			System.out.println("searched contact found\n"+searchedContact.getId()+"\t"+searchedContact.getName()+"\t"+searchedContact.getNumber());
		}
		if(searchedContact==null)
		{
			System.out.println("Searched contact not found");

		}

	}

}