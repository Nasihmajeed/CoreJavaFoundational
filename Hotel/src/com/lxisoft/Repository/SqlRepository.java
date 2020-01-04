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
			qry="create table if not exists foodlist (Id int primary key auto_increment,Foodname varchar(15),Foodprice int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
		}
		catch (SQLException e)
		{			
			e.printStackTrace();
		}		
	}
	public void insertQuery(HotelModel mhotel)
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql=("insert into foodlist(Foodname,Foodprice) values(?,?)");
			ps = con.prepareStatement(sql);
			for(int j=0;j<mhotel.getFoodList().size();j++)
			{
				//ps.setInt(1,Id);
				ps.setString(1,mhotel.getFoodList().get(j).getFoodName());
				ps.setInt(2,mhotel.getFoodList().get(j).getFoodPrice());
				int i = ps.executeUpdate();
			}
			//con.close();
		}
		catch (Exception e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}
	}
	// public void deleteQuery()
	// {
	// 	try
	// 	{
	// 		dataBaseConnectionEstablish();
	// 		String sq;
	// 		sq = "delete from foodlist where Id=101";
	// 		ps = con.prepareStatement(sq);
	// 		ps.execute();
	// 	}
	// 	catch (Exception e)
	// 	{
	// 		System.out.println("ddddddddddddd"+e);
	// 	}
	// }
	// public void alterQuery()
	// {
	// 	try
	// 	{
	// 		dataBaseConnectionEstablish();
	// 		String sq;
	// 		sq = "alter table foodlist add itemquantity int";
	// 		ps = con.prepareStatement(sq);
	// 		ps.execute();
	// 	}
	// 	catch (Exception e)
	// 	{
	// 		System.out.println("aaaaa"+e);
	// 	}
	// }
	public void displayAll()
	{
		try
		{
			dataBaseConnectionEstablish();
			String q;
			q=("select * from foodlist");
			ResultSet rs = ps.executeQuery(q);
			if(rs.next())
			{ 
				do
				{
					System.out.print(rs.getInt(1));
					System.out.print( rs.getString(2));
					System.out.print( rs.getInt(3));
				}while(rs.next());
			}
			else{
				System.out.println("Not Found...");
			}
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("uuuuuuuu"+e);
			e.printStackTrace();
		}
	}
	public void createStockTable()
	{
		try 
		{
			dataBaseConnectionEstablish();
			String qry;
			qry="create table if not exists stocklist (Id int primary key auto_increment,Foodname varchar(15),Quantity int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
		}
		catch (SQLException e)
		{			
			System.out.println("sssssssssssss"+e);
			e.printStackTrace();
		}		
	}
	// public void insertStockQuery()
	// {
	// 	try
	// 	{
	// 		dataBaseConnectionEstablish();
	// 		String sql;
	// 		sql=("insert into stocklist(Foodname,Quantity) values(?,?)");
	// 		ps = con.prepareStatement(sql);
	// 		for(int j=0;j<mhotel.getFoodList().size();j++)
	// 		{
	// 			//ps.setInt(1,Id);
	// 			ps.setString(1,mhotel.getFoodList().get(j).getFoodName());
	// 			ps.setInt(2,mhotel.getFoodList().get(j).getFoodQuantity());
	// 			int i = ps.executeUpdate();
	// 		}
	// 		//con.close();
	// 	}
	// 	catch (Exception e)
	// 	{
	// 		System.out.println("qqqqqqqqq"+e);
	// 		e.printStackTrace();
	// 	}
	// }		
}	