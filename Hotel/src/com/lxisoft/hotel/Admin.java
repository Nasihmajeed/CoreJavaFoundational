package com.lxisoft.hotel;
import java.util.Scanner;

public class Admin{

	Menu menu=new Menu();

	
	String adminName;
	Scanner scanner=new Scanner(System.in);
	
	

	public void adminFunctions(){
		System.out.println("**********************************");
		System.out.println("\n \n  ***THE CURRENT MENU IS***");
		menu.printMenuDetails();
		boolean quit=false;

		do{

			System.out.println("\n \n ***ENTER YOUR DESIRED OPERATION TO PERFORM***");
			System.out.println("1.	ADD");
			System.out.println("2.	DELETE");
			System.out.println("3.	UPDATE");
			System.out.println("4.	TO EXIT");

			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
			
		
			switch(choice){
				case 1:
				menu.addDynamically();
				break;
				case 2:
				menu.removeDynamically();
				break;
				case 3:
				menu.modifyNameDynamically();
				break;
				case 4:
				System.out.println("Wrong input");
				default:
			

		
			}
		}
		 System.out.println("Exited from admin option");


		
		
	}
}
	
      


		
	
