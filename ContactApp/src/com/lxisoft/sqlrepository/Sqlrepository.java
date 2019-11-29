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
	String drivername = "com.mysql.jdbc.Driver"; 
	String connectionname = "jdbc:mysql://localhost:3306/abhijith,root,root";

	public void connection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
	        Connection conn=DriverManager.getConnection(connectionname);  
        }  
        catch(Exception e)
        {
        	System.out.println(e);
        }                             
	}
	public void write()
	{
		try
		{
		String query = "insert into contact values(?,?,?)";
		PreparedStatement stmnt = conn.PrepareStatement(query);
		stmnt.setInt(1,3);
		stmnt.setString(2,abhiram);
		stmnt.setString(3,89765);

		stmnt.executeUpdate();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}

}