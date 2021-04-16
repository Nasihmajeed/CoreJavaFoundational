import java.util.*;
import java.util.ArrayList;

class User
{
ArrayList<Food> food=new ArrayList<Food>();
ArrayList<Drink> drinks=new ArrayList<Drink>();

Food f=new Food();
Drink d=new Drink();

public void authenticate()
{
	    f.setFood(food);
		d.setDrinks(drinks);
		
		System.out.println("Hi Sir/Madam!!!!!!!!!!!!!Welcome to Hotel Nalla Bakshanam!!!!!");
        System.out.println("We are happy to serve you......Please make your Order from the menu given below : ");
		
		f.printMenuFood();
		d.printMenuDrinks();
}

}