package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
public class Repository implements Filestorage{
File file=new File(directory);
Controller controlller=new Controller();
public ArrayList<Contact> contacts=new ArrayList<Contact>();

public void setFile( ArrayList<Contact>  contacts){
  	try{
	FileWriter write=new FileWriter(file);
	BufferedWriter fwrite=new BufferedWriter(write);
	Contact con=new Contact();
	for(Contact contact:contacts){
	fwrite.write(contact.getName()+","+contact.getNumber()+"\n");  
        }
	fwrite.flush();
	fwrite.close();
      
    }
    catch(IOException e){
    	System.out.println("Exception "+e);
    }
  }
}