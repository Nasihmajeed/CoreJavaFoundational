package com.lxisoft.repository;
import java.sql.*;
import java.util.*;
import com.lxisoft.domain.Contact;
import com.lxisoft.contactmodel.*;
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

			// con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	} 
	public void createStorage()
	{
		try
		{
			Statement s=con.createStatement();
			String st="create table contactApp(ID int,NAME varchar(20),Number varchar(20)";
			s.executeUpdate(st);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
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
			e.printStackTrace();
		}
	}
	/**
	 *to sort contact by number
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> sortByNumber()
	{
		contactList.clear();
		contactList=findAllContact();
		Collections.sort(contactList, new SortByNumber());
		return contactList;
	}
	/**
	 *to sort contact by name
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> sortByName()
	{
		contactList.clear();
		contactList=findAllContact();
		Collections.sort(contactList, new SortByName());
		return contactList;
	}
	/**
	 *to sort contact by id
	 *
	 *@return arraylist of contact
	 */
	public List <Contact> sortById()
	{
		contactList.clear();
		contactList=findAllContact();
		Collections.sort(contactList, new SortById());
		return contactList;
	}	  
}