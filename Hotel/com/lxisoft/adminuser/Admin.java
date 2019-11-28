package com.lxisoft.adminuser;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class Admin
{
	Scanner scanner = new Scanner(System.in);
	public void crud(Hotel hotel)
	{
		FoodOrdering foodOrdering = new FoodOrdering();
		int num;
		boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("1 . Add");
			System.out.println("2 . Update");
			System.out.println("3 . Delete");
			System.out.println("4 . Read");
			System.out.println("5 . Back");
			num = scanner.nextInt();
			switch(num)
			{
				case 1:
					add(hotel);
					break;
				case 2:
					update(hotel);
					break;
				case 3:
					delete(hotel);
					break;
				case 4:
					read(hotel);
					break;
				case 5: 
				foodOrdering.adminUser(hotel);
				default :
				System.out.println("Sorry!!!! Select Options From Above ");
				isTrue = true;
				break;
			}
		}while(isTrue);
	    
	}
	public void add(Hotel hotel)
	{
		boolean isTrue=false;
		do
		{
			isTrue=false;
			int flag = 0;
			for(int i=0;i<10;i++)
            {
            	if(flag==0)
            	{
					if(hotel.foodProduct[i].getName()==null)
					{
						System.out.println("Press ==> 1.Add 2.Print 3.Back 4.Stop ");
						int num = scanner.nextInt();
						switch(num)
						{
						case 1:
						    checkDuplicate(hotel,i);
						    flag=1;
						    isTrue=true;
						    break;
						case 2:
							hotel.getProduct(hotel.foodProduct);
							isTrue=true;
							break;
						case 3:
						    crud(hotel);
						    break;
						case 4:
							crud(hotel);
							break;
						default :
							System.out.println("Select Any 4 Options");
							isTrue = true;
							break;
						}
					}
				}
				else if(flag==1)
				{
					break;
				}
			}
	    }
		while(isTrue);
	}		
	public void update(Hotel hotel)
	{
		boolean isRight;
		do
		{
		isRight = false;
		System.out.println("Press ==> 1.Edit 2.Print 3.Back 4.Stop ");
		int numb = scanner.nextInt();
			switch(numb)
			{
			case 1:
				System.out.println("******MENU******");
				hotel.getProduct(hotel.foodProduct);
				System.out.println("==>> Select a Product to Update");
				int num = scanner.nextInt();
				checkDuplicate(hotel,num-1);
				isRight = true;
				break;
			case 2:
				hotel.getProduct(hotel.foodProduct);
				isRight = true;
				break;
			case 3:
				crud(hotel);
				break;
			case 4:
				isRight= true;
				break;
			default :
				System.out.println("Sorry!!!! Select Options From Above ");
				isRight = true;
				break;
			}
		}
		while(isRight);
    }
	public void delete(Hotel hotel)
	{
		boolean isRight = false;
		do
		{
			isRight = false;
			System.out.println("Press ==> 1.Delete 2.Print 3.Back");
			int numb = scanner.nextInt();
			switch(numb)
			{
			case 1:
				System.out.println("******MENU******");
				hotel.getProduct(hotel.foodProduct);
				System.out.println("==> Select a Product to Delete");
				int num = scanner.nextInt();
				hotel.foodProduct[num-1].setName(null);
				hotel.foodProduct[num-1].setAmount(0);
				isRight = true;
				break;
			case 2:
				hotel.getProduct(hotel.foodProduct);
				isRight = true;
				break;
			case 3:
				crud(hotel);
				break;
			default :
				System.out.println("Select Any Options From Above");
				isRight = true;
				break;
			}
		}while(isRight);
	}
	public void read(Hotel hotel)
	{
		hotel.getProduct(hotel.foodProduct);

	}
	public void checkDuplicate(Hotel hotel,int i)
	{
		boolean exists = true;
		System.out.print("Enter Food Name : ");
	    String productName = scanner.next();
	    System.out.print("Enter Food Amount : ");
	    int productAmount = scanner.nextInt();
		for(int m = 0;m<10;m++)
		{
			if(hotel.foodProduct[m].getName()!=null)
			{
				if(hotel.foodProduct[m].getName().equals(productName))
				{
					System.out.println(productName+" Already Exists !!!!!!!");
					exists = false;
					break;
				}
		    }
		}
		if(exists)
		{
			hotel.foodProduct[i].setName(productName);
			hotel.foodProduct[i].setAmount(productAmount);
		
		}
	}
}