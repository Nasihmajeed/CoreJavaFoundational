package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.sql.*;

public class DbRepository implements DbStorage
{
	Connection connection;
	PreparedStatement ps;

	public ArrayList<Contact> findAll()
	{
		ArrayList<Contact> contactList=new ArrayList<Contact>(); 
		try
		{			
			Class.forName(driverName); 
			connection=DriverManager.getConnection(dbUrl,username,password);
			ps=connection.prepareStatement("insert into contactList (ID,NAME,NUMBER) values(?,?,?)");
			ResultSet rs=ps.executeQuery("select * from contactList");
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getString("ID"));
				contact.setName(rs.getString("NAME"));
				contact.setNumber(rs.getString("NUMBER"));
				contactList.add(contact);
			}
			
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}	
		return contactList;
	}

	public void save(Contact contact) 
	{
		int id=index();
		try
		{
			ps.setString(1,id+"");
			ps.setString(2,contact.getName());
			ps.setString(3,contact.getNumber());
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}

	public int index()
	{
		ArrayList<Contact> contactList=findAll();
		int n=0,x=0;
		for(int i=0;i<contactList.size();i++)
		{
			x=Integer.parseInt(contactList.get(i).getId());
			if(n<x)
				n=x;
		}
		return n+1;
	}

	// public void save(Contact contact)
	// {
	// 	int id=index();
	// 	++id;
	// 	try
	// 	{
	// 		if(file.exists())
	// 		{
	// 			FileWriter fw1=new FileWriter(file,true);
	// 			BufferedWriter bw1=new BufferedWriter(fw1);
	// 			bw1.write(id+","+contact.getName()+","+contact.getNumber()+"\n");
	// 			bw1.flush();
	// 			bw1.close();
	// 		}
	// 		else
	// 		{
	// 			System.out.println("\nfile created and contact saved");
	// 			FileWriter fw=new FileWriter(file);
	// 			BufferedWriter bw=new BufferedWriter(fw);
	// 			System.out.println("NEW FILE CREATED");
	// 			bw.write(id+","+contact.getName()+","+contact.getNumber()+"\n");
	// 			bw.flush();
	// 			bw.close();
	// 		}
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("Exception: "+e);
	// 	}
	// }
	
}


	
			// ps.setString(1,"22");
			// ps.setString(2,"adc");
			// ps.setString(3,"adc");
			// ps.executeUpdate();

// int x=1;
			// String s="zzzn";

			//ps.setString();
