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
		int n=0/*flag=1*/;
			for(int i=0;i<hotel.foodProduct.length;i++)
				{
					
					/*if(flag==1)
					{*/
						boolean flag1 = false;
						do
						{
						 flag1 = false;
							if(hotel.foodProduct[i].getName()==null)
							{
								System.out.print("Enter Food Name : ");
								hotel.foodProduct[n].setName(scanner.next());
								System.out.print("Enter Food Amount : ");
								hotel.foodProduct[n].setAmount(scanner.nextInt());
								System.out.println("Do you Want to Enter Another Product ? (If yes press 1,If no press 2)");
								int num = scanner.nextInt();
								if(num==1)
								{
									flag1 = true;
								}
								else if(num==2)
								{
									break;
									/*flag = 0;*/
								}
							}
					    }
						while(flag1);
						n++;
				   /* }
				    else if(flag==0)
				    {
				    	break;
				    }*/

				}
	}
	void update()
	{
		System.out.print("***********");
	}
}