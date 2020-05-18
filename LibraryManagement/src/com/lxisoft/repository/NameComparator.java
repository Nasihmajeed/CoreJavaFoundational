package com.lxisoft.repository;
import com.lxisoft.librarymanagement.*;
import java.util.*;
import java.io.*;
public class NameComparator implements Comparator<Book>
{
	public int compare(Book b,Book b1)
	{
		return b.getName().compareTo(b1.getName());
	}
}