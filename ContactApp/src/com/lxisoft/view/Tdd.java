package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.util.*;


public class Tdd
{
	 public static void main(String[] args)
	{
		Controller con = new Controller();
		System.out.println("  \n \t \t -----CONTACT LIST------");
		do{
		System.out.println(" \n \n 1 = ADD NEW CONTACT \n 2 = SEARCH \n 3 = DISPLAY ");
		Scanner read= new Scanner(System.in);
		int n = read.nextInt();
		switch(n)
		{
			case 1 : addContact(con); break;
			case 2 : search();break;
			case 3 : display(con); break;
			default: System.out.println("INVALID CHOICE");
		}
		}while(true);
	}
	public static void addContact(Controller con)
	{
		
		System.out.println("ENTER NAME");
		Scanner read = new Scanner(System.in);
		String name= read.nextLine();
		System.out.println("ENTER NUMBER");
		String number=read.nextLine();
		con.addContact(name,number);
	}
	public static void search()
	{
		System.out.println("ENTER NAME");
		do{
		System.out.println(" \n \n 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU ");
		Scanner read= new Scanner(System.in);
		int n = read.nextInt();
		switch(n)
		{
			case 1 :edit(); break;
			case 2 : delete();break;
			case 3 :main(args) ; break;
			default: System.out.println("INVALID CHOICE");
		}
		} while(true);

	}
	public static void display(Controller con)
	{
		 for(int i=0;i<(con.getArraySize());i++)
		{ 	
		 System.out.println("\t"+con.array.get(i).getName()+"  "+con.array.get(i).getNumber());
		}
	}
	public static void edit()
	{

	}
	public static void delete()
	{

	}
		
}