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
System.out.println("Car Color :"+color+"\n");

Tyre t1 = new Tyre("Front_Left_Tyre", "MRF", "F1", "Tubless", "2");

 
Tyre t2 = new Tyre("Front_Right_Tyre", "MRF", "F1", "Tubless", "2");


Tyre t3 = new Tyre("Back_Left_Tyre", "CEAT", "F2", "Tubless", "2.5");


Tyre t4 = new Tyre("Back_Right_Tyre", "CEAT", "F2", "Tubless", "2.5");

 t1.tyredetails();

System.out.println("\t");

 t2.tyredetails();


System.out.println("\t");


 t3.tyredetails();


System.out.println("\t");


 t4.tyredetails();


System.out.println("\t");

}

}