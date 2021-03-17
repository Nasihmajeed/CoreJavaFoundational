class Car
{
	//String carColor="red";
	//String carFuel="petrol";
	boolean isOwnerHasLicense=true;
	
	
	public void color(String carColor)
	{
		System.out.println("The color of the car is "+carColor);
	
	}
	public void fuel(String carFuel)
	{
		System.out.println("The fuel of the car is "+carFuel);
	}
	
	public void tyreType(String tyre)
	{
		System.out.println("The tyre type of the car is "+tyre);
	}
	public void checkLicense()
	{
		if(isOwnerHasLicense==true)
		{
			System.out.println("Owner can drive");	
		}
		else
		{
			System.out.println("only driver  can drive");	
		}
	}
	
	public void engine()
	{
		System.out.println("The Engine Starts");
	
	}
	
	public void drive()
	{
		System.out.println("Change the gear");
		System.out.println("Accelrating");
		System.out.println("Tires are moving");
		System.out.println("Let's go!!!");
		
	}
	
	
}


class CarTestDrive
{
public static void main(String [] args)
{
	Car audi=new Car(); //audi car object
	
	audi.color("white");
	audi.fuel("Petrol");
	
	audi.isOwnerHasLicense=false; //audi owner hasnt have  a license
	audi.checkLicense(); // checked if he can drive or not
	
	
	// drive
	audi.tyreType("Normal");
	audi.engine();
	audi.drive();	
	
	System.out.println("-------------------------------");
	Car benz=new Car();
	
	benz.color("Black");
	benz.fuel("Disel");
	benz.isOwnerHasLicense=true;// by default all owner has license,so do benz owner;	
	benz.checkLicense();
	
	
	//drive
	benz.tyreType("Normal");
	benz.engine();
	benz.drive();
	System.out.println("-------------------------------");
	
	
	Car ferrari = new Car();

		ferrari.color("Dark blue");
		ferrari.fuel("petrol");
		
		ferrari.checkLicense(); //owenr has got license by default
		
		//drive
		
		ferrari.tyreType("sports");
		ferrari.engine();
		ferrari.drive();
		
		System.out.println("-------------------------------");
		
}
}