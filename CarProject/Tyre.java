public class Tyre 
{
String position;
String brand;
String size;
String tyretype;
String radius;


public Tyre(String position,String brand,String size, String tyretype,String radius){
        this.position = position;
        this.brand = brand;
        this.size = size;
        this.tyretype = tyretype;
        this.radius = radius; 
}
public void tyredetails()
{
System.out.println("Tyre Position :"+position);
System.out.println("Tyre Brand :"+brand);
System.out.println("Tyre Size :"+size);
System.out.println("Tyre Type :"+tyretype);
System.out.println("Tyre Radius :"+radius);

}
}