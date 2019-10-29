package com.lxisoft.Controller;
import com.lxisoft.Model.Contact;
import java.util.ArrayList;

public class Controller
{
  ArrayList <Contact> contactslist = new  ArrayList <Contact>();	
 
  public ArrayList<Contact> addContact(String name,String number)
  {
     Contact contact = new Contact();
   contact.setName(name);
   contact.setNumber(number);
   contactslist.add(contact);
   return contactslist;
  }
  public ArrayList<Contact> displayAll(String name,String number)
  {
  	return contactslist;
  }
}

