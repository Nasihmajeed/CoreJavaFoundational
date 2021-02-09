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
System.out.println("The details of car"+"\n");
System.out.println("Car name"+""+model1.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of the car is "+""+door1.color);
System.out.println("Engine type is "+""+model1.engine);
System.out.println("The tyre size of car is "+""+tyre1.size);
System.out.println("The tyre type of car is "+""+tyre1.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre1.no+"\n");
}
public void print2()
{
System.out.println("The details of Second car "+"\n");
System.out.println("Car name"+""+model2.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of car is "+""+door2.color);
System.out.println("Engine type is "+""+model2.engine);
System.out.println("The tyre size of car is "+""+tyre2.size);
System.out.println("The tyre type of car is "+""+tyre2.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre2.no+"\n");
}
}

