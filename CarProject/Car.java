public class Car  {

private String model;
private String brand;
private String registerNo;
private String colour;
private String price;
 
Tyre T1,T2,T3,T4;

public String getModel()  
{
return model;
}
  public void setModel(String newModel)  
{
this.model=newModel;
}
public String getBrand()  
{
return brand;
}
 public void setBrand(String newBrand)  
{
this.brand=newBrand;
}
public String getRegisterNo()
{
return registerNo;
}
public void setRegisterNo(String newRegisterNo)
{
 this.registerNo=newRegisterNo;
}
public String getColour()
{
return colour;
}
public void setColour(String newColour)
{
this.colour=newColour;
}
public String getPrice()
{
return price;
}
public void setPrice(String newPrice) 
{
this.price=newPrice;
}
public void printDetails()   { 
for (int i = 1; i <= 3; i++)  {
System.out.println("CAR :" + i);
System.out.println("Car Brand" + i+ ": Brand" + i);
System.out.println("Car Model" + i+ ": Model" + i);
System.out.println("Car Register Number" + i +":Register Number"+i+i);
System.out.println("Car Colour" + i + ":Colour" +i);
System.out.println("Car Price" + i + ":Price"+i+i+i);
System.out.println("\n");


T1.printDetails();
T2.printDetails();
T3.printDetails();
T4.printDetails();
}
}
}