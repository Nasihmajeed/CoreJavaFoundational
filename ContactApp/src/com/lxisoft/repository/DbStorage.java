package com.lxisoft.repository;
import java.util.ArrayList;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;

public interface DbStorage
{
	String driverName="com.mysql.jdbc.Driver";
	String dbUrl="jdbc:mysql://localhost:3306/contact";
	String username="root";
	String password="root";
}