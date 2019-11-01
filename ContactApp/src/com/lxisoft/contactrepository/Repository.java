package com.lxisoft.contactrepository;
import java.io.*;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.contactrepository.FileStorage;

public class Repository implements FileStorage
{
	File file=new File(directory);
	static int i=0;
	//ContactView contactview=new ContactView();

    public void setFile(ArrayList<Contact> array)
	{
		try
		{
			System.out.println(file.exists());
			if(file.exists())
			{
				i=saveFile(array);
			}
			else
			{
				FileWriter fw=new FileWriter(file);
				BufferedWriter br=new BufferedWriter(fw);
				br.write(" SL.NO , NAME , NUMBER\n");
				br.flush();
				br.close();
				i=saveFile(array);
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		
	}	

	public int saveFile(ArrayList<Contact> array)
	{
		try
		{
			FileWriter fwr=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fwr);
			for(Contact contact: array)
			{
				i++;
				bw.write((i)+","+contact.getName()+","+contact.getNumber()+"\n");
			}
			bw.flush();
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
		return i;
	}

	public void fileRead()
	{
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader  br=new BufferedReader(fr);
			while((br.readLine())!=null)
			{
				System.out.println(br.readLine());
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
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