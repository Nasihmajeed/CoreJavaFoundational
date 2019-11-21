import java.util.Scanner;
public class Admin
{
	FoodProduct foodProduct;
	Hotel hotel;
	FoodOrdering foodOrdering;
	Scanner scanner;
	int test=0,test1=0;
	void add()
	{
		scanner = new Scanner(System.in);
		hotel = new Hotel();
		foodOrdering = new FoodOrdering();
		hotel.setProduct();
		int flag=1;
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
								case 2:
								System.out.println("Checking : "+i);
								crud();
								num = 0;
								case 3:
								num = 0;
								hotel.getProduct();
								case 4:
								num = 0;
								flag = 0;
								break;
								default :
								System.out.println("Select Any 4");
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
	void crud()
	{
		scanner = new Scanner(System.in);
	    System.out.println("1 . Add");
		System.out.println("2 . Update");
		System.out.println("3 . Delete");
		System.out.println("4 . Read");
		int num = scanner.nextInt();

		if (num==1)
		{
			num = 0;
			add();
		}
		else if (num==2)
		{
			num = 0;
			update();
		}
	}
	void update()
	{
		System.out.print("***********");
	}
}