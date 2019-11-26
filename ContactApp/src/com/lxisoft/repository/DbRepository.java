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

	public void dbConnect()
	{
		try
		{
			Class.forName(driverName); 
			connection=DriverManager.getConnection(dbUrl,username,password);
			// for(int j=0;j<3;j++)
			// {
			PreparedStatement ps=connection.prepareStatement("insert into contactList (ID,NAME,NUMBER) values(?,?,?)");
			ps.setString(1,"22");
			ps.setString(2,"adc");
			ps.setString(3,"adc");
			//}

			int i=0;
			 ResultSet rs=ps.executeQuery("select * from contactList");
			while(rs.next())
			{
				System.out.println((++i)+"  "+Integer.parseInt(rs.getString("ID")));
				System.out.println(" 22 "+rs.getString("NAME"));
				System.out.println(" 33 "+rs.getString("NUMBER"));
			}
			// int x=1;
			// String s="zzzn";

			//ps.setString();
			ps.executeUpdate();
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	
}
