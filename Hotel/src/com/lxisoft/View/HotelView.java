package com.lxisoft.View;
import com.lxisoft.Model.*;
import com.lxisoft.Repository.FileRepository;
import java.util.Scanner;
public class HotelView 
{		
	static Scanner sc=new Scanner(System.in);
	public HotelModel mhotel=new HotelModel();
	public StockModel stock=new StockModel();
	FileRepository filerepo=new FileRepository();
	public int menu()
	{
		System.out.println("\n\tMENU  \n1.Add Food \n2.Add Stock \n3.Display Food \n4.Display Stock \n5.Add food User \n6.Exit  \n ");
		int u=sc.nextInt();	
		return u;
	}		
	public int selectFood(int n)
	{	
		System.out.println("\nSelect food");
		System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n 4.Exit"); 																																																																																																																																																															
		int item=sc.nextInt();
		return item;
	}			
	public void addBiriyani()
	{		

		//System.out.println("Which type biriyani you want to add");
		if(mhotel.getFoodList().size()==0)
		{
			FoodModel biriyani=new Biriyani();
			System.out.println("Biriyani ID");
			biriyani.setId(sc.nextInt());
			System.out.println("Type");
			biriyani.setFoodType(sc.next());
			System.out.println("food price");
			biriyani.setFoodPrice(sc.nextInt());	
			mhotel.setFoodList(biriyani);
			filerepo.addwriter(mhotel);

		}
		else if(mhotel.getFoodList().size()>0) 
		{
			boolean check=true;
			System.out.println("Biriyani ID");
			int test=sc.nextInt();
			for(int i=0;i<mhotel.getFoodList().size();i++)
		 	{
		 		if(test==mhotel.getFoodList().get(i).getId())
				{
					check=false;
					System.out.println("Already exist");	
				}				
					
			}
			if(check)
			{
				FoodModel biriyani=new Biriyani();
				// System.out.println("Biriyani ID");
				biriyani.setId(test);
				System.out.println("Type");
				biriyani.setFoodType(sc.next());
				System.out.println("food price");
				biriyani.setFoodPrice(sc.nextInt());	
				mhotel.setFoodList(biriyani);
				filerepo.addwriter(mhotel);
				//filerepo.readFile();
			}
		}	

	}
	public void addDosa()
	{
		System.out.println("Which type dosa you want to add");				
		FoodModel dosa=new Dosa();
		dosa.setFoodType(sc.next());
		System.out.println("food price");
		dosa.setFoodPrice(sc.nextInt());
	 	System.out.println("Dosa ID");
		dosa.setId(sc.nextInt());						
		mhotel.setFoodList(dosa);
		filerepo.addwriter(mhotel);
		//filerepo.readFile();

	}
	public void addShake()
	{
		System.out.println("Which type shake you want to add");
		FoodModel shake=new Shake();
		shake.setFoodType(sc.next());
		System.out.println("food price");
		shake.setFoodPrice(sc.nextInt());				
		System.out.println("Shake ID");
		shake.setId(sc.nextInt());			
		mhotel.setFoodList(shake);	
		filerepo.addwriter(mhotel);
		//filerepo.readFile();

	} 
	public void displayFood()
	{
		System.out.println("\nDisplay the details of Food");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Food Type","Food Price");
		for(int i=0;i<mhotel.getFoodList().size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(i).getId(),mhotel.getFoodList().get(i).getFoodType(),mhotel.getFoodList().get(i).getFoodPrice());
		}		
	}
	public int selectStock()
	{   
		displayFood();
		System.out.println("\nIn which food you want add quantity");		
		int s=sc.nextInt();
		return s;
	}
	public void addStockMethod()
	{	
		System.out.println("How much food you want to add");
		mhotel.setStockList(stock);
		stock.setQuantity(sc.nextInt());
		filerepo.addToStock(mhotel);
		//filerepo.readToStock();						
	}
	public void displayStock()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food ID","Food Name","Quantity");
		for(int k=0;k<mhotel.getStockList().size();k++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(k).getId(),mhotel.getFoodList().get(k).getFoodType(),mhotel.getStockList().get(k).getQuantity());
		}	 		      	                                          	
	}
	public int repeate()
	{
		System.out.println("Do you want More 1.Yes 2.No");
		int n=sc.nextInt();
		return n;
	}		
	
	public int addFoodUser()
	{
		System.out.println("Which food you want");
		int b=sc.nextInt();
		return b;
	}
	public int addFoodUserMethod()
	{
		System.out.println("How much food do you want");		
		int f=(sc.nextInt());
		return f;
		 	
	}
	public void currentStock(int q)	
	{
		System.out.println("Current stock"+(mhotel.getStockList().get(q).getQuantity()));
        checkStock(q);
	}
	public void checkStock(int q)
	{
		if(mhotel.getStockList().get(q).getQuantity()>=mhotel.getItemQuantity())
        {
          	System.out.println("\nAvailable Stocks");
		  	System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food Type","Food Price","Quantity");
		 	System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(q).getFoodType(),mhotel.getFoodList().get(q).getFoodPrice(),mhotel.getItemQuantity());
		 	System.out.println("Total Bill Amount="+((mhotel.getFoodList().get(q).getFoodPrice())*(mhotel.getItemQuantity())));
		}	
        else if(mhotel.getStockList().get(q).getQuantity()<mhotel.getItemQuantity())
		{	
		  	System.out.println("-Less Stock");
		  	System.out.println("Total Bill Amount="+((mhotel.getFoodList().get(q).getFoodPrice())*(mhotel.getItemQuantity())));

		}	
	}
	
}	


