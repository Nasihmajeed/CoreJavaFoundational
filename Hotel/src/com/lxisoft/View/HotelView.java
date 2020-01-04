package com.lxisoft.View;
import com.lxisoft.Model.*;
import com.lxisoft.Repository.*;
import java.util.Scanner;
public class HotelView 
{		
	static Scanner sc=new Scanner(System.in);
	public HotelModel mhotel=new HotelModel();
	//FileRepository filerepo=new FileRepository();
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
	public void addBiriyani(SqlRepository sqlrepo)
	{		
		FoodModel biriyani=new Biriyani();
		System.out.println("Biriyani ID");
		biriyani.setId(sc.nextInt());
		System.out.println("Biriyani Type");
		biriyani.setFoodName(sc.next());
		System.out.println("Biriyani price");
		biriyani.setFoodPrice(sc.nextInt());	
		mhotel.setFoodList(biriyani);
		// filerepo.addwriter(mhotel);
		// filerepo.readFile();
		sqlrepo.insertQuery(mhotel);
	}
	public int biriyaniId()
	{
		System.out.println("Biriyani ID");
		int test=sc.nextInt();
		return test;
	}		
	public void addDosa(int d,SqlRepository sqlrepo)
	{
		FoodModel dosa=new Dosa();
		dosa.setId(d);		
		System.out.println("Dosa Type");
		dosa.setFoodName(sc.next());
		System.out.println("Dosa price");
		dosa.setFoodPrice(sc.nextInt());
	 	mhotel.setFoodList(dosa);
	 	sqlrepo.insertQuery(mhotel);
		// filerepo.addwriter(mhotel);
		// filerepo.readFile();
	}		
	public int dosaId()
	{
		System.out.println("Dosa ID");
		int d=sc.nextInt();
		return d;
	}
	public void addShake(int s,SqlRepository sqlrepo)
	{
		FoodModel shake=new Shake();
		shake.setId(s);
		System.out.println("Shake Type");
		shake.setFoodName(sc.next());
		System.out.println("Shake price");
		shake.setFoodPrice(sc.nextInt());				
		mhotel.setFoodList(shake);	
		// filerepo.addwriter(mhotel);
		// filerepo.readFile();
		sqlrepo.insertQuery(mhotel);
	}
	public int shakeId()
	{
		System.out.println("Shake ID");
		int s=sc.nextInt();
		return s;
	}			
	public void displayFood()
	{
		System.out.println("\nDisplay the details of Food");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Food Type","Food Price");
		for(int i=0;i<mhotel.getFoodList().size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(i).getId(),mhotel.getFoodList().get(i).getFoodName(),mhotel.getFoodList().get(i).getFoodPrice());
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
		StockModel stock=new StockModel();
		System.out.println("How much food you want to add");
		stock.setFoodQuantity(sc.nextInt());
		mhotel.setStockList(stock);
		// filerepo.addToStock(mhotel,stock);
		// filerepo.readToStock(mhotel);								
	}
	public void displayStock()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food ID","Food Name","Quantity");
		for(int k=0;k<mhotel.getStockList().size();k++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(k).getId(),mhotel.getFoodList().get(k).getFoodName(),mhotel.getStockList().get(k).getFoodQuantity());
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
		System.out.println("Current stock"+(mhotel.getStockList().get(q).getFoodQuantity()));
        checkStock(q);
	}
	public void checkStock(int q)
	{
		if(mhotel.getStockList().get(q).getFoodQuantity()>=mhotel.getItemQuantity())
        {
          	System.out.println("\nAvailable Stocks");
		  	System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food Type","Food Price","Quantity");
		 	System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(q).getFoodName(),mhotel.getFoodList().get(q).getFoodPrice(),mhotel.getItemQuantity());
		 	System.out.println("Total Bill Amount="+((mhotel.getFoodList().get(q).getFoodPrice())*(mhotel.getItemQuantity())));
		}	
        else if(mhotel.getStockList().get(q).getFoodQuantity()<mhotel.getItemQuantity())
		{	
		  	System.out.println("-Less Stock");
		  	System.out.println("Total Bill Amount="+((mhotel.getFoodList().get(q).getFoodPrice())*(mhotel.getItemQuantity())));

		}	
	}	
}	


