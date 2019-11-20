import java.util.Scanner;
public class Admin
{
	FoodProduct foodProduct = new FoodProduct();
	Hotel hotel;
	Scanner scanner;
	void add()
	{
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		hotel.setProduct();
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
								System.out.print("Do you Want to Enter Another Product ? (If yes press 1,If no press 2) : ");
								int num = scanner.nextInt();
								if(num==1)
								{
									flag1 = true;
								}
								else if(num==2)
								{
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
				hotel.getProduct();
	}
	void update()
	{
		System.out.print("***********");
	}
}