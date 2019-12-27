package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.*;
public class SqlRepository
{
	Connection connection = null;
	Statement statement = null;
	public void dataBaseConnectionEstablish()
	{
		if (connection == null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodlist", "root", "root");
				statement = connection.createStatement();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void dataToTable()
	{
		try 
		{
			this.dataBaseConnectionEstablish();
			String sql;
			statement.execute("INSERT INTO foodlist(Id,FoodType,FoodPrice)"+ "VALUES(11,'cb',60)");
			connection.close();
		}
		catch (SQLException e)
		{			
			e.printStackTrace();
		}

	}

}	