package com.lxisoft.repository;
import java.sql.*;
import java.util.*;
import com.lxisoft.domain.Contact;
/**
 * interface repository
 */
public interface Repository
{
	public void saveContact(Contact contact);
	public List <Contact> findAllContact();
	public Contact findContactById(int n);
	public void deleteContact(int n);
	public void updateContact(int n,Contact con);
	public void deleteAllContact();
	public List <Contact> sortById();
	public List <Contact> sortByName();
	public List <Contact> sortByNumber();

}