package com.lxisoft.hotel;
import java.util.Scanner;

public class Admin{

	
	String adminName;
	Scanner scanner=new Scanner(System.in);
	Order order=new Order();
	Food food=new Food();

	public void showOperations(){
		System.out.println(" \n\n1. Create \n\n2.Update \n\n3.Delete \n\n3.Rename");

	}
	public void editOrderDetails(){
	 System.out.println(" \n\n1. Create \n\n2.Update \n\n3.Delete \n\n3.Rename");
  
	 int choice=0;
    do
    {
      System.out.println("\n________________________");
       
        choice=scanner.nextInt();
      
       /* if(choice==1)
        {
           item.editMenu();
        }
         if(choice==2)
        {
            item.editMenu();
        }
        else if (choice==0)
        {
        	 System.out.println(" ");
        }*/
    }
    while(choice>0);
      
}

}
		
	
