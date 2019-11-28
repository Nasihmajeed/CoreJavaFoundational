package com.lxisoft.contactapp.repository;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.lxisoft.contactapp.*;

public interface Repository
{
	public void dB_Connection() throws SQLException,ClassNotFoundException;
	public void insertContactDetails(Contact contact,boolean tbexists)throws SQLException;
	public void createTable()throws SQLException;
	public boolean checkTableExists();
	public int getId();
	public ArrayList<Contact> getAllContacts()throws SQLException;
	public void updateRepo(int i,Contact contact)throws SQLException;
	public void deleteContact(int i)throws SQLException;
	public void clearRepository()throws SQLException;
	public ArrayList<Contact> sortContactByName()throws SQLException;
	public ArrayList<Contact> sortContactByNumber()throws SQLException;
	public ArrayList<Contact> sortContactById()throws SQLException;
	public void addContactDetails(Contact contact)throws SQLException;
}