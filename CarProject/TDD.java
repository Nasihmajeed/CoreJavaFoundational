//import CarProjectDemo4.Engine;


public class Tdd {

 public static void main(String[] args) {
  //Taking input from Cars
   Car car1=new Car();
   Engine engine1=new Engine();
   car1.engine=engine1;
   Tyre tyre1=new Tyre();
   car1.tyre=tyre1;
   Driver driver1=new Driver();
   car1.driver=driver1;
   car1.inputDetails();
  
   
  Car car2=new Car();
   Engine engine2=new Engine();
   car2.engine=engine2;
   Tyre tyre2=new Tyre();
   car2.tyre=tyre2;
   Driver driver2=new Driver();
   car2.driver=driver2;
   car2.inputDetails();
 //comand to print about both cars  
    car1.printDetails();
   car2.printDetails();
  
  }
}