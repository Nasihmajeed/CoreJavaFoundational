class Tyre{
	String side;
	String type;
	String model;
	int rate;
}
class Door{
	String side;
	String type;
	int rate;
}
class Steering{
	String type;
	int rate;
}
public class Car{
	public static void main(String[] args) {
		String brand_name = "IZUZU";
		String model_name = "Monster Truck";
		String owner_name = "BABS";
		String reg_num = "KL 51 N 80";
		String color = "Black";
		System.out.println("Car Details : ");
		System.out.println("\n Brand Name : "+brand_name);
		System.out.println("\n Model : "+model_name);
		System.out.println("\n Owner : "+owner_name);
		System.out.println("\n Registration number : "+reg_num);
		System.out.println("\n Color : "+color);
		
		Tyre t1 = new Tyre();
		Tyre t2 = new Tyre();
		Tyre t3 = new Tyre();
		Tyre t4 = new Tyre();
		
		Door d1 = new Door();
		Door d2 = new Door();
		Door d3 = new Door();
		Door d4 = new Door();
		
		Steering steer = new Steering();
		
		t1.side = "Front Right";
		t1.type = "Baloon size";
		t1.model = "off road";
		t1.rate = 4500;
		t2.side = "Front Left";
		t2.type = "Baloon size";
		t2.model = "off road";
		t2.rate = 4500;
		t3.side = "\nBack Right";
		t3.type = "Baloon size";
		t3.model = "off road";
		t3.rate = 4500;
		t4.side = "Back Left";
		t4.type = "Baloon size";
		t4.model = "off road";
		t4.rate = 4500;
		System.out.println("\nTyre Details : ");
		System.out.println(t1.side);
		System.out.println(t1.type);
		System.out.println(t1.model);
		System.out.println(t1.rate);
		System.out.println(t2.side);
		System.out.println(t2.type);
		System.out.println(t2.model);
		System.out.println(t2.rate);
		System.out.println(t3.side);
		System.out.println(t3.type);
		System.out.println(t3.model);
		System.out.println(t3.rate);
		System.out.println(t4.side);
		System.out.println(t4.type);
		System.out.println(t4.model);
		System.out.println(t4.rate);

		d1.side = "Front Right";
		d1.type = "butter fly";
		d1.rate = 2100;
		d2.side = "Front Left";
		d2.type = "butter fly";
		d2.rate = 2100;
		d3.side = "\nBack Right";
		d3.type = "Slide";
		d3.rate = 1500;
		d4.side = "Back Left";
		d4.type = "Slide";
		d4.rate = 1500;
		System.out.println("\nDoor deatils : ");
		System.out.println(d1.side);
		System.out.println(d1.type);
		System.out.println(d1.rate);
		System.out.println(d2.side);
		System.out.println(d2.type);
		System.out.println(d2.rate);
		System.out.println(d3.side);
		System.out.println(d3.type);
		System.out.println(d3.rate);
		System.out.println(d4.side);
		System.out.println(d4.type);
		System.out.println(d4.rate);
		
		steer.type = "Power";
		steer.rate = 2500;
		System.out.println("\nSteering type : ");
		System.out.println(steer.type);
		System.out.println(steer.rate);
	}
}