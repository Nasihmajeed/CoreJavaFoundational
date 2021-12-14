  public class Car  {

private String brand;
private String model;
private String registerNo;
private String colour;
private String price;
 

 Tyre [] tyres = new Tyre [5];



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


public void printDetails()   { 

System.out.println("Car Brand : " + this.brand);
System.out.println("Car Model : " + this.model);
System.out.println("Car Register Number : " +this.registerNo);
System.out.println("Car Colour : " + this.colour);
System.out.println("Car Price : " + this.price);
System.out.println("\n");

for(int x = 1; x <tyres.length; x++)  {
	
tyres[x].printDetails();

}
System.out.println("_________________________");

}
}