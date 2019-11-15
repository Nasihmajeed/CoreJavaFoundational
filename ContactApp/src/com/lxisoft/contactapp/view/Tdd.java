package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Tdd{
Scanner s=new Scanner(System.in);
View v=new View();
static ArrayList<Contact> contacts=new ArrayList<Contact>();
public static void main(String[] args) {
	Tdd t=new Tdd();
	t.options();

}
 public void options(){
 	Controller control=new Controller();
 do{
	System.out.println("\n\n\t\t........CONTACT APP..........\n\tMENU\n ");
	System.out.println("1- create new contact\n2-DISPLAY\n3-search\n4-update CONTACT\n5-Delete \n");
	 int x=s.nextInt();
	 switch(x){
	 	case 1:control.save();
	 			break;
	 	case 2:control.read();
	 			break;
	 	case 3:control.search ();
	 			break;
/*	 	case 4:v.updateContact();
	 			break;
	 	case 5:v.deleteContact();
	 			break; */
	 }
	}while(true); 
  }
 }

 
