package com.lxisoft.contactapp.repository;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.sql.*;
import java.util.*;
import java.util.Collections;
import java.io.*;
/**
 * class Repository is created to do database operations that implements MySqlRepo
 */
public class Repository implements MySqlRepo
{  
	static Connection con=null;
	static PreparedStatement stmt=null;
	public static void dB_Connection()throws ClassNotFoundException, SQLException
	{
			try
			{
			Class.forName(driver_Class);
			con=DriverManager.getConnection(db_URL,userName,password);
			System.out.println("DB Connection created successfully");
			System.out.println("Creating statement..."); 
		    createTable();
		    // ResultSet rs = stmt.executeQuery(table); 
			}
			catch(ClassNotFoundException |SQLException ex) 
			{ 
		   	System.out.println("Error: unable to load driver class!"); 
			}

	}
	/**
	 * Add contact details from file.
	 * @param contact.
	 */
	public void addContactDetails(Contact contact)throws SQLException//Contact contact
	{
		//contacts.add(contact);	
		boolean val=false;
		try
		{	
			//createTable();
			int i=0;
			stmt=con.prepareStatement("insert into Contactlist values(?,?,?)");  
			stmt.setInt(1,contact.getId());
			stmt.setString (2,contact.getName());
			stmt.setString(3,contact.getNo());
			i=stmt.executeUpdate();
			System.out.println(i+"inserted");
		}
	catch(SQLException ex) 
			{ 
		   	System.out.println("Error: unable to load driver class!"); 
			}

		//contactWriteIntoFile(contact,val);

	}
	public static void createTable()throws SQLException
	{
		try
		{
		System.out.println("create ");
			String create_Table="create table Contactlist(ID int(3),NAME varchar(50),NUMBER varchar(10))";
			stmt=con.prepareStatement(create_Table);
			
			stmt.execute();
			System.out.println("table cretaed successfully");
		}
		catch(SQLException ex) 
		{ 
		   	System.out.println("Error: SQLSyntax error!"); 
		}
		
		
	}
}