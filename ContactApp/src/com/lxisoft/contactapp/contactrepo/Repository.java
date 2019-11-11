package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
public class Repository implements Filestorage{
File file=new File(directory);
//Controller controlller=new Controller();
ArrayList<Contact> contacts=new ArrayList<Contact>();
public void setFile(Contact contact){
  	try{
	FileWriter write=new FileWriter(file,true);
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
	 contacts=new ArrayList<Contact>();
	try{
		FileReader read=new FileReader(file);
		BufferedReader bread=new BufferedReader(read);
		//System.out.println("reading file End");
		String data;
		while((data=bread.readLine())!=null){	
			String[] dataArray=data.split(",");
				Contact contact=new Contact();	
				contact.setName(dataArray[0]);
			 	contact.setNumber(dataArray[1]);
				contacts.add(contact);
		}
	}
	catch(IOException e){
    	System.out.println("Exception "+e);
    }

    return contacts;
  }

public Contact searchList(String name){
		 int count=0;
		 Contact c=null;
		for(int i=0;i<contacts.size();i++){
			if(name.equals(contacts.get(i).getName())){
				count++;
				c=contacts.get(i);
      		}
  		 }
    if(count==1){
   		return c;
  		 }
    else{
   		return null;
  		 }

  }


 public void deleteList(String cn){
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
		//return contacts;
          }
         //this.setFile(contacts.get(i));
       }
    } 




}