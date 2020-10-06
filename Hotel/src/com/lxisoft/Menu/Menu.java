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
			int quant=scn.nextInt();
			quantity=quantity*itm.get(i).getRate();
			sum=sum+itm.get(quant-1).getRate();
			int ratee=itm.get(quant-1).getRate();
			String namee=itm.get(quant-1).getName();
			bill.add(new Item());
			bill.get(quant-1).setName(namee);
			bill.get(quant-1).setRate(ratee);
			qty.add(new Item());
			qty.get(quant-1).setRate(ratee);
			total.add(new Item());
			total.get(quant-1).setRate(quantity);
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
			System.out.println("|"+"\t"+(i+1)+"   |"+"\t"+bill.get(i).getName()+"\t"+"|"+qty.get(i).getRate()+"\t"+"|"+"\t"+total.get(i).getRate()+"\t"+"|");
		}
				System.out.println("|-----------------------------------------------|");
				System.out.println("|The grand total is"+"\t"+"\t"+"\t"+sum+"\t"+"|");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|          *Thank you do visit us again*        |");
				System.out.println("|-----------------------------------------------|");
	}
}





















