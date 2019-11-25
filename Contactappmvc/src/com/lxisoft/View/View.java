package com.lxisoft.View;
import com.lxisoft.Controller.Controller;
import com.lxisoft.Domain.Contact;
import java.io.*;
import java.util.*;
/*
*class for view All 
*
*/
public class View
{ 
   static ArrayList <Contact> contactslist = new  ArrayList <Contact>();  
   static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
   static Scanner in = new Scanner(System.in);
   static Controller control = new Controller();
   /*
   *MENU
   */
   public void display()
  {
    int a;
    do
    {
      System.out.println("\t\t\t***************MENU****************");
      System.out.println("\t\t\t1. ADD"+"\t\t\t2. DELETE\n");
      System.out.println("\t\t\t3. DISPLAY"+"\t\t4. EDIT\n\n\t\t\t5. EXIT\nEnter your Choice:");
      a = in.nextInt();
      switch(a)
      {

        
          case 1 : //ADD
                 addContact();
                 break;
          case 2 : //DELETE
                 deleteContact();
                 break;
          case 3 : //DISPLAY
                 displayAll();
                 break;  
          case 4 : // EDIT
                editContact();  
                break;    
          case 5 : //EXIT
                break;  
          default :  System.out.println("INVALID CHOICE");
                         
      }
    }while(a!=5);
         //contactslist = control.addContact();
  }
  /*
  *display for Add contact
  *@param control
  */
  public static void addContact()
   {
      System.out.println("Enter the number of the persons:");
      int x = in.nextInt();
        for(int i=1;i<=x;i++)
        {   try{       
                Contact c ;
                int id=0;
                System.out.println("Enter the name:");
                String name = input.readLine();
                System.out.println("Enter the phone number:");
                String number = input.readLine();
                contactslist=control.addContact(name,number);
                System.out.println(contactslist.size());
              }catch(IOException e){}
              
        }  control.file(contactslist);

    }
/*
*view for display all contact details
*/
   public static void displayAll()
     {   // contactslist = control.display();
          for(int i=0;i<contactslist.size();i++)
          {
            System.out.println("Id     "+(i+1)+":"+contactslist.get(i).getId());
            System.out.println("Name   "+(i+1)+":"+contactslist.get(i).getName());
            System.out.println("Number "+(i+1)+":"+contactslist.get(i).getNumber());

          }
     }
  /*
  *view for delete selected contact
  */

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
          Systrem.out.println("contact deleted successfuly...")
           }catch(IOException e){}
           control.file(contactslist);
    } 
/*
*view for edit selected contact
*/
    public static void editContact()
    { String b=null;
      String a=null;
      String c=null;   
      int d = 1;
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
          }  control.file(contactslist);
    }
}