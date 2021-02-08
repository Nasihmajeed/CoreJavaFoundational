public class TDD
{
public static void main(String[] args)
{
int i;

Cars car1=new Cars();

car1.price=300000;
car1.model1.name="alto";
car1.model1.engine="Petrol";
car1.door1.price=23;
car1.door1.color="white";
car1.tyre1.type="MRF";
car1.tyre1.size=15;
car1.tyre1.no=4;
car1.print();

Cars car2=new Cars();

car2.price=400000;
car2.model2.name="Swift";
car2.model2.engine="Petrol";
car2.door2.size=14;
car2.door2.color="Red";
car2.tyre2.size=21;
car2.tyre2.no=5;
car2.print2();
car2.printd(car2.driver2.i);

Cars car3=new Cars();

car3.price=700000;
car3.model3.name="Ertiga";
car3.model3.engine="Petrol";
car3.door3.size=20;
car3.door3.color="Black";
car3.tyre3.size=21;
car3.tyre3.no=5;
car3.print3();
car3.printd(car3.driver3.i);
}
}
