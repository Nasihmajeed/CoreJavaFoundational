package com.lxisoft.market;
import com.lxisoft.market.*;
import com.lxisoft.repository.FileRepository;
import java.util.*;
import java.io.*;
import java.util.Comparator; 
public class StoreKeeper
{
	private static Scanner sc;	
	private List<Item> items = new ArrayList<Item>();
	private List<Stock> stock=new ArrayList<Stock>();
	int numbers;
	FileRepository fr=new FileRepository();
	public static Scanner getScanner()
	{
		if(sc == null)
		{
			sc = new Scanner(System.in);
			return sc;
		}
		else
		{
			return sc;
		}
	}			
	public void selectOption()
	{
		sc = this.getScanner();
		try
		{
			boolean isTest=false;
			do
			{
				isTest=false;
				System.out.println("\n1.Add Item \n2.Add Stock \n3.Display Item \n4.Display Stock \n5.Bill \n6.Exit");
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	setItem(); isTest=true;break;				
					case 2: setStock(); isTest=true;  break;
					case 3: getItem(); isTest=true; break;
					case 4: getCurrentStock(); isTest=true; break;
					case 5: printBill(); isTest=true; break;
					case 6: System.exit(0);break;
				}
			}while(isTest);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			e.printStackTrace();
		}	
	}
	public void setItem()
	{
		System.out.println("Name of Item");
		Item item=new Item();
		item.setName(sc.next());
		System.out.println("Item ID");
		item.setId(sc.nextInt());	
		System.out.println("Price of item");
		item.setPrice(sc.nextInt());
		items.add(item);
		fr.writeToFile(items);
			
	}
	public void itemGuaranty()
	{
		Item items=new Item();
		items.guarantiItem();
	}
	public List<Item> getItem()
	{
		System.out.println("\nDisplay the details of Item");
		itemGuaranty();
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Type","Price");
		for(int i=0;i<items.size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",items.get(i).getId(),items.get(i).getName(),items.get(i).getPrice());
		}
		return items;
	}	
	public List<Stock> setStock()
	{   
		getItem();
		System.out.println("\nIn which Item you want add quantity");
		String s=sc.next();
		for(int i=0;i<items.size();i++)
		{			
			if((items.get(i).getName()).equals(s))
		 	{
		 		System.out.println("How much item you want to add");
		 		stock.add(new Stock());
		 		stock.get(i).setQuantity(sc.nextInt());		 	 	
		 	}		 	
		 }
		 return stock;
	}
	public void getCurrentStock()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Item ID","Name","Quantity");
		for(int k=0;k<stock.size();k++)
		{			

			System.out.printf("%-20.30s %-20.30s %-20.30s%n",items.get(k).getId(),items.get(k).getName(),stock.get(k).getQuantity());	
		}	 		      	                                          	
	}
	public void printBill()
	{	
		getCurrentStock();
		boolean sample=false;	
		do{
			sample=false;
			
			System.out.println("\nSelect Your item");
			curentStock();
			System.out.println("Do you want More 1.No 2.Yes");
			int n=sc.nextInt();
			if (n==1)
			{
				break;
			}
			else
			{
				continue;
			}	
		}
		while(sample);		
	}	
	public List<Stock> curentStock()
	{
		for(int q=0;q<items.size();q++)
		{
			String d=sc.next();
			if((items.get(q).getName()).equals(d))				
			{
				System.out.println("How much items do you want");
				int qty=sc.nextInt();	
                int val=(stock.get(q).getQuantity()-numbers);
                stock.get(q).setQuantity(val);
                System.out.println("Current stock"+(stock.get(q).getQuantity()));				
				if(stock.get(q).getQuantity()>=numbers)
				{					
					// System.out.println("\nAvailable Stocks");
					// System.out.printf("%-20.30s %-20.30s %-20.30s%n","items Type","items Price","Quantity");
					// System.out.printf("%-20.30s %-20.30s %-20.30s%n",items.get(q).getName(),items.get(q).getPrice(),numbers);
					System.out.println("Total Bill Amount="+((items.get(q).getPrice())*(numbers)));
				}			
				else if(stock.get(q).getQuantity()<numbers)
				{	
					System.out.println("- Stock");
					break;
				}					
			}		
		}			
		return stock;				
	}
	public void printSortedItems()
	{		
		Collections.sort(items);
        System.out.println(items);
	}	
    public void printFileDetails()
	{
		fr.readFromFile();
	}
	public void deleteItem()
	{


	}
	public void searchItem()
	{

	}

}





	


