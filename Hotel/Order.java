public class Order
{
	int total=0;
	Item[] order = new Item[20];
	void setOrder()
	{
		for(int i=0;i<20;i++)
		{
			order[i]=new Item();
		}
	}
	
	
	void setTotal(int index)
	{
		this.total=0;
		for(int i=0;i<index;i++)
		{
			order[i].setItemAmount();
			this.total=this.total+(order[i].itemTotAmount);
		}
	}
	
	void printOrderDetails(int index)
	{
		
		System.out.println("---------------------Bill----------------");
		System.out.println("Item Name \t\t Price\t\t Quantity");
		System.out.println("-----------------------------------------");
		for(int i=0;i<index;i++)
		{
			
			System.out.println(this.order[i].itemName +"\t--->    "+ this.order[i].itemPrice+ "\t           " +this.order[i].itemQuantity);
		}
		System.out.println("-----------------------------------------");
		System.out.println("TOTAL = "+this.total);
	}
	
	
}