package com.lxisoft.Control;
import com.lxisoft.View.HotelView;
public class HotelControl 
{		
	public void addFood()
	{
		HotelView view=new HotelView();
		int item=view.addFood();
		switch(item)
		{
		 	case 1: view.addBiriyani(); break;
			case 2: view.addDosa(); break;
			case 3: view.addShake(); break;							
		}				
				
	}	
}	
	