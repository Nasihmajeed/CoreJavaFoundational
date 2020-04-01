import java.util.*;
public class Menu
{
	Item[] item;
	int iNum=-1,index=0;
	String iName;
	int price,ind;
	Order ord = new Order();
	String ch;
	void setFood()
	{
		
		item = new Item[20];
		for(int i=0;i<20;i++)
		{
			item[i] = new Item();
			
		}		
		item[0].setItem("Porotta   ",8);
		item[1].setItem("Ghee Roast",45);
		item[2].setItem("Coffee    ",15);
		item[3].setItem("Biriyani  ",120);
		item[4].setItem("Fried Rice",80);
		ind=4;
		
	}
	void printMenu()
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("\t\t Menu \t");
		System.out.println("----------------------------------------");
		System.out.println("Item Number \tItem Name \t\t Price(Rs)\t\n");
		for(int i=0;this.item[i].itemName!=null;i++)
		{
			System.out.println("  "+(i+1)+"\t\t"+this.item[i].itemName +"\t\t" +this.item[i].itemPrice);
		}
		System.out.println("----------------------------------------\n");
		

	}
	
	void ordering(int ind)
	{
		//************************
		this.index=0;
		//***********************
		this.ord.setOrder();
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("Select your Dish(Please enter the Item Number And press 0 to Submit) ->");
			iNum=in.nextInt();
			if(iNum<=(ind+1) && iNum >0)
			{
				this.selectOrder((iNum-1));			
			}
			else if(iNum==0)
			{
				System.out.println("Do you Placed your orders Completely (yes/no)");
				in.nextLine();
				ch=in.nextLine();
				if(ch.equals("yes"))
				{
					System.out.println("\n\tThank you : Order placed\t");
				}
				else
				{
					iNum=1;
				}
			}
			else
			{
				System.out.println("\n ****INVALID ITEM NUMBER*******\n");
				iNum=1;
			}
			
		}while(iNum!=0);
		ord.setTotal(index);
		ord.printOrderDetails(index);
}


	void selectOrder(int itemNumber)
	{
		Scanner in = new Scanner(System.in);
		this.ord.order[index].itemName=this.item[itemNumber].itemName;
		this.ord.order[index].itemPrice=this.item[itemNumber].itemPrice;
		System.out.println("Enter the quantity of " + this.ord.order[index].itemName + " Required \n");
		this.ord.order[index].itemQuantity = in.nextInt();
		index++;
	}
	
}