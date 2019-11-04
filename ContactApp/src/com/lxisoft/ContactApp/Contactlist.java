package com.lxisoft.ContactApp;
import com.lxisoft.ContactApp.*;
import java.util.Scanner;
public class Contactlist
{ 
	Contact[] contact= new Contact[50];
	int n;
	int c=0;
	// public void defualt()
	// {
	// 	for(int i=0;i<4;i++)
 //  	{
 //  		contact[i]= new Contact();
 //  	}
 //  	    contact[0].name= "abhijith";
 //  	    contact[0].number = "95476734"; 
 //        contact[1].name="balu" ;
 //        contact[1].number= "54734723";
 //        contact[2].name="aswathy";
 //        contact[2].number= "965743573"; 
 //        contact[3].name="sasikuttan";
 //        contact[3].number="97565668"; 

	// }
  public void start()
  {

	do{
    System.out.println("-----ENTER CHOICE------- \n 1 = Add new contact \n 2 = Search \n 3 = display ");
    Scanner read= new Scanner(System.in);
    int x=read.nextInt();
    switch(x)
    {
    	case 1 : c=insertion(); break;
    	case 2 : search(); break;
        case 3 : display(c); break;
    	//default : System.out.println("----INVALID CHOICE-------");
    }
	} while(true);
}
  public int insertion()
 {
 	 	
 	for (i=0;i<n ;i++)
 	 {
 	 	 contact[i]=new Contact();
 	  	 System.out.println(" Enter the Name ");
 	  	 Scanner read = new Scanner(System.in);
         contact[i].name=read.nextLine();
         System.out.println(" Enter the Number");
         contact[i].number = read.nextLine(); 
               
 		
 	  }
 	 	
 		
 	c=c++;
 	return c;
 	
 }
 public void display(int c)
 {

 	for(int i=0;i<c;i++)
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
 	for(int i=0;i<n;i++)
 	{   
 		if(name.equals(contact[i].name))
 		{
 			
 			System.out.println("Enter the new name");
 			//Scanner read = new Scanner(System.in);
 			String newname = read.nextLine();
 			contact[i].name=newname;
 			System.out.println("Enter the new number");
 			//Scanner read = new Scanner(System.in);
 			String newnumber = read.nextLine();
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
 	for(int i=0;i<n;i++)
 	{   
 		//System.out.println(contact[i].name+" valu i = "+i);
 		if(contact[i]!=null)
 		{


 		if(name.equals(contact[i].name))
 		{
 			System.out.println(contact[i].name+" deleted from your contact list");
 			contact[i]=null;
 			break;
 			//System.out.println(contact[i].name+" deleted from your contact list");
 		}
 		else 
 		{
 		 
 		}

 	}

    }
 }
}