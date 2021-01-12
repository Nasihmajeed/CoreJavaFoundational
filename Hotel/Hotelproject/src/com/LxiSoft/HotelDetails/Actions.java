package com.LxiSoft.HotelDetails;
import java.util.*;

public class Actions 
{
    Menu menu = new Menu();
    public void viewMenu()
    {
		menu.setMenu();
		menu.printRiceMenu();
        menu.printDessertMenu();
    }

    public void addMenu()
    {
		Scanner s = new Scanner(System.in);
		
		int repeat;
		do{
			System.out.println("\n++ Add ++\n1.Rice \n2.Dessert");
			int add = s.nextInt();
            if(add == 1)
            {	
		        System.out.println("\nNo. of Dishes");
		        int numOfFood = s.nextInt();
		        menu.getRice(numOfFood);
			}
            else if(add == 2)
            {
		        System.out.println("\nNo. of Desserts");
		        int numOfFood = s.nextInt();
		        menu.getDessert(numOfFood);
			}	
			
		    System.out.println("\nAdd More? ?\n1.Yes\n0.No");
		    repeat = s.nextInt();
        }
        while(repeat!=0);
    }
    
    public void editMenu()
    {
		Scanner s = new Scanner(System.in);
		
		menu.printRiceMenu();
		menu.printDessertMenu();
		int back;
        do
        {
			System.out.println("\n** Edit ** \n1.Rice \n2.Dessert");
			int edit = s.nextInt();
            if(edit == 1)
            {
			    System.out.println("\nEnter Sl.No.");
			    int num = s.nextInt();
			    menu.editRice(num);
			}
            else if(edit == 2)
            {
			    System.out.println("\nEnter Sl.No.");
			    int sn = s.nextInt();
			    menu.editDessert(sn);
			
			}
			
			System.out.println("\nEdit More ?\n1.Yes\n0.No");
			back = s.nextInt();
        }
        while(back!=0);
    }
    
    public void deleteMenu()
    {
        Scanner s = new Scanner(System.in);
        
		menu.printRiceMenu();
		menu.printDessertMenu();
		int back;
        do
        {
			System.out.println("\n-- Delete -- \n1.Rice \n2.Dessert");
			int delete = s.nextInt();
            if(delete == 1)
            {
			    System.out.println("\nEnter Sl.No.");
			    int num = s.nextInt();
			    menu.deleteRiceMenu(num);
			}
            else if(delete ==2)
            {
				System.out.println("\nEnter Sl.No.");
			    int num = s.nextInt();
			    menu.deleteDessertMenu(num);
			}
			System.out.println("\nDelete More ?\n1.Yes\n0.No");
			back = s.nextInt();
        }
        while(back!=0);
    }
    
    public void order()
    {
        Scanner s = new Scanner(System.in);
        int repeat;
        
        do
        {			
		    System.out.println("\nPlace your order \n1.Rice \n2.Desserts");
            int choose = s.nextInt();
            
            switch(choose)
            {
                case 1:
                menu.printRiceMenu();
                
		        System.out.println("\nEnter Sl.No. to order");
                int order = s.nextInt();
                
		        System.out.println("\nEnter quantity");
                int number = s.nextInt();

                System.out.println("\nNeed special on extra 100? \n1.Yes \n 0.No");
		        int special = s.nextInt();
                if(special==1)
                {
                    System.out.println(">--Specials--<");
                    System.out.println(">------------<");
                    System.out.println("  1.Fish \n  2.Meat");
                    System.out.println(">------------<");
		    	    int typ = s.nextInt();
		    	    if(typ == 1){
		    		    String type = "FISH";
		    		    Rice rice = new Rice();
		    		    rice.foodType(Type.valueOf(type));
		    		
		    	    }
		    	    else if(typ ==2){
		    		    String type = "MEAT";
		    		    Rice rice = new Rice();
		    		    rice.foodType(Type.valueOf(type));
		    			
		    	    }
		        }
            
		        menu.riceOrder(order,number,special);
                break;
                
                case 2:
                menu.printDessertMenu();
                
		        System.out.println("\nEnter Sl.No. to order");
                int ordr = s.nextInt();
                
		        System.out.println("\nEnter quantity");
                int orderNo = s.nextInt();
                
		        menu.dessertOrder(ordr,orderNo);
                break;
                
		        default:
		        System.out.println("\nInvalid");
		    }
		    System.out.println("\nAnything more?\n1.Yes\n0.No");
		    repeat = s.nextInt();
        }
        while(repeat!=0);
    }
    
    public void payBill()
    {
		menu.totalAmount();
    }

}
