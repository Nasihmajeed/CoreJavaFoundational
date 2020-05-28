package com.lxisoft.market;
import com.lxisoft.market.*;
import com.lxisoft.repository.FileRepository;
import java.util.*;
import java.io.*;
import java.util.Comparator; 
public class Shop
{
	
	private String shopName="EVERGREEN ENTERPRISES";
	private String address="Pookotukavu";
	private String place="Kadambur";
	private final int pinCode = 679514;
	public void printShopDetails()
	{
		System.out.println("Shop Name : "+shopName);
		System.out.println("Address: "+address);
		System.out.println("Place : "+place);
		System.out.println("Pin : "+pinCode);
		mainOption();		
	}
	public void mainOption()
	{
		Scanner sc=new Scanner(System.in);
		StoreKeeper sk=new StoreKeeper();
		try
		{
			boolean isCheck=false;
			do
			{
				isCheck=false;
				System.out.println("------------Welcome----------");
				System.out.println("\n1.Item Details \n2.Employee Details \n3.Exit");
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	getItemDetails(); isCheck=true;break;				
					case 2: getEmployeeDetails(); isCheck=true;  break;
					case 3: System.exit(0);break;
				}
			}while(isCheck);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			e.printStackTrace();
		}	
	}			
	public void getItemDetails()
	{
		StoreKeeper sk=new StoreKeeper();
		sk.selectOption();
	}	
	public void getEmployeeDetails()
	{
		Administrator ad=new Administrator();
		ad.findEmployeeDetails();
	}
}





	