package com.lxisoft.hotel;
import java.util.Scanner;

public class Admin{

	Menu menu=new Menu();

	
	String adminName;
	Scanner scanner=new Scanner(System.in);
	int x;
	
	

	public void adminFunctions(){
		System.out.println("**********************************");
		System.out.println("\n \n  ***THE CURRENT MENU IS***");
		menu.printMenuDetails();
		boolean quit=false;

		 int choice=0;
    	do
    	{

			System.out.println("\n \n ***ENTER YOUR DESIRED OPERATION TO PERFORM***");
			System.out.println("1.	ADD");
			System.out.println("2.	DELETE");
			System.out.println("3.	UPDATE");
			
			System.out.println("0.	TO EXIT");

			System.out.println("Enter your choice");
			 choice=scanner.nextInt();


			
			
		
				if(choice==1)
				{
				menu.addDynamically();
				}
				if(choice==2)
				{
				menu.removeDynamically();
				}
				if(choice==3)
				{
				menu.modifyNameDynamically();
				}
				
				else if (choice==0)
        		{
        	 	System.out.println(" ");
        		}
    		}
    		while(choice>0);
      
				
			

			
			}
		
	}
		

		
		


		
		
	

	
      


		
	
