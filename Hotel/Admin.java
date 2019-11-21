import java.util.Scanner;
public class Admin
{
	FoodProduct foodProduct;
	Hotel hotel;
	FoodOrdering foodOrdering;
	Scanner scanner;
	void add()
	{
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		foodOrdering = new FoodOrdering();
		int flag=1;
		for(int i=0;i<hotel.foodProduct.length;i++)
			{
				
				if(flag==1)
				{
					boolean flag1 = false;
					do
					{
					 flag1 = false;
						if(hotel.foodProduct[i].getName()==null)
						{
							System.out.print("Enter Food Name : ");
							hotel.foodProduct[i].setName(scanner.next());
							System.out.print("Enter Food Amount : ");
							hotel.foodProduct[i].setAmount(scanner.nextInt());
							System.out.print("1.Add 2.back 3.Print 4.Stop = ");
							int num = scanner.nextInt();
							if(num==1)
							{
								num = 0;
								flag1 = true;
							}
							else if(num==2)
							{
								
								foodOrdering.adminUser();
								num = 0;
							}
							else if(num==3)
							{
								num = 0;
								hotel.getProduct();
							}
							else if(num==4)
							{
								num = 0;
								flag = 0;
								break;
							}
						}
						else if(hotel.foodProduct[i].getName()!=null)
						{
							break;
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
}