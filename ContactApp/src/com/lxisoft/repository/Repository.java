package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;
public interface Repository
{
	public void connection();
	public void write(Contact contact, boolean isTrue);

	// public  int setId();
	// public  ArrayList read();
	// public void write(Contact contact, boolean isTrue);
	// public void search();
	// public int getArraysize();
	// public void clear();

}