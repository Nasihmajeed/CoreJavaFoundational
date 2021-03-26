import java.util.Scanner;
import java.util.ArrayList;
class Order{ 
	int id;
	int proceed;
	float total=0;;
	Scanner sc=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	public void takeOrder(ArrayList<Food> food){
		do{
		System.out.println("SELECT FOOD ");
		id=sc.nextInt();
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		
		switch(id){
			case 1:
			System.out.println("Order  "+food.get(0).getFoodItem()+": Price :"+food.get(0).getPrice()+" Placed");
			break;
			case 2:
			System.out.println("Order  "+food.get(1).getFoodItem()+": Price :"+food.get(1).getPrice()+" Placed");
			break;
			case 3:
			System.out.println("Order  "+food.get(2).getFoodItem()+": Price :"+food.get(2).getPrice()+" Placed");
			break;
			case 4:
			System.out.println("Order  "+food.get(3).getFoodItem()+": Price :"+food.get(3).getPrice()+" Placed");
			break;
			case 5:
			System.out.println("Order  "+food.get(4).getFoodItem()+": Price :"+food.get(4).getPrice()+" Placed");
			break;
			case 6:
			System.out.println("Order  "+food.get(5).getFoodItem()+": Price :"+food.get(5).getPrice()+" Placed");
			break;
			case 7:
			System.out.println("Order  "+food.get(6).getFoodItem()+": Price :"+food.get(6).getPrice()+" Placed");
			break;
			case 8:
			System.out.println("Order  "+food.get(7).getFoodItem()+": Price :"+food.get(7).getPrice()+" Placed");
			break;
			case 9:
			System.out.println("Order  "+food.get(8).getFoodItem()+": Price :"+food.get(8).getPrice()+" Placed");
			break;
			case 10:
			System.out.println("Order  "+food.get(9).getFoodItem()+": Price :"+food.get(9).getPrice()+" Placed");
			break;
			default:
			System.out.println("No order");
			break;
		}
		
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		System.out.println("Do you wish to order more? 1.YES 2.NO");
		proceed=sn.nextInt();
		}while(proceed==1);
	}
}