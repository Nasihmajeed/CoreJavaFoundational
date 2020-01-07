package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.*;
import com.lxisoft.Model.*;   
public class SqlRepository
{
	private static SqlRepository sqlrepo = null;
	private SqlRepository() {}
	public static SqlRepository getInstance()
	{
		if(sqlrepo==null)
		sqlrepo=new SqlRepository();
		return sqlrepo;
	}
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
			qry="create table if not exists foodlist (SlNo int primary key auto_increment,Id int,Foodname varchar(15),Foodprice int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
		}
		catch (SQLException e)
		{			
			e.printStackTrace();
		}		
	}
	public void insertDataToFoodlist(HotelModel mhotel)
	{
		try
		{
			deleteFoodlist();
			dataBaseConnectionEstablish();
			String sql;
			sql=("insert into foodlist(Id,Foodname,Foodprice) values(?,?)");
			ps = con.prepareStatement(sql);
			for(int j=0;j<mhotel.getFoodList().size();j++)
			{
				ps.setInt(1,mhotel.getFoodList().get(j).getId());
				ps.setString(2,mhotel.getFoodList().get(j).getFoodName());
				ps.setInt(3,mhotel.getFoodList().get(j).getFoodPrice());
				int i = ps.executeUpdate();
			}
		}
		catch (Exception e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}
	}
	public void displayFoodlist()
	{
		try
		{
			dataBaseConnectionEstablish();
			String q;
			q=("select * from foodlist");
			ResultSet rs = ps.executeQuery(q);
			if(rs.next())
			{ 
				System.out.printf("%-20.30s %-20.30s %-20.30s%n","SlNo","Food Type","Food Price");
				while(rs.next())
				{
					System.out.printf("%-20.30s %-20.30s %-20.30s%n",rs.getInt(1),rs.getString(2),rs.getInt(3));
				}
			}
			else
				System.out.println("Not Found...");
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
			qry="create table if not exists stocklist(SlNo int primary key auto_increment,Id int,Foodname varchar(15),Quantity int)";
			ps = con.prepareStatement(qry);
			ps.execute();			     
		}
		catch (SQLException e)
		{			
			System.out.println("sssssssssssss"+e);
			e.printStackTrace();
		}		
	}
	public void deleteFoodlist()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sq;
			sq = "delete from foodlist where id=1 ";
			ps = con.prepareStatement(sq);
			ps.execute();
		}
		catch (Exception e)
		{
			System.out.println("vfg"+e);
		}
	}		
	public void insertStockQuery(HotelModel mhotel)
	{
		try
		{
			deleteStocklist();
			dataBaseConnectionEstablish();
			String sql;
			sql=("insert into stocklist(Foodname,Quantity) values(?,?)");
			ps = con.prepareStatement(sql);
			for(int j=0;j<mhotel.getFoodList().size();j++)
			{
				ps.setString(1,mhotel.getFoodList().get(j).getFoodName());
				ps.setInt(2,mhotel.getStockList().get(j).getFoodQuantity());
				int i = ps.executeUpdate();
			}
		}
		catch (Exception e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}
	}
	public void deleteStocklist()
	{
		try
		{
			dataBaseConnectionEstablish();
			String sq;
			sq = "delete from stocklist where Quantity=2";
			ps = con.prepareStatement(sq);
			ps.execute();
		}
		catch (Exception e)
		{
			System.out.println("frrss"+e);
		}
	}		
	public void displayStocklist()
	{
		try
		{
			dataBaseConnectionEstablish();
			String q;
			q=("select * from stocklist");
			ResultSet rs = ps.executeQuery(q);
			if(rs.next())
			{ 
				System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Food Name","Quantity");
				while(rs.next())
				{
					System.out.printf("%-20.30s %-20.30s %-20.30s%n",rs.getInt(1),rs.getString(2),rs.getInt(3));
				}
			}
			else
				System.out.println("Not Found...");			
		}
		catch(SQLException e)
		{
			System.out.println("uuuuuuuu"+e);
			e.printStackTrace();
		}
	}
	public void updateStocklist()
	{
		try
		{
			dataBaseConnectionEstablish();
			String d;
			d=("update stocklist set name= 'am' where SlNo=1");
			ps = con.prepareStatement(d);
			ps.execute();
		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
	}	
}	