package com.lxisoft.contactrepository;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.view.Tdd;
import com.lxisoft.contactrepository.FileStorage;

public class Repository implements FileStorage
{
	File file;
	Tdd t;
	FileWriter fw;
	Contact contact;

    public void setContact()
	{
		try
		{
			file=new File(directory);
			t=new Tdd();
			fw=new FileWriter(file);
			int n=t.inputContact();
			fw.write("Sl.No,Name,Number\n");
			for (int i=0;i<n;i++)
			{
				String[] temp=t.scan(i);
				contact=new Contact();
				contact.setName(temp[0]);
				contact.setNumber(temp[1]);
				fw.write((i+1)+","+contact.getName()+","+contact.getNumber()+"\n");
			}
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		
	}

 //    public void contactAdd()
 //    {

 //    }
	// public int contactSearch()
	// public void contactDelete()
	// public void contactUpdate()
}












// System.out.println("File name :"+f.getName()); 
//         System.out.println("Path: "+f.getPath()); 
//         System.out.println("Absolute path:" +f.getAbsolutePath()); 
//         System.out.println("Parent:"+f.getParent()); 
//         System.out.println("Exists :"+f.exists()); 
//         if(f.exists()) 
//         { 
//             System.out.println("Is writeable:"+f.canWrite()); 
//             System.out.println("Is readable"+f.canRead()); 
//             System.out.println("Is a directory:"+f.isDirectory()); 
//             System.out.println("File Size in bytes "+f.length()); 
//         } 