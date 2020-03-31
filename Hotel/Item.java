public class Item
{
	String itemName;
	int itemPrice,itemTotAmount=0;
	int itemQuantity;
	public void setItem(String iName,int iPrice)
	{
		this.itemName=iName;
		this.itemPrice=iPrice;
	}
	public void setItemAmount()
	{
		this.itemTotAmount=(this.itemPrice * this.itemQuantity);
	}
	

}