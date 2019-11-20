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
 contacts=this.getList();
for(int i=0;i<contacts.size();i++){
	if(name.equals(contacts.get(i).getName())){
		count=1;
		c=contacts.get(i);
		} 
	 }
	 return c;

  } //7306546322


public void editList(Contact contac,String[] temp){
	//Contact contact=new Contact();
	for(int i=0;i<contacts.size();i++){
		if(contacts.get(i).getName().equals(contac.getName())){
			//System.out.println("\n : "+temp[0]+" 	no :"+temp[1]+"  "+i);
			Contact contact=new Contact();
			contact.setName(temp[0]);
			contact.setNumber(temp[1]);
			contacts.set(i,contact);
		}
	}
	  this.clearList();
      for(int i=0;i<contacts.size();i++){
      	this.setFile(contacts.get(i));
      } 
  }

public void deleteList(String cn){
contacts=this.getList();
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
		
          }
       } 
      this.clearList();
      for(int i=0;i<contacts.size();i++){
      	this.setFile(contacts.get(i));
      } 
    } 

public void clearList(){
	try{
		FileWriter f=new FileWriter(file);
	}
		catch(IOException e){
    	System.out.println("Exception "+e);
      }
    }

}