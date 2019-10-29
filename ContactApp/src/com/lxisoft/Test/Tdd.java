package com.lxisoft.Test;
import com.lxisoft.Controller.Controller;
import com.lxisoft.Model.Contact;
import java.io.*;
import java.util.*;


public class Tdd
{ 
  static ArrayList <Contact> contactslist = new  ArrayList <Contact>();  
  static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
  static Scanner in = new Scanner(System.in);
  public static void main(String[] arg)
  {
    int a;
    Controller control = new Controller();
    do
    {
  	  System.out.println("\t\t\t***************MENU****************");
  	  System.out.println("\t\t\t1. ADD"+"\t\t\t2. DELETE\n");
  	  System.out.println("\t\t\t3. DISPLAY"+"\t\t");
  	  a = in.nextInt();
  	  switch(a)
  	  {
  	     case 1 : //ADD
                 addContact(control);
                 break;
          case 2 : //DELETE
                 deleteContact();
                 break;
          case 3 : //DISPLAY
                 displayAll(contactslist);
                 break;  
      }
    }while(a!=3);
         //contactslist = control.addContact();
  }
  public static void addContact(Controller control)
   {
      System.out.println("Enter the number of the persons:");
      int x = in.nextInt();
        for(int i=1;i<=x;i++)
        {   try{       
  				      Contact c ;
              
  	            System.out.println("Enter the name:");
                String name = input.readLine();
                System.out.println("Enter the phone number:");
                String number = input.readLine();
                contactslist=control.addContact(name,number);
                System.out.println(contactslist.size());
              }catch(IOException e){}
              
        }  

    }

        public static void displayAll(ArrayList <Contact> contactslist)
    {
      for(int i=0;i<contactslist.size();i++)
          {
            System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getName());
            System.out.println("Number "+(i+1)+":"+contactslist.get(i).getNumber());
           // System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getId());
           
          }
    }
  

    public static void deleteContact()

    {   for(int i=0;i<contactslist.size();i++)
        {
          System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getName());
        }
	      System.out.println("Enter the name for delete:");
	      
        try{
            String c = input.readLine();
            for(int i=0;i<contactslist.size();i++)
            if(c.equals(contactslist.get(i).getName())) 
            contactslist.remove(i);
           }catch(IOException e){}
    } 

}
