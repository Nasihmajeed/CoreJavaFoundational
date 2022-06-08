public class Tdd {

public static void main(String[] args) {




System.out.println(".........CAR1........");


System.out.println("\t");


Car car = new Car("Ford", "Aspire", "White", "KL 51 7722", "11111");


Tyre T1 = new Tyre("Front_Left_Tyre", "MRF", "F1", "Tubless", "2");

car.tyre1=T1;


 Tyre T2 = new Tyre("Front_Right_Tyre", "MRF", "F1", "Tubless", "2");

car.tyre2=T2;


Tyre T3 = new Tyre("Back_Left_Tyre", "CEAT", "F2", "Tubless", "2.5");

car.tyre3=T3;

Tyre T4 = new Tyre("Back_Right_Tyre", "CEAT", "F2", "Tubless", "2.5");

car.tyre4=T4;


car.printdetails();

System.out.println("\n");

T1.printtyreDetails();

System.out.println("\n");

T2.printtyreDetails();

System.out.println("\n");


T3.printtyreDetails();


System.out.println("\n");



T4.printtyreDetails();


	}
 }