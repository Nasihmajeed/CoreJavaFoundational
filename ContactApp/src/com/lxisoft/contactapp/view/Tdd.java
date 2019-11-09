package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Tdd{
Scanner s=new Scanner(System.in);
Scanner ss=new Scanner(System.in);
Controller control=new Controller();
Repository repo=new Repository();
static ArrayList<Contact> contacts=new ArrayList<Contact>();
public static void main(String[] args) {
	Tdd t=new Tdd();
	do{
	System.out.println("\n\n\t\t........CONTACT APP..........\n\tMENU\n ");
	System.out.println("1- create new contact\n2-DISPLAY\n3-search\n4-update CONTACT\n5-Delete \n6-Displayfile\n");
	 int x=t.s.nextInt();
	 switch(x){
	 	case 1:t.setContact();
	 			break;
	 	case 2:t.display(t.control.read());
	 			break;
	 	case 3:t.searchContact();
	 			break;
	 	case 4:t.updateContact();
	 			break;
	 	case 5:t.deleteContact();
	 			break;
	 	case 6:t.repo.getList();
	 			break;
	 	//case 7:t.repo.
	 }
	}while(true); 
  }
public void setContact(){
System.out.println("\n\nEnter number of contacts : ");
int n=s.nextInt();
	for(int i=0;i<n;i++){
		Contact cc=new Contact();		
		System.out.println("Enter the name : ");
		cc.setName(ss.next());
		System.out.println("Enter the number : ");
		cc.setNumber(s.next());
		control.save(cc);
		System.out.println("(contact saved sucssesfully )");
    } 
   
}

public void display(ArrayList<Contact> contacts){
	System.out.println("size : ");
	for(int i=0;i<contacts.size();i++){
		System.out.println(contacts.get(i).getName());
		System.out.println(contacts.get(i).getNumber());
	}
}

public void searchContact(){
System.out.println("\n\nEnter name to search : ");
String n=ss.next();
Contact c=control.search(n);
if(c==null){
	System.out.println("cannot find");
     }
else{
	System.out.println("\n------ User-----\n ");
	  System.out.println(c.getName());
	  System.out.println(c.getNumber());
    }
  }

/*public void fileSearch(){
System.out.println("\n\nEnter name to search : ");
String n=ss.next();
Contact c=repo.searchList(n);
if(c==null){
	System.out.println("cannot find");
     }
else{
	System.out.println("\n User ");
	  System.out.println(c.getName());
	  System.out.println(c.getNumber());
    }


}
*/
public void updateContact(){
System.out.println("\n\nEnter contact name : ");
String n=ss.next();
Contact c=control.search(n);
if(c==null){
	System.out.println("cannot edit");
     }
else{
	//Contact c=new Contact();
	System.out.println("Enter new name : ");
	c.setName(ss.next());
	System.out.println("Enter new number : ");
	c.setNumber(s.next());	
	control.save(c);
	System.out.println("(contact updated sucssesfully )");
    }
  }


/*control.update(n);	
Contact c=new Contact();
System.out.println("Enter new name : ");
c.setName(ss.next());
System.out.println("Enter new number : ");
c.setNumber(s.next());	
control.save(c);
System.out.println("(contact updated sucssesfully )");*/
   

public void deleteContact(){
System.out.println("\n\nEnter contact name to delete : ");
String n=ss.next();
control.delete(n);
System.out.println("---------"+n+" deleted from the contact");
  }
 }
