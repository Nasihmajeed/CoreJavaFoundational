package com.lxisoft.sqlrepository;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import com.lxisoft.filerepository.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.test.*;

public class Sqlrepository implements Repository
{
	String drivername = "com.mysql.jdbc.Driver"; 
	String connectionname = ("jdbc:mysql://localhost:3306/abhijith","root","root");
	public void connection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhijith","root","root");  
        }  
        catch(Exception e)
        {

        }                             
	}
}