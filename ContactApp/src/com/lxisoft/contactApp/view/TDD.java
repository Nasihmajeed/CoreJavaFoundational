package com.lxisoft.contactApp.view;
import com.lxisoft.contactApp.controller.Controller;
import java.util.Scanner;
import java.io.Console;
import com.lxisoft.contactApp.model.Contact;
public class TDD 
{
	static Scanner scan=new Scanner(System.in);
	static Console console = System.console();
	public static Controller controller;
	public static void main(String args[])
	{
		controller=new Controller();
		controller.setInitialContacts();
		System.out.println("********contact set*********");
		controller.fileCreation();
		//controller.fileFunctions();
		//controller.createPhoneData();
		//controller.writeToFile();
		printMenu();
	}

	public static void printMenu()
	{
		while(true)
		{
			System.out.println("Choose your options\n==> 1.Create\t2.Show\t3.Update\t4.Delete\t5.Exit");
			int menu=scan.nextInt();
			switch(menu)
			{
				case 1:
				create();
				controller.fileFunctions();
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
				controller.store();
				return;

			}
		}

	}

	public static void show()
	{
		for(Contact contact:controller.getContacts())
		{
			System.out.println("id= "+contact.getId()+"\t"+"name= "+contact.getName()+"\t"+"number="+contact.getNumber());
		}
		System.out.println();
		//controller.writeToFile();
	}

	public static void create()
	{
		
		System.out.println("Enter contact name:");
		String name=console.readLine();
		System.out.println("Enter contact phone number:");
		long number=scan.nextLong();
		controller.newContact(name,number);
		show();
	}

	public static void update()
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

	public static void delete()
	{
		System.out.println("Enter id to delete:");
		int delId=scan.nextInt();
		controller.deleteContact(delId);
		show();

	}

}