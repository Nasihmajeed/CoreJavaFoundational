import java.util.Scanner;
public class Admin
{
	FoodProduct foodProduct;
	Hotel hotel;
	FoodOrdering foodOrdering;
	Scanner scanner;
	int flag=1;
	boolean flag2=true;
	void add()
	{
		if(flag2)
		{
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		hotel.setProductObject();
		hotel.setProduct();
		foodOrdering = new FoodOrdering();
	    }
		for(int i=0;i<10;i++)
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
							switch(num)
							{
								case 1:
								num = 0;
								flag1 = true;
								break;
								case 2:
								flag2=false;
								System.out.println("Checking : "+i);
								foodOrdering.crud();
								num = 0;
								break;
								case 3:
								num = 0;
								hotel.getProduct();
								flag1 = true;
								flag = 0;
								break;
								case 4:
								num = 0;
								flag = 0;
								break;
								default :
								System.out.println("Select Any 4");
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