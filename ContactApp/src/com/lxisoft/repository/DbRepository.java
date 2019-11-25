package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;

public class DbRepository implements DbStorage
{
	Connection conection;
	public void dbConnect()
	{
		try
		{
			Class.forName(driverName); 
			conection=DriverManager.getConnection(dbUrl,username,password);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}	
	}

	public void print()
	{
		PreparedStatement ps=conection.prepareStatement("insert into contactList(ID,NAME,NUMBER) values('"++"','"++"','"++"')");
		//ps.setString(1,con.name);
		ps.executeUpdate();
	}
	
}
	