package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.*;
import com.lxisoft.Model.*;   
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
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","root");						
			}
			catch (Exception e)
			{
				System.out.println("eeeeeeeeeeee"+e);
			}
		}
	}
	public void createTable()
	{
		try 
		{
			dataBaseConnectionEstablish();
			String qry;
			qry="create table foodlist (Id int,Foodname varchar(15),Foodprice int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
			//con.close();
		}
		catch (SQLException e)
		{			
			e.printStackTrace();
		}		
	}
	public void insertQuery()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql="insert into foodlist(Id,Foodname,Foodprice) values(101,'cb',45)";
			ps = con.prepareStatement(sql);
			ps.execute();
			//con.close();
		}
		catch (Exception e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}
	}
	public void deleteQuery()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sq;
			sq = "delete from foodlist where Id=101";
			ps = con.prepareStatement(sq);
			ps.execute();
		}
		catch (Exception e)
		{
			System.out.println("ddddddddddddd"+e);
		}
	}
	public void alterQuery()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sq;
			sq = "alter table foodlist add itemquantity int";
			ps = con.prepareStatement(sq);
			ps.execute();
		}
		catch (Exception e)
		{
			System.out.println("aaaaa"+e);
		}

	}
	public void displayQuery()
	{
		try
		{
			dataBaseConnectionEstablish();
			String q;
			q=("select * from foodlist");
			ps = con.prepareStatement(q);
			ps.execute();
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("uuuuuuuu"+e);
			e.printStackTrace();
		}
	}

}	