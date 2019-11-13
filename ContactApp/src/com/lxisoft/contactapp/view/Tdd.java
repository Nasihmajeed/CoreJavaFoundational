package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Tdd{

public static void main(String[] args) {
	View v=new View();
	do{
	System.out.println("\n\n\t\t........CONTACT APP..........\n\tMENU\n ");
	System.out.println("1- create new contact\n2-DISPLAY\n3-search\n4-update CONTACT\n5-Delete \n");
	 int x=t.s.nextInt();
	 switch(x){
	 	case 1:v.setContact();
	 			break;
	 	case 2:v.display(v.control.read());
	 			break;
	 	case 3:v.searchContact();
	 			break;
	 	case 4:v.updateContact();
	 			break;
	 	case 5:v.deleteContact();
	 			break;
	 }
	}while(true); 
  }

 }
