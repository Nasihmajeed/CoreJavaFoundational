package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import java.sql.*;
import java.util.*;
import java.io.*;
public class MysqlRepository implements Repository
{
	List<Contact>contactList=new ArrayList<Contact>();
	Contact c;
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
	
	public List<Contact> getAllContact()
	{
		connectionDB();
		try
		{
			contactList.clear();
			Statement smt=conn.createStatement();
			ResultSet rs=smt.executeQuery("select * from Contactlist");
			while(rs.next())
			{
				Contact c=new Contact();
				c.setId(rs.getString("ID"));
				c.setName(rs.getString("NAME"));	
				c.setContactNo(rs.getString("NUMBER"));
				contactList.add(c);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contactList; 
	}

 	public List<Contact> insertContact()
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into Contactlist values(?,?,?)");
	 		stmt.setString(1,c.getId());
	 		stmt.setString(2,c.getName());
	 	    stmt.setString(3,c.getContactNo());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			System.out.println("Insert Failed");
 		}
 		return contactList;
 	}

 	public void updateContact()
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("update Contactlist set SentOn=? where id=?");
	 		stmt.setString(1,c.getContactNo());
	 		stmt.setString(2,c.getId());
	 	    stmt.executeUpdate();
	 		System.out.println("Successfully Updated");
 		}
 		catch(Exception e)
 		{
 			System.out.println("Updation Failed");
 		}
 	}
 	public void deleteContact(String d)
	{
		try
		{
			stmt=conn.prepareStatement("delete from Contactlist where id=?");
			stmt.setString(1,d);
			stmt.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}