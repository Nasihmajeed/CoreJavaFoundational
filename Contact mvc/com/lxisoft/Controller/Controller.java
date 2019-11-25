package com.lxisoft.Controller;
import com.lxisoft.Domain.Contact;
import com.lxisoft.View.View;
import java.util.ArrayList;
import com.lxisoft.Repository.Repository;

public class Controller
{ ArrayList <Contact> contactsList = new ArrayList <Contact>();
  Repository repo = new Repository();
  public void start()
  {
   contactsList=repo.getFromFile();
   View view = new View();
   view.menu(contactsList);
  }
  public void addNewContact(Contact c )
  {
    repo.add(c);
  }
  public ArrayList <Contact>  getContacts(){
  	contactsList=repo.getFromFile();
  	return contactsList;
  }
  public boolean deleteContact(String name)
  {
    boolean flag=false;
   contactsList=repo.getFromFile();
   int dId=-1;
   for(int i=0;i<contactsList.size();i++)
            { 
              if(name.equals(contactsList.get(i).getName()))  
                 {
                  dId=contactsList.get(i).getId();
                  repo.delete(dId);
                  flag=true;
                 }
            }
      return flag;
  }
  public boolean editContact(String name,String newname)
  {
    boolean flag=false;
    contactsList=repo.getFromfile();
    int eId=-1;
   for(int i=0;i<contactsList.size();i++)
            { 
              if(name.equals(contactsList.get(i).getName()))  
                 {
                  eId=contactsList.get(i).getId();
                  repo.delete(eId,newname);
                  flag=true;
                 }
            }
  }

}

