import java.util.ArrayList;
class Food{
	int id;
	String foodItem;
	float price;
	ArrayList<Food> food=new ArrayList<Food>();
	Food[] f=new Food[10];
	Order o=new Order();
	public void Food(){
		this.id=id;
		this.foodItem=foodItem;
		this.price=price;
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
	public void addMenu(){
		
		for(int i=0;i<10;i++){
		f[i]=new Food();
		}
		f[0].setId(1);
		f[0].setFoodItem("Chappathi");
		f[0].setPrice(9);
		f[1].setId(2);
		f[1].setFoodItem("Parotta");
		f[1].setPrice(10);
		f[2].setId(3);
		f[2].setFoodItem("Dosa");
		f[2].setPrice(7);
		f[3].setId(4);
		f[3].setFoodItem("Idli");
		f[3].setPrice(5);
		f[4].setId(5);
		f[4].setFoodItem("7-up");
		f[4].setPrice(30);
		f[5].setId(6);
		f[5].setFoodItem("Chicken Curry");
		f[5].setPrice(50);
		f[6].setId(7);
		f[6].setFoodItem("Beef Curry");
		f[6].setPrice(80);
		f[7].setId(8);
		f[7].setFoodItem("Mirinda");
		f[7].setPrice(35);
		f[8].setId(9);
		f[8].setFoodItem("Biriyani-Chicken");
		f[8].setPrice(110);
		f[9].setId(10);
		f[9].setFoodItem("Biriyani-Beef");
		f[9].setPrice(90);
		for(int i=0;i<10;i++){
		food.add(f[i]);
		}
		System.out.println("**********************************");
		System.out.println("MENU LIST");
		System.out.println("**********************************");

		
		for(int i=0;i<10;i++){
			System.out.println(food.get(i).getId()+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
		}
			o.takeOrder(food);
	}
	
}