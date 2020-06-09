package com.lxisoft.hotel;
import java.util.Scanner;

public class Admin{

	Menu menu=new Menu();

	
	String adminName;
	Scanner scanner=new Scanner(System.in);
	
	}
	public void editMenuDetails(){
	 System.out.println(" \n\n1. Create \n\n2.Update \n\n3.Delete \n\n3.Rename");
  
	 int choice=0;
    do
    {
      System.out.println("\n________________________");
       
        choice=scanner.nextInt();
      
        if(choice==1)
        {
           
        }
         if(choice==2)
        {
            //code to edit
        }
        if (choice==3)
        {
        	 //code to delete
        }
        if (choice==4)
        {
        	//code to rename
        }
        else if(choice==0)
        {
        	System.out.println(" ");
        }
    }
    while(choice>0);
      
}


		
	
