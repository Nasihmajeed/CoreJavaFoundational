package com.LxiSoft.HotelDetails;
import java.util.*;

public class Menu 
{
    Rice rice = new Rice();
    Dessert desert = new Dessert();

    ArrayList<Rice> rices = new ArrayList<Rice>();
    ArrayList<Dessert> desserts = new ArrayList<Dessert>();
    ArrayList<Food> fish = new ArrayList<Food>();
	ArrayList<Food> meat = new ArrayList<Food>();

    public void viewMenu()
    {
		this.setMenu();
		this.printRiceMenu();
        this.printDessertMenu();
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
		        this.getRice(numOfFood);
			}
            else if(add == 2)
            {
		        System.out.println("No. of Desserts");
		        int numOfFood = s.nextInt();
		        this.getDessert(numOfFood);
			}	
			
		    System.out.println("Add More? ?\n1.Yes\n0.No");
		    repeat = s.nextInt();
        }
        while(repeat!=0);
    }
    
    public void editMenu()
    {
		Scanner s = new Scanner(System.in);
		
		this.printRiceMenu();
		this.printDessertMenu();
		int back;
        do
        {
			System.out.println("\n** Edit ** \n1.Rice \n2.Dessert");
			int edit = s.nextInt();
            if(edit == 1)
            {
			    System.out.println("Enter Sl.No.");
			    int num = s.nextInt();
			    this.editRice(num);
			}
            else if(edit == 2)
            {
			    System.out.println("Enter Sl.No.");
			    int sn = s.nextInt();
			    this.editDessert(sn);
			
			}
			
			System.out.println("Edit More ?\n1.Yes\n0.No");
			back = s.nextInt();
        }
        while(back!=0);
    }
    
    public void deleteMenu()
    {
        Scanner s = new Scanner(System.in);
        
		this.printRiceMenu();
		this.printDessertMenu();
		int back;
        do
        {
			System.out.println("\n-- Delete -- \n1.Rice \n2.Dessert");
			int delete = s.nextInt();
            if(delete == 1)
            {
			    System.out.println("Enter Sl.No.");
			    int num = s.nextInt();
			    this.deleteRiceMenu(num);
			}
            else if(delete ==2)
            {
				System.out.println("Enter Sl.No.");
			    int num = s.nextInt();
			    this.deleteDessertMenu(num);
			}
			System.out.println("Delete More ?\n1.Yes\n0.No");
			back = s.nextInt();
        }
        while(back!=0);
	}


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

    public void setFishMenu(){
		fish.add(new Rice());
		fish.get(0).setName("Prawns");
		
		fish.add(new Rice());
		fish.get(1).setName("Salmon");
		
	}
	public void setMeatMenu(){
		meat.add(new Rice());
		meat.get(0).setName("Chicken");

		meat.add(new Rice());
		meat.get(1).setName("Beef");

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

    public void printFishMenu(){
		this.setFishMenu();
		System.out.println("+---------+-------------+");
		System.out.println("  S.No\t    Food    ");
		System.out.println("+---------+-------------+");
		System.out.println(fish.size());
		for(int i=0; i<fish.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+fish.get(i).getName()+"\t ");
		}
		System.out.println("+---------+-------------+");
	}
	public void printMeatMenu(){
		this.setMeatMenu();
		System.out.println("+---------+-------------+");
		System.out.println("  S.No\t    Food    ");
		System.out.println("+---------+-------------+");
		System.out.println(meat.size());
		for(int i=0; i<meat.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+meat.get(i).getName()+"\t ");
		}
		System.out.println("+---------+-------------+");
	}
    
    public void order()
    {
        Scanner s = new Scanner(System.in);
        int repeat;
        
        do
        {			
		    System.out.println("Place your order \n1.Rice \n2.Desserts");
            int choose = s.nextInt();
            
            switch(choose)
            {
                case 1:
                this.setMenu();
                this.printRiceMenu();
                
		        System.out.println("\nEnter Sl.No. to order");
                int order = s.nextInt();
                
		        System.out.println("Enter quantity");
                int number = s.nextInt();

                System.out.println("Choose special? \n1.Yes \n 0.No");
		        int special = s.nextInt();
                if(special==1)
                {
		    	    System.out.println("1.Fish \n2.Meat");
		    	    int types = s.nextInt();
		    	    if(types == 1){
		    		    String type = "Fish";
		    		    Rice rice = new Rice();
		    		    rice.foodType(Type.valueOf(type));
		    		
		    	    }
                    else if(types ==2)
                    {
		    		    String type = "Meat";
		    		    Rice rice = new Rice();
		    		    rice.foodType(Type.valueOf(type));
		    			
		    	    }
		        }
            
		        this.riceOrder(order,number);
                break;
                
                case 2:
                this.setMenu();
                this.printDessertMenu();
                
		        System.out.println("\nEnter Sl.No. to order");
                int ordr = s.nextInt();
                
		        System.out.println("Number of order ?");
                int orderNo = s.nextInt();
                
		        this.dessertOrder(ordr,orderNo);
                break;
                
		        default:
		        System.out.println("Invalid");
		    }
		    System.out.println("Anything more?\n1.Yes\n0.No");
		    repeat = s.nextInt();
        }
        while(repeat!=0);
    }
    
    public void payBill()
    {
		this.totalAmount();
    }
    
    int riceItemsPrice=0;
	int dessertItemsPrice=0;
    int total=0;
    
    public void riceOrder(int order, int quantity)
    {
		int prize = quantity * rices.get(order-1).getPrice();
		riceItemsPrice = riceItemsPrice + prize;	
    }
    
    public void dessertOrder(int order, int quantity)
    {
		int price = quantity * desserts.get(order-1).getPrice();
		dessertItemsPrice = dessertItemsPrice + price;	
    }
    
    public void totalAmount()
    {
		int totel = dessertItemsPrice + riceItemsPrice;
		total = total + totel;
		System.out.println("+--------------------------+");
		System.out.println("  Bill Amount\t: "+total);	
		System.out.println("+--------------------------+");
	}

}
