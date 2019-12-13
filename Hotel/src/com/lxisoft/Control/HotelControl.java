package com.lxisoft.Control;
import com.lxisoft.View.HotelView;
public class HotelControl 
{		

	public void menu()
	{
		HotelView view=new HotelView();
		int d=1;	
		while(d<=6)
		{
			int menu=view.menu();			
			switch (menu)
			{
				case 1: view.addFood(); break;				
				case 2: view.addStock(); break;
				case 3: view.displayFood(); break;	
				case 4: view.displayStock(); break;
				//case 5: hotel.printBill(); break;
				case 6: System.exit(0); break;		
			}d++;
		}	
	}
		
}	
	