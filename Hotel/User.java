import java.util.Scanner;
public class User
{
	void bill(Hotel hotel)
	{
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		int i=1;
		System.out.println("********Menu********");
		hotel.getProduct(hotel.foodProduct);
		System.out.println("==> Order Food ");
		array[0] = scanner.nextInt();
		Boolean isTrue = false;
		do
		{
			isTrue = false;
			int num;
			System.out.println("Press ==> 1.Add More Food 2.Print Bill ");
			num = scanner.nextInt();
			switch(num)
			{
				case 1:
					array[i] = scanner.nextInt();
					i++;
					isTrue = true;
					break;
				case 2:
					System.out.println("******BILL******");
					for(int j=0;j<10;j++)
					{
						if(array[j]!=0)
						{
						System.out.println(hotel.foodProduct[array[j]].getName());
						System.out.print("     ");
						System.out.print(hotel.foodProduct[array[j]].getAmount());
					    }
					}
					break;
				default :
					System.out.println("==> Select the Above Option");
					break;
			}

		}while(isTrue);
		
	}
}