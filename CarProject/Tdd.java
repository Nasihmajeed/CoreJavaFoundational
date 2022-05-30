public class Tdd {
public static void main(String[] args) {
System.out.println(".........CAR1........");
System.out.println("\t");
Car car = new Car("Ford", "Aspire", "White");


Car car1 = new Car("Toyota", "Auris", "Blue");

Tyre tyre = new Tyre("Brand1","GOODYEAR", "Tubeless",4,3);

Tyre tyre1= new Tyre("Brand2","MRF","Tubeless",4,2);


car.cardetails();
System.out.println("\t");
tyre.tyredetails();

System.out.println("............CAR2........");
System.out.println("\t");
car1.cardetails();

System.out.println("\t");
tyre1.tyredetails();
	}
}