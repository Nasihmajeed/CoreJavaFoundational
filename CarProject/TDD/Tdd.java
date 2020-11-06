package Tdd;
import java.util.*;
import CarDetails.Cars;
//import CarDetails.Tyre;
//import CarDetails.Door;
//import CarDetails.Steering;
public class Tdd{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number of cars : ");
		int num = n.nextInt();
		Cars c = new Cars();
		c.enter(num);
		c.display(num);		 
	}
}
