public class Tdd {

  public static void main(String[] args) {

  //Taking input from Cars 1
   Car car1=new Car();
   //Array 
  // Tyre[] tyre=new Tyre[8];
   
   //objects for car1
   
   Engine engine1=new Engine();
   Driver driver1=new Driver();
   Tyre tyre0=new Tyre();
   Tyre tyre1=new Tyre();
   Tyre tyre2=new Tyre();
   Tyre tyre3=new Tyre();
//assigning for methods of car 1

car1.engine=engine1;
car1.driver=driver1;
car1.tyres0=tyre0;
car1.tyres1=tyre1;
car1.tyres2=tyre2;
car1.tyres3=tyre3;
//input details

car1.inputDetails();
//method to add tyre
 car1.addTyre();
   // input for car 2
   
Car car2=new Car();
//objects for car 2
   Engine engine2=new Engine();
   Driver driver2=new Driver();
   Tyre tyre4=new Tyre();
   Tyre tyre5=new Tyre();
   Tyre tyre6=new Tyre();
   Tyre tyre7=new Tyre();

//assigng for method for car 2

 car2.engine=engine2;
car2.driver=driver2;
car2.tyres0=tyre4;
car2.tyres1=tyre5;
car2.tyres2=tyre6;
car2.tyres3=tyre7;

 
 //input deatils of car2
  
  car2.inputDetails();
  // method to add tyre
  car2.addTyre();
  
  //comand to print about both cars*/
 
    car1.printDetails();
    car2.printDetails();
  
  }

  }