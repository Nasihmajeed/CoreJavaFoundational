public class TDD
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.driver1 = new Driver();
		car1.name = "Maruthi";
		car1.regNo = "KL 09 AM 35";
		car1.model = 2016;
		car1.driver1.name = "Suresh";
		car1.driver1.id = 1234;
		
		Car car2 = new Car();
		car2.driver2 = new Driver();
		car2.name = "Ford";
		car2.regNo = "KL 01 BZ 4710";
		car2.model = 2020;
		car2.driver2.name = "Rajesh";
		car2.driver2.id = 1783;

		System.out.println("Car Name: "+car1.name);
		System.out.println("Car Register No: "+car1.regNo);
		System.out.println("Driver name: "+car1.driver1.name);
		System.out.println("Driver id: "+car1.driver1.id);


		System.out.println("Car Name: "+car2.name);
		System.out.println("Car Register No: "+car2.regNo);
		System.out.println("Driver name: "+car2.driver2.name);
		System.out.println("Driver id: "+car2.driver2.id);
	}
}