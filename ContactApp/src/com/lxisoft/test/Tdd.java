package com.lxisoft.test;
import com.lxisoft.ContactApp.*;
import java.util.Scanner;
public class Tdd
{ 
   

 public static void main (String args[])
 {
 	int x;
	System.out.println(" \t \t ----CONTACT LIST------- \n");
   	Contactlist contactlist = new Contactlist();
    System.out.println("-----ENTER CHOICE------- \n 1 = Add new contact \n 2 = Search ");
    Scanner read= new Scanner(System.in);
    x=read.nextInt();
    switch(x)
    {
    	case 1 : contactlist.insertion();
    	case 2 : contactlist.search();
        //case 3 : contactlist.display();
    	//default : System.out.println("----INVALID CHOICE-------");
    }
 }
}