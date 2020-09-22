public class Cars
{
int price,i;
Door door1=new Door();
Door door2=new Door();
Door door3=new Door();

Tyre tyre1=new Tyre();
Tyre tyre2=new Tyre();
Tyre tyre3=new Tyre();

Model model1=new Model();
Model model2=new Model();
Model model3=new Model();

Driver driver1=new Driver();
Driver driver2=new Driver();
Driver driver3=new Driver();


public void print()
{
System.out.println("Name of the driver "+""+driver1.id);
System.out.println("Name of the car is "+""+model1.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of the car is "+""+door1.color);
System.out.println("Engine type is "+""+model1.engine);
System.out.println("The door size of 1st car is "+""+door1.size);
System.out.println("The door weight of 1st car is "+""+door1.price);
System.out.println("The tyre size of 1st car is "+""+tyre1.size);
System.out.println("The tyre type of 1st car is "+""+tyre1.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre1.no+"\n");
}
public void print2()
{
System.out.println("Name of the driver "+""+driver2.id);
System.out.println("Name of the car is "+""+model2.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of 2nd car is "+""+door2.color);
System.out.println("Engine type is "+""+model2.engine);
System.out.println("The door size of 2nd car is "+""+door2.size);
System.out.println("The tyre size of 2nd car is "+""+tyre2.size);
System.out.println("The tyre type of 2nd car is "+""+tyre2.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre2.no);
}
public void print3()
{
System.out.println("Name of the driver "+""+driver3.id);
System.out.println("Name of the car is "+""+model3.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of 2nd car is "+""+door3.color);
System.out.println("Engine type is "+""+model3.engine);
System.out.println("The door size of 2nd car is "+""+door3.size);
System.out.println("The tyre size of 2nd car is "+""+tyre3.size);
System.out.println("The tyre type of 2nd car is "+""+tyre3.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre3.no);
}
public void printd()
{
if (i==1)
{
System.out.println("The car is driven by his driver");
}
if(i==0)
{
System.out.println("The owner of the  car drives by himself");
}
}
}

