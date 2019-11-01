package com.lxisoft.ContactApp;
import com.lxisoft.ContactApp.*;
import java.util.Scanner;
public class Contactlist
{ 
	Contact[] contact= new Contact[50];
	int k=4,n;
	int l=4;
  public void start()
  {
  	    contact[0]= 
        contact[1]= 
        contact[2]= 
        contact[3]= 

	do{
    System.out.println("-----ENTER CHOICE------- \n 1 = Add new contact \n 2 = Search \n 3 = display ");
    Scanner read= new Scanner(System.in);
    int x=read.nextInt();
    switch(x)
    {
    	case 1 : l=insertion(); break;
    	case 2 : search(); break;
        case 3 : display(l); break;
    	//default : System.out.println("----INVALID CHOICE-------");
    }
	} while(true);
}
  public int insertion()
 {
 	 	System.out.println(" number of contacts you want to add  ");
 	  	Scanner set = new Scanner(System.in);
 	   	n=set.nextInt();
 	   	int l=k+n;
 	for(int i=k;i<l;i++)
 	{
 		 contact[i]=new Contact();
 	  	 System.out.println(" Enter the Name ");
 	  	 Scanner read = new Scanner(System.in);
         contact[i].name=read.nextLine();
         System.out.println(" Enter the Number");
         contact[i].number = read.nextInt(); 
         k++;       
 	} 
 	 return l;
 }
 public void display(int l)
 {

 	for(int i=0;i<l;i++)
 	{	
 	  	contact[i].display();
 	}   
 }
 public void search()
 {
 	do{
 	Scanner read = new Scanner(System.in);
 	System.out.println(" 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU");
    int x= read.nextInt();
    switch(x)
    {
    	case 1 : edit(); break;
    	case 2 : delete(); break;
    	case 3 : start(); break;
    }
	} while(true);

 }
 public void edit()
 {
 	Scanner read = new Scanner(System.in);
 	System.out.println("Enter the name");
 	String name = read.nextLine();
 	int f=0;
 	for(int i=0;i<l;i++)
 	{   
 		if(name.equals(contact[i].name))
 		{
 			
 			System.out.println("Enter the new name");
 			//Scanner read = new Scanner(System.in);
 			String newname = read.nextLine();
 			contact[i].name=newname;
 			System.out.println("Enter the new number");
 			//Scanner read = new Scanner(System.in);
 			long newnumber = read.nextLong();
 			contact[i].number=newnumber;
 			System.out.println("updated as new contact");
 		}
 		else
 		{
 		  f=1;	
 		}

 	}
 	if(f==1)
 	{
 		System.out.println("NOT FOUND");
 	}

 	
 }
 public void delete()
 {
 	Scanner read = new Scanner(System.in);
 	System.out.println("Enter the name");
 	String name = read.nextLine();
 	for(int i=0;i<l;i++)
 	{   
 		//System.out.println(contact[1].name+"deleted from your contact list");
 		if(name.equals(contact[i].name))
 		{
 			System.out.println(contact[i].name+"deleted from your contact list");
 			contact[i]=null;
 			
 		}
 		else 
 		{
 		 
 		}

 	}


 }
}