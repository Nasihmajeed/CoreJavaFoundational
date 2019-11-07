package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
public class Repository implements Filestorage{
File file=new File(directory);
Controller controlller=new Controller();
public void setFile(Contact contact){
  	try{
	FileWriter write=new FileWriter(file);
	BufferedWriter fwrite=new BufferedWriter(write);
	fwrite.write(contact.getName()+","+contact.getNumber()+"\n");  
	fwrite.flush();
	fwrite.close();
      
    }
    catch(IOException e){
    	System.out.println("Exception "+e);
    }
  }

public void getList(){
	try{
		FileReader read=new FileReader(file);
		BufferedReader bread=new BufferedReader(read);
		public ArrayList<Contact> contacts=new ArrayList<Contact>();
		String data;
		while((data=bread.readLine())!=null){	
			String[] dataArray=data.split(",");
				Contact contact=new Contact();
				contact.setName(dataArray[0]);
			 	contact.setNumber(dataArray[1]);
				contacts.add(contact);
				System.out.println(a);
		}
	}
	catch(IOException e){
    	System.out.println("Exception "+e);
    }
    return contacts;
  }
}