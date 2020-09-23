public class TDD
{
public static void main(String[] args)
{
int i;

Cars car1=new Cars();

car1.price=120000;
car1.model1.name="benz";
car1.model1.engine="Petrol";
car1.door1.size=12;
car1.door1.price=23;
car1.door1.color="blue";
car1.tyre1.type="Snow";
car1.tyre1.size=15;
car1.tyre1.no=4;
car1.driver1.id=121;
car1.driver1.i=1;
car1.print();
car1.printd(car1.driver1.i);

Cars car2=new Cars();

car2.price=70000;
car2.model2.name="Audi";
car2.model2.engine="Diesel";
car2.door2.size=14;
car2.door2.price=53;
car2.door2.color="yellow";
car2.tyre2.type="Mud";
car2.tyre2.size=21;
car2.tyre2.no=5;
car2.driver2.id=122;
car2.driver2.i=0;
car2.print2();
car2.printd(car2.driver2.i);

Cars car3=new Cars();

car3.price=850000;
car3.model3.name="BMW";
car3.model3.engine="Electric";
car3.door3.size=14;
car3.door3.price=53;
car3.door3.color="yellow";
car3.tyre3.type="Mud";
car3.tyre3.size=21;
car3.tyre3.no=5;
car3.driver3.id=123;
car3.driver3.i=1;
car3.print3();
car3.printd(car3.driver3.i);
}
}
