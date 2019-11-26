package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.sql.*;

public class DbRepository implements DbStorage
{
	Connection connection;
	PreparedStatement ps;

	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>(); 
		try
		{			
			Class.forName(driverName); 
			connection=DriverManager.getConnection(dbUrl,username,password);
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
	
}


	
			// ps.setString(1,"22");
			// ps.setString(2,"adc");
			// ps.setString(3,"adc");
			// ps.executeUpdate();

// int x=1;
			// String s="zzzn";

			//ps.setString();
