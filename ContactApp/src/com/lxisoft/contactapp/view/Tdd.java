package com.lxisoft.contactapp.view;
import com.lxisoft.contactapp.controller.*;
import com.lxisoft.contactapp.model.*;
import java.util.*;
public class Tdd{
static ArrayList<Contact> contacts=new ArrayList<Contact>();
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Controller c=new Controller();
	Contact cc=new Contact();
	for(int i=0;i<contacts.size();i++){
	System.out.println("Enter the name : ");
	cc.setName(s.next());
	System.out.println("Enter the number : ");
	cc.setNumber(s.nextLong())	;
	c.save(cc);
    }
  }
}
