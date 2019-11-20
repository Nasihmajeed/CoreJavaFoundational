package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import java.util.*;
public class Tdd{
public static void main(String[] args) {
	Controller control=new Controller();
	do{
			 Scanner s=new Scanner(System.in);
	System.out.println("\n\n\t\t........CONTACT APP..........\n\tMENU\n ");
	System.out.println("1- create new contact\n2-DISPLAY\n3-search\n");
	 int x=s.nextInt();
	 switch(x){
	 	case 1:control.save();
	 			break;
	 	case 2:control.read();
	 			break;
	 	case 3:control.search();
	 			break;
	 	default:System.out.println("wrong entry");
	 }
	}while(true); 
  }
 }
