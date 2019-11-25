import java.util.*;
public class Hotel
{
	String name,place;
	FoodItems[] food;
		void menu()
		{
			food=new FoodItems[10];
			for(int i=0;i<10;i++)
			{
				food[i]=new FoodItems();
			}
			food[0].name="Biriyani";
			food[0].price=110;
			food[1].name="Porotta";
			food[1].price=50;
			food[2].name="Noodles";
			food[2].price=150;
			food[3].name="Masala Dosa";
			food[3].price=80;
			food[4].name="BBQ";
			food[4].price=150;
			
}
		void getMenu()
		{
			int n=1;
			System.out.println("\t****MENU*****");
			for(int i=0;i<10;i++) 
			{
				if(food[i].name!=null)
				{		
						
						System.out.println(n+"."+food[i].name);
						System.out.println("\t"+food[i].price);
						n++;
				}		

			}
		}
}