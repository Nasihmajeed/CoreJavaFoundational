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
				// 	case 2: addDosa(); break;
				// 	case 3: addShake(); break;							
		}		
				
				
	}	
	/*public void addBiriyani()
	{
		System.out.println("Which type biriyani you want to add");
		Food biriyani=new Biriyani();
		biriyani.setName(sc.next());
		System.out.println("food price");
		biriyani.setPrice(sc.nextInt());	
		System.out.println("Biriyani ID");
		biriyani.setId(sc.nextInt());	
		foodList.add(biriyani);
						
	}
	*//*public void addDosa()
	{
		System.out.println("Which type dosa you want to add");				
		Food dosa=new Dosa();
		dosa.setName(sc.next());
		System.out.println("food price");
		dosa.setPrice(sc.nextInt());
	 	System.out.println("Dosa ID");
		dosa.setId(sc.nextInt());						
		foodList.add(dosa);
		
	}
	public void addShake()
	{
		System.out.println("Which type shake you want to add");
		Food shake=new Shake();
		shake.setName(sc.next());
		System.out.println("food price");
		shake.setPrice(sc.nextInt());				
		System.out.println("Shake ID");
		shake.setId(sc.nextInt());			
		foodList.add(shake);
		
	}    */
	
	
}	

 