public class TDD
{
public static void main(String[] args)
{
car car=new car();
Door d=new door();
tyre t=new tyre();
Print pri=new print();
car.d.size=12;
car.d.weight=21;
car.d.color=blue;
car.t.size=15;
car.t.type=snow;

car car2=new car2();
door d2=new door();
tyre t2=new tyre();
car2.d2.size=12;
car2.d2.weight=21;
car2.d2.color=blue;
car2.t2.size=15;
car2.t2.type=snow;

System.out.println("the door size of 2nd car is"+car2.d2.size);
System.out.println("the door weight of 2nd car is"+car2.d2.weight);
System.out.println("the door color of 2nd car is"+car2.d2.color);
System.out.println("the tyre size of 2nd car is"+car2.t2.size);
System.out.println("the tyre type of 2nd car is"+car2.t2.type);
System.out.println("the door size of 1st car is"+car.d.size);
System.out.println("the door weight of 1st car is"+car.d.weight);
System.out.println("the door color of 1st car is"+car.d.color);
System.out.println("the tyre size of 1st car is"+car.t.size);
System.out.println("the tyre type of 1st car is"+car.t.type);
}
}
