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
public void printTyreDetails()
{
System.out.println("......TYRE.....\n");
System.out.println("Tyre Position :"+ this.position);
System.out.println("Tyre Brand :"+ this.brand);
System.out.println("Tyre Size :"+ this.size);
System.out.println("Tyre Type :"+ this.tyretype);
System.out.println("Tyre Radius :"+this.radius+"\n");

}
}