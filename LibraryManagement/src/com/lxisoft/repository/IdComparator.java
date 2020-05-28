package com.lxisoft.repository;
import com.lxisoft.library_management.*;
import java.util.*;
import java.io.*;
public class IdComparator implements Comparator<Book>
{
	public int compare(Book b,Book b1)
    {
    	return (Integer.parseInt(b.getId()))-(Integer.parseInt(b1.getId()));
    }
}