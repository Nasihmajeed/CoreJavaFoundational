 import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

for(int i = 1; i <=3; i++)  {

Car c = new Car("brand"+i,"model"+i,"registerNo"+i,"colour"+i,"price"+i);
System.out.println("CAR :" +i);


for(int j = 1; j <5; j++)  {


Tyre tyre = new Tyre("brand"+i+j,"position"+i+j,"R-"+i+j);
c.tyres[j] = tyre;



}
c.printDetails();

}
}

}


