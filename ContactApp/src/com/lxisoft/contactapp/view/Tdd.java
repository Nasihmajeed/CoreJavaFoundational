package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import java.util.*;
/**
*class for testing
*/
public class Tdd{
	/**
*main method
*/
public static void main(String[] args) {
	Controller control=new Controller();
	do{
			 Scanner s=new Scanner(System.in);
	System.out.println("\n\n\t\t........CONTACT APP..........\n\tMENU\n ");
	control.read();
	System.out.println("\n1- create new contact\t2-search\n");
	 int x=s.nextInt();
	 switch(x){
	 	case 1:control.save();
	 			break;
	 	//case 2:control.read();
	 			//break;
	 	case 3:control.search();
	 			break;
	 	default:System.out.println("wrong entry");
	 }
	}while(true); 
  }
 }
