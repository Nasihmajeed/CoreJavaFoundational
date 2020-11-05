class Tyre{
	String type;
	String model;
	int rate;
}
class Door{
	String type;
	int rate;
}
class Steering{
	String type;
	int rate;
}
public class Car{
	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		Door door = new Door();
		Steering steer = new Steering();
		tyre.type = "Baloon size";
		tyre.model = "off road";
		tyre.rate = 4500;
		System.out.println(tyre.type);
		System.out.println(tyre.model);
		System.out.println(tyre.rate);
		door.type = "butter fly";
		door.rate = 2100;
		System.out.println(door.type);
		System.out.println(door.rate);
		steer.type = "Power";
		steer.rate = 2500;
		System.out.println(steer.type);
		System.out.println(steer.rate);
	}
}
































/*public class Car{
	String brand_name = "Toyota";
	String model_name = "Innova";
	Door d1, d2,d3,d4;
	//Tyre t1,t2,t3,t4;
	//Steer steering;
	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println(mycar.brand_name);
		System.out.println(mycar.model_name);
		mycar.d1 = "Front 1";
		mycar.d2 = "front 2";
		mycar.d3 = "back 1";
		mycar.d4 = "back 2";
		System.out.println(mycar.d1);
		System.out.println(mycar.d2);
		System.out.println(mycar.d3);
		System.out.println(mycar.d4);
	}
}*/