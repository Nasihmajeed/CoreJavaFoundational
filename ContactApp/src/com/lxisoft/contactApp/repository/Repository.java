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
		try
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
	   finally
	   {
	   		phoneBook.close();
	   }


	   ArrayList<Product> products=new ArrayList<Product>();
    try{
    FileReader fileReader = new FileReader("exampleObj.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line;
    String[] strings;
    while ((line = bufferedReader.readLine()) != null) {
        strings = line.split(",");
        String id = strings[0];
         String name = strings[1];
         String content=" "; 
         for(int i=2;i<strings.length;i++)
         {
            content=content+","+ strings[i];
         }
         Product newProduct = new Product(id,name,content);
         products.add(newProduct);
         System.out.println(newProduct.getId()+","+newProduct.getName()+","+newProduct.getDepartment());

    }
    fileReader.close();
    }
    catch ( IOException e ) 
    {
        e.printStackTrace();
    }

    PrintWriter printer = null;
      try {
          printer = new PrintWriter("Description.txt");
            for (Product o : products) {
            printer.println(o.getName()+","+o.getId()+","+o.getDepartment());
            }
            printer.close();
        } catch ( IOException e ) 
        {
            e.printStackTrace();
        } 

	}


}