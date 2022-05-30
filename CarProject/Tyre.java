public class Tyre 
{
String brand;
String model;
String type;
int tyre;
int radius;

Tyre(String brand,String model, String type,int tyre,int radius){
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.tyre = tyre;
        this.radius = radius; 
}
public void tyredetails()
{
System.out.println("Tyre Brand :"+brand);
System.out.println("Tyre Model :"+model);
System.out.println("Tyre Type :"+type);
System.out.println("Tyre  :"+tyre);
System.out.println("Tyre Radius :"+radius);
}
}