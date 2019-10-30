package com.lxisoft.contactApp.repository;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Repository
{
	public File contactDetails;
	public void createPhoneData()
	{
		try
		{
			contactDetails=new File("D:\\contactApp\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactApp\\repository\\PhoneBook.txt");
			if(contactDetails.createNewFile())
			{
				System.out.println("Contact details file created "+contactDetails.getName());
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
		try
		{
		  PrintWriter printer = null;
          printer = new PrintWriter(new FileWriter(contactDetails,false));
            printer.flush();
          
            for (Contact contact : contacts) 
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