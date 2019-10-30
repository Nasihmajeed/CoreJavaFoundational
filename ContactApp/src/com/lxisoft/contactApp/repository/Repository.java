package com.lxisoft.contactApp.repository;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import com.lxisoft.contactApp.controller.Controller;
import com.lxisoft.contactApp.model.Contact;
public class Repository
{
	public static File phoneBook;
	public void createPhoneData()
	{
		try
		{
			phoneBook=new File("D:\\contactApp\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactApp\\repository\\PhoneBook.txt");
			if(phoneBook.createNewFile())
			{
				System.out.println("Contact details file created "+phoneBook.getName());
			}
			else
			{
				System.out.println("Contact File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("contact details error");
		}
	}


	public void writeToFile()
	{
		Controller controller=new Controller();

		try
		{
		  PrintWriter printer = null;
          printer = new PrintWriter(new FileWriter(phoneBook,false));
            printer.flush();
          
            for (Contact contact : controller.getContacts()) 
            {
           printer.print(contact.getId()+","+contact.getName()+","+contact.getNumber() );
			printer.println();
            }
            printer.close();
        }
		catch ( Exception e ) 
		{
		    e.printStackTrace();
		}
		
	}
}