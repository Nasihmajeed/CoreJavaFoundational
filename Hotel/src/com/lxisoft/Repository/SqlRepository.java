package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.*;
import com.lxisoft.Model.*;   
public class SqlRepository implements Repository
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
	ResultSet rs =null;
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
	public void saveData(HotelModel mhotel)
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql=("insert into foodlist(Id,Foodname,Foodprice) values(?,?,?)");
			ps = con.prepareStatement(sql);
			int j=(mhotel.getFoodList().size())-1;
			ps.setInt(1,mhotel.getFoodList().get(j).getId());
			ps.setString(2,mhotel.getFoodList().get(j).getFoodName());
			ps.setInt(3,mhotel.getFoodList().get(j).getFoodPrice());
			int i = ps.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println("qqqqqqqqq"+e);
			e.printStackTrace();
		}
	}
	public void displayAll()
	{
		try
		{
			dataBaseConnectionEstablish();
			String q;
			q=("select * from foodlist");
			System.out.println("ps"+ps);
			System.out.println("exe"+ps.executeQuery(q));

			rs = ps.executeQuery(q);
			System.out.println("rs"+rs);
			
			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n","SlNo","Food Type","Food Price");
			while(rs.next())
			{
				System.out.printf("%-20.30s %-20.30s %-20.30s%n",rs.getInt(2),rs.getString(3),rs.getInt(4));
			}
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
			String t=("truncate table foodlist");
			ps = con.prepareStatement(t);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("ttttttt"+e);
		}
	}		
	public void insertStockQuery(HotelModel mhotel)
	{
		try
		{
			dataBaseConnectionEstablish();
			String sql;
			sql=("insert into stocklist(Id,Foodname,Quantity) values(?,?,?)");
			ps = con.prepareStatement(sql);
				int j=(mhotel.getStockList().size())-1;
				ps.setInt(1,mhotel.getFoodList().get(j).getId());
				ps.setString(2,mhotel.getFoodList().get(j).getFoodName());
				ps.setInt(3,mhotel.getStockList().get(j).getFoodQuantity());
				int i = ps.executeUpdate();
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
			String t=("truncate table stocklist");
			ps = con.prepareStatement(t);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println("ttttttt"+e);
		}
	}		
	public void displayStocklist()
	{
		try
		{
			dataBaseConnectionEstablish();
			String q;
			q=("select * from stocklist");
			rs = ps.executeQuery(q);
			System.out.println("rs.next stock"+rs.next());
			System.out.printf("%-20.30s %-20.30s %-20.30s%n","SlNo","Food Name","Quantity");
			while(rs.next())
			{
				System.out.printf("%-20.30s %-20.30s %-20.30s%n",rs.getInt(2),rs.getString(3),rs.getInt(4));
			}
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
			d=("update stocklist set name='am' where SlNo=1");
			ps = con.prepareStatement(d);
			ps.execute();
		}
		catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	
}	