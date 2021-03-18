class driver{
	boolean hasLicense= false;
	public void LicenseCheck(){
			if(hasLicense==true){
				System.out.println("Owner can drive");	
			}
			else
			{
				System.out.println("only driver  can drive");	
			}
		}
	public void drive(){
	
		System.out.println("Changing gear");
		System.out.println("Accelarating");
		System.out.println("Tires are rolling");
		System.out.println("Off we go....");
	}
}