package com.lxisoft.adminuser;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class Admin
{
	Scanner scanner;
	public void crud(FoodList foodList)
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
			System.out.println("Press==> 5.Back");
			int num = scanner.nextInt();
			switch(num)
			{
				case 1:
					add(foodList);
					isTrue = true;
					break;
				case 2:
					update(foodList);
					isTrue = true;
					break;
				case 3:
					delete(foodList);
					isTrue = true;
					break;
				case 4:
					read(foodList);
					isTrue = true;
					break;
				case 5: 
				    break;
				default :
					System.out.println("Sorry!!!! Select Options From Above ");
					isTrue = true;
					break;
			}
		}while(isTrue);
	    
	}
	public void add(FoodList foodList)
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
					if(foodList.foodItemList[i].getName()==null)
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
						    flag = 1;
							foodList.getFoodItem();
							isTrue=true;
							break;
						case 3:
							flag = 1;
						    break;
						case 4:
							System.exit(0);
							break;
						default :
							System.out.println("Select Any 4 Options");
							flag = 1;
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
	public void update(FoodList foodList)
	{ 
		boolean isRight;
		do
		{
		isRight = false;
		foodList.getFoodItem();
		System.out.println("Press ==> 1.Edit 2.Back 3.Stop ");
		int numb = scanner.nextInt();
			switch(numb)
			{
			case 1:
				System.out.println("==>> Select a Product to Update");
				int num = scanner.nextInt();
				checkDuplicate(foodList,num-1);
				isRight = true;
				break;
			case 2:
				break;
			case 3:
			System.exit(0);
				break;
			default :
				System.out.println("Sorry!!!! Select Options From Above ");
				isRight = true;
				break;
			}
		}
		while(isRight);
    }
	public void delete(FoodList foodList)
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
				reAligningFoodList(foodList);
				isRight = true;
				break;
			case 2:
				foodList.getFoodItem();
				isRight = true;
				break;
			case 3:
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
		boolean isTrue = false;
		do
		{
		isTrue = false;
		System.out.println("Press==> 1.Print Menu 2.Back");
		int num = scanner.nextInt();
			switch(num)
			{
			case 1:
				foodList.getFoodItem();
				isTrue = true;
				break;
			case 2:
				break;
			default :
				System.out.println("Select Any Options from Above ");
				isTrue = true;
				break;
		    }
	    }while(isTrue);
	}
	public void checkDuplicate(FoodList foodList,int num)
	{
		boolean exists = true;
		System.out.print("Enter Food Name : ");
	    String productName = scanner.nextLine();
	    productName = scanner.nextLine();
	    System.out.print("Enter Food Amount : ");
	    int productAmount = scanner.nextInt();
		for(int i = 0;i<10;i++)
		{
			if(foodList.foodItemList[i].getName()!=null)
			{
				if(foodList.foodItemList[i].getName().equals(productName))
				{
					System.out.println(productName+" Already Exists !!!!!!!");
					exists = false;
					break;
				}
		    }
		}
		if(exists)
		{
			foodList.foodItemList[num].setName(productName);
			foodList.foodItemList[num].setPrice(productAmount);
		}
	}
	public void reAligningFoodList (FoodList foodList)
	{
		System.out.println("******MENU******");
		foodList.getFoodItem();
		System.out.println("==> Select a Product to Delete");
		int num = scanner.nextInt();
		foodList.foodItemList[num-1].setName(null);
		foodList.foodItemList[num-1].setPrice(0);
		for(int i=num;i<10;i++)
		{
			if(foodList.foodItemList[i]!=null)
			{
				foodList.foodItemList[i-1].setName(foodList.foodItemList[i].getName());
				foodList.foodItemList[i-1].setPrice(foodList.foodItemList[i].getPrice());
		    }
		    else if(foodList.foodItemList[i]==null)
		    {
		    	foodList.foodItemList[i+1].setName(null);
		        foodList.foodItemList[i+1].setPrice(0);
		    }
	    }
	}
}