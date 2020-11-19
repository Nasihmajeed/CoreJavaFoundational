package com.lxisoft.Test;
import com.lxisoft.Library.Library;
import java.io.File;
import java.io.IOException;
public class Tdd
{
	public static void main (String[] args)
	{
	  Library li = new Library();
	  li.libraryDetails();
	  li.indexOfLibrary();
	  File file = new File("D:\\javaworks\\CoreJavaFoundational\\LibraryManagement\\scr\\com\\lxisoft\\File\\file.txt");
		try
		{
			if(file.createNewFile())
			{
				System.out.print("\n file got created ");
			}
			else
			{
				System.out.print("\n file got created ");
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
}