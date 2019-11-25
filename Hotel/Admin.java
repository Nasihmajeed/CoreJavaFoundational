import java.util.Scanner;
public class Admin
{
	Scanner scanner = new Scanner(System.in);
	int flag=1;
	void crud(Hotel hotel)
	{
		FoodOrdering foodOrdering = new FoodOrdering();
		int num;
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
				num = 0;
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
			break;
		}
	}
	void add(Hotel hotel)
	{
		for(int i=0;i<10;i++)
			{
				if(flag==1)
				{
					boolean flag1=false;
					do
					{
						flag1=false;
						if(hotel.foodProduct[i].getName()==null)
						{
							System.out.println("Press ==> 1.Add 2.Print 3.Back 4.Stop ");
							int num = scanner.nextInt();
							
							switch(num)
							{
								case 1:
									System.out.print("Enter Food Name : ");
								    hotel.foodProduct[i].setName(scanner.next());
								    System.out.print("Enter Food Amount : ");
								    hotel.foodProduct[i].setAmount(scanner.nextInt());
								    break;
								case 2:
									hotel.getProduct(hotel.foodProduct);
									break;
								case 3:
								    crud(hotel);
								    break;
								case 4:
									flag = 0;
									break;
								default :
									System.out.println("Select Any 4");
									flag1 = true;
									break;
							}
						}
				    }
					while(flag1);
			    }
			    else if(flag==0)
			    {
			    	break;
			    }

			}		
	}
	void update(Hotel hotel)
	{
		boolean isRight;
		int numb;
		do
		{
		isRight = false;
		System.out.println("Press ==> 1.Edit 2.Print 3.Back 4.Stop ");
		numb = scanner.nextInt();
			switch(numb)
			{
				case 1:
					System.out.println("******MENU******");
					hotel.getProduct(hotel.foodProduct);
					System.out.println("==>> Select a Product to Update");
					int num = scanner.nextInt();
					System.out.println("==> Enter Product Name");
					hotel.foodProduct[num-1].setName(scanner.next());
					System.out.println("==> Enter Product Amount");
					hotel.foodProduct[num-1].setAmount(scanner.nextInt());
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
					break;
				default :
					System.out.println("Sorry!!!! Select Options From Above ");
					isRight = true;
					break;
			}
		}
		while(isRight);
    }
	void delete(Hotel hotel)
	{
		boolean isRight = false;
		do
		{
			isRight = false;
			System.out.println("******MENU******");
			hotel.getProduct(hotel.foodProduct);
			System.out.println("==> Select a Product to Delete");
			int num = scanner.nextInt();
			hotel.foodProduct[num-1].setName(null);
			hotel.foodProduct[num-1].setAmount(0);
			hotel.getProduct(hotel.foodProduct);
			System.out.println("Press ==> 1.Delete 2.Back");
			int numb = scanner.nextInt();
			switch(numb)
			{
				case 1:
				isRight = true;
				break;
				case 2:
				crud(hotel);
				break;
				default :
				System.out.println("Select Any Options From Above");
				isRight = true;
				break;
			}


		}while(isRight);
	}
	void read(Hotel hotel)
	{
		hotel.getProduct(hotel.foodProduct);

	}
}