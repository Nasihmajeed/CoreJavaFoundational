import java.util.ArrayList;
class Bill{
	
	int foodId;
	String foodName;
	float foodPrice;
	ArrayList<Bill> bill= new ArrayList<Bill>();
			Bill[] b=new Bill[10];
			
	
		
	public void Bill(){
		this.foodId=foodId;
		this.foodName=foodName;
		this.foodPrice=foodPrice;
	}
	public void setFoodId(int foodId){
		this.foodId=foodId;
	}
	public int getFoodId(){
		return foodId;
	}
	public void setFoodName(String foodName){
		this.foodName=foodName;
	}
	public String getFoodName(){
		return foodName;
		
	}
	public void setFoodPrice(float foodPrice){
		this.foodPrice=foodPrice;
	}
	public float getFoodPrice(){
		return foodPrice;
	}
	/* public void saveBill(ArrayList<Food> food, ArrayList<Bill> bill){
		for (int i=0;i<10;i++){
		b[i]=new Bill();
	}for (int i=0;i<10;i++){
	b[i].setFoodId(food.get(i).getId());
	b[i].setFoodName(food.get(i).getFoodItem());
	b[i].setFoodPrice(food.get(i).getPrice());
	bill.add(b[i]);
	}
	} */
	
	public void printBill(ArrayList<Food> food, ArrayList<Bill> bill){
		
		System.out.println(" ----------------------------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.println(" -------------------BILL------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.println(" ----------------------------------------------- ");
		for(int i=0;i<bill.size();i++){
		System.out.println(bill.get(i).getFoodName()+"   "+bill.get(i).getFoodPrice());
		}
		System.out.println("-----------------------------------------------");
	System.out.println("-----------------------------------------------");
	}
	/* public void printTotal(){
		Order od=new Order();
		System.out.println("Total : "+ od.total);
	} */
}