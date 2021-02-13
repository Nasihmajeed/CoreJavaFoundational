public class Cars
{
long price1=500000;
long price2=200000;
long price3=700000;

String car1Name="Alto";
String car2Name="I10";
String car3Name="Beat";

Door door1=new Door();
Door door2=new Door();
Door door3=new Door();

Tyre tyre1=new Tyre();
Tyre tyre2=new Tyre();
Tyre tyre3=new Tyre();

Brand model1=new Brand();
Brand model2=new Brand();
Brand model3=new Brand();

Driver driver1=new Driver();
Driver driver2=new Driver();
Driver driver3=new Driver();

public void print1()
{
System.out.println("***** Car Detail 1 *****");
System.out.println("-------------------------");
System.out.println("Brand of the car is : "+model1.name1);
System.out.println("Name of the car is : "+car1Name);
System.out.println("Price of the car is : "+price1);
System.out.println("Driver of the car :"+driver1.driv_name1);
System.out.println("Age of Driver :"+driver1.age1);
System.out.println("No.of doors in the car :"+door1.door_no);
System.out.println("Type of the door :"+door1.door_type);
System.out.println("No.of tyres : "+tyre1.ty_no);
System.out.println("Company of the tyre : "+tyre1.ty_name1);f
System.out.println("-------------------------");
System.out.println("\n");
}
public void print2()
{
System.out.println("***** Car Detail 2 *****");
System.out.println("-------------------------");
System.out.println("Brand of the car is : "+model2.name2);
System.out.println("Name of the car is : "+car2Name);
System.out.println("Price of the car is : "+price2);
System.out.println("Driver of the car : "+driver2.driv_name1);
System.out.println("Age of Driver : "+driver2.age2);
System.out.println("No.of doors in the car : "+door2.door_no);
System.out.println("Type of the door : "+door2.door_type);
System.out.println("No.of tyres : "+tyre2.ty_no);
System.out.println("Company of the tyre : "+tyre2.ty_name2);
System.out.println("-------------------------");
System.out.println("\n");
}
public void print3()
{
System.out.println("***** Car Detail 3 *****");
System.out.println("-------------------------");
System.out.println("Brand of the car is : "+model3.name3);
System.out.println("Name of the car is : "+car3Name);
System.out.println("Price of the car is : "+price3);
System.out.println("Driver of the car : "+driver3.driv_name3);
System.out.println("Age of Driver : "+driver3.age3);
System.out.println("No.of doors in the car : "+door3.door_no);
System.out.println("Type of the door : "+door3.door_type);
System.out.println("No.of tyres : "+tyre3.ty_no);
System.out.println("Company of the tyre : "+tyre3.ty_name3);
System.out.println("-------------------------");
System.out.println("\n");
}
}


