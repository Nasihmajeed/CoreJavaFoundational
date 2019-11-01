package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Controller{
public ArrayList<Contact> contacts=new ArrayList<Contact>();
 Repository repo=new  Repository();
public Contact save(Contact cc)
{
contacts.add(cc);
return cc;
}
public ArrayList<Contact> read(){
	return contacts;
	repo.setFile(contacts);
  }

public Contact search(String n){
	Contact c=null;
	int count=0;
for(int i=0;i<contacts.size();i++){
	if(n.equals(contacts.get(i).getName())){
		count++;
		c=contacts.get(i);
      }
   }
   if(count==1){
   		return c;
   }
   else{
   	return null;
   }
 }
public void update(String cn){
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
          }
       }
} 
public void delete(String cn){
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
          }
       }
} 



}