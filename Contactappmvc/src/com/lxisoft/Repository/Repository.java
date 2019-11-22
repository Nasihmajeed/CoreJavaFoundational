package com.lxisoft.Repository;
import com.lxisoft.Domain.Contact;
import java.io.*;
import java.util.*;
/*
*Repository class for file operation
*/
public class Repository
{  ArrayList <Contact> filelist = new  ArrayList <Contact>();
   File file = new File("Contact1.csv");

   /*
   *method for file operation
   */
  public void file(ArrayList <Contact> contactslist)
  {
   try{  
             //if(!file.exists())
              //{
              PrintWriter pw = new PrintWriter(file);
              if(file.length()==0) 
                { pw.println("ID"+","+"NAME"+","+"NUMBER");}
                  pw.flush();
                  for(int i=0;i<contactslist.size();i++)
                    {
     	               pw.println(contactslist.get(i).getId()+","+contactslist.get(i).getName()+","+contactslist.get(i).getNumber());
                     pw.flush();
                    }//}
               // else
              //{System.out.println("empty");}

       }catch(IOException e){}
  }
  /*
  *get all contacts from file
  *
  */
  public ArrayList <Contact> getAllContacts()
  {  String contacts;
      TreeSet<Contact> ts=new TreeSet<Contact>();  
  	   try
  	   {
  	    File file = new File("Contact1.csv");
  	      FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           while((contacts=br.readLine())!= null)
           {
           	String []datas=contacts.split(",");
           	String name = datas[0];
           	String number=datas[1];
           	Contact c= new Contact();
            //c.setId(id);
            int oldId=c.getId();
            c.setId(++oldId);
           	c.setName(name);
           	c.setNumber(number);
            ts.add(c);
          
           	//filelist=tc;
            System.out.println(filelist.size()+"***********");
           }
           filelist.addAll(ts);
           filelist.remove(0);
      for(int i=0;i<filelist.size();i++)
          {
            System.out.println("Name   "+(i+1)+":"+filelist.get(i).getName());
  
        }}catch(IOException e)
        {
        	System.out.println("ERROR");
        }   return filelist;
  }
  	   
}