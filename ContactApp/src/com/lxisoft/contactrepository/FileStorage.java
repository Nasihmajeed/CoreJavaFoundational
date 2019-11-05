package com.lxisoft.contactrepository;
import java.util.ArrayList;
import com.lxisoft.model.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactrepository\\Contactlist.csv";
	public ArrayList<Contact> check(ArrayList<Contact> array);
	public ArrayList<Contact> addToFile(ArrayList<Contact> array);
	public ArrayList<Contact> initialFileRead();
	public void fileRead(ArrayList<Contact> array);
	public void syncFile(ArrayList<Contact> array);
}