class Order
{
	//int slct;
	Food f=new Food();
	Drink d=new Drink();
	//static Scanner sc=new Scanner(System.in);
	
public void customerOrder()
{
	System.out.println("You may place your Order from the below menu List :");
	System.out.println("---------------------------------------------------------------");
	f.printMenuFood();
	d.printMenuDrinks();
		
}
}