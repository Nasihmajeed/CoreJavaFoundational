package com.lxisoft.ctr;
import com.lxisoft.Domain.Contact;
import com.lxisoft.View.View;
import com.lxisoft.Model.SortName;
import java.util.ArrayList;
import com.lxisoft.Repository.Repository;
import com.lxisoft.Repository.DataRepository;

public class Controller
{ ArrayList <Contact> contactsList = new ArrayList <Contact>();
  Repository repo = new Repository();
  DataRepository drr=new DataRepository();
  public void start()
  {
    
    drr.display();
   contactsList=repo.getFromFile();
   View view = new View();
   view.menu(contactsList);
  }
  public void addNewContact(Contact c )
  {
    //repo.add(c);
    drr.add(c);
  }
  public ArrayList <Contact>  getContacts(){
  	contactsList=repo.getFromFile();
  	return contactsList;
  }

  public void deleteContact(String name)
  {
    drr.delete(name);
  }


  public void editContact(String name,String newname)
  { drr.edit(name,newname);
   //  boolean flag=false;
   //  int eId=-1;
   // for(int i=0;i<contactsList.size();i++)
   //          { 
   //            if(name.equals(contactsList.get(i).getName()))  
   //               {
   //                drr.edit(name,newname);
   //                eId=contactsList.get(i).getId();
   //                repo.edit(eId,newname);
   //                flag=true;
   //               }
   //          }
   //          return flag;
  }
  public ArrayList <Contact> sort()
  {
    repo.sortName();
    return contactsList;
  }

}
