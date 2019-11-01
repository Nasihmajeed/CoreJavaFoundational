package com.lxisoft.contactrepository;
import java.util.ArrayList;
import com.lxisoft.model.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactrepository\\Contactlist.csv";
	// public void contactAdd();
	// public int contactSearch();
	// public void contactDelete();
	// public void contactUpdate();
	 public void setFile(ArrayList<Contact> array);
}