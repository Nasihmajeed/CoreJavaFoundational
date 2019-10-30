package com.lxisoft.contactrepository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.contactrepository.FileStorage;

public class Repository implements FileStorage
{
	File f=new File(directory);
	

	public void sample()
	{
		System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable:"+f.canWrite()); 
            System.out.println("Is readable"+f.canRead()); 
            System.out.println("Is a directory:"+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
        } 
    }
}