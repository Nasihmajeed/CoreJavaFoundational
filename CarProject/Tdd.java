import java.util.Scanner;

public class TDD {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME TO OUR CAR WORLD\n");
		for (int i = 1; i <= 3; i++) {
			System.out.println("CAR-" + i + "\n");
			Car car = new Car();
			System.out.println("Enter the brand of a car : ");
			car.brand = scanner.nextLine();
			System.out.println("Enter the model of a car : ");
			car.model = scanner.nextLine();
			System.out.println("Enter registration number : ");
			car.regNo = scanner.nextLine();
			System.out.println("Enter the color of the car : ");
			car.color = scanner.nextLine();
			
			car.flTyre = car.createTyre("FRONT_LEFT_TYRE");
			car.frTyre = car.createTyre("FRONT_RIGHT_TYRE");
			car.brTyre = car.createTyre("BACK_RIGHT_TYRE");
			car.blTyre = car.createTyre("BACK_LEFT_TYRE");

			System.out.println("-------------------------------\n");
			System.out.println("DETAILS OF CAR " + i + "\n");
			car.printDetails();
			System.out.println("\n**************************************\n\n");
		}
		scanner.close();
	}
}