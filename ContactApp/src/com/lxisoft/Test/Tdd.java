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
  static Controller control = new Controller();
  public static void main(String[] arg)
  {
    int a;
   
    do
    {
  	  System.out.println("\t\t\t***************MENU****************");
  	  System.out.println("\t\t\t1. ADD"+"\t\t\t2. DELETE\n");
  	  System.out.println("\t\t\t3. DISPLAY"+"\t\t4. EDIT");
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
          case 4 : // EDIT
                editContact();  
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

    public static void editContact()
    { String b=null;
      String a=null;
      String c=null;
      try{System.out.println("Enter the name for edit:");
          a = input.readLine();
          System.out.println("Enter the new name     :");
          b = input.readLine();
          System.out.println("Enter the new number   :");
          c = input.readLine(); }catch(IOException e){}   
          for(int i=0;i<contactslist.size();i++)
          { System.out.println((contactslist.get(i).getName())+"*****"+a);
            if(a.equals(contactslist.get(i).getName()))
             {contactslist.remove(i);
              contactslist=control.addContact(b,c);
             }
          }
    }
}