public class Tyre {

private String brand ;
private String position;
private String radius;
int x,i = 1;
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
for(x = 1; x <=4; x++)  { 
System.out.println("TYRE");
System.out.println("Brand Is : Brand" +i +"-"+ x);
System.out.println("Position Is :Position "+ i+"-" +x);
System.out.println("Radius Is : Radius "+i+x);
System.out.println("\n"); 
}
i = i +1;  
 
}
}