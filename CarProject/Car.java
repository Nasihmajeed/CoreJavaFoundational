public class Car
{
 String brand;
    String model;
    String color;
    

    
    Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
}
public void cardetails()
{
System.out.println("Car Brand :"+brand);
System.out.println("Car Model :"+model);
System.out.println("Car Color :"+color);
}
}