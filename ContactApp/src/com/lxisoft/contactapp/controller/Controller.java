package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
/**
* controller class
*/
public class Controller{
public ArrayList<Contact> contacts=new ArrayList<Contact>();
Repository repo=new  Repository();
View v=new View();
/**
*method for save contact
*/
public void save()
{
//contacts.add(cc);
 repo.setFile(v.setContact());

}
/**
*method for displays contact
*/

public void read(){
	v.display(repo.getList());

  }
/**
*method for search contact
*/

public void search(){
	v.searchContact();
	
   }
}
