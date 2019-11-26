package com.lxisoft.repository;
import java.sql.*;
import java.util.*;
public class Repo implements MysqlRepository
{
	public void databaseConnection()
	{
		try
		{  
			Class.forName(driver);  
			Connection con=DriverManager.getConnection(db_url,username,password);
			System.out.println("Connection established");
			PreparedStatement ps=con.prepareStatement("insert into contactApp(ID,NAME,NUMBER)"+"values(?,?,?)");
			ps.setString(1,"2");
			ps.setString(2,"mehar");
			ps.setString(3,"63");
			ps.execute();
			PreparedStatement p=con.prepareStatement("delete from contactApp where id=?");
			p.setInt(1,1);
			p.execute();
			PreparedStatement pst=con.prepareStatement("update contactApp set ID=? where NAME=?");
			pst.setInt(1,1);
			pst.setString(2,"me");
			pst.execute();
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from contactApp");
			while(rs.next())
			{
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				String number=rs.getString("NUMBER");
				System.out.format("%s,%s,%s\n",id,name,number);
			}
			s.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 
		  
}