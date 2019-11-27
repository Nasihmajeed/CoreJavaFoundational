package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;
import com.lxisoft.Domain.*;

import java.sql.*;
import java.util.*;

public class MysqlRepository implements Repository
{
	static Connection con =null;
	static PreparedStatement stmt=null;
	static ResultSet rs=null;
	static int id=1;
	static Statement stm=null;
	ArrayList<Contact> contacts=new ArrayList<Contact> (); 
	static
	{
		try
		{
			connection();
			System.out.println("static block mysql");
		}catch(Exception p)
		{
			System.out.println("error"+p);
		}
	}
	public static void connection()throws SQLException,ClassNotFoundException
	{
		try
		{
		Class.forName(driverName);
		con = DriverManager.getConnection(connectionName,"root","root");
		stm=con.createStatement();
		System.out.println("Connection registered");
		}
		catch(ClassNotFoundException e)
		{
		System.out.println("errororo");
		}
	}
	public void writeNewContact(Contact contact,boolean write)throws SQLException, ClassNotFoundException
	{
		try
		{
			// stmt=con.prepareStatement("use tab");
			// setId();
			if (write)
			{
				stmt=con.prepareStatement("insert into tab values(?,?,?)");
				stmt.setInt(1,id);
				stmt.setString(2,contact.getName());
				stmt.setString(3,contact.getNo());
				stmt.executeUpdate();
				// System.out.println("contact added");
				id++;
			}
			else
			{
				stmt=con.prepareStatement("insert into tab values(?,?,?)");
				stmt.setInt(1,contact.getId());
				stmt.setString(2,contact.getName());
				stmt.setString(3,contact.getNo());
				stmt.executeUpdate();
				setId();
				// System.out.println("contact added");
			}
			
		}catch(Exception p)
		{
			System.out.println("Error "+p);
		}
	}
	public ArrayList<Contact> getAllContacts()throws SQLException, ClassNotFoundException
	{
		contacts.clear();
		try
		{
			stmt=con.prepareStatement("use tab");
			rs=stmt.executeQuery("select * from tab");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("ID"));
				contact.setName(rs.getString("NAME"));
				contact.setNo(rs.getString("NUMBER"));
				contacts.add(contact);
			}
		}
		catch(Exception p)
		{
			System.out.println(p+"error");
		}
		// for(Contact a: contacts)
		// System.out.println(a.getName());
		return contacts;
	}
	public void editContact(Contact contact, int i)throws SQLException, ClassNotFoundException
	{
		try
		{
			stmt=con.prepareStatement("update tab set name=?,number=? where id=?");
			stmt.setString(1,contact.getName());
			stmt.setString(2,contact.getNo());
			stmt.setInt(3,contact.getId());
			stmt.executeUpdate();
			System.out.println("contact added");
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public  void setId()throws SQLException, ClassNotFoundException
	{
	
					System.out.println("id  ");
		try
		{
			contacts=getAllContacts();
		}catch(Exception e)
		{

		}
		// if(contacts.size()!=0)
		// {
		// 	id=contacts.get(contacts.size()-1).getId();
		for(Contact a: contacts)
		{
			if(a.getId()>id)
				{
					id=a.getId();
				}
		id++; 
		}
		
		System.out.println("id=="+id);
		
	}
	public void deleteContact(int i)throws SQLException, ClassNotFoundException
	{
		try
		{
			contacts=getAllContacts();
			stmt=con.prepareStatement("delete from tab where id=?");
			stmt.setInt(1,contacts.get(i).getId());
			stmt.executeUpdate();
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public void clearAllContacts()throws SQLException, ClassNotFoundException
	{
		try
		{
			id=1;
			stmt=con.prepareStatement("truncate table tab");
			stmt.executeUpdate();
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public void sortByName()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts=getAllContacts();
		}catch(Exception e)
		{

		}

		Collections.sort(contacts, new SortByName());
		clearAllContacts();
		resetDataBase();

  	}
  	public void sortById()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts=getAllContacts();
		}catch(Exception e)
		{

		}

		Collections.sort(contacts, new SortById());
		clearAllContacts();
		resetDataBase();

  	}
  	public void sortByNumber()throws SQLException, ClassNotFoundException
  	{
  		try
		{
			contacts=getAllContacts();
		}catch(Exception e)
		{

		}

		Collections.sort(contacts, new SortByNumber());
		clearAllContacts();
		resetDataBase();
	}
	public void resetDataBase()throws SQLException, ClassNotFoundException
	{
		for (Contact a:contacts ) 
		writeNewContact(a,false);			
	}
  	
}