package com.lxisoft.ContactApp;
import com.lxisoft.ContactApp.*;
import java.util.Scanner;
public class Contactlist
{ 
	Contact[] contact;
	int n;
  public void insertion()
 {
 		contact= new Contact[10];
 	 	System.out.println(" number of contacts you want to add  ");
 	  	Scanner set = new Scanner(System.in);
 	   	n=set.nextInt();
 	for(int i=0;i<n;i++)
 	{
 		contact[i]=new Contact();
 	  	 System.out.println(" Enter the Name ");
 	  	 Scanner read = new Scanner(System.in);
        contact[i].name=read.nextLine();
         System.out.println(" Enter the Number");
         contact[i].number = read.nextInt();

         
 	} 
 	display();   
 }
 public void display()
 {
 	for(int i=0;i<n;i++)
 	{
 	  	contact[i].display();
 	}   
 }
 public void search()
 {

 }
}