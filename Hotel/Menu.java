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
		do
		{
			System.out.println("Select your Dish(Please enter the Item Number) ->");
			iNum=in.nextInt();
			if(iNum<6 && iNum >0)
			{
				this.selectOrder((iNum-1));			
			}
			
		}while(iNum<6 && iNum >0);
		ord.setTotal(index);
		ord.printOrderDetails(index);

	}
	void selectOrder(int itemNumber)
	{
		Scanner in = new Scanner(System.in);
		ord.order[index].itemName=item[itemNumber].itemName;
		ord.order[index].itemPrice=item[itemNumber].itemPrice;
		System.out.println("Enter the quantity of " + ord.order[index].itemName + "Required \n");
		ord.order[index].itemQuantity = in.nextInt();
		index++;
	}
	
}