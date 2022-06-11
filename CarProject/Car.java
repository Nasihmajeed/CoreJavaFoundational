public class Car
{
 String brand;
    String model;
    String color;
    String registerNo;
    String price;

  Tyre [] tyres = new Tyre [5];
    

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


tyres[1].printTyreDetails();



tyres[2].printTyreDetails();


tyres[3].printTyreDetails();



tyres[4].printTyreDetails();


}

}