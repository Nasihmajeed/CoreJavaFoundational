import java.util.Scanner;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Car car1 = new Car();
		car1.driver1 = new Driver();
		System.out.println("enter the name of car: ");
		car1.name = in.next();
		System.out.println("enter the register number of car: ");
		car1.regNo = in.next();
		System.out.println("enter the model/year of car: ");
		car1.model = in.nextInt();
		System.out.println("enter the name of car driver: ");
		car1.driver1.name = in.next();
		System.out.println("enter the id of car driver:");
		car1.driver1.id = in.nextInt();
		
		Car car2 = new Car();
		car2.driver2 = new Driver();
		System.out.println("enter the name of car: ");
		car2.name = in.next();
		System.out.println("enter the register number of car: ");
		car2.regNo = in.next();
		System.out.println("enter the model/year of car: ");
		car2.model = in.nextInt();
		System.out.println("enter the name of the driver: ");
		car2.driver2.name = in.next();
		System.out.println("enter the id of car driver: ");
		car2.driver2.id = in.nextInt();

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