package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import java.sql.*;
import java.util.*;
import java.io.*;
public class MysqlRepository implements Repository
{
	List<Contact>contactList=new ArrayList<Contact>();
	Contact contact;
	PreparedStatement stmt=null;
	Connection conn=null;
	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8080/Contact","root","root");	
 	    }
 	    catch(Exception e)
 	    {
 	    	System.out.println("Database not connected");
 	    }
 	}
 	public void create()
 	{
 		try
 		{
 			String cr="CREATE TABLE Contactlist(ID int,Name varchar(25),Number varchar(25))";
			Statement s=conn.createStatement();
			s.executeUpdate(cr);
 		}
 		catch(SQLException e)
 		{
 			e.printStackTrace();
 		}
 	}
				
 	public void insert()
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into contactList values(?,?,?)");
	 		stmt.setString(1,contact.getId());
	 		stmt.setString(2,contact.getName());
	 	    stmt.setString(3,contact.getContactNo());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			System.out.println("Insert Failed");
 		}
 	}
}