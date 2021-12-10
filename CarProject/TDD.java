import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

for(int i = 1; i <=3; i++)  {

Car c = new Car("brand"+i,"model"+i,"registerNo"+i,"colour"+i,"price"+i);
System.out.println("CAR :" +i);




Tyre tyre = new Tyre("brand"+i+"1","position"+i+"1",i+"1");
c.setT1  (tyre);

Tyre tyre2 = new Tyre("brand"+i+"2","position"+i+"2",i+"2");
c.setT2(tyre2);

Tyre tyre3 = new Tyre("brand"+i+"3","position"+i+"3",i+"3");  
c.setT3(tyre3);

Tyre tyre4 = new Tyre("brand"+i+"4","position"+i+"4",i+"4");
c.setT4(tyre4);


c.printDetails();

}
}

}


