package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;

import java.sql.*;
import java.util.*;

public class Repository implements MysqlRepo
{
	static Connection con =null;
	static PreparedStatement stmt=null;
	static ResultSet rs=null;
	static int id;
	ArrayList<Contact> contacts=new ArrayList<Contact> (); 
	
	public void connection()throws SQLException,ClassNotFoundException
	{
		try
		{
		Class.forName(driverName);
		con = DriverManager.getConnection(connectionName,"root","root");
		System.out.println("Connection registered");
		}
		catch(ClassNotFoundException e)
		{
		System.out.println(e);
		}
	}
	public void writeNewContact(Contact contact,boolean write)throws SQLException, ClassNotFoundException
	{
		try
		{
			stmt=con.prepareStatement("insert into tab values(?,?,?)");
			stmt.setInt(1,id);
			stmt.setString(2,contact.getName());
			stmt.setString(3,contact.getNo());
			stmt.executeUpdate();
			System.out.println("contact added");
			id++;
		}catch(Exception p)
		{
			System.out.println("Error"+p);
		}
	}
	public ArrayList<Contact> getAllContacts()throws SQLException, ClassNotFoundException
	{
		contacts.clear();
		try
		{
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
			System.out.println(p);
		}
		for(Contact a: contacts)
		System.out.println(a.getName());
		return contacts;
	}
	public void editContact(Contact contact)
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
	public static void setId()
	{
		try
		{
			rs=stmt.executeQuery("select * from tab");
			while(rs.next())
			{
				id=rs.getInt("ID");
				System.out.println(id+"id");
				
			}
			id++;
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public void clearAllContacts()
	{
		try
		{
			stmt=con.prepareStatement("truncate table tab");
			stmt.executeUpdate();
		}catch(Exception p)
		{
			System.out.println(p);
		}
	}

}