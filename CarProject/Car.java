public class Car  {

private String Model;
 private String Brand;
private String RegisterNo;
private String Colour;
private String Price;
String M,B,RN,C,P; 
Tyre T1,T2,T3,T4;

public String getModel()  
{
return Model;
}
  public void setModel(String newModel)  
{
Model=this.M;
}
public String getBrand()  
{
return Brand;
}
 public void setBrand(String newBrand)  
{
Brand=this.B;
}
public String getRegisterNo()
{
return RegisterNo;
}
public void setRegisterNo(String nerRegisterNo)
{
 RegisterNo=this.RN;
}
public String getColour()
{
return Colour;
}
public void setColour(String Colour)
{
Colour=this.C;
}
public String getPrice()
{
return Price;
}
public void setPrice(String Price) 
{
Price=this.P;
}
public void printDetails()   { 
System.out.println("Car Brand:" + this.B);
System.out.println("Car Model:" + this.M);
System.out.println("Car Register Number:" + this.RN);
System.out.println("Car Colour:" + this.C);
System.out.println("Car Price:" + this.P);
System.out.println("\n");


T1.printDetails();
T2.printDetails();
T3.printDetails();
T4.printDetails();
}
}
