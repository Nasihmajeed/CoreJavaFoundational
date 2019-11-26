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
	String db_URL="jdbc:mysql://localhost:3306/contactApp";
	String table="create table ContactsApp(ID int(3),NAME varchar(50),NUMBER int(10))";
	public void dB_Connection()throws ClassNotFoundException, SQLException;
}