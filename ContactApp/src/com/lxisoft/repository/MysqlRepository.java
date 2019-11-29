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
	{
		try
		{
			connectionDB();
		}
		catch(Exception e)
		{
			System.out.println("not connected");	
		}
	}
	public void connectionDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:8080/contact","root","root");	
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
 			String cr="CREATE TABLE contactlist(ID int(2),Name varchar(25),Number varchar(25))";
			// Statement s=conn.createStatement();
			stmt.execute();
 		}
 		catch(SQLException e)
 		{
 			e.printStackTrace();
 		}
 	}
	
	public List<Contact> getAllContact()
	{
		// connectionDB();
		try
		{
			contactList.clear();
			Statement smt=conn.createStatement();
			ResultSet rs=smt.executeQuery("select * from contactlist");
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
	// public int getContactId()
	// {
	// 	int id=0;
	// 	try
	// 	{
	// 		Statement st=con.createStatement();
	// 		ResultSet rs=st.executeQuery("select ID ");
	// 		while(rs.next())
	// 		{
	// 			id=rs.getInt("ID");
	// 			id++;
	// 		}
	// 	}
	// 	catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	return id;
	// }

 	public void insertContact()
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("insert into contactlist values(?,?,?)");
	 		stmt.setString(1,c.getId());
	 		stmt.setString(2,c.getName());
	 	    stmt.setString(3,c.getContactNo());
	 		stmt.executeUpdate();
	 		System.out.println("Successfully Inserted");
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 			System.out.println("Insert Failed"+e);
 		}
 		// return contactList;
 	}

 	public void updateContact()
 	{
 		try
 		{
	 		stmt=conn.prepareStatement("update contactlist set SentOn=? where id=?");
	 		// stmt.setString(1,c.getContactNo());
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