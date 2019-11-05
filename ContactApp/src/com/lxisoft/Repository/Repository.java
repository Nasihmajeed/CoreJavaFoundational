package com.lxisoft.Repository;
import com.lxisoft.Model.Contact;
import java.io.*;
import java.util.ArrayList;

public class Repository
{  

  public void file(ArrayList <Contact> contactslist)
  {
   try{ //boolean newFile = false;
     //String name = "Contact.txt";
     //File file = new File(name);
     //file.createNewFile();
     File file = new File("Contact1.csv");
     FileWriter fw = new FileWriter(file,true);
     PrintWriter pw = new PrintWriter(fw); 
     pw.println("NAME"+","+"NUMBER");
     pw.flush();
     for(int i=0;i<contactslist.size();i++)
     {
     	pw.println(contactslist.get(i).getName()+","+contactslist.get(i).getNumber());
        pw.flush();
     }
     
      }catch(IOException e){}
  }
}