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

public ArrayList<Contact>  getList(){
	 ArrayList<Contact> contacts=new ArrayList<Contact>();
	try{
		FileReader read=new FileReader(file);
		BufferedReader bread=new BufferedReader(read);
		String data;
		while((data=bread.readLine())!=null){	
			String[] dataArray=data.split(",");
				Contact contact=new Contact();
				contact.setName(dataArray[0]);
			 	contact.setNumber(dataArray[1]);
				contacts.add(contact);
				System.out.println(dataArray[0]);
		}
	}
	catch(IOException e){
    	System.out.println("Exception "+e);
    }
    return contacts;
  }

public Contact searchList(String name){
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	 int count=0;
	 Contact c=null;
	try{
		for(int i=0;i<contacts.size();i++){
			if(name.equals(contacts.get(i).getName())){
				count++;
				c=contacts.get(i);
      		}
  		 }
		}
	catch(NullPointerException e){
    	System.out.println("Exception "+e);
    }
    if(count==1){
   		return c;
  		 }
    else{
   		return null;
  		 }

  }
}