package com.LxiSoft.HotelDetails;
import java.util.*;
public class User{
	int order;
	int numberOfPlates;
	
	Menu menu = new Menu();
	public void orderFood(){
		Scanner s = new Scanner(System.in);
		int repeat;
		menu.setMenu();
		do{			
		    menu.printMenu();
		    System.out.println("\nSelect your order with the serial number : ");
		    order = s.nextInt();
		    System.out.println("Number of order ?");
		    numberOfPlates = s.nextInt();
		    System.out.println("Do you need any curry ? \n1.Yes \n 0.No");
		    int curry = s.nextInt();
		    if(curry==1){
		    	System.out.println("1.Veg \n2.Non Veg");
		    	int typ = s.nextInt();
		    	if(typ == 1){
		    		String type = "VEG";
		    		Eatables eat = new Eatables();
		    		eat.foodType(Type.valueOf(type));
		    		int more;
		    		do{			
			            
		                System.out.println("\nSelect your order with the serial number : ");
		                int ordr = s.nextInt();
		                System.out.println("How many plates ");
		                int num = s.nextInt();
		                menu.getVegOrder(ordr,num);
		                System.out.println("Do you need anything else \n1.Yes \n0.No");
		                more = s.nextInt();
		            }while(more != 0);
		    	}
		    	else if(typ ==2){
		    		String type = "NONVEG";
		    		Eatables eat = new Eatables();
		    		eat.foodType(Type.valueOf(type));
		    		int more;
		    		do{			
			            
		                System.out.println("\nSelect your order with the serial number : ");
		                int ordr = s.nextInt();
		                System.out.println("How many plates ");
		                int num = s.nextInt();
		                menu.getNonOrder(ordr,num);
		                System.out.println("Do you need anything else \n1.Yes \n0.No");
		                more = s.nextInt();
		            }while(more != 0);	
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