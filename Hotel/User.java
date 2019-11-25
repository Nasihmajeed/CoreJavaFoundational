import java.util.Scanner;
public class User
{
	void bill(Hotel hotel)
	{
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		FoodOrdering foodOrdering = new FoodOrdering();
		int i=0,amount = 0;
		System.out.println("********Menu********");
		hotel.getProduct(hotel.foodProduct);
		/*System.out.println("==> Order Food ");
		array[0] = scanner.nextInt();*/
		Boolean isTrue = false;
		do
		{
			isTrue = false;
			int num;
			System.out.println("Press ==> 1.Add Food to Cart 2.Print Bill ");
			num = scanner.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("==> Select Food");
					array[i] = scanner.nextInt();
					i++;
					isTrue = true;
					break;
				case 2:
					System.out.println("******BILL******");
					for(int k=0;k<10;k++)
					{
						if(array[k]!=0)
						{
							amount = amount + hotel.foodProduct[array[k]-1].getAmount();
						}
					}
					if(hotel.getName()!=null)
						{
							foodOrdering.getHotel(hotel);		
						}
					else
						{
							System.out.println("**Hotel Name Not Entered**");
						}
					for(int j=0;j<10;j++)
					{
						if(array[j]!=0)
						{
						System.out.print(hotel.foodProduct[array[j]-1].getName());
						System.out.print("     ");
						System.out.print(hotel.foodProduct[array[j]-1].getAmount());
						System.out.println(" ");
					    }
					}
					System.out.println("Total Amount : "+amount+" Rs");
					break;
				default :
					System.out.println("==> Select the Above Option");
					isTrue = true;
					break;
			}

		}while(isTrue);
		
	}
}