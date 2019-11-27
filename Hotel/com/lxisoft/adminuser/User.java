package com.lxisoft.adminuser;
import com.lxisoft.hotel.Hotel;
import com.lxisoft.hotel.FoodOrdering;
import java.util.Scanner;
public class User
{
	Scanner scanner;
	public void bill(Hotel hotel)
	{
		scanner = new Scanner(System.in);
		/*FoodOrdering foodOrdering = new FoodOrdering();*/
		boolean numberExist = false;
		int[] array = new int[10];
		int[] quantity = new int[10];
		int i=0;
		System.out.println("********Menu********");
		hotel.getProduct(hotel.foodProduct);
		Boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("Press ==> 1.Add Food to Cart 2.Print Bill ");
			int num = scanner.nextInt();
			switch(num)
			{
			case 1:
				selectProduct(array);
				isTrue = true;
				break;
			case 2:
				print(hotel,selectProduct(array),quantity);
				isTrue = false;
				break;
			default :
				System.out.println("==> Select the Above Option");
				isTrue = true;
				break;
			}

		}while(isTrue);
		
	}
	public int[] selectProduct(int[] array)
	{
		scanner = new Scanner(System.in);
		int n=1;
		System.out.println("==> Select Food");
		int productNumber = scanner.nextInt();
		for(int i=0;i<10;i++)
		{
			if(array[i]==0)
			{
				array[i]=productNumber;
				break;
				/*quantity[i]=n;*/
			}
		}
		return array;
	}
	public void print(Hotel hotel,int[] array,int[] quantity)
	{
		scanner = new Scanner(System.in);
		int amount = 0;
		System.out.println("******BILL******");
		for(int i=0;i<10;i++)
		{
			if(array[i]!=0)
			{
				amount = amount + (hotel.foodProduct[array[i]-1].getAmount());
			}
		}
		if(hotel.getName()!=null)
			{
				/*foodOrdering.getHotel(hotel);*/		
			}
		else
			{
				System.out.println("**Hotel Name Not Entered**");
			}
			System.out.println("Food Items  \t Quantity \t  Amount ");
		for(int i=0;i<10;i++)
		{
			if(array[i]!=0)
			{
			System.out.println(hotel.foodProduct[array[i]-1].getName()+"\t"+quantity[i]+"\t"+hotel.foodProduct[array[i]-1].getAmount()+" Rs");
		    }
		}
		System.out.println("Total Amount \t\t\t"+amount+" Rs");
	}
}