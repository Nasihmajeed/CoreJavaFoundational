package com.LxiSoft.Test;
import java.util.*;
import com.LxiSoft.CarDetails.Cars;
import com.LxiSoft.CarDetails.Steering;
public class Tdd{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number of cars : ");
		int num = n.nextInt();
		Cars car = new Cars();
		car.carDetails(num);
		car.printCarDetails(num);
		car.findDriver(num);
	}
}

