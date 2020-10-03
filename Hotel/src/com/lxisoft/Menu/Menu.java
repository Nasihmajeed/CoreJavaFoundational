package com.lxisoft.Menu;
import com.lxisoft.Item.Item;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Menu extends Item
{
public ArrayList<Item> itm=new ArrayList<Item>();
public ArrayList<Item> bill=new ArrayList<Item>();
public ArrayList<Item> qty=new ArrayList<Item>();
public ArrayList<Item> total=new ArrayList<Item>();
	public void addMenu()
	{
		itm.add(new Item());
		itm.get(0).setName("Pizza");
		itm.get(0).setRate(250);
		itm.add(new Item());
		itm.get(1).setName("Burger");
		itm.get(1).setRate(450);
		itm.add(new Item());
		itm.get(2).setName("Pancake");
		itm.get(2).setRate(150);
		itm.add(new Item());
		itm.get(3).setName("Cakes");
		itm.get(3).setRate(250);
		itm.add(new Item());
		itm.get(4).setName("Soda");
		itm.get(4).setRate(50);
		itm.add(new Item());
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
	}
	public void orderFood()
	{
	int sum=0;
	int i;
	int c=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("How many items do u prefer to order :");
	int m=scn.nextInt();
		for(i=0;i<m;i++)
		{
			System.out.println("\n"+"Please place your order by the corresponding food's index value :");
			int n=scn.nextInt();
			System.out.println("Enter the quantity :");
			int v=scn.nextInt();
			c=v*itm.get(i).getRate();
			sum=c+itm.get(n-1).getRate();
			int ratee=itm.get(n-1).getRate();
			String namee=itm.get(n-1).getName();
			bill.add(new Item());
			bill.get(n-1).setName(namee);
			bill.get(n-1).setRate(ratee);
			qty.add(new Item());
			qty.get(n-1).setRate(v);
			total.add(new Item());
			total.get(n-1).setRate(c);
		}
				System.out.println("The amount is"+"\n");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|                   Bill                        |");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|              The Sky Lounge                   |");
				System.out.println("|-----------------------------------------------|");
				System.out.println("|---SlNo:---|----Item---|--Qty--|-"+"-----Rate-----|");
		for(i=0;i<m;i++)
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





















