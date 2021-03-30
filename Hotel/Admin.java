/* import java.util.Scanner;
import java.util.ArrayList;
class Admin{
	Scanner sc=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	Food fd=new Food();
	Food[] ff=new Food[10];
	int select;
	int edit;
	String newFood;
	public void adminDetails(ArrayList<Food> food){
		for(int i=0;i<10;i++){
		ff[i]=new Food();
		}
		System.out.println("SELECT WHAT TO DO");
		System.out.println("1. EDIT");
		System.out.println("2. DELETE");
		System.out.println("3. ADD");
		select=sc.nextInt();
		switch(select){
			case 1: 
			fd.addMenu();
			System.out.println("SELECT WHICH ITEM TO EDIT");
			edit=sr.nextInt();
			System.out.println("    "+edit+"   "+food.get(0).getId());
			for(int i=0;i<food.size(); i++){
			if(edit==food.get(i).getId()){
				System.out.println("ENTER NEW FOOD ITEM");
				newFood=sn.nextLine();
				ff[i].setFoodItem(newFood);
				
			}
			}
			
		}
	}
	
} */