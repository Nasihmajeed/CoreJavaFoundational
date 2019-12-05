package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
/**
*class for UI
*/
public class View{

Scanner s=new Scanner(System.in);
Scanner ss=new Scanner(System.in);
public ArrayList<Contact> contacts=new ArrayList<Contact>();
Repository repo=new DbRepository();

/**
*method used to get data from user
*@return Contact 
*/


public Contact setContact(){
	for(int i=0;i<1;i++){
		Contact cc=new Contact();		
		System.out.println("Enter the name : ");
		cc.setName(ss.next());
		System.out.println("Enter the number : ");
		cc.setNumber(s.next());
		//control.save();
		System.out.println("(contact saved sucssesfully )");
		return cc;
    } 
    return null;  
}
/**
*method used to display all data
*@param ArrayList of Contact
*/

public void display(ArrayList<Contact> contacts){
	System.out.println("\n-----ALL CONTACTS------\nID\tNAME");
	for(int i=0;i<contacts.size();i++){
		System.out.println(contacts.get(i).getId()+"------"+contacts.get(i).getName());
	}
/*	System.out.println("sort by number");
	repo.sortNumber();*/
}
/**
*method used to search a contact from list
*/

public void searchContact(){
System.out.println("\n\nEnter name to search : ");
String n=ss.next(); 
Contact c=repo.searchList(n);
System.out.println("######"+c.getName());
if(c==null){
	System.out.println("cannot find");
     }
else{
	  System.out.println("\n------ User-----\n ");
	  System.out.println("ID\tNAME\tNUMBER");
	  System.out.println(c.getId()+"-------"+c.getName()+"-------"+c.getNumber());
	  System.out.println("\n1-EDIT\t2-Delete\t3-Delete All");
	  int x=s.nextInt();
	  switch(x){
	  	case 1:String[] temp=this.updateContact(n);
	  			repo.editList(c,temp);
	  			break;
	  	case 2:this.deleteContact(n);
	  			break;
	  	case 3:repo.clearList();
	  			break;
	  	default:System.out.println("wrong entry");
	  }
	  
    }
  }
/**
*method used to edit a contact from list
*@param String contact name
*@return String[] string array of name and number
*/

public String[] updateContact(String n){
String[] temp=new String[3];
 Contact c=repo.searchList(n);
	if(c==null){
		temp=null;
		System.out.println("cannot edit");
    	 }
	else{
		int a=c.getId();
		temp[0]=Integer.toString(a);
		System.out.println("Enter new name : ");
		temp[1]=ss.next();
		System.out.println("Enter new number : ");
		temp[2]=ss.next();	
		System.out.println("(contact updated sucssesfully )");
    }
    return temp;
  }
/**
*method used to delete a contact from list
*@param String contact name
*/

public void deleteContact(String n){
repo.deleteList(n);
System.out.println("---------"+n+" deleted from the contact");
  }

/* public void sort(){
 	System.out.println("1-sort by number\t2-sort by id");
 	int x=s.nextInt();
 	switch(x){
 		case 1:repo.sortNumber();
 				break;
 		case 2:repo.sortId();
 				break;
 		default:System.out.println("wrong entry");
 	}
 }*/
 }

