package com.lxisoft.contactapp.contactrepo;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.*;
import java.sql.*; 
public class DbRepository implements Repository{
	Connection con;
	Contact contact=new Contact();
	PreparedStatement ps;	
public ArrayList<Contact>getAll(){
	ArrayList<Contact> conlist=new ArrayList<Contact>();
	Set<Contact> conset=new TreeSet<Contact>();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");


		Statement s=con.createStatement();
		s.executeUpdate("create table  contactlist (ID int auto_increment primary key,NAME varchar(15),NUMBER varchar(15))");
        // ps=con.prepareStatement("insert into contactlist (NAME,NUMBER) values(?,?)");
		ResultSet rs=ps.executeQuery("select * from contactlist");

		while(rs.next()){
			Contact contact=new Contact();
			contact.setId(rs.getInt("ID"));
			contact.setName(rs.getString("NAME"));
			contact.setNumber(rs.getString("NUMBER"));
			conset.add(contact);
		}
		conlist.addAll(conset);
	}
	catch(Exception ee){
		System.out.println(ee);} 
		return conlist;
  }
public void setContact(Contact contact){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("insert into contactlist(NAME,NUMBER) values("+contact.getName()+","+contact.getNumber()+")");
		con.close();
	}
	catch(Exception ee){
		System.out.println(ee);} 

	}
public Contact searchList(String name){
	Contact contact=new Contact();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		//ArrayList<Contact> colist=this.getAll();
		ResultSet rs=s.executeQuery("select * from contactlist where(NAME ='"+name+"')");
		contact.setId(rs.getInt("ID"));
		contact.setName(rs.getString("NAME"));
		contact.setNumber(rs.getString("NUMBER"));
        }
    catch(Exception ee){
		System.out.println(ee);} 
		return contact;
   }
}