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
		int flag=1;
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
							
							System.out.println("1.Add 2.Print 3.Stop ");
							int num = scanner.nextInt();
							
							switch(num)
							{
								case 1:
									System.out.print("Enter Food Name : ");
								    hotel.foodProduct[i].setName(scanner.next());
								    System.out.print("Enter Food Amount : ");
								    hotel.foodProduct[i].setAmount(scanner.nextInt());
									num = 0;
								    break;
								/*case 2:
									flag2=false;
									System.out.println("Checking : "+i);
									foodOrdering.crud();
									num = 0;
									break;*/
								case 2:
									num = 0;
									/*hotel.getProduct();*/
									for(int j=0;j<10;j++)
									{
										if(hotel.foodProduct[j].getName()!= null)
										{
										System.out.println(hotel.foodProduct[j].getName());
										System.out.println(hotel.foodProduct[j].getAmount());
									    }
									}
									break;
								case 3:
									num = 0;
									flag = 0;
									flag1=true;
									break;
								default :
									System.out.println("Select Any 4");
									break;
							}
						}
						/*else if(hotel.foodProduct[i].getName()!=null)
						{
							break;
						}*/
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
	void read()
	{
		hotel = new Hotel();
		for(int i=0;i<10;i++)
		{
			if(hotel.foodProduct[i].getName()!= null)
			{
			System.out.println(hotel.foodProduct[i].getName());
			System.out.println(hotel.foodProduct[i].getAmount());
		    }
		}

	}
}