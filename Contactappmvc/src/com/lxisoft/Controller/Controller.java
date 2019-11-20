package com.lxisoft.Controller;
import com.lxisoft.Domain.Contact;
import java.util.ArrayList;
import com.lxisoft.Repository.Repository;
import com.lxisoft.View.View;
import com.lxisoft.Model.Model1;
import com.lxisoft.Model.ModelList;
/*
*Controller class
*/
public class Controller
{
  ArrayList <Contact> contactslist = new  ArrayList <Contact>();	
  Repository r = new Repository();
  View view = new View();
  /*
  *Start method with no param
  */
  public void start()
  {
	  contactslist = r.getAllContacts();
    for(int i=0;i<contactslist.size();i++)
    {
    Model1 model = new Model1();
    model.setId(contactslist.get(i).getId());
    model.setName(contactslist.get(i).getName()); 
    ModelList ml = new ModelList();
    ml.setContactsList(model);
	  }
    view.display();

  }
  /*
  *To add contact
  *
  *@param id,name,number - user details
  *@return contactslist 
  */
 
  public ArrayList<Contact> addContact(String name,String number)
  {
   Contact contact = new Contact(); 
   int a = contact.getId();
   contact.setId(++a);
   contact.setName(name);
   contact.setNumber(number);
   contactslist.add(contact);

   return contactslist;
  }
 /*
 *
 *
 */
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