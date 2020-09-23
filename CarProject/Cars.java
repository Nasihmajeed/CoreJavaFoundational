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
System.out.println("--------The details of first car Owner is--------"+"\n");
System.out.println("Id of the driver "+""+driver1.id);
System.out.println("Name of the car is "+""+model1.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of the car is "+""+door1.color);
System.out.println("Engine type is "+""+model1.engine);
System.out.println("The door size of car is "+""+door1.size);
System.out.println("The door weight of car is "+""+door1.price);
System.out.println("The tyre size of car is "+""+tyre1.size);
System.out.println("The tyre type of car is "+""+tyre1.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre1.no+"\n");
//System.out.println("The car is driven by his driver");
}
public void print2()
{
System.out.println("--------The details of Second car Owner is--------"+"\n");
System.out.println("Id of the driver "+""+driver2.id);
System.out.println("Name of the car is "+""+model2.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of car is "+""+door2.color);
System.out.println("Engine type is "+""+model2.engine);
System.out.println("The door size of car is "+""+door2.size);
System.out.println("The tyre size of car is "+""+tyre2.size);
System.out.println("The tyre type of car is "+""+tyre2.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre2.no+"\n");
//System.out.println("The car is driven by the owner");
}
public void print3()
{
System.out.println("--------The details of Third car Owner is--------"+"\n");
System.out.println("Id of the driver "+""+driver3.id);
System.out.println("Name of the car is "+""+model3.name);
System.out.println("Price of the car is "+""+price);
System.out.println("The color of the car is "+""+door3.color);
System.out.println("Engine type is "+""+model3.engine);
System.out.println("The door size of car is "+""+door3.size);
System.out.println("The tyre size of car is "+""+tyre3.size);
System.out.println("The tyre type of car is "+""+tyre3.type);
System.out.println("The no: of tyres including steppiny is "+""+tyre3.no+"\n");
//System.out.println("The car is driven by his driver");
}

//public void printd()
//{
//System.out.println("")

//}

public void printd(int i)
{
switch(i)
{
case 1: System.out.println("The car is driven by his driver"+"\n");
break;
case 0: System.out.println("THe care is driven by his owner"+"\n");
break;

}
}
}



