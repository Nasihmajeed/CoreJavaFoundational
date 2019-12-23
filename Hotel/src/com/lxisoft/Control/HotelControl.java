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
	 			case 1: addBiriyaniId();check=true; break;
				case 2: addDosaId();check=true; break;
				case 3: addShakeId();check=true; break;
				default:
			}				
		}while(check);		
	}
	public void addStock()
	{
		int c=view.selectStock();
		for(int j=0;j<view.mhotel.getFoodList().size();j++)
		{
			if((view.mhotel.getFoodList().get(j).getId())==c)
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
			foodBillUser();
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
	public void foodBillUser()
	{
		int b=view.addFoodUser();
		for(int q=0;q<view.mhotel.getFoodList().size();q++)
		{
		 	if((view.mhotel.getFoodList().get(q).getId())==b)				
		 	{
		 		int f=view.addFoodUserMethod();		
		 		view.mhotel.setItemQuantity(f);
		 	}	
		 	int val=(view.mhotel.getStockList().get(q).getQuantity()-view.mhotel.getItemQuantity());
		 	view.mhotel.getStockList().get(q).setQuantity(val);	        
            view.currentStock(q);	
		}		
	}
	public void addBiriyaniId()
	{
		if(view.mhotel.getFoodList().size()==0)
		{
			view.addBiriyani();
		}
		else if(view.mhotel.getFoodList().size()>0) 
		{
			boolean check=true;
			int t=view.biriyaniId();
			for(int i=0;i<view.mhotel.getFoodList().size();i++)
		 	{
		 		if(t==view.mhotel.getFoodList().get(i).getId())
				{
					check=false;
					System.out.println("Already exist");	
				}						
			}
			if(check)
			{
				view.addBiriyani();
			}
		}
	}	
	public void addDosaId()
	{
		if(view.mhotel.getFoodList().size()==0)
		{
			view.addDosa();			
		}
		else if(view.mhotel.getFoodList().size()>0) 
		{
			boolean chk=true;
			int a=view.dosaId();
			for(int i=0;i<view.mhotel.getFoodList().size();i++)
		 	{
		 		if(a==view.mhotel.getFoodList().get(i).getId())
				{
					chk=false;
					System.out.println("Already exist");	
				}						
			}
			if(chk)
			{
				view.addDosa();
			}			
		}	
	}	
	public void addShakeId()
	{
		if(view.mhotel.getFoodList().size()==0)
		{			
			view.addShake();
		}	
		else if(view.mhotel.getFoodList().size()>0) 
		{
			boolean ck=true;
			int s=view.shakeId();
			for(int i=0;i<view.mhotel.getFoodList().size();i++)
		 	{
		 		if(s==view.mhotel.getFoodList().get(i).getId())
				{
					ck=false;
					System.out.println("Already exist");	
				}						
			}
			if(ck)
			{
				view.addShake();
			}
		}
	}
}	
	