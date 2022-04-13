public class Tyre {

private String brand ;
private String position;
private String radius;


Tyre (String brand,String position,String radius)  {

this.brand=brand;
this.position=position;
this.radius=radius;

}

public String getBrand()
{
return brand;
}
public void setBrand(String newBrand)
{
this.brand=newBrand;
}

public String getPosition()
{
return position;
}
public void setPosition(String newPosition)
{
this.position = newPosition;
}
public String getRadius()
{
return radius;
}
public void setRadius(String newRadius)
{ 
this.radius=newRadius;
}
public void printDetails()
 {

System.out.println("TYRE");
System.out.println("Brand Is: " + this.brand);
System.out.println("Position Is: "+ this.position);
System.out.println("Radius Is: "+ this.radius);
System.out.println("\n"); 
  
 
}
}