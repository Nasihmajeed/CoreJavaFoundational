package com.lxisoft.repository;
import java.util.ArrayList;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactrepository\\Contactlist.csv";
	// public void save(Contact contact);
	public ArrayList<Contact> findAll();
	// public void findByName(String name);
	// public ArrayList<Contact> delete(String name);
	// public void syncFile(Contact contact,int j);
}
