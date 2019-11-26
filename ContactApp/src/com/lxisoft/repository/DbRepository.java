package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.sql.*;

public class DbRepository implements Repository
{
	Connection connection;
	PreparedStatement ps;

	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>(); 
		try
		{			
			Class.forName("com.mysql.jdbc.Driver"); 
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
			ps=connection.prepareStatement("insert into contactList (ID,NAME,NUMBER) values(?,?,?)");
			ResultSet rs=ps.executeQuery("select * from contactList");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getString("ID"));
				contact.setName(rs.getString("NAME"));
				contact.setNumber(rs.getString("NUMBER"));
				contactList.add(contact);
			}
			
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}	
		return contactList;
	}

	public void save(Contact contact) 
	{
		int id=index();
		try
		{
			ps.setString(1,id+"");
			ps.setString(2,contact.getName());
			ps.setString(3,contact.getNumber());
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}

	public int index()
	{
		ArrayList<Contact> contactList=findAll();
		int n=0,x=0;
		for(int i=0;i<contactList.size();i++)
		{
			x=Integer.parseInt(contactList.get(i).getId());
			if(n<x)
				n=x;
		}
		return n+1;
	}

	public ArrayList<Contact> delete(Contact contact)
	{

	}
	
	
}









	
			// ps.setString(1,"22");
			// ps.setString(2,"adc");
			// ps.setString(3,"adc");
			// ps.executeUpdate();

// int x=1;
			// String s="zzzn";

			//ps.setString();
