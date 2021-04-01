import java.util.Scanner;
import java.util.ArrayList;
class Hotel{
	Food ff= new Food();
	Admin ad=new Admin();
	ArrayList<Food> food=new ArrayList<Food>();
	User u=new User();
	Scanner sc=new Scanner(System.in);
	int sel;
	public void displayHotel(){
		System.out.println("***************************************");
		System.out.println("ABCD FIVE STAR HOTEL");
		System.out.println("PATHIRIPALA, PALAKKAD");
		System.out.println("***************************************");
		ff.addMenu(food);
		selectUser();
	}
	public void selectUser(){
		System.out.println("SELECT THE MODE ");
		System.out.println("1. ADMIN");
		System.out.println("2. USER");
		sel=sc.nextInt();
		switch(sel){
			case 1:
				ad.adminDetails(food);
				
			break;
			case 2:
			//ff.addMenu(food);
				u.userDetails(food);
				
				break;
		}
	}
}