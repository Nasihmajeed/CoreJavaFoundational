package com.lxisoft.test;
import com.lxisoft.carproject.Car;
import java.util. Scanner;
public class TDD
{
	public static void main(String[] args)
	{
		Car car=new Car();

		String cname;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter car name");
		cname=scanner.nextLine();
		car.setCarName(cname);
		car.getCarName();

		String oname;

		
		System.out.println("Enter owner name");
		oname=scanner.nextLine();
		car.setOwnerName(oname);
		car.getOwnerName();

		car.carDetails();
		car.printCarDetails();
	}
}



		