public class Tdd {

public static void main(String[] args) {




System.out.println(".........CAR1........");


System.out.println("\t");


Car car = new Car("Ford", "Aspire", "White", "KL 51 7722", "11111");



Tyre t1 = new Tyre("Front_Left_Tyre", "MRF", "F1", "Tubless", "2");

car.tyres[1]=t1;


 Tyre t2 = new Tyre("Front_Right_Tyre", "MRF", "F1", "Tubless", "2");

car.tyres[2]=t2;


Tyre t3 = new Tyre("Back_Left_Tyre", "CEAT", "F2", "Tubless", "2.5");

car.tyres[3]=t3;

Tyre t4 = new Tyre("Back_Right_Tyre", "CEAT", "F2", "Tubless", "2.5");

car.tyres[4]=t4;




car.printdetails();


System.out.println("\n");



	}
 }