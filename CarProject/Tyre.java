public class Tyre {

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

public void printTyreDetails() {

System.out.println("......TYRE.....\n");
System.out.println("Tyre Position is :"+ this.position);
System.out.println("Tyre Brand is :"+ this.brand);
System.out.println("Tyre Size is :"+ this.size);
System.out.println("Tyre Type is :"+ this.tyretype);
System.out.println("Tyre Radius is :"+ this.radius+"\n");

}

}
