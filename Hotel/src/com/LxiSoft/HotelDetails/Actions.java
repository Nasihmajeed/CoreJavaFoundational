package com.LxiSoft.HotelDetails;
import java.util.*;
public class Actions{
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
		//menu.setMenu();
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
		//menu.setMenu();
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


	public void orderFood(){
		Scanner s = new Scanner(System.in);
		int repeat;
		//menu.setMenu();
		do{			
		    menu.printMenu();
		    System.out.println("\nSelect your order with the serial number : ");
		    int order = s.nextInt();
		    System.out.println("Number of order ?");
		    int numberOfPlates = s.nextInt();
		    System.out.println("Do you need any curry ? \n1.Yes \n 0.No");
		    int curry = s.nextInt();
		    if(curry==1){
		    	System.out.println("1.Veg \n2.Non Veg");
		    	int typ = s.nextInt();
		    	if(typ == 1){
		    		String type = "VEG";
		    		Eatables eat = new Eatables();
		    		eat.foodType(Type.valueOf(type));
		    		
		    	}
		    	else if(typ ==2){
		    		String type = "NONVEG";
		    		Eatables eat = new Eatables();
		    		eat.foodType(Type.valueOf(type));
		    			
		    	}
		    }
		    menu.getOrder(order,numberOfPlates);
		    System.out.println("Do you like to order anything else ?\n1.Yes\n0.No");
		    repeat = s.nextInt();
		}while(repeat!=0);
	}
	public void payBill(){
		System.out.println("The total amount : ");
		System.out.println(menu.totalPrize);
	}
}