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
	public ArrayList<Contact> contactData;
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


	public void writeToFile(ArrayList<Contact> contacts)
	{
		Controller controller=new Controller();

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

	public void storeData()
	{
	  contactData=new ArrayList<Contact>();
		/*try
		{	
	        reader = new BufferedReader(new FileReader(phoneBook));	
	        PrintWriter printer = null;
        	printer = new PrintWriter(new FileWriter(phoneBook,false));
		   	System.out.println("Reading the file using readLine() method:");
		  	String contentLine = reader.readLine();
		  	while (contentLine != null)
		    {
		      	System.out.println(contentLine);
		      	printer.println(contentLine);
		      	contentLine = reader.readLine();
		   	}
		   	printer.flush();
		   	printer.close();

		}
	   catch (IOException ioe) 
       {
           	ioe.printStackTrace();
			System.out.println("Error in closing the BufferedReader");
	   }
	  */
    PrintWriter printer = null;
    try
    {
	    FileReader fileReader = new FileReader(phoneBook);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    String line;
	    String[] strings;
	    while ((line = bufferedReader.readLine()) != null) 
	    {
	        strings = line.split(",");
	        int id = Integer.parseInt(strings[0]);
		    String name = strings[1];
		    long number=Long.parseLong(strings[2]); 
		    Contact newContact = new Contact(id,name,number);
		    controller.getContacts().add(newContact);
		    System.out.println("contact:=="+newContact.getId()+","+newContact.getName()+","+newContact.getNumber());

	    }
	    fileReader.close();

	    printer = new PrintWriter(phoneBook);
	    for (Contact contact : controller.getContacts()) 
	    {
	  		printer.println(contact.getId()+","+contact.getName()+","+contact.getNumber());
	    }
   		printer.close();
	}
    catch ( IOException e ) 
    {
        e.printStackTrace();
    }

    /*  try {
         
        } catch ( IOException e ) 
        {
            e.printStackTrace();
        } */

	}


}