public class Car
{
 String brand;
    String model;
    String color;
    String registerNo;
    String price;

Tyre tyre1;
Tyre tyre2;
Tyre tyre3;
Tyre tyre4;

    

    Car(String brand, String model, String color, String registerNo, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNo = registerNo;
        this.price = price;
}
public void printdetails()
{
System.out.println("Car Brand :"+this.brand);
System.out.println("Car Model :"+this.model);
System.out.println("Car Color :"+this.color);
System.out.println("Car RegisterNo :"+ this.registerNo);
System.out.println("Car Price :"+this.price+"\n");

tyre1.printTyreDetails();



tyre2.printTyreDetails();


tyre3.printTyreDetails();



tyre4.printTyreDetails();


}

}