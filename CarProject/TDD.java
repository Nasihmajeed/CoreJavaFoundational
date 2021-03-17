class TDD
{
	public static void main(String [] args)
	{
		Car c1=new Car();
		c1.carName="Audi";
		
		
		CarColor clr=new CarColor();
		clr.carColor="white";
		clr.color();
		
		Fuel f= new Fuel();
		f.carFuel="Petrol";
		f.fuelType();
		
		Tyre t=new Tyre();
		t.carTyre="Normal";
		t.tyreType();
		
		Driver d=new Driver();
		d.isOwnerHasLicense=true;
		d.checkLicense();
		
		Engine e=new Engine();
		e.engineType="2000cc";
		e.engine();
		
		//ready to drive
		c1.drive();
		
		
		//car2
		
		Car c2=new Car();
		c2.carName="Benz";
		
		
		CarColor clr1=new CarColor();
		clr1.carColor="Black";
		clr1.color();
		
		Fuel f1= new Fuel();
		f1.carFuel="Diesel";
		f1.fuelType();
		
		Tyre t1=new Tyre();
		t1.carTyre="Normal";
		t1.tyreType();
		
		Driver d1=new Driver();
		d1.isOwnerHasLicense=false;
		d1.checkLicense();
		
		Engine e1=new Engine();
		e1.engineType="2000cc";
		e1.engine();
		
		//ready to drive
		c2.drive();
		
		
		
		//car3
		
		Car c3=new Car();
		c3.carName="Ferrari";
		
		
		CarColor clr2=new CarColor();
		clr2.carColor="DarkBlue";
		clr2.color();
		
		Fuel f2= new Fuel();
		f2.carFuel="Petrol";
		f2.fuelType();
		
		Tyre t2=new Tyre();
		t2.carTyre="Sports";
		t2.tyreType();
		
		Driver d2=new Driver();
		d2.isOwnerHasLicense=true;
		d2.checkLicense();
		
		Engine e2=new Engine();
		e2.engineType="3000cc";
		e2.engine();
		
		//ready to drive
		c3.drive();
		
		
		
	}
}