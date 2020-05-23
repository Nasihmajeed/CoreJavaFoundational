package com.lxisoft.librarymanagement;
import com.lxisoft.repository.*;
import java.util.*;
public class Library
{
	FileRepo repo=new FileRepo();
	private String book;
	
	public void setBook(String book)
	{
		this.book = book;
	}
	public String getBook()
	{
		return book;
	}
}