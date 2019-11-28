package com.lxisoft.adminuser;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class Admin
{
	Scanner scanner;
	public void crud(FoodList foodlist,Hotel hotel)
	{
		scanner = new Scanner(System.in);
		boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("1 . Add");
			System.out.println("2 . Update");
			System.out.println("3 . Delete");
			System.out.println("4 . Read");
			System.out.println("5 . Back");
			int num = scanner.nextInt();
			switch(num)
			{
				case 1:
					add(foodlist,hotel);
					break;
				case 2:
					update(foodlist,hotel);
					break;
				case 3:
					delete(foodlist,hotel);
					break;
				case 4:
					read(foodlist);
					isTrue = true;
					break;
				case 5: 
				hotel.adminUser(foodlist,hotel);
				default :
				System.out.println("Sorry!!!! Select Options From Above ");
				isTrue = true;
				break;
			}
		}while(isTrue);
	    
	}
	public void add(FoodList foodList,Hotel hotel)
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
					if(foodList.foodItem[i].getName()==null)
					{
						System.out.println("Press ==> 1.Add 2.Print 3.Back 4.Stop ");
						int num = scanner.nextInt();
						switch(num)
						{
						case 1:
						    checkDuplicate(foodList,i);
						    flag=1;
						    isTrue=true;
						    break;
						case 2:
							foodList.getFoodItem(foodList.foodItem);
							isTrue=true;
							break;
						case 3:
						    crud(foodList,hotel);
						    break;
						case 4:
							flag = 1;
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
	public void update(FoodList foodList,Hotel hotel)
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
				foodList.getFoodItem(foodList.foodItem);
				System.out.println("==>> Select a Product to Update");
				int num = scanner.nextInt();
				checkDuplicate(foodList,num-1);
				isRight = true;
				break;
			case 2:
				foodList.getFoodItem(foodList.foodItem);
				isRight = true;
				break;
			case 3:
				crud(foodList,hotel);
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
	public void delete(FoodList foodList,Hotel hotel)
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
				foodList.getFoodItem(foodList.foodItem);
				System.out.println("==> Select a Product to Delete");
				int num = scanner.nextInt();
				foodList.foodItem[num-1].setName(null);
				foodList.foodItem[num-1].setPrice(0);
				isRight = true;
				break;
			case 2:
				foodList.getFoodItem(foodList.foodItem);
				isRight = true;
				break;
			case 3:
				crud(foodList,hotel);
				break;
			default :
				System.out.println("Select Any Options From Above");
				isRight = true;
				break;
			}
		}while(isRight);
	}
	public void read(FoodList foodList)
	{
		foodList.getFoodItem(foodList.foodItem);

	}
	public void checkDuplicate(FoodList foodList,int i)
	{
		boolean exists = true;
		System.out.print("Enter Food Name : ");
	    String productName = scanner.next();
	    System.out.print("Enter Food Amount : ");
	    int productAmount = scanner.nextInt();
		for(int m = 0;m<10;m++)
		{
			if(foodList.foodItem[m].getName()!=null)
			{
				if(foodList.foodItem[m].getName().equals(productName))
				{
					System.out.println(productName+" Already Exists !!!!!!!");
					exists = false;
					break;
				}
		    }
		}
		if(exists)
		{
			foodList.foodItem[i].setName(productName);
			foodList.foodItem[i].setPrice(productAmount);
		
		}
	}
}