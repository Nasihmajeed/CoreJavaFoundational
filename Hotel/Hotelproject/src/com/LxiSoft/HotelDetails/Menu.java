package com.LxiSoft.HotelDetails;
import java.util.*;

public class Menu 
{
    Rice rice = new Rice();
    Dessert desert = new Dessert();

    ArrayList<Rice> rices = new ArrayList<Rice>();
    ArrayList<Dessert> desserts = new ArrayList<Dessert>();

    public void setMenu()
    {
        rices.add(new Rice());
		rices.get(0).setName("Meals");
		rices.get(0).setPrice(50);

		rices.add(new Rice());
		rices.get(1).setName("Mandhi");
		rices.get(1).setPrice(110);
		
		desserts.add(new Dessert());
		desserts.get(0).setName("Gelato");
		desserts.get(0).setPrice(60);

		desserts.add(new Dessert());
		desserts.get(1).setName("C.Cake");
		desserts.get(1).setPrice(70);
    }

    public void getRice(int n)
    {
        int i,j;
        j = rices.size();
        Scanner s = new Scanner(System.in);

        for(i=0; i<n; i++)
        {
            System.out.println("Enter new Dish");
		    String foodName = s.next();
		    
		    System.out.println("Enter Price");
            int price = s.nextInt();
            
		    rices.add(new Rice());		    
		    rices.get(j).setName(foodName);
		    rices.get(j).setPrice(price);
		    j++;
        }
        System.out.println("\n--- Updated Menu ---");
		this.printRiceMenu();
    }

    public void getDessert(int n)
    {
        int i,k;
        k = desserts.size();
        Scanner s = new Scanner(System.in);

        for(i=0; i<n; i++)
        {
			System.out.println("Enter new Dessert");
		    String dessertName = s.next();

		    System.out.println("Enter the price");
            int pric = s.nextInt();
            
		    desserts.add(new Dessert());		    
		    desserts.get(k).setName(dessertName);
		    desserts.get(k).setPrice(pric);
		    k++;
		}
		System.out.println("\n--- Updated Menu ---");
		this.printDessertMenu();
    }

    public void editRice(int l)
    {
		Scanner s = new Scanner(System.in);	
		System.out.println("Update Price");
        int newPrice = s.nextInt();
        
		rices.get(l-1).setPrice(newPrice);
		System.out.println("\n--- Updated Menu ---");
		this.printRiceMenu();
    }
    
	public void editDessert(int l){
		Scanner s = new Scanner(System.in);	
		System.out.println("Update Price");
        int newPric = s.nextInt();
        
		desserts.get(l-1).setPrice(newPric);
		System.out.println("\n--- Updated Menu ---");
		this.printDessertMenu();
    }
    
    public void deleteRiceMenu(int l)
    {
		Scanner s = new Scanner(System.in);
        rices.remove(l-1);
        
		System.out.println("\n--- Updated Menu ---");
		this.printRiceMenu();
    }
    
    public void deleteDessertMenu(int l)
    {
		Scanner s = new Scanner(System.in);
        desserts.remove(l-1);
        
		System.out.println("\n--- Updated Menu ---");
		this.printDessertMenu();
    }
    
    public void printRiceMenu()
    {
        System.out.println("\n>----------------------------------------<");
		System.out.println(">----------------- RICE -----------------<");
		System.out.println(">-------------+-------------+------------<");
		System.out.println("    Sl.No          Rice          Price    ");
		System.out.println(">-------------+-------------+------------<");
        
        for(int i=0; i<rices.size(); i++)
        {
		    System.out.println("      "+(i+1)+"\t         "+rices.get(i).getName()+"\t          "+rices.get(i).getPrice()+"    \t");
		}
		System.out.println(">-------------+-------------+------------<");
    }
    
    public void printDessertMenu()
    {
        System.out.println("\n>----------------------------------------<");
        System.out.println(">---------------- DESSERT ---------------<");
		System.out.println(">-------------+-------------+------------<");
		System.out.println("     Sl.No        Dessert        Price     ");
		System.out.println(">-------------+-------------+------------<");
        
        for(int i=0; i<desserts.size(); i++)
        {
		    System.out.println("      "+(i+1)+"\t         "+desserts.get(i).getName()+"\t          "+desserts.get(i).getPrice()+"    \t");
		}
		System.out.println(">-------------+-------------+------------<");
    }
    
    

}
