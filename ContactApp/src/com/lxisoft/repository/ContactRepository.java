package com.lxisoft.repository;
import java.io.*;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.repository.FileStorage;
import com.lxisoft.view.ContactView;

public class ContactRepository implements FileStorage
{
	File file;
	FileWriter fw;
	Contact contact;
	ContactView contactview=new ContactView();

    public void setContact(ArrayList<Contact> array)
	{
		try
		{
			file=new File(directory);
			fw=new FileWriter(file,true);
			fw.write("Sl.No,Name,Number\n");
			int i=0;
			for(Contact contact: array)
			{
				i++;
				fw.write((i+1)+","+contact.getName()+","+contact.getNumber()+"\n");
			}
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		
	}
		// ArrayList<Contact> array=controller.getContact();
		
		// {
		// 	System.out.print("S.No:-"+(i++)+"\t\tName- " +contact.getName());
		// 	System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
		// }


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