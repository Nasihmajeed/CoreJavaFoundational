import java.util.ArrayList;
class Food{
	ArrayList<String> food=new ArrayList<String>();
	public void menuList(){
		food.add("Chappathi");
		food.add("Parotta");
		System.out.println("MENU LIST");
		for (int i=0;i<food.size();i++){
			System.out.println(food.get(i));
		}
	}
}