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
		Cars car = new Cars();
		Cars[] c = new Cars[num];
		for(int i=0; i<num; i++){
			c[i] = new Cars();
			c[i].cardetails();
		}
		for(int j=0; j<num; j++){
			c[j] = new Cars();
			c[j].printcardetails();
		}
	}
}
