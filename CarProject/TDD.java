class TDD{
	public static void main(String[] args){
	//First Car
	design d1= new design();
	d1.design();
	Car car1= new Car();
	car1.brand="Benz";
	car1.CarBrand();
	tyre t1= new tyre();
	t1.Tyre="Normal";
	t1.tyreType();
	engine e1= new engine();
	e1.Engine="diesel engine";
	e1.engineType();
	fuel f1=new fuel();
	f1.Fuel="Petrol";
	f1.fuelType();
	driver dr1= new driver();
	dr1.hasLicense=true;
	dr1.LicenseCheck();
	dr1.drive();
	
	//Second Car
	
	d1.design();
	Car car2= new Car();
	car2.brand="Porsche";
	car2.CarBrand();
	tyre t2= new tyre();
	t2.Tyre="Sport";
	t2.tyreType();
	engine e2= new engine();
	e2.Engine="special engine";
	e2.engineType();
	fuel f2=new fuel();
	f2.Fuel="Premium Gasoline";
	f2.fuelType();
	driver dr2= new driver();
	dr2.hasLicense=false;
	dr2.LicenseCheck();
	dr2.drive();
	
		//Third Car
	
	d1.design();
	Car car3= new Car();
	car3.brand="Tesla";
	car3.CarBrand();
	tyre t3= new tyre();
	t3.Tyre="Normal";
	t3.tyreType();
	engine e3= new engine();
	e3.Engine="petrol engine";
	e3.engineType();
	fuel f3=new fuel();
	f3.Fuel="Electric";
	f3.fuelType();
	driver dr3= new driver();
	dr3.hasLicense=false;
	dr3.LicenseCheck();
	dr3.drive();
}
}