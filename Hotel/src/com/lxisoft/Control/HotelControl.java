package com.lxisoft.Control;
import com.lxisoft.View.HotelView;
public class HotelControl 
{		

	public void addFood()
	{
		HotelView view=new HotelView();
		int d=1;	
		while(d<=5)
		{	
			int item=view.addFood();
			switch(item)
			{
		 		case 1: view.addBiriyani(); break;
				case 2: view.addDosa(); break;
				case 3: view.addShake(); break;	
				case 4: System.exit(0); break;
				case 5:	view.displayFood(); break;					
			}d++;	
		
		}
		
	}	
}	
	