import java.util.*;
enum Type{
	VEG,NONVEG;
}
public class Eatables implements Food {
	String foodName;
	//String foodType;
	int prize;
	public void setName(String food){
		this.foodName = food;
	}
	public String getName(){
		return foodName;
	}
	//public void setType(String type){
	//	this.foodType = type;
	//}
	//public String getType(){
	//	return foodType;
	//}
	public void setPrize(int prize){
		this.prize = prize;
	}
	public int getPrize(){
		return prize;
	}
	Type type;
	//public Eatables(Type type){
	//	this.type = type;
	//}
	public void foodType(Type type){
		Menu menu = new Menu();
		Scanner s =new Scanner(System.in);
		switch(type){
			case VEG:
			menu.printVegCurryMenu();
			int more;
		    do{			
			            
		        System.out.println("\nSelect your order with the serial number : ");
		        int ordr = s.nextInt();
		        System.out.println("Do you need anything else \n1.Yes \n0.No");
		        more = s.nextInt();
		    }while(more != 0);
			break;
			case NONVEG:
			menu.printNonVegCurryMenu();
			int mre;
		    do{			
			            
		        System.out.println("\nSelect your order with the serial number : ");
		        int ordr = s.nextInt();
		        System.out.println("Do you need anything else \n1.Yes \n0.No");
		        mre = s.nextInt();
		    }while(mre != 0);
			break;
			default:
			System.out.println("Wrong Input");
			break;
		}
	}
}