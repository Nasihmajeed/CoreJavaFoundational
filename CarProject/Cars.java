public class Cars
{
int price;
Door door1=new Door();
Door door2=new Door();
Tyre tyre1=new Tyre();
Tyre tyre2=new Tyre();
Model model1=new Model();
Model model2=new Model();


public void print()
{
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
System.out.println("Name of the car is "+""+model2.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of 2nd car is "+""+door2.color);
System.out.println("Engine type is "+""+model2.engine);
System.out.println("The door size of 2nd car is "+""+door2.size);
System.out.println("The tyre size of 2nd car is "+""+tyre2.size);
System.out.println("The tyre type of 2nd car is "+""+tyre2.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre2.no);
}}
