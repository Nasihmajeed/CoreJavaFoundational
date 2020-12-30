package com.LxiSoft.HotelDetails;
import java.util.*;
public class Admin{
	Menu menu = new Menu();
	public void viewMenu(){
		//System.out.println("Under Construction");
		menu.setMenu();
		menu.printMenu();
	}
	public void addToMenu(){
		Scanner s = new Scanner(System.in);
		//menu.setMenu();
		int repeat;
		do{
			System.out.println("What would you like to add ?\n1.Eatables \n2.Drinks");
			int add = s.nextInt();
			if(add == 1){
				//Scanner s = new Scanner(System.in);
		        System.out.println("How many items need to be added");
		        int numOfFood = s.nextInt();
		        menu.getEatables(numOfFood);
			}
			else if(add == 2){
				//Scanner s = new Scanner(System.in);
		        System.out.println("How many items need to be added");
		        int numOfFood = s.nextInt();
		        menu.getDrinks(numOfFood);
			}	
			/*Scanner s = new Scanner(System.in);
		    System.out.println("How many items need to be added");
		    int numOfFood = s.nextInt();
		    menu.getMenu(numOfFood);
		    System.out.println("The new Menu ");		    
		    menu.printMenu();*/
		    System.out.println("Do you need to add anything else ?\n1.Yes\n0.No");
		    repeat = s.nextInt();
		}while(repeat!=0);
	}
	public void editTheMenu(){
		Scanner s = new Scanner(System.in);
		menu.printMenu();
		int back;
		do{
			System.out.println("Which item need to be editted ?\n1.Eatables \n2.Drinks");
			int edit = s.nextInt();
			if(edit == 1){
				//Scanner s = new Scanner(System.in);
			    System.out.println("Enter the Serial number of the food to be editted");
			    int num = s.nextInt();
			    menu.editEatables(num);
			}
			else if(edit == 2){
				//Scanner s = new Scanner(System.in);
			    System.out.println("Enter the Serial number of the food to be editted");
			    int sn = s.nextInt();
			    menu.editDrinks(sn);
			
			}
			/*Scanner s = new Scanner(System.in);
			System.out.println("Enter the Serial number of the food to be editted");
			int num = s.nextInt();
			menu.editMenu(num);*/
			System.out.println("Do you need to edit anything else ?\n1.Yes\n0.No");
			back = s.nextInt();
		}while(back!=0);
	}
	public void deleteTheMenu(){
		menu.printMenu();
		int back;
		do{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Serial number of the food to be Deleted");
			int num = s.nextInt();
			menu.deleteMenu(num);
			System.out.println("Do you need to delete anything else ?\n1.Yes\n0.No");
			back = s.nextInt();
		}while(back!=0);
	}
}