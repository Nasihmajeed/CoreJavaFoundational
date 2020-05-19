package com.lxisoft.test;
import java.util.*;
import java.io.*;
import com.lxisoft.market.*;
public class TDD
{
	public static void main(String[] arg)
	{
		Shop.shop("\n\t         EVERGREEN ENTERPRISES");  
        System.out.println(Shop.shopName);     
       	Shop shop = new Shop();  	
		if(shop instanceof Shop){
			shop.shopDetails(); 
		}  

	}
}
					

		

				











						
