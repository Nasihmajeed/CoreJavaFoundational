package com.lxisoft.Repository;
import com.lxisoft.Model.Contact;
import java.io.*;
import java.util.ArrayList;

public class Repository
{  

  public void file(ArrayList <Contact> contactslist)
  {
   try{ 
     //File file = new File(name);
     //file.createNewFile();
     File file = new File("Contact1.csv");
     //FileWriter fw = new FileWriter(file,true);
     PrintWriter pw = new PrintWriter(file); 
     if(file.length()==0) 
     {pw.println("NAME"+","+"NUMBER");}
     pw.flush();
      
      //{
     for(int i=0;i<contactslist.size();i++)
     {
     	pw.println(contactslist.get(i).getName()+","+contactslist.get(i).getNumber());
        pw.flush();
     }//}
      }catch(IOException e){}
      readFile();
  }
  public void readFile()
  {  String contacts;
  	   try
  	   {   File file = new File("Contact1.csv");
  	   	   FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           while((contacts=br.readLine())!= null)
           {
           	System.out.println(contacts);
           }
        }catch(IOException e)
        {
        	System.out.println("ERROR");
        }   
  }
  	   
}

