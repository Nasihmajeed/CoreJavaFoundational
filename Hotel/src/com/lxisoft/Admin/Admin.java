package com.lxisoft.Admin;
import com.lxisoft.Menu.Menu;
import com.lxisoft.Item.Item;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Admin
{
public Menu menu=new Menu();
	public void adminConsole()
	{
	System.out.println("\nPress \n1.Add a food Item\n2.Remove a food Item\n3.Update a food Item\n4.EXit");
	Scanner scn=new Scanner(System.in);
	int k=scn.nextInt();
		if(k==1)
		{	
			menu.addMenu();
			this.addFood(menu.itm);
		}
		if(k==2)
		{
			menu.addMenu();
			this.deleteFood(menu.itm);
		}
		else if(k==3)
		{
			menu.addMenu();
			this.updateFood(menu.itm);
		}
	}
	public void addFood(ArrayList<Item> itm)
	{
	int i;
	int l=itm.size();
	int u=l+1;
	Scanner scnr=new Scanner(System.in);
	System.out.println("Enter name of the food:");
	String name=scnr.next();
	System.out.println("Enter rate of the food:");
	int price=scnr.nextInt();
	itm.add(new Item());
	itm.get(u).setName(name);
	itm.get(u).setRate(price);
	System.out.println("The updated Menu is");
	System.out.println("|---------------------------------------|");
	System.out.println("|                Menu                   |");
	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----SlNo:---"+"----Item-------"+"---Rate----|");
		for(i=0;i<u+1;i++)
		{
		System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
		System.out.println("|---------------------------------------|");
	}
	public void deleteFood(ArrayList<Item> itm)
	{
	int i;
	int l=itm.size();
	itm.add(new Item());
	System.out.println("Enter the index value of the food item you want to remove:");
	Scanner scnr=new Scanner(System.in);
	int nmr=scnr.nextInt();
	System.out.println(itm.get(nmr-1).getName()+" has been removed from the list");
	itm.remove(nmr-1);
	System.out.println("The updated Menu is");
	System.out.println("|---------------------------------------|");
	System.out.println("|                Menu                   |");
	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
		for(i=0;i<l-1;i++)
		{
		System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
		System.out.println("|---------------------------------------|");
	}
	public void updateFood(ArrayList<Item> itm)
	{
	int i;
	int o;
	o=itm.size();
	itm.add(new Item());
	System.out.println("Enter the index value of the food item you want to update:");
	Scanner scnr=new Scanner(System.in);
	int nm=scnr.nextInt();
	System.out.println("SlNo:"+"\t"+"Item"+"\t"+"Rate");
	System.out.println("\n"+(nm)+"\t"+itm.get(nm-1).getName()+"\t"+itm.get(nm-1).getRate());
	System.out.println("Enter the name of the new item");
	String nam=scnr.next();
	itm.get(nm-1).setName(nam);
	System.out.println("Enter the rate of the new item");
	int rat=scnr.nextInt();
	itm.get(nm-1).setRate(rat);
	System.out.println("The updated Menu is");
	System.out.println("|---------------------------------------|");
	System.out.println("|                Menu                   |");
	System.out.println("|---------------------------------------|");
	System.out.println("|            The Sky Lounge             |");
	System.out.println("|---------------------------------------|");
	System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
		for(i=0;i<o;i++)
		{
		System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
		}
		System.out.println("|---------------------------------------|");
	}
}

