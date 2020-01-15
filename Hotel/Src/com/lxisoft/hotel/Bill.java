package com.lxisoft.hotel;
import com.lxisoft.hotel.Biriyani;
import com.lxisoft.hotel.Vegmeals;
public class Bill
{
	
	public void billdetails1(Food[] f)
	{
		for (int i=0;i<f.length;i++) 
		{
			f[i].setdetails();
		}
		
		

	}
	
}