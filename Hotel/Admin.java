import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
class Admin{
	Scanner sc=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	Scanner sv=new Scanner(System.in);
	Scanner ss=new Scanner(System.in);
	Food fd=new Food();
	Food[] ff=new Food[10];
	int x;
	int select;
	int edit;
	String newFood;
	float newPrice;
	public void adminDetails(ArrayList<Food> food){
		
		for(int i=0;i<10;i++){
		ff[i]=new Food();
		}
		System.out.println("SELECT WHAT TO DO");
		System.out.println("1. EDIT");
		System.out.println("2. DELETE");
		System.out.println("3. ADD");
		select=sc.nextInt();
		do{
			switch(select){
			case 1: 
			
			fd.printMenu(food);
			System.out.println("SELECT WHICH ITEM TO EDIT");
			edit=sr.nextInt();
			System.out.println("    "+edit+"   "+food.get(0).getId()+"  "+food.size());
			for(int i=0;i<10; i++){
			if(edit==food.get(i).getId()){
				System.out.println("    "+edit+"   "+food.get(i).getId());
				System.out.println("ENTER NEW FOOD ITEM");
				newFood=sn.nextLine();
				System.out.println("ENTER NEW PRICE");
				newPrice=sv.nextFloat();
				food.get(i).setFoodItem(newFood);
				food.get(i).setPrice(newPrice);
				System.out.println(food.get(i).getFoodItem());
				fd.printMenu(food);
				
			}
			}
				
		}
		System.out.println("DO YOU WISH TO EDIT MORE? 1.YES 2.NO");
		x=ss.nextInt();
		}while(x==1);
	}
	
}