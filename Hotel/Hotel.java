import java.util.Scanner;
public class Hotel
{
	String name,place;
	Scanner scanner;
	Product product[];
	void booking()
	{
		scanner = new Scanner(System.in);
		setProduct();
		/*getProduct();*/
	}
	void setHotel()
	{

	}
	void setProduct()
	{
		 product = new Product[5];
		 for(int i = 0;i<5;i++)
		 {
		 	product[i]= new Product();
		 }
		 product[0].name = "Chicken Biriyani";
		 product[0].amount = 110;

		 product[1].name = "Meals";
		 product[1].amount = 60;

		 product[2].name = "Fried Rice";
		 product[2].amount = 130;

		 product[3].name = "Chapathi";
		 product[3].amount = 5;

		 product[4].name = "Porotta";
		 product[4].amount = 10;

	}
	void getProduct()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(product[i].name);
		System.out.println(product[i].amount);
		}
	}
}