package com.lxisoft.Control;
import com.lxisoft.View.HotelView;
import com.lxisoft.Repository.SqlRepository;
public class HotelControl 
{		
	HotelView view=new HotelView();	
	SqlRepository sqlrepo = SqlRepository.getInstance();	
	public void menuItem()
	{
		boolean test=false;
		do
		{
			test=false;
			int m=view.menu();
			switch (m)
			{
				case 1:	foodItem(sqlrepo);	test=true;break;				
				case 2: addStock(); test=true;  break;
				case 3: view.displayFood(sqlrepo); test=true; break;	
				case 4: view.displayStock(sqlrepo); test=true; break;
				case 5: billPrint(); test=true;  break;
				case 6: System.exit(0); break;	
			}
		}while(test);			
	}
	public void foodItem(SqlRepository sqlrepo)
	{		
		sqlrepo.createTable();
		boolean check=false;
		do	
		{
			check=false;
			int n=1;
			int i=view.selectFood(n);
			switch (i)
			{
	 			case 1: addBiriyaniId(sqlrepo);check=true; break;
				case 2: addDosaId(sqlrepo);check=true; break;
				case 3: addShakeId(sqlrepo);check=true; break;
				default:
			}				
		}while(check);		
	}
	public void addStock()
	{
		int c=view.selectStock(sqlrepo);
		for(int j=0;j<view.mhotel.getFoodList().size();j++)
		{
			if((view.mhotel.getFoodList().get(j).getId())==c)
		 	{
		 		view.addStockMethod(sqlrepo);		 		
		 	}
		}	
	}
	public void billPrint()
	{
		boolean sample;	
		do{
			view.displayStock(sqlrepo);			
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
		 	int val=(view.mhotel.getStockList().get(q).getFoodQuantity()-view.mhotel.getItemQuantity());
		 	view.mhotel.getStockList().get(q).setFoodQuantity(val);	        
            view.currentStock(q);	
		}		
	}
	public void addBiriyaniId(SqlRepository sqlrepo)
	{
		if(view.mhotel.getFoodList().size()==0)
		{
			view.addBiriyani(sqlrepo);
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
				view.addBiriyani(sqlrepo);
			}
		}
	}	
	public void addDosaId(SqlRepository sqlrepo)
	{
		if(view.mhotel.getFoodList().size()==0)
		{
			view.addDosa(view.dosaId(),sqlrepo);			
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
				view.addDosa(a,sqlrepo);
			}			
		}	
	}	
	public void addShakeId(SqlRepository sqlrepo)
	{
		if(view.mhotel.getFoodList().size()==0)
		{			
			view.addShake(view.shakeId(),sqlrepo);
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
				view.addShake(s,sqlrepo);
			}
		}
	}
}	
	