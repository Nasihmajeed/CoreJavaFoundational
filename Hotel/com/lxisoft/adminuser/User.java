package com.lxisoft.adminuser;
import com.lxisoft.hotel.Hotel;
import com.lxisoft.hotel.FoodOrdering;
import java.util.Scanner;
public class User
{
	public void bill(Hotel hotel)
	{
		boolean numberExist = false;
		int[] array = new int[10];
		int[] quantity = new int[10];
		Scanner scanner = new Scanner(System.in);
		FoodOrdering foodOrdering = new FoodOrdering();
		int i=0,n=1,amount = 0;
		System.out.println("********Menu********");
		hotel.getProduct(hotel.foodProduct);
		Boolean isTrue = false;
		do
		{
			isTrue = false;
			int num;
			System.out.println("Press ==> 1.Add Food to Cart 2.Print Bill ");
			num = scanner.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("==> Select Food");
					int number = scanner.nextInt();
					for(int j=0;j<10;j++)
					{
						if(number==array[j])
						{
							n++;
						    quantity[j]=n;
							numberExist = true;
							break;
					    }
					}
					if(numberExist)
					{
					numberExist = false;
					}
					else
					{
						n=1;
						quantity[i]=n;
						array[i] = number;
						i++;
					}
					isTrue = true;
					break;
				case 2:
					System.out.println("******BILL******");
					for(int k=0;k<10;k++)
					{
						if(array[k]!=0)
						{
							amount = amount + (hotel.foodProduct[array[k]-1].getAmount()*quantity[k]);
						}
					}
					if(hotel.getName()!=null)
						{
							foodOrdering.getHotel(hotel);		
						}
					else
						{
							System.out.println("**Hotel Name Not Entered**");
						}
						System.out.println("Food Items  \t Quantity \t  Amount ");
					for(int j=0;j<10;j++)
					{
						if(array[j]!=0)
						{
						System.out.println(hotel.foodProduct[array[j]-1].getName()+"\t"+quantity[j]+"\t"+hotel.foodProduct[array[j]-1].getAmount()+" Rs");
						/*System.out.print();
						System.out.println();*/
					    }
					}
					System.out.println("Total Amount \t\t\t"+amount+" Rs");
					break;
				default :
					System.out.println("==> Select the Above Option");
					isTrue = true;
					break;
			}

		}while(isTrue);
		
	}
}