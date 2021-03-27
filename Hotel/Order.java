import java.util.Scanner;
import java.util.ArrayList;
class Order{ 
	public float total=0;
	int[] qty=new int[10];
	Bill bi= new Bill();
	int id;
	int proceed;
	
	Scanner sc=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	ArrayList<Bill> bill=new ArrayList<Bill>();
	
	public void takeOrder(ArrayList<Food> food, ArrayList<Bill> bill){
		
		Bill[] b=new Bill[10];
	for (int i=0;i<10;i++){
		b[i]=new Bill();
	}
		do{
			
		System.out.println("SELECT FOOD ");
		id=sc.nextInt();
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		
		switch(id){
			case 1:
			//b.saveBill(food,bill);
			
			b[0].setFoodId(food.get(0).getId());
			b[0].setFoodName(food.get(0).getFoodItem());
			b[0].setFoodPrice(food.get(0).getPrice());
			bill.add(b[0]);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[0]=sr.nextInt();
			total=total+qty[0]*food.get(0).getPrice();
			System.out.println("Order Placed "+food.get(0).getFoodItem()+": Price :"+food.get(0).getPrice()+"    QUANTITY :"+qty[0]);
			
			break;
			case 2:
			
			//b.saveBill(food,bill);
			b[1].setFoodId(food.get(1).getId());
			b[1].setFoodName(food.get(1).getFoodItem());
			b[1].setFoodPrice(food.get(1).getPrice());
			bill.add(b[1]);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[1]=sr.nextInt();
			total=total+qty[1]*food.get(1).getPrice();
			System.out.println("Order Placed  "+food.get(1).getFoodItem()+": Price :"+food.get(1).getPrice()+"    QUANTITY :"+qty[1]);
			
			break;
			case 3:
			b[2].setFoodId(food.get(2).getId());
			b[2].setFoodName(food.get(2).getFoodItem());
			b[2].setFoodPrice(food.get(2).getPrice());
			bill.add(b[2]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[2]=sr.nextInt();
			System.out.println("Order Placed "+food.get(2).getFoodItem()+": Price :"+food.get(2).getPrice()+"    QUANTITY :"+qty[2]);
			total=total+qty[2]*food.get(2).getPrice();
			break;
			case 4:
			b[3].setFoodId(food.get(3).getId());
			b[3].setFoodName(food.get(3).getFoodItem());
			b[3].setFoodPrice(food.get(3).getPrice());
			bill.add(b[3]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[3]=sr.nextInt();
			System.out.println("Order Placed  "+food.get(3).getFoodItem()+": Price :"+food.get(3).getPrice()+"    QUANTITY :"+qty[3]);
			total=total+qty[3]*food.get(3).getPrice();
			break;
			case 5:
			b[4].setFoodId(food.get(4).getId());
			b[4].setFoodName(food.get(4).getFoodItem());
			b[4].setFoodPrice(food.get(4).getPrice());
			bill.add(b[4]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[4]=sr.nextInt();
			System.out.println("Order Placed  "+food.get(4).getFoodItem()+": Price :"+food.get(4).getPrice()+"    QUANTITY :"+qty[4]);
			total=total+qty[4]*food.get(4).getPrice();
			break;
			case 6:
			b[5].setFoodId(food.get(5).getId());
			b[5].setFoodName(food.get(5).getFoodItem());
			b[5].setFoodPrice(food.get(5).getPrice());
			bill.add(b[5]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[5]=sr.nextInt();
			System.out.println("Order Placed "+food.get(5).getFoodItem()+": Price :"+food.get(5).getPrice()+"    QUANTITY :"+qty[5]);
			total=total+qty[5]*food.get(5).getPrice();
			break;
			case 7:
			b[6].setFoodId(food.get(6).getId());
			b[6].setFoodName(food.get(6).getFoodItem());
			b[6].setFoodPrice(food.get(6).getPrice());
			bill.add(b[6]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[6]=sr.nextInt();
			System.out.println("Order Placed "+food.get(6).getFoodItem()+": Price :"+food.get(6).getPrice()+"    QUANTITY :"+qty[6]);
			total=total+qty[6]*food.get(6).getPrice();
			break;
			case 8:
			b[7].setFoodId(food.get(7).getId());
			b[7].setFoodName(food.get(7).getFoodItem());
			b[7].setFoodPrice(food.get(7).getPrice());
			bill.add(b[7]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[7]=sr.nextInt();
			System.out.println("Order Placed "+food.get(7).getFoodItem()+": Price :"+food.get(7).getPrice()+"    QUANTITY :"+qty[7]);
			total=total+qty[7]*food.get(7).getPrice();
			break;
			case 9:
			b[8].setFoodId(food.get(8).getId());
			b[8].setFoodName(food.get(8).getFoodItem());
			b[8].setFoodPrice(food.get(8).getPrice());
			bill.add(b[8]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[8]=sr.nextInt();
			System.out.println("Order Placed "+food.get(8).getFoodItem()+": Price :"+food.get(8).getPrice()+"    QUANTITY :"+qty[8]);
			total=total+qty[8]*food.get(8).getPrice();
			break;
			case 10:
			b[9].setFoodId(food.get(9).getId());
			b[9].setFoodName(food.get(9).getFoodItem());
			b[9].setFoodPrice(food.get(9).getPrice());
			bill.add(b[9]);
			//b.saveBill(food,bill);
			System.out.println("ENTER QUANTITY YOU WANT TO BUY");
			qty[9]=sr.nextInt();
			System.out.println("Order Placed "+food.get(9).getFoodItem()+": Price :"+food.get(9).getPrice()+"    QUANTITY :"+qty[9]);
			total=total+qty[9]*food.get(9).getPrice();
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
		
	bi.printBill(food,bill);
	System.out.println("Total :"+total);
	}
	
}