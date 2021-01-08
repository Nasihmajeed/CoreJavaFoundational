package com.LxiSoft.HotelDetails;
import java.util.*;

public class Edit 
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
		        System.out.println("No. of Dishes");
		        int numOfFood = s.nextInt();
		        menu.getRice(numOfFood);
			}
            else if(add == 2)
            {
		        System.out.println("No. of Desserts");
		        int numOfFood = s.nextInt();
		        menu.getDessert(numOfFood);
			}	
			
		    System.out.println("Add More? ?\n1.Yes\n0.No");
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
			    System.out.println("Enter Sl.No.");
			    int num = s.nextInt();
			    menu.editRice(num);
			}
            else if(edit == 2)
            {
			    System.out.println("Enter Sl.No.");
			    int sn = s.nextInt();
			    menu.editDessert(sn);
			
			}
			
			System.out.println("Edit More ?\n1.Yes\n0.No");
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
			    System.out.println("Enter Sl.No.");
			    int num = s.nextInt();
			    menu.deleteRiceMenu(num);
			}
            else if(delete ==2)
            {
				System.out.println("Enter Sl.No.");
			    int num = s.nextInt();
			    menu.deleteDessertMenu(num);
			}
			System.out.println("Delete More ?\n1.Yes\n0.No");
			back = s.nextInt();
        }
        while(back!=0);
	}


}
