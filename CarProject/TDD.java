import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

for(int i = 1; i <=3; i++)  {

Car c = new Car("brand"+i,"model"+i,"registerNo"+i,"colour"+i,"price"+i);
System.out.println("CAR :" +i);



Tyre tyre = new Tyre(i+"1",i+"1",i+"1");
c.T1= tyre;
Tyre tyre2 = new Tyre(i+"2",i+"2",i+"2");
c.T2= tyre2;
Tyre tyre3 = new Tyre(i+"3",i+"3",i+"3");
c.T3= tyre3;
Tyre tyre4 = new Tyre(i+"4",i+"4",i+"4");
c.T4= tyre4;

c.printDetails();

}
}

}


