public class Car {

	String brand;
	String model;
	String regNo;
	String color;
	Tyre flTyre, frTyre, brTyre, blTyre;

	public void printDetails() {
		System.out.println("CAR BRAND IS : " + this.brand);
		System.out.println("CAR MODEL IS : " + this.model);
		System.out.println("CAR REGISTERED AS : " + this.regNo);
		System.out.println("COLOR OF THE CAR IS : " + this.color);
		
		System.out.println("--------------------------------------");
		flTyre.printDetails();
		System.out.println("--------------------------------------");
		frTyre.printDetails();
		System.out.println("--------------------------------------");
		brTyre.printDetails();
		System.out.println("--------------------------------------");
		blTyre.printDetails();
		
	}

	public Tyre createTyre(String tyrePosition) {
		Tyre tyre = new Tyre();
		tyre.tyrePosition = tyrePosition;
		tyre.tyreType = "Run-Flat";
		tyre.brand = "CEAT";
		tyre.radius = "8";
		return tyre;
		
	}
}