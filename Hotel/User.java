import java.util.Scanner;
import java.util.ArrayList;
class User{
	ArrayList<Bill> bill=new ArrayList<Bill>();
	ArrayList<Food> food=new ArrayList<Food>();
	Food fd=new Food();
	Order o=new Order();
	Scanner sc=new Scanner(System.in);
	String userName;
	public void userDetails(ArrayList<Food> food){
		System.out.println("ENTER USER NAME ");
		userName=sc.nextLine();
		fd.printMenuUser(food);
		o.takeOrder(food,bill);
	}
}