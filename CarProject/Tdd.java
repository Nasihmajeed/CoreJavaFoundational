 public class Tdd {

public static void main(String[] args) {




System.out.println(".........CAR1........");


System.out.println("\t");


Car car = new Car("Ford", "Aspire", "White", "KL 51 7722", "11111");


for(int k=1; k<5; k++) {


Tyre tyre = new Tyre(" position"+k," brand"+k," S-"+k," Tubeless"+k," R-"+k);


car.tyres[k] = tyre;


}


car.printdetails();


System.out.println("\n");



	}
 }