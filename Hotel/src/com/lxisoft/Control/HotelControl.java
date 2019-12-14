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
				case 2: view.addStock();test=true;  break;
				case 3: view.displayFood();test=true; break;	
				case 4: view.displayStock(); test=true; break;
				case 5: view.printBill();test=true;  break;
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
			int i=view.addFood();
			switch (i)
			{
	 			case 1: view.addBiriyani();check=true; break;
				case 2: view.addDosa();check=true; break;
				case 3: view.addShake();check=true; break;
				default:
			}
				
		}while(check);

		
		
	}		

}	
	