package com.lxisoft.repository;
import java.util.ArrayList;
import com.lxisoft.view.ContactView;
import com.lxisoft.model.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\repository\\Contactlist.csv";
	// public void contactAdd();
	// public int contactSearch();
	// public void contactDelete();
	// public void contactUpdate();
	 public void setContact(ArrayList<Contact> array);
}