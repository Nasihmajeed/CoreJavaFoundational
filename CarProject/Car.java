class Tyre
{
	String position;
	String type;
	String model;
	String brand;
	int rate;
}
class Door
{
	String position;
	String type;
	String color;
}
class Steering
{
	String position;
	String type;
	int rate;
}
public class Car
{
	public static void main(String[] args) {
		String brand = "Volkswagen";
		String model = "Polo";
		String owner = "Jithin";
		String number = "KL 65 H 4770";
		String color = "Black";
		
		
		Tyre t1 = new Tyre();
		Tyre t2 = new Tyre();
		Tyre t3 = new Tyre();
		Tyre t4 = new Tyre();
		
		Door d1 = new Door();
		Door d2 = new Door();
		Door d3 = new Door();
		Door d4 = new Door();
		
		Steering steer = new Steering();
		
		t1.position = "\nFront Right : ";
		t1.type = "Radials";
		t1.model = "Dueler";
		t1.brand = "Bridgestone";
		t1.rate = 3500;
		t2.position = "\nFront Left : ";
		t2.type = "Radials";
		t2.model = "Dueler";
		t2.brand = "Bridgestone";
		t2.rate = 3500;
		t3.position = "\nBack Right : ";
		t3.type = "Radials";
		t3.model = "Dueler";
		t3.brand = "Bridgestone";
		t3.rate = 3500;
		t4.position = "\nBack Left : ";
		t4.type = "Radials";
		t4.model = "Dueler";
		t4.brand = "Bridgestone";
		t4.rate = 3500;
		

		d1.position = "\nFront Right : ";
		d1.type = "Side ways";
		d1.color = "Body color";
		d2.position = "\nFront Left : ";
		d2.type = "Side ways";
		d2.color = "Body color";
		d3.position = "\nBack Right : ";
		d3.type = "Side ways";
		d3.color = "Body color";
		d4.position = "\nBack Left : ";
		d4.type = "Side ways";
		d4.color = "Body color";
		
		
		steer.type = "Power Steering";
		steer.position = "Right Hand Drive";
		steer.rate = 3000;

		

		System.out.println("_____Car Info_____ ");
		System.out.println("\nBrand Name		: "+brand);
		System.out.println("Model 			: "+model);
		System.out.println("Owner 			: "+owner);
		System.out.println("Registration	: "+number);
		System.out.println("Color 			: "+color);

		System.out.println("\n_____Door Info_____");
		System.out.println(d1.position);
		System.out.println(d1.type);
		System.out.println(d1.color);
		System.out.println(d2.position);
		System.out.println(d2.type);
		System.out.println(d2.color);
		System.out.println(d3.position);
		System.out.println(d3.type);
		System.out.println(d3.color);
		System.out.println(d4.position);
		System.out.println(d4.type);
		System.out.println(d4.color);

		System.out.println("\n_____Tyre Info_____");
		System.out.println(t1.position);
		System.out.println(t1.type);
		System.out.println(t1.model);
		System.out.println(t1.brand);
		System.out.println(t1.rate);
		System.out.println(t2.position);
		System.out.println(t2.type);
		System.out.println(t2.model);
		System.out.println(t2.brand);
		System.out.println(t2.rate);
		System.out.println(t3.position);
		System.out.println(t3.type);
		System.out.println(t3.model);
		System.out.println(t3.brand);
		System.out.println(t3.rate);
		System.out.println(t4.position);
		System.out.println(t4.type);
		System.out.println(t4.model);
		System.out.println(t4.brand);
		System.out.println(t4.rate);

		System.out.println("\n_____Steering Info_____");
		System.out.println(steer.position);
		System.out.println(steer.type);
		System.out.println(steer.rate);
	}
}