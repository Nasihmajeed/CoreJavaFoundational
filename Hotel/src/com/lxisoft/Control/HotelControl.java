package com.lxisoft.Control;
import com.lxisoft.View.HotelView;
public class HotelControl 
{		
	HotelView view=new HotelView();		
	public void menuItem()
	{
		boolean test=false;
		do
		{
			test=false;
			int m=view.menu();
			switch (m)
			{
				case 1:	foodItem();	test=true;break;				
				case 2: addStock();test=true;  break;
				case 3: view.displayFood();test=true; break;	
				case 4: view.displayStock(); test=true; break;
				case 5: billPrint();test=true;  break;
				case 6: System.exit(0); break;	
			}
		}while(test);
			
	}
	public void foodItem()
	{
		boolean check=false;
		do	
		{
			check=false;
			int n=1;
			int i=view.selectFood(n);
			switch (i)
			{
	 			case 1: view.addBiriyani();check=true; break;
				case 2: view.addDosa();check=true; break;
				case 3: view.addShake();check=true; break;
				default:
			}
				
		}while(check);
		
	}
	public void addStock()
	{
		String c=view.selectStock();
		// view.mhotel.getStockList();
		for(int j=0;j<view.mhotel.getFoodList().size();j++)
		{
			if((view.mhotel.getFoodList().get(j).getFoodType()).equals(c))
		 	{
		 		view.addStockMethod();
		 	}
		}	
	}
	public void billPrint()
	{
		boolean sample;	
		do{
			view.displayStock();			
			view.addFoodUser();
			sample= repeatProcess();
		}
		while(sample);			
	}
	public boolean repeatProcess()
	{		
		boolean sample = false;
		int n=view.repeate();
		if (n==1)
		{
		sample = true;	
		}
		else if(n==2)
		{
			sample = false;
		}
		return sample;
	}
	public void addFoodUser()
	{
		view.displayStock();
		//int b=sc.nextInt();
		// for(int q=0;q<mhotel.getFoodList().size();q++)
		// {
		//  	if((mhotel.getFoodList().get(q).getId())==b)				
		//  	{
		//  		int f=view.addFoodUser();		
		//  		mhotel.setItemQuantity(f);
		//  	}	
		//  	int val=(mhotel.getStockList().get(q).getQuantity()-mhotel.getItemQuantity());
		//  	mhotel.getStockList().get(q).setQuantity(val);	        
  //           view.currentStock();		
		//}		
	}	
}	
	