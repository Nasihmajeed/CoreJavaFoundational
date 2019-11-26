package com.lxisoft.repository;
import java.sql.*;
public class Repo implements MysqlRepository
{
	Class.forName(driver);
	Connection conn=DriverManager.getConnection(connection);	
}