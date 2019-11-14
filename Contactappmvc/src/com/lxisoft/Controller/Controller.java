package com.lxisoft.Controller;
import com.lxisoft.Domain.Contact;
import java.util.ArrayList;
import com.lxisoft.Repository.Repository;

public class Controller
{
  ArrayList <Contact> contactslist = new  ArrayList <Contact>();	
  Repository r = new Repository();
  View view = new View();
public ArrayList <Contact> start()
{
	contactslist = r.getAllContacts();
	view.display();

	//return contactslist;
}
  public ArrayList<Contact> addContact(String name,String number)
  {
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
  // public ArrayList<Contact> display()
  // {
  //   contactslist=r.readFile();
  //   return contactslist;
  // }
 }