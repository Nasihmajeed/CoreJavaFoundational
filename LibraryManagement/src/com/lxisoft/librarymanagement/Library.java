package com.lxisoft.librarymanagement;
import java.util.*;
public class Library
{
	private String book;
	
	public void setBook(String book)
	{
		this.book = book;
	}
	public String getBook()
	{
		return book;
	}


	public int display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n             Enter your choice:");
		System.out.println("             1-Add\n             2-View\n             3-Sort\n             4-Exit");
		int ch=sc.nextInt();
		return ch;
	}	

	public void display(int ch)
    {
       
            ch=display();
       
    }
}