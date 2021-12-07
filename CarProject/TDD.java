import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

for(int i = 1; i <=3; i++)  {

Car c = new Car();
System.out.println("CAR ="+i);



Tyre tyre = new Tyre();
c.T1= tyre;
Tyre tyre2 = new Tyre();
c.T2= tyre2;
Tyre tyre3 = new Tyre();
c.T3= tyre3;
Tyre tyre4 = new Tyre();
c.T4= tyre4;

c.printDetails();

}
}

}


