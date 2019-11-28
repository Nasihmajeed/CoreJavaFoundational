package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;
public interface Repository
{
	public  int setId();
	public  ArrayList fileRead();
	public void fileWrite(Contact contact, boolean isTrue);
	public void search();
	public int getArraysize();
	public void clearFile();
}