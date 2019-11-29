package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
import java.sql.*; 
public class DbRepository implements Repository{
	Connection con;//=new Connection()
	Statement s;	
public ArrayList<Contact>getAll(){
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	Set<Contact> contactset=new TreeSet<Contact>();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
	}
}
}