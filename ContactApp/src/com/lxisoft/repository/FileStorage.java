package com.lxisoft.repository;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.domain.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\repository\\Contactlist.csv";
	public void save(Contact contact);
	public ArrayList<Contact> findAll();
	public ArrayList<Contact> edit(EditModel editModel,String[] tempEdit);
	public ArrayList<Contact> delete(Contact contact);
	public void syncFile(Contact contact,int j);
}
