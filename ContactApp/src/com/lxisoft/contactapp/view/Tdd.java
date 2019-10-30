package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import java.util.*;
public class Tdd{
Scanner s=new Scanner(System.in);
Scanner ss=new Scanner(System.in);
Controller control=new Controller();
static ArrayList<Contact> contacts=new ArrayList<Contact>();
public static void main(String[] args) {
	Tdd t=new Tdd();
	do{
	System.out.println("\n\n\t\t........CONTACT APP..........\n\tMENU\n ");
	System.out.println(" 1- create new contact\n2-DISPLAY\n3-search ");
	 int x=t.s.nextInt();
	 switch(x){
	 	case 1:t.setContact();
	 			break;
	 	case 2:t.display(t.control.read());
	 	break;
	 	case 3:t.searchContact();
	 	break;
	 }
	}while(true); 
  }
public void setContact(){
System.out.println("Enter number of contacts : ");
int n=s.nextInt();
	for(int i=0;i<n;i++){
		Contact cc=new Contact();
		System.out.println("Enter the name : ");
		cc.setName(s.next());
		System.out.println("Enter the number : ");
		cc.setNumber(s.nextLong());
		control.save(cc);
    }
}
public void display(ArrayList<Contact> contacts){
	for(int i=0;i<contacts.size();i++){
		System.out.println(contacts.get(i).getName());
		System.out.println(contacts.get(i).getNumber());
	}
}
public void searchContact(){
System.out.println("Enter name to search : ");
Contact c=control.search(s.next());
if(c==null){
	System.out.println("cannot find");
     }
else{
	System.out.println("User ");
	  System.out.println(c.getName());
	  System.out.println(c.getNumber());
}

/*for(int i=0;i<contacts.size();i++){
	if(n.equals(contacts.get(i).getName())){
		System.out.println(" is in the contact list");
		System.out.print("contact number = "+contacts.get(i).getNumber());
	}
	/*else{
		System.out.println("cannot find");
	}
	} */
   }
  }

