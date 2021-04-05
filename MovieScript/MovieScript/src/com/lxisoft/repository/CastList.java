package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import java.util.*;
import java.sql.*;

public class CastList 
{
    Connection con = null;
    Statement statement = null;
    ResultSet result = null;
    PreparedStatement pStatement = null;
    int row;

    public void databaseConnect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try 
            {
            	con = DriverManager.getConnection("cj.jdbc:mysql://localhost:3306/test","root","pavilion2912"); 
            }
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addToDatabase(ArrayList<Cast> cast)
    {
		this.databaseConnect();
		try
        {
			for(int i=0;i<cast.size();i++)
            {
				System.out.println("Name : "+cast.get(i).getName()+" Character : "+cast.get(i).getCharacterName());
				pStatement = con.prepareStatement("insert into cast (id,name,character) values("+i+","+cast.get(i).getName()+","+cast.get(i).getCharacterName()+")");
                row = pStatement.executeUpdate();  
			}
			pStatement.close();
            con.close();
            this.showDatabase();
		}
		catch(SQLException e)
        {
			e.printStackTrace();
		}
	}
	public void showDatabase()
    {
		this.databaseConnect();
		try
        {
			statement = con.createStatement();
			result = statement.executeQuery("select * from cast");

			while(result.next())
			{
				int id = result.getInt("id");
				String aName = result.getString("name");
				String cName = result.getString("character");

				System.out.println("  ID       : "+id+"\n  Name     : "+aName+"\n Character : "+cName);
			}
			result.close();
		}
		catch(SQLException e)
        {
			e.printStackTrace();
		}
	}
	public void deleteFromDatabase()
    {
		this.databaseConnect();
		try
        {
			statement = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID of actor to be deleted ");
			int delete = sc.nextInt();

			statement.executeUpdate("delete from cast where id ="+delete+"");

			System.out.println("Deleted 1 row ");
			this.showDatabase();
			
		}
		catch(SQLException e)
        {
			e.printStackTrace();
		}
	}
}