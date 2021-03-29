import java.util.ArrayList;
class Bill{
	
	int foodId;
	String foodName;
	float foodPrice;
	int qnty;
	ArrayList<Bill> bill= new ArrayList<Bill>();
			Bill[] b=new Bill[10];
			
	
		
	public void Bill(){
		this.foodId=foodId;
		this.foodName=foodName;
		this.foodPrice=foodPrice;
		this.qnty=qnty;
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
	public void setQnty(int qnty){
		this.qnty=qnty;
	}
	public int getQnty(){
		return qnty;
	}
	
	public void printBill(ArrayList<Food> food, ArrayList<Bill> bill){
		Order order=new Order();
		System.out.println(" ----------------------------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.println(" -------------------BILL------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.println(" ----------------------------------------------- ");
		for(int i=0;i<bill.size();i++){
		System.out.println(bill.get(i).getFoodName()+"   "+bill.get(i).getFoodPrice()+" qty "+bill.get(i).getQnty());
		}
		System.out.println("-----------------------------------------------");
	System.out.println("-----------------------------------------------");
	}
	/* public void printTotal(){
		Order od=new Order();
		System.out.println("Total : "+ od.total);
	} */
}