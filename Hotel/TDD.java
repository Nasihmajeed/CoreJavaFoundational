import java.util.ArrayList;
class TDD{
	public static void main(String[] args){
		ArrayList<Bill> bill= new ArrayList<Bill>();
		ArrayList<Food> food=new ArrayList<Food>(10);
		Hotel h= new Hotel();
		User u=new User();
		h.displayHotel();
		u.userDetails();
		Food fd=new Food();
		fd.addMenu();
		Order o=new Order();
		o.takeOrder(food,bill);
		//Bill b1=new Bill();
		//b.printBill();
		//b1.printTotal();
	
		
		
		}
	
}