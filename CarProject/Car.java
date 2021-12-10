 public class Car  {

private String brand;
private String model;
private String registerNo;
private String colour;
private String price;
 
private Tyre T1,T2,T3,T4;


Car (String model,String brand,String registerNo,String colour,String price) {

this.model=model;
this.brand=brand;
this.registerNo=registerNo;
this.colour=colour;
this.price=price;

 }
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
public Tyre getT1()
{
return T1;
}
public void setT1(Tyre newT1)
{
this.T1=newT1;
}
public Tyre getT2()
{
return T2;
}
public void setT2(Tyre newT2)
{
this.T2=newT2;
}
public Tyre getT3()
{
return T3;
}
public void setT3(Tyre newT3)
{
this.T3=newT3;
}
public Tyre getT4()
{
return T4;
}
public void setT4(Tyre newT4)
{
this.T4=newT4;
}

public void printDetails()   { 

System.out.println("Car Brand : " + this.brand);
System.out.println("Car Model : " + this.model);
System.out.println("Car Register Number : " +this.registerNo);
System.out.println("Car Colour : " + this.colour);
System.out.println("Car Price : " + this.price);
System.out.println("\n");

T1.printDetails();
T2.printDetails();
T3.printDetails();
T4.printDetails();



System.out.println("_________________________");

}
}