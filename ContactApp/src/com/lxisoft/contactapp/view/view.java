package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class View{
Scanner s=new Scanner(System.in);
Scanner ss=new Scanner(System.in);
public ArrayList<Contact> contacts=new ArrayList<Contact>();
Repository repo=new Repository();
public Contact setContact(){
System.out.println("\n\nEnter number of contacts : ");
int n=s.nextInt();
	for(int i=0;i<n;i++){
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

public void display(ArrayList<Contact> contacts){
	System.out.println("\n-----ALL CONTACTS------\n");
	for(int i=0;i<contacts.size();i++){
		System.out.println(contacts.get(i).getName()+"------"+contacts.get(i).getNumber());
		//System.out.println(contacts.get(i).getNumber());
	}
}

public void searchContact(){
System.out.println("\n\nEnter name to search : ");
String n=ss.next(); 
Contact c=repo.searchList(n);
if(c==null){
	System.out.println("cannot find");
     }
else{
	System.out.println("\n------ User-----\n ");
	  System.out.println(c.getName()+"-------"+c.getNumber());
	  System.out.println("1-EDIT\t2-Delete ");
	  int x=s.nextInt();
	  switch(x){
	  	case 1:String[] temp=this.updateContact();
	  			repo.editList(c,temp);
	  			break;
	  	case 2:this.deleteContact();
	  			break;
	  	default:System.out.println("wrong entry");
	  }
	  
    }
  }


public String[] updateContact(){
System.out.println("\n\nEnter contact name : ");
String n=ss.next();
//repo.deleteList(n);
String[] temp=new String[2];
// Contact c=control.search(n);
	if(c==null){
		temp=null;
		System.out.println("cannot edit");
    	 }
	else{
		
		System.out.println("Enter new name : ");
		temp[0]=ss.next();
		System.out.println("Enter new number : ");
		temp[1]=ss.next();	
		//control.save(c);
		System.out.println("(contact updated sucssesfully )");
    }
    return temp;
  }


   

public void deleteContact(){
System.out.println("\n\nEnter contact name to delete : ");
String n=ss.next();
repo.deleteList(n);
//control.setContact(n);
System.out.println("---------"+n+" deleted from the contact");
  }
 }

