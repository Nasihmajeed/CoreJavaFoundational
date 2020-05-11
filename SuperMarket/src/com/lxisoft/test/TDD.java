package com.lxisoft.test;
import java.util.*;
import java.io.*;
import com.lxisoft.market.*;
public class TDD
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		Shop shop = new Shop();
		shop.items=new ArrayList<Item>();
		ArrayList<String> details=new ArrayList<String>();  
		details.add("Evergreen Enterprices");  
		details.add("Pookotukavu");  
		details.add("Kadambur (PO),Pin: 679514,Palakkad"); 	 
		for(String d:details){  
		System.out.println(d); 
		}
		try
		{
			boolean isTest=false;
			do
			{
				isTest=false;
				System.out.println("\n1.Add Stock \n2.Display All \n3.Exit");
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	shop.addStock(); isTest=true;break;				
					case 2: shop.displayAll(); isTest=true;  break;
					case 3: System.exit(0); break;	
					
				}
			}while(isTest);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			e.printStackTrace();
		}	
	}	
}
					

		

				











						
