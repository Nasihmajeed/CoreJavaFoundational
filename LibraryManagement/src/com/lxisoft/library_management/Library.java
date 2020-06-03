package com.lxisoft.library_management;
import com.lxisoft.repository.*;
import java.util.*;
public class Library
{
	private List<Book>bookList=new ArrayList<Book>();
	private Librarian librarian;
	private User user;

	public void setBookList(List<Book>bookList)
	{
		this.bookList=bookList;
	}
	public List<Book> getBookList()
	{
		return bookList;
	}

	public void setLibrarian(Librarian librarian)
	{
		this.librarian = librarian;
	}
	public Librarian getLibrarian()
	{
		return librarian;
	}

	public void setUser(User librarian)
	{
		this.user = user;
	}
	public User getUser()
	{
		return user;
	}

}