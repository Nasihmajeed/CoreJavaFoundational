package com.lxisoft.order;
public class Order
{
	String orderId;
	String itemName;

	public void orderId()
	{
		final String alphabet = "0123456789ABCDE";
		final int length = alphabet.length();
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			System.out.println(alphabet.charAt(random.nextInt(n)));
		}
	}
	public void createOrder()
	{
		Scanner sc = new Scanner(System.in);
		Sytem.out.println("Enter Food Name:");
		itemName  = sc.nextLine();
	}

	public void viewOrder()
	{

	}
	public void editOrder()
	{

	}
	public void deleteOrder()
	{

	}
	// public void placeOrder()
	// {

	// }

	public void displayOrderDetails()
	{
		System.out.println("****Order Details****");

		System.out.println("Id:"+orderId);
		System.out.println("Name:"+item);

	}
}