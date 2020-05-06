package  com.lxisoft.forest;
import java.util.*;
public class Lion extends Animal implements Carnivores 
{
	public void eat()
	{
		System.out.println("Lion Eats Flesh");
	}
	public void run()
	{
		System.out.println("Lion Runs Fast");	
	}
}