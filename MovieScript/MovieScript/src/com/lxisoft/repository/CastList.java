package com.lxisoft.repository;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Map.Entry; 
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
            	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","pavilion2912"); 
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

    public void addToDatabase(ArrayList<Entry<String, String>> cast)
    {
		this.databaseConnect();
		try
        {
			for (Entry<String, String> entry : cast) 
        	{ 
           		System.out.println("\nName : "+entry.getKey()+"\nCharacter : "+entry.getValue()); 
				pStatement = con.prepareStatement("insert into cast (id,name,charactor) values('"+(i++)+"','"+entry.getKey()+"','"+entry.getValue()+"')");
                row = pStatement.executeUpdate();  
			}
			System.out.println("\n\nAdded to Database \n\n");
			pStatement.close();
            con.close();
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
				String cName = result.getString("charactor");

				System.out.println("\n  ID       : "+id+"\n  Name     : "+aName+"\n Character : "+cName);
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
			System.out.print("\nEnter the ID of actor to be deleted : ");
			int delete = sc.nextInt();

			statement.executeUpdate("delete from cast where id ="+delete+"");

			System.out.println("\n\nDeleted 1 entry \n\n");
			
		}
		catch(SQLException e)
        {
			e.printStackTrace();
		}
	}
}