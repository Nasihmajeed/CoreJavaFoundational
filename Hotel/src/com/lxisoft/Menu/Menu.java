package com.lxisoft.Menu;
import com.lxisoft.Item.Item;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.lxisoft.Food.Food;
import com.lxisoft.Drinks.Drinks;

public class Menu
{
public ArrayList<Item> itm=new ArrayList<Item>();
public ArrayList<Item> bill=new ArrayList<Item>();
public ArrayList<Item> qty=new ArrayList<Item>();
public ArrayList<Item> total=new ArrayList<Item>();
	public void addMenu()
	{
		itm.add(new Food());
		itm.get(0).setName("Pizza");
		itm.get(0).setRate(250);
		itm.add(new Food());
		itm.get(1).setName("Burger");
		itm.get(1).setRate(450);
		itm.add(new Food());
		itm.get(2).setName("Pancake");
		itm.get(2).setRate(150);
		itm.add(new Food());
		itm.get(3).setName("Cakes");
		itm.get(3).setRate(250);
		itm.add(new Drinks());
		itm.get(4).setName("Soda");
		itm.get(4).setRate(50);
		itm.add(new Drinks());
		itm.get(5).setName("Wine");
		itm.get(5).setRate(500);
		
	}
	public void menuPrint()
	{
	int i;
		System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
		for(i=0;i<itm.size();i++)
		{
			System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
			System.out.println("|---------------------------------------|");
			System.out.println("To order Drinks press-1\tTo order Food press-2\n");
			System.out.println("Enter your choice\n");
			Scanner scn=new Scanner(System.in);
			int choice=scn.nextInt();
			if (choice==1)
			{
			getDrinks();
			}
			if (choice==2)
			{
			getFood();
			}
	}
	public void adminPrint()
	{
	int i;
		System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
		for(i=0;i<itm.size();i++)
		{
			System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
			System.out.println("|---------------------------------------|");
			}
			
	public void getDrinks()
    {
    	
    	System.out.println("\nDrinks");
    	int i;
    	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----------------MENU-------------------|");
		for(i=0;i<itm.size();i++)
          {
          	if(itm.get(i) instanceof Drinks)
          	{
              System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");                
            }

            }
                          System.out.println("|---------------------------------------|");
            System.out.println("To see Food menu enter press-1\tTo order Food press-2\n");
            System.out.println("Enter your choice\n");
            Scanner scn=new Scanner(System.in);
            int choice=scn.nextInt();
            if(choice==1)
            {
            getFood();
            }
            if(choice==2)
            {
            orderFood();
            }
          }
   
    	public void getFood()
    {
    	
    	System.out.println("\nFood");
    	int i;
    	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----------------MENU-------------------|");
		for(i=0;i<itm.size();i++)
          {
          	if(itm.get(i) instanceof Food)
          	{
              System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
                                
            }

            }
                          System.out.println("|---------------------------------------|");
            System.out.println("To see Drinks menu enter press-1\tTo order  press-2\n");
            System.out.println("Enter your choice\n");
            Scanner scn=new Scanner(System.in);
            int choice=scn.nextInt();
            if(choice==1)
            {
            getDrinks();
            }
            if(choice==2)
            {
            orderFood();
            }
          }
	public void orderFood()
	{
	int sum=0;
	int i;
	int quantity=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("How many items do u prefer to order :");
	int itemNo=scn.nextInt();
		for(i=0;i<itemNo;i++)
		{
			System.out.println("\n"+"Please place your order by the corresponding food's index value :");
			int n=scn.nextInt();
			System.out.println("Enter the quantity :");
			int qtity=scn.nextInt();
			quantity=qtity*itm.get(n-1).getRate();
			sum=sum+quantity;
			int ratee=itm.get(n-1).getRate();
			String namee=itm.get(n-1).getName();
			bill.add(new Food());
			bill.get(n-1).setName(namee);
			bill.get(n-1).setRate(qtity);
			total.add(new Food());
			total.get(n-1).setRate(quantity);
		}
				System.out.println("The amount is"+"\n");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|                   Bill                        |");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|              The Sky Lounge                   |");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|---SlNo:---|----Item---|--Qty--|-"+"-----Rate-----|");
		for(i=0;i<itemNo;i++)
		{
		if(itm.get(i) instanceof Food)
          	{
 	 	System.out.println("|"+"\t"+(i+1)+"   |"+"\t"+bill.get(i).getName()+"\t"+"|"+bill.get(i).getRate()+"\t"+"|"+"\t"+total.get(i).getRate()+"\t"+"|");
		}
		}
				System.out.println("|-----------------------------------------------|");
				System.out.println("|The grand total is"+"\t"+"\t"+"\t"+sum+"\t"+"|");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|          *Thank you do visit us again*        |");
				System.out.println("|-----------------------------------------------|");
	}
	public void searchFood()
	{
	int i,m=0,number=1;
	int size=itm.size();
	System.out.println("Enter the foods name\n");
	Scanner scnr=new Scanner(System.in);
	String name=scnr.next();
	for(i=0;i<itm.size();i++)
	{
        if(name.equals(itm.get(i).getName()))
        {
        m=i;
	System.out.println("\n"+name+" is present at "+i+"\n");
	}
	}
	System.out.println("Press 1 to Remove \t Press 2 to Add\n");
	int n=scnr.nextInt();
	if(n==1)
	{
	itm.remove(m);
	System.out.println("The updated Menu is");
	System.out.println("|---------------------------------------|");
	System.out.println("|                Menu                   |");
	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
		for(i=0;i<itm.size();i++)
		{
		System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
		System.out.println("|---------------------------------------|");
	}
	if(n==2)
	{
	System.out.println("Enter the foods name\n");
	name=scnr.next();
	for(i=0;i<itm.size();i++)
	{
        if(name.equals(itm.get(i).getName()))
        {
        m=i;
	System.out.println("\n"+name+" is present at "+i+"\n");
	}
	}
	System.out.println("SlNo:"+"\t"+"Item"+"\t"+"Rate");
	System.out.println("\n"+(m)+"\t"+itm.get(m).getName()+"\t"+itm.get(m).getRate());
	System.out.println("Enter the name of the new item");
	String nam=scnr.next();
	itm.get(m).setName(nam);
	System.out.println("Enter the rate of the new item");
	int rat=scnr.nextInt();
	itm.get(m).setRate(rat);
	System.out.println("The updated Menu is");
	System.out.println("|---------------------------------------|");
	System.out.println("|                Menu                   |");
	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
		for(i=0;i<itm.size();i++)
		{
		System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
		System.out.println("|---------------------------------------|");
	}
	}
		}
	
	












