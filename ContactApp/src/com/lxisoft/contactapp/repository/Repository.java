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
	public void dB_Connection()
	{
			Connection con=null;
			Statement stmt=null;
			try
			{
			Class.forName(driver_Class);
			con=DriverManager.getConnection(db_URL,userName,password);
			System.out.println("DB Connection created successfully");
			System.out.println("Creating statement..."); 
		    // stmt = con.createStatement(); 
		    // ResultSet rs = stmt.executeQuery(table); 
			}
			catch(ClassNotFoundException |SQLException ex) 
			{ 
		   	System.out.println("Error: unable to load driver class!"); 
			}
		}
	}