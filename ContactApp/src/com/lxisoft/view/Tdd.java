package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.util.*;


public class Tdd
{
	 public static void main(String[] args)
	{
		System.out.println("  \n \t \t -----CONTACT LIST------ \n \n 1 = ADD NEW CONTACT \n 2 = SEARCH \n 3 = DISPLAY ");
		
		Scanner read= new Scanner(System.in);
		int n = read.nextInt();
		switch(n)
		{
			case 1 : addContact(); break;
			case 2 : search();break;
			case 3 : display(); break;
			default: System.out.println("INVALID CHOICE");
		}
	}
	public static void addContact()
	{
		Controller con = new Controller();
		System.out.println("ENTER NAME");
		Scanner read = new Scanner(System.in);
		String name= read.nextLine();
		System.out.println("ENTER NUMBER");
		String number=read.nextLine();
		con.addContact(name,number);
	}
	public static void search()
	{
			
	}
	public static void display()
	{


	}
		
}