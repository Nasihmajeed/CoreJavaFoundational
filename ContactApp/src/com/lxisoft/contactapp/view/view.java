package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class View{
Scanner s=new Scanner(System.in);
Scanner ss=new Scanner(System.in);
//Controller control=new Controller();
Repository repo=new Repository();


public ContactModel setContact(){
System.out.println("\n\nEnter number of contacts : ");
int n=s.nextInt();
	for(int i=0;i<n;i++){
		ContactModel cc=new ContactModel();		
		System.out.println("Enter the name : ");
		cc.setName(ss.next());
		System.out.println("Enter the number : ");
		cc.setNumber(s.next());
		cc.setId(i);
		return cc;
		//control.save(cc);
		//System.out.println("(contact saved sucssesfully )");
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

public Contact searchContact(){
System.out.println("\n\nEnter name to search : ");
String n=ss.next();
Contact c=repo.searchList(n);
if(c==null){
	System.out.println("cannot find");
	return null;
     }
else{
	System.out.println("\n------ User-----\n ");
	  System.out.println(c.getName()+"-------"+c.getNumber());
	  //System.out.println(c.getNumber());
	  return c;
    }
  }
 /*


public void updateContact(){
System.out.println("\n\nEnter contact name : ");
String n=ss.next();
repo.deleteList(n);
Contact c=control.search(n);
	if(c==null){
		System.out.println("cannot edit");
    	 }
	else{
		
		System.out.println("Enter new name : ");
		c.setName(ss.next());
		System.out.println("Enter new number : ");
		c.setNumber(s.next());	
		//control.save(c);
		System.out.println("(contact updated sucssesfully )");
    }
  }


   

public void deleteContact(){
System.out.println("\n\nEnter contact name to delete : ");
String n=ss.next();
repo.deleteList(n);
//control.setContact(n);
System.out.println("---------"+n+" deleted from the contact");
  }
*/

}