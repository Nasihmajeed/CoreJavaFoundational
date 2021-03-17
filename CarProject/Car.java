class Car{
	String Brand;
	String color;
	String FuelType;
	String EngineStatus;
	String Tyre;
	boolean LicenseCheckOwner= false;
	void CarColor(){
		System.out.println("color of "+ Brand +" is " + color);
	}
	void Fuel(){
		System.out.println("Fuel Type is " + FuelType);
	}	
	public void tyreType(){
		System.out.println("The tyre type of the car is "+ Tyre);
	}
		public void LicenseCheck(){
			if(LicenseCheckOwner==true){
				System.out.println("Owner can drive");	
			}
			else
			{
				System.out.println("only driver  can drive");	
			}
		}
	
	public void engine()
	{
		System.out.println("The "+ Brand +" Engine Starts");
	
	}
	
	public void drive()
	{
		System.out.println("Changing gear");
		System.out.println("Accelarating");
		System.out.println("Tires are rolling");
		System.out.println("Off we go....");
		
	}
	void design(){
		System.out.println("*****************************************");
	}
}
class CarTestDrive{
	public static void main (String[] args){
		Car car1=new Car();
		car1.design();
		car1.color="blue";
		car1.Brand="Benz";
		car1.CarColor();
		car1.FuelType="Diesel";
		car1.Fuel();
		car1.LicenseCheckOwner=true;
		car1.LicenseCheck();
		car1.Tyre="Normal";
		car1.tyreType();
		car1.engine();
		car1.drive();
		car1.design();
		
		Car car2=new Car();
		car2.design();
		car2.color="Red";
		car2.Brand="Porsche";
		car2.CarColor();
		car2.FuelType="Premium Gasoline";
		car2.Fuel();
		car2.LicenseCheckOwner=false;
		car2.LicenseCheck();
		car2.Tyre="Sports";
		car2.tyreType();
		car2.engine();
		car2.drive();
		car2.design();
		
		Car car3=new Car();
		car3.design();
		car3.color="Black";
		car3.Brand="Tesla";
		car3.CarColor();
		car3.FuelType="Electric";
		car3.Fuel();
		car3.LicenseCheckOwner=true;
		car3.LicenseCheck();
		car3.Tyre="Normal";
		car3.tyreType();
		car3.engine();
		car3.drive();
		car3.design();
	}
}