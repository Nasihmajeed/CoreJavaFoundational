package com.lxisoft.Repository;
import com.lxisoft.Domain.Contact;
import java.io.*;
import java.util.ArrayList;
import java.lang.*;

public class Repository
{

 static int id;
 //File file = new File("Contact1.csv");
 public ArrayList <Contact> getFromFile()
  {
     ArrayList <Contact> filelist = new  ArrayList <Contact>(); 
    try{
    String data,name,number;
    FileReader fr = new FileReader("Contact1.csv");
    BufferedReader br = new BufferedReader(fr);
    boolean x=false;
    while((data=br.readLine())!= null)
    {
      if(x){
      String []datas=data.split(",");
      id=Integer.valueOf(datas[0]);
      name = datas[1];
      number=datas[2];
      Contact c = new Contact();
      c.setName(name);
      c.setNumber(number);
      c.setId(id);
      filelist.add(c);
    } x=true;
    }
    }catch(Exception e){}
    return filelist;
   }
   public void add(Contact c)
   {
    c.setId(++id);
    try{
      FileWriter fr = new FileWriter("Contact1.csv",true);
      fr.write("\n"+c.getId()+","+c.getName()+","+c.getNumber());
      fr.close();
      
       }catch(IOException e){}
   }
   public void delete(int id)
   {
    try{
        ArrayList <Contact> filelist=getFromFile();
        FileWriter fr = new FileWriter("Contact1.csv");
        for(int i=0;i<filelist.size();i++)
        {
         if(id==filelist.get(i).getId())
         {

         }
         else{
       
      FileWriter fr1 = new FileWriter("Contact1.csv",true);
      fr1.write("\n"+filelist.get(i).getId()+","+filelist.get(i).getName()+","+filelist.get(i).getNumber());
      fr1.close();
      
         }
        }
       }catch(IOException e){}
   }
 }
