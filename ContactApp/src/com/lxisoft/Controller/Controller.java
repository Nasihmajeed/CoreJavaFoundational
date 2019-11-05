package com.lxisoft.Controller;
import com.lxisoft.Model.Contact;
import java.util.ArrayList;
import com.lxisoft.Repository.Repository;

public class Controller
{
  ArrayList <Contact> contactslist = new  ArrayList <Contact>();	
  Repository r = new Repository();

  public ArrayList<Contact> addContact(String name,String number)
  {// r.file(ArrayList <Contact> contactslist);
   Contact contact = new Contact(); 
   contact.setName(name);
   contact.setNumber(number);
   contactslist.add(contact);
   return contactslist;
  }
  public void file(ArrayList <Contact> contactslist)
  {
    r.file(contactslist);
  }
 }