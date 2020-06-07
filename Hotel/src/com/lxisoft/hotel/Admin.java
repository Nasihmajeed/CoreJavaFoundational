package com.lxisoft.hotel;
import java.util.Scanner;

public class Admin{

	
	String adminName;
	Scanner scanner=new Scanner(System.in);
	Order order=new Order();
	Food food=new Food();



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
           food.createMenu();
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


		
	
