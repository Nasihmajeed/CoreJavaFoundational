package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
/**
*class for file repository
*/ 
public class Repository implements Filestorage{
File file=new File(directory);
static int id=0;
//Controller controlller=new Controller();
ArrayList<Contact> contacts=new ArrayList<Contact>();
/**
*method used to write contact to the file
*@param Contact single contact
*/
public void setFile(Contact contact){
  	try{
  	id++;
	int temp=id;
	if(temp>id){
		id=temp++;
		FileWriter write=new FileWriter(file,true);
		BufferedWriter fwrite=new BufferedWriter(write);
		contact.setId(id);
		fwrite.write(contact.getId()+","+contact.getName()+","+contact.getNumber()+"\n");  
		fwrite.flush();
		fwrite.close();
         }
     else{
	    FileWriter write=new FileWriter(file,true);
		BufferedWriter fwrite=new BufferedWriter(write);
		contact.setId(id);
		fwrite.write(contact.getId()+","+contact.getName()+","+contact.getNumber()+"\n");  
		fwrite.flush();
		fwrite.close();
        }
    }
    catch(IOException e){
    	System.out.println("Exception "+e);
    }
  }
/**
*method used to read from the file
*@return ArrayList contact list
*/
public ArrayList<Contact>  getList(){
	 contacts=new ArrayList<Contact>();
	 TreeSet<Contact>contactlist=new TreeSet<Contact>();
	try{
		FileReader read=new FileReader(file);
		BufferedReader bread=new BufferedReader(read);
		String data;
		while((data=bread.readLine())!=null){	
			String[] dataArray=data.split(",");
				Contact contact=new Contact();
				contact.setId(Integer.parseInt((dataArray[0])));	
				contact.setName(dataArray[1]);
			 	contact.setNumber(dataArray[2]);
				contactlist.add(contact);
		}
		contacts.addAll(contactlist);
	}
	catch(IOException e){
    	System.out.println("Exception "+e);
    }

    return contacts;
  }

  public void sortNumber(){
  	Collections.sort(contacts,new SortNumber());
  	for(Contact contact:contacts){
  		System.out.println(contact.getName()+"------"+contact.getNumber());
  	}

  }
  /**
*method used to search a contact from the file
*@param String contact name
*@return Contact single contact
*/
 
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
/**
*method used to edit a contact from list
*@param String[],Contact array contains name and number,single contact
*/

public void editList(Contact contac,String[] temp){  
	for(int i=0;i<contacts.size();i++){
		if(contacts.get(i).getName().equals(contac.getName())){
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
 /**
*method used to delete a contact from list
*@param String contact name
*/

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
/**
*method used to clear all data
*/
public void clearList(){
	try{
		FileWriter f=new FileWriter(file);
	}
		catch(IOException e){
    	System.out.println("Exception "+e);
      }
    }

}