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
		for(int i=0;i<index;i++)
		{
			this.total=this.total+(order[i].itemPrice);
		}
	}
}