package com.lxisoft.contactApp.repository;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.lxisoft.contactApp.controller.Controller;
import com.lxisoft.contactApp.model.Contact;
public class Repository
{
	public static File phoneBook;
	public static BufferedReader reader = null;
	//public ArrayList<Contact> contactData=new ArrayList<Contact>();
	public void createPhoneData(ArrayList<Contact> contacts)
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
				storeData(contacts);
			}
		}
		catch(IOException e)
		{
			System.out.println("contact details error");
		}
	}


	public void writeToFile(ArrayList<Contact> contacts)
	{

		try
		{
		  PrintWriter printer = null;
          printer = new PrintWriter(new FileWriter(phoneBook,false));
          
            for (Contact contact : contacts) 
            {
           printer.print(contact.getId()+","+contact.getName()+","+contact.getNumber() );
			printer.println();
            }
            printer.flush();
            printer.close();
        }
		catch ( Exception e ) 
		{
		    e.printStackTrace();
		}
		
	}

	public void storeData(ArrayList<Contact> contacts)
	{
	 // contactData=new ArrayList<Contact>();
    PrintWriter printer = null;
    try
    {
	    FileReader fileReader = new FileReader(phoneBook);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    String line;
	    String[] strings;
		System.out.println("CONTACT BOOK\n");
		System.out.println("ID\tNAME\tNUMBER");
	    while ((line = bufferedReader.readLine()) != null) 
	    {
	        strings = line.split(",");
	        int id = Integer.parseInt(strings[0]);
		    String name = strings[1];
		    long number=Long.parseLong(strings[2]); 
		    Contact newContact = new Contact(id,name,number);
		    contacts.add(newContact);
		    System.out.println(newContact.getId()+",\t"+newContact.getName()+",\t"+newContact.getNumber());

	    }
	//    fileReader.flush();
	    fileReader.close();
	    //writeToFile();
	  /*  printer = new PrintWriter(phoneBook);
	    for (Contact contact : contacts) 
	    {
	  		printer.println(contact.getId()+","+contact.getName()+","+contact.getNumber());
	    }
   		printer.close();*/
	}
    catch ( IOException e ) 
    {
        e.printStackTrace();
    }

  
	}


}