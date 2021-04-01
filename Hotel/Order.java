import java.util.Scanner;
import java.util.ArrayList;
class Order{ 
	public float total=0;
	//int[] qty=new int[10];
	Bill bi= new Bill();
	int id;
	int proceed;
	Food ff=new Food();
	Scanner sc=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	ArrayList<Bill> bill=new ArrayList<Bill>();
	ArrayList<Food> food=new ArrayList<Food>();
	
	public void takeOrder(ArrayList<Food> food, ArrayList<Bill> bill){
		
		
		Order order=new Order();
		Bill[] b=new Bill[10];
	for (int i=0;i<10;i++){
		b[i]=new Bill();
	}
		do{
			
		System.out.println("SELECT FOOD ");
		id=sc.nextInt();
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		for(int i=0;i<food.size(); i++){
			if(id==food.get(i).getId()){
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			b[i].setQnty(sr.nextInt());
			b[i].setFoodId(food.get(i).getId());
			b[i].setFoodName(food.get(i).getFoodItem());
			b[i].setFoodPrice(food.get(i).getPrice());
			
			bill.add(b[i]);	
			total=total+b[i].getQnty()*food.get(i).getPrice();
			System.out.println("Order Placed "+food.get(i).getFoodItem()+": Price :"+food.get(i).getPrice());
			}
			}
		
		
		
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		System.out.println("Do you wish to order more? 1.YES 2.NO");
		proceed=sn.nextInt();
		}while(proceed==1);
		
	bi.printBill(food,bill);
	System.out.println("Total :"+total);
	}
	
}