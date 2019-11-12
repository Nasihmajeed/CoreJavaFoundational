package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Controller{
public ArrayList<Contact> contacts=new ArrayList<Contact>();
Repository repo=new  Repository();
public void save(Contact cc)
{
contacts.add(cc);
 repo.setFile(cc);

}


public ArrayList<Contact> read(){
	return repo.getList();

  }


public Contact search(String n){
	String name=n;
	Contact contact=repo.searchList(name);
	return contact;
 }
 
public void update(String cn){
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
          }
       }
}


public void  delete(String cn){
    repo.deleteList(cn);  
    repo.clearList();
    for(int i=0;i<contacts.size();i++){
      	repo.setFile(contacts.get(i));
           } 
       }      
}
/*public Contact setContact(String cn){
	contacts=repo.deleteList(cn);
	Contact contact=null;
	//=new Contact();
	for(int i=0;i<contacts.size();i++){
			contact=contacts.get(i);
			return contact;
	}
}*/

