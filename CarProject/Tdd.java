package practice;

import java.util.Scanner;

class Car {
	String Brand;

	String Model;

	String RegNo;

	String Color;

	Scanner src = new Scanner(System.in);

	public void PrintDetails() {
		System.out.println("Enter the brand of a car : ");

		Brand = src.nextLine();

		System.out.println("Enter the model of a car : ");

		Model = src.nextLine();

		System.out.println("Enter registration number : ");

		RegNo = src.nextLine();

		System.out.println("Enter the color of the car : ");

		Color = src.nextLine();

		System.out.println("CAR BRAND IS :" + Brand);

		System.out.println("CAR MODEL IS :" + Model);

		System.out.println("CAR REGISTRATION NUMBER IS :" + RegNo);

		System.out.println("COLOR OF THE CAR IS :" + Color);

	}
}

class Tyre {

	String Brand;

	float Radius;

	String t1, t2, t3, t4;

	public void typeOfTyre()

	{
		System.out.println("TYRE BRAND IS : " + Brand);

		System.out.println("TYRE RADIUS IS : " + Radius);

		System.out.println("THE CAR TYRES ARE : " +t1+ " ," +t2+ "," +t3+ ", " +t4);
	}

}

public class TDD {

	public static void main(String[] ar) {

		System.out.println("WELCOME TO OUR CAR FACTORY");

		Car c = new Car();

		c.PrintDetails();

		Tyre t = new Tyre();

		t.Brand = "MRF";

		t.Radius = 5.25f;

		t.t1 = "FRONT_LEFT_TYRE";

		t.t2 = "FRONT_RIGHT_TYRE";

		t.t3 = "BACK_RIGHT_TYRE";

		t.t4 = "BACK_LEFT_TYRE";

		t.typeOfTyre();
	}
}
