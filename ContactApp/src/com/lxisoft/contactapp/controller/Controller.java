package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import java.util.*;
public class Controller{
	//Contact c=new Contact;
public ArrayList<Contact> contacts=new ArrayList<Contact>();
public Contact save(Contact cc)
{
contacts.add(cc);
return cc;
}
/*public Contact[] read(){
	return c;
  }*/
}