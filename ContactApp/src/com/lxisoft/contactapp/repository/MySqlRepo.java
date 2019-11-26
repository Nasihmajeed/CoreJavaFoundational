package com.lxisoft.contactapp.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.lxisoft.contactapp.*;

public interface MySqlRepo
{
	String driver_Class="com.mysql.jdbc.Driver";
	String userName="root";
	String password="root";
	String db_URL="jdbc:mysql://localhost:3306/contacts";
	
	//public static void dB_Connection()throws ClassNotFoundException, SQLException;
}