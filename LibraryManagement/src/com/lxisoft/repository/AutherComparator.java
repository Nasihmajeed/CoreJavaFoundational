package com.lxisoft.repository;
import com.lxisoft.librarymanagement.*;
import java.util.*;
import java.io.*;
public class AutherComparator implements Comparator<Book>
{
	public int compare(Book b,Book b1)
	{
		return b.getAuther().compareTo(b1.getAuther());
	}
}