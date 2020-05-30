package com.lxisoft.library_management;
import com.lxisoft.repository.*;
import java.util.*;
public class Library
{
	// private String book;
	
	// public void setBook(String book)
	// {
	// 	this.book = book;
	// }
	// public String getBook()
	// {
	// 	return book;
	// }
	List<Book>bookList=new ArrayList<Book>();
	private Librarian librarian;
	public void setLibrarian(Librarian librarian)
	{
		this.librarian = librarian;
	}
	public String getLibrarian()
	{
		return librarian;
	}

}