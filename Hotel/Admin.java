import java.util.Scanner;
public class Admin
{
	FoodProduct foodProduct;
	FoodOrdering foodOrdering;
	Scanner scanner = new Scanner(System.in);
	int flag=1;
	void add(Hotel hotel)
	{
		foodOrdering = new FoodOrdering();
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
							System.out.println("1.Add 2.Print 3.Stop 4.Back ");
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
									hotel.getProduct();
									break;
								case 3:
									flag = 0;
									flag1=true;
									break;
								case 4:
									foodOrdering.crud(hotel);
								default :
									System.out.println("Select Any 4");
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
	void update()
	{
		System.out.print("***********");
	}
	void delete(Hotel hotel)
	{
		System.out.println("Select a Product to Delete");
		hotel.getProduct();
		int num = scanner.nextInt();
		hotel.foodProduct[num-1].setName(null);
		hotel.foodProduct[num-1].setName(null);
		hotel.getProduct();
	}
	void read(Hotel hotel)
	{
		hotel.getProduct();

	}
}