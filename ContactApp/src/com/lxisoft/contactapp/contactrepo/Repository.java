package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
public class Repository implements Filestorage{
File file=new File(directory);
Controller controlller=new Controller();
Contact contact=new Contact();
public ArrayList<Contact> con=new ArrayList<Contact>();
public void setFile(ArrayList<Contact> con){
  	try{
	f.createNewFile();
	FileWriter write=new FileWriter(f);
	BufferedWriter fwrite=new BufferedWriter(write);
	for(int i=0;i<con.size();i++){
	fwrite.write(con.get(i).getName(),con.get(i).getNumber(),"\n");  
	fwrite.close();
      }
    }
    catch(IOException e){
    	System.out.println("Exception "+e);
    }
  }
}