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
	//String drivername = "com.mysql.jdbc.Driver"; 
	//String connectionname = "jdbc:mysql://localhost:3306/abhijith,root,root";
	Connection con; 
	PreparedStatement stmnt; 
	public Sqlrepository()
	{
		try
		{
			System.out.println("Initiating Connection");
			Class.forName("com.mysql.jdbc.Driver");  
			this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhijith","root","root");  

			System.out.println("Initiating Connection Successfull");
	        
        }  
        catch(Exception e)
        {
        	System.out.println(e);
        }                             
	}
	public void write(Contact contact, boolean isTrue)
	{
		try
		{
		System.out.println("name "+contact.getName()+"  Number  "+contact.getNumber());
		if(con != null) 
		{
	     	stmnt = con.prepareStatement("insert into contact values(?,?,?)");
	     	stmnt.setInt(1,1);
			stmnt.setString(2,contact.getName());
			stmnt.setString(3,contact.getNumber());
			stmnt.executeUpdate();
		} else
		 {
			System.out.println("djhhdhdjhjdjhdjh");
		}
	
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}

}