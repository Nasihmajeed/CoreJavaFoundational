package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public interface FileRepository
{
	String fileName="F:\\KP ZONE\\java\\GIT repo\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\Repository\\textfile.csv";
	public ArrayList<Contact> initialization(ArrayList<Contact> contacts, Contact contact);
	public void clearAll();
}