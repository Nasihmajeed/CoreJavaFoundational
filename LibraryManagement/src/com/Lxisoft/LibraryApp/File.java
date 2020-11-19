package com.Lxisoft.LibraryApp;
//import com.Lxisoft.LibraryApp.*;
import java.util.*;
import java.io.*;


public class File
{
	Book book = new Book();
	Admin admin = new Admin();
	ArrayList<Book> b;
	public void createFile() 
 	{

	try{
            FileOutputStream writeData = new FileOutputStream("Library_Data.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(b);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) 
        {
            e.printStackTrace();
        }

    }
}