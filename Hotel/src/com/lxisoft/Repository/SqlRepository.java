package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.*;
public class SqlRepository
{
	Connection con = null;
	PreparedStatement ps = null;
	public void dataBaseConnectionEstablish()
	{
		if (con == null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "root");						
			}
			catch (Exception e)
			{
				System.out.println("eeeeeeeeeeeeeeeeee"+e);
			}
		}
	}
	public void createTable()
	{
		try 
		{
			this.dataBaseConnectionEstablish();
			String qry;
			qry="create table foodlist (Id int,Foodname varchar(15),Foodprice int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
			con.close();
		}
		catch (SQLException e)
		{			
			e.printStackTrace();
		}
		
	}

}	