public class Tdd {

 public static void main(String[] args) {
  //Taking input from Cars
   Car car1=new Car();
   Engine engine1=new Engine();
   car1.engine=engine1;
   Tyre tyre1=new Tyre();
   Tyre tyre2=new Tyre();
   Tyre tyre3=new Tyre();
   Tyre tyre4=new Tyre();
 /*car1.rearTyreLeft=tyre1;
car1.rearTyreRight=tyre2;
car1.frontTyreLeft=tyre3;
car1.frontTyreRight=tyre4;*/
car1.tyres[0]=tyre1;
car1.tyres[1]=tyre2;
car1.tyres[2]=tyre3;
car1.tyres[3]=tyre4;
   Driver driver1=new Driver();
   car1.driver=driver1;
   car1.inputDetails();
  
   
 Car car2=new Car();
   Engine engine2=new Engine();
   car2.engine=engine2;
   Tyre tyre5=new Tyre();
   Tyre tyre6=new Tyre();
   Tyre tyre7=new Tyre();
   Tyre tyre8=new Tyre();
 /*car2.rearTyreLeft=tyre5;
car2.rearTyreRight=tyre6;
car2.frontTyreLeft=tyre7;
car2.frontTyreRight=tyre8;*/
car2.tyres[0]=tyre5;
car2.tyres[1]=tyre6;
car2.tyres[2]=tyre7;
car2.tyres[3]=tyre8;
   Driver driver2=new Driver();
   car2.driver=driver2;
   car2.inputDetails();
  
   
 //comand to print about both cars*/
 
    car1.printDetails();
  car2.printDetails();
  
  }
}