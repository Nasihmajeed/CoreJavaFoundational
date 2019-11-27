package com.lxisoft.repository;
import java.sql.*;
import java.util.*;
import com.lxisoft.domain.Contact;
public class MysqlRepository implements Repository
{
	List <Contact> contactList=new ArrayList<Contact>();
	Connection con=null;
	PreparedStatement ps=null;
	PreparedStatement pst=null;
	public void databaseConnection()
	{
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
			System.out.println("Connection established");
			// con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 
	public void createStorage()
	{

	}
	public List<Contact> findAllContact()
	{
		databaseConnection();
		try
		{
			contactList.clear();
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from contactApp");
			while(rs.next())
			{
				Contact c=new Contact();
				c.setContactId(rs.getInt("ID"));
				c.setContactName(rs.getString("NAME"));	
				c.setContactNumber(rs.getString("NUMBER"));
				contactList.add(c);
			}
			s.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return contactList; 
	}
	public int getContactId()
	{
		int id=0;
		try
		{
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select ID from contactApp");
			while(rs.next())
			{
				id=rs.getInt("ID");
				id++;
			}
			s.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return id;
	}
	public void saveContact(Contact contact)
	{
		try
		{
			ps=con.prepareStatement("insert into contactApp(ID,NAME,NUMBER)"+"values(?,?,?)");
			int id=getContactId();
			ps.setInt(1,id);
			ps.setString(2,contact.getContactName());
			ps.setString(3,contact.getContactNumber());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public Contact findContactById(int n)
	{
		Contact c=new Contact();
		try
		{
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select NAME,NUMBER from contactApp where ID=?");
			ps.setInt(1,n);
			c.setContactName(rs.setString("NAME"));
			c.setContactNumber(rs.setString("Number"));
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return c;
	}
	public void deleteContact(int n)
	{
		try
		{
			ps=con.prepareStatement("delete from contactApp where id=?");
			ps.setInt(1,n);
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void updateContact(int n,Contact con)
	{
		try
		{
			pst=con.prepareStatement("update contactApp set NAME=?,Number=? where ID=?");
			pst.setInt(1,n);
			pst.setString(2,con.getContactName());
			pst.setString(3,con.getContactNumber());
			pst.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void deleteAllContact()
	{
		try
		{
			Statement s=con.createStatement();
			s.executeUpdate("truncate contactApp");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}	  
}