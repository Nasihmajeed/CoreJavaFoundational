package com.lxisoft.sqlrepository;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.test.*;
import java.sql.*;
import java.io.*;
public class Sqlrepository implements Repository
{
	ArrayList <Contact> contactList = new ArrayList<Contact>();
	Connection con; 
	PreparedStatement stmnt; 
	public Sqlrepository()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhijith","root","root");
        }  
        catch(Exception e)
        {
        	System.out.println(e);
        }                             
	}
	public void write(Contact contact, boolean isTrue)
	{
		//System.out.println("CONTACT DETAILS  "+contact.getNumber()+contact.getName());
		try
		{
		if(con != null) 
		{
	     	stmnt = con.prepareStatement("insert into contact values(?,?,?)");
	     	stmnt.setInt(1,1);
			stmnt.setString(2,contact.getName());
			stmnt.setString(3,contact.getNumber());
			stmnt.executeUpdate();
		} else
		 {
			System.out.println("insertion failed");
		}
	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}
	public ArrayList <Contact> read()
	{
		try
		{
			contactList.clear();
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from contact");
			while(rs.next())
			{
				Contact contact = new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setNumber(rs.getString("number"));
				contactList.add(contact);
			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return contactList;
	}
	public void edit(Contact contact)
	{
		stmnt = con.prepareStatement("update contact set  number=? ,name=?, where id = ? ");
		stmnt= setInt(1,getId());
		stmnt = setString(2,contact.getName());
		stmnt = setString(3,contact.getNumber());
		stmnt.executeUpdate();
	}
	public void clear()
	{
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("truncate contact");
	}
}