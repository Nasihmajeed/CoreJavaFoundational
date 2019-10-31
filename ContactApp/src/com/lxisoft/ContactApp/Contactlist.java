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
  	    contact[0]= new Contact("Balu",99587489);
        contact[1]= new Contact("Abhijith",9989689);
        contact[2]= new Contact("sanoop",95933333);
        contact[3]= new Contact("anjaly",933333333);

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

 }
}