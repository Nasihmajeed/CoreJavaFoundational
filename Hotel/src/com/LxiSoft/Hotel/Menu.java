package com.LxiSoft.Hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu
{	

    Scanner scnr=new Scanner(System.in);

    public void printMenu()
{
    
        System.out.println("-----------------------------------------------------------------------"); 
        System.out.println("\t\t \t Menu \t");
        System.out.println("-----------------------------------------------------------------------");                                      
        
    ArrayList<String> list=new ArrayList<String>();
    list.add("tea");
    list.add("coffee");
    list.add("lime");
    list.add("juice");
    System.out.println(list);
}
}

    
    

