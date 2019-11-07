package com.lxisoft.contactrepository;
import java.util.ArrayList;
import com.lxisoft.model.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactrepository\\Contactlist.csv";
	public ArrayList<Contact> check();
	public ArrayList<Contact> initialFileRead();
	public void fileRead();
	public void syncFile(Contact contact,int j);
}