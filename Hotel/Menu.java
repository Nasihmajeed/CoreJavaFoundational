import java.util.*;
public class Menu{
	Eatables eat = new Eatables();
	Drinks drink = new Drinks();
	
	ArrayList<Eatables> eatable = new ArrayList<Eatables>();
	ArrayList<Drinks> drinks = new ArrayList<Drinks>();
	ArrayList<Food> vegCurry = new ArrayList<Food>();
	ArrayList<Food> nonVegCurry = new ArrayList<Food>();
	public void setMenu(){
		eatable.add(new Eatables());
		eatable.get(0).setName("Poratta");
		eatable.get(0).setPrize(30);

		eatable.add(new Eatables());
		eatable.get(1).setName("Pathiri");
		eatable.get(1).setPrize(25);
		
		drinks.add(new Drinks());
		drinks.get(0).setName("Lemonide");
		drinks.get(0).setPrize(15);

		drinks.add(new Drinks());
		drinks.get(1).setName("Fresh Juice");
		drinks.get(1).setPrize(17);
	}
	public void setVegCurryMenu(){
		vegCurry.add(new Eatables());
		vegCurry.get(0).setName("Stew");
		
		vegCurry.add(new Eatables());
		vegCurry.get(1).setName("Sambar");
		
	}
	public void setNonVegCurryMenu(){
		nonVegCurry.add(new Eatables());
		nonVegCurry.get(0).setName("Chicken Gravy");

		nonVegCurry.add(new Eatables());
		nonVegCurry.get(1).setName("Beef Gravy");

	}
	public void getEatables(int n){
	    int j = eatable.size();	
		//Food food = new Food();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Dish ");
		    String foodName = s.next();
		    
		    System.out.println("Enter the prize of that dish ");
		    int prize = s.nextInt();
		    eatable.add(new Eatables());		    
		    eatable.get(j).setName(foodName);
		    
		    eatable.get(j).setPrize(prize);
		    j++;
		}
		System.out.println("The new Menu");
		this.printEatMenu();
	}
	public void getDrinks(int n){
	    int l = drinks.size();	
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Drink ");
		    String drinkName = s.next();

		    System.out.println("Enter the prize of that drink ");
		    int prizee = s.nextInt();
		    drinks.add(new Drinks());		    
		    drinks.get(l).setName(drinkName);

		    drinks.get(l).setPrize(prizee);
		    l++;
		}
		System.out.println("The new Menu");
		this.printDrinkMenu();
	}
	public void editEatables(int index){
		Scanner s = new Scanner(System.in);	
		System.out.println("Insert the new amount");
		int newPrize = s.nextInt();
		eatable.get(index-1).setPrize(newPrize);
		System.out.println("The updated Menu ");
		this.printEatMenu();
	}
	public void editDrinks(int index){
		Scanner s = new Scanner(System.in);	
		System.out.println("Insert the new amount");
		int nwPrize = s.nextInt();
		drinks.get(index-1).setPrize(nwPrize);
		System.out.println("The updated Menu ");
		this.printDrinkMenu();
	}
	public void deleteEatMenu(int index){
		Scanner s = new Scanner(System.in);
		eatable.remove(index-1);
		System.out.println("The updated Menu ");
		this.printEatMenu();
	}
	public void deleteDrinkMenu(int index){
		Scanner s = new Scanner(System.in);
		drinks.remove(index-1);
		System.out.println("The updated Menu ");
		this.printDrinkMenu();
	}
	
	public void printEatMenu(){
		//this.setMenu();
		System.out.println("+---------+-------------+-------------+");
		System.out.println("+=============== FOOD ================+");
		System.out.println("+---------+-------------+-------------+");
		System.out.println("  S.No\t    Food    \t  Rate\t");
		System.out.println("+---------+-------------+-------------+");
		System.out.println(eatable.size());
		for(int i=0; i<eatable.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+eatable.get(i).getName()+"\t "+eatable.get(i).getPrize()+"    \t");
		}
		System.out.println("+---------+-------------+-------------+");
	}
	public void printDrinkMenu(){
		//this.setMenu();
		System.out.println("+---------+-------------+-------------+");
		System.out.println("+============== DRINKS ===============+");
		System.out.println("+---------+-------------+-------------+");
		System.out.println("  S.No\t    Drinks    \t  Rate\t");
		System.out.println("+---------+-------------+-------------+");
		System.out.println(drinks.size());
		for(int i=0; i<drinks.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+drinks.get(i).getName()+"\t "+drinks.get(i).getPrize()+"    \t");
		}
		System.out.println("+---------+-------------+-------------+");
	}

	public void printVegCurryMenu(){
		this.setVegCurryMenu();
		System.out.println("+---------+-------------+");
		System.out.println("  S.No\t    Food    ");
		System.out.println("+---------+-------------+");
		System.out.println(vegCurry.size());
		for(int i=0; i<vegCurry.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+vegCurry.get(i).getName()+"\t ");
		}
		System.out.println("+---------+-------------+");
	}
	public void printNonVegCurryMenu(){
		this.setNonVegCurryMenu();
		System.out.println("+---------+-------------+");
		System.out.println("  S.No\t    Food    ");
		System.out.println("+---------+-------------+");
		System.out.println(nonVegCurry.size());
		for(int i=0; i<nonVegCurry.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+nonVegCurry.get(i).getName()+"\t ");
		}
		System.out.println("+---------+-------------+");
	}
	int totalFoodPrize=0;
	int totalDrinksPrize=0;
	int total=0;
	public void getFoodOrder(int order, int quantity){
		int prize = quantity*eatable.get(order-1).getPrize();
		totalFoodPrize = totalFoodPrize+prize;	
	}
	public void getDrinkOrder(int order, int quantity){
		int price = quantity*drinks.get(order-1).getPrize();
		totalDrinksPrize = totalDrinksPrize+price;	
	}
	public void totalAmount(){
		int tot = totalDrinksPrize+totalFoodPrize;
		total = total+tot;
		System.out.println("+--------------------------+");
		System.out.println("  Total\t: "+total);	
		System.out.println("+--------------------------+");
	}
}