public class Menu
{
	Item[] item;
	void setItem()
	{
		item = new Item[5];
		item[0] = new Item("Porotta",8);
		item[1]= new Item("Ghee Roast",45);
		item[2]= new Item("Coffee",15);
		item[3]= new Item("Biriyani",120);
		item[4]= new Item("Fried Rice",80);
	}
	void printMenu()
	{
		System.out.println("\t\t Menu \t");
		System.out.println("\t----------------------------");
		System.out.println("Item Name \t Price\t");
		for(int i=0;i<5;i++)
		{
			System.out.println(item[i].itemName +"\t\t" + item[i].itemPrice);
		}
		System.out.println("Select your Dish :) ");
	}
}