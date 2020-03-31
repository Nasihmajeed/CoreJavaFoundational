import java.util.*;
public class Menu
{
	Item[] item;
	int iNum=-1,index=0;
	Order ord = new Order();
	void setItem()
	{
		item = new Item[5];
		for(int i=0;i<5;i++)
		{
			item[i] = new Item();
		}
		item[0].setItem("Porotta   ",8);
		item[1].setItem("Ghee Roast",45);
		item[2].setItem("Coffee    ",15);
		item[3].setItem("Biriyani  ",120);
		item[4].setItem("Fried Rice",80);
		ord.setOrder();
	}
	void printMenu()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\t\t Menu \t");
		System.out.println("----------------------------------------");
		System.out.println("Item Number \tItem Name \t\t Price(Rs)\t\n");
		for(int i=0;i<5;i++)
		{
			System.out.println("  "+(i+1)+"\t\t"+item[i].itemName +"\t\t" + item[i].itemPrice);
		}
		System.out.println("----------------------------------------\n");
		System.out.println("Select your Dish(Please enter the Item Number) ->");
		while(iNum<6)
		{
			iNum=in.nextInt();
			if(iNum<6)
			{
				this.selectOrder((iNum-1));			
			}
			
		}
		ord.setTotal(index);
		this.printOrderDetails();

	}
	void selectOrder(int itemNumber)
	{
		ord.order[index].itemName=item[itemNumber].itemName;
		ord.order[index].itemPrice=item[itemNumber].itemPrice;
		index++;
	}
	void printOrderDetails()
	{
		System.out.println("------------Bill-------------");
		System.out.println("Item Name \t\t Price\t");
		System.out.println("----------------------------");
		for(int i=0;i<index;i++)
		{
			
			System.out.println(ord.order[i].itemName +"\t--->    "+ ord.order[i].itemPrice);
		}
		System.out.println("----------------------------");
		System.out.println("TOTAL = "+ord.total);
	}
}