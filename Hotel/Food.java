import java.util.ArrayList;
import java.util.*;
class Food{
	int id;
	String foodItem;
	float price;
	int qty;
	public static ArrayList<Food> food=new ArrayList<Food>(10);
	

	ArrayList<Bill> bill= new ArrayList<Bill>(10);
	//ArrayList<Integer> qty=new ArrayList<Integer>(10);
	public Food(){
		this.id=id;
		this.foodItem=foodItem;
		this.price=price;
		this.qty=qty;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setFoodItem(String foodItem){
		this.foodItem=foodItem;
	}
	public String getFoodItem(){
		return foodItem;
		
	}
	public void setPrice(float price){
		this.price=price;
	}
	public float getPrice(){
		return price;
		
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public  void addMenu(ArrayList<Food> food){
		Food[] f=new Food[10];
		/* food.add(new Food());
		food.get(0).setFoodItem("Chappathi");
		food.get(0).setPrice(10);
		
		food.get(0).setId(1);
		food.add(new Food());
		food.get(1).setFoodItem("Parotta");
		food.get(1).setPrice(12);
		food.get(1).setId(2); */
		
		
		for(int i=0;i<10;i++){
		f[i]=new Food();
		}
		f[0].setId(1);
		f[0].setFoodItem("Chappathi");
		f[0].setPrice(9);
		f[0].setQty(0);
		f[1].setId(2);
		f[1].setFoodItem("Parotta");
		f[1].setPrice(10);
		f[1].setQty(0);
		f[2].setId(3);
		f[2].setFoodItem("Dosa");
		f[2].setPrice(7);
		f[2].setQty(0);
		f[3].setId(4);
		f[3].setFoodItem("Idli");
		f[3].setPrice(5);
		f[3].setQty(0);
		f[4].setId(5);
		f[4].setFoodItem("7-up");
		f[4].setPrice(30);
		f[4].setQty(0);
		f[5].setId(6);
		f[5].setFoodItem("Chicken Curry");
		f[5].setPrice(50);
		f[5].setQty(0);
		f[6].setId(7);
		f[6].setFoodItem("Beef Curry");
		f[6].setPrice(80);
		f[6].setQty(0);
		f[7].setId(8);
		f[7].setFoodItem("Mirinda");
		f[7].setPrice(35);
		f[7].setQty(0);
		f[8].setId(9);
		f[8].setFoodItem("Biriyani-Chicken");
		f[8].setPrice(110);
		f[8].setQty(0);
		f[9].setId(10);
		f[9].setFoodItem("Biriyani-Beef");
		f[9].setPrice(90);
		f[9].setQty(0);
		for(int i=0;i<10;i++){
		food.add(f[i]);
		}
		
			
	}
	public static void printMenu(ArrayList<Food> food){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST"+food.size());
		System.out.println("**********************************");

		int j=1;
		for(int i=0;i<food.size();i++){
			if(j<=food.size()){
			System.out.println(j+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
			j++;
		}
		}
	}
	public  void printMenuUser(ArrayList<Food> food){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST"+food.size());
		System.out.println("**********************************");

		int j=1;
		for(int i=0;i<food.size();i++){
			if(j<food.size()){
			System.out.println(j+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
			j++;
		}
		}
	}
	
}