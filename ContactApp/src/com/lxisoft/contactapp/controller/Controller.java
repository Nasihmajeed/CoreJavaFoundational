package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Controller{
public ArrayList<Contact> contacts=new ArrayList<Contact>();
Repository repo=new  Repository();
View v=new View();
public void save()
{
//contacts.add(cc);
 repo.setFile(v.setContact());

}
//9352323605

public void read(){
	v.display(repo.getList());

  }


public void search(){
	v.searchContact();
	
   }
}
