public class Tdd {

  public static void main(String[] args) {

  //Taking input from Cars 1
   Car car1=new Car();
      //objects for car1
   
   Engine engine1=new Engine();
   Driver driver1=new Driver();
//assigning for methods of car 1

   car1.engine=engine1;
  car1.driver=driver1;
  
for(int num=0;num<=3;num++){
Tyre tyre=new Tyre();
car1.tyres[num]=tyre;
}
//input details
car1.inputDetails();


   // input for car 2
Car car2=new Car();
//objects for car 2
  Engine engine2=new Engine();
   Driver driver2=new Driver();


//assigng for method for car 2
 car2.engine=engine2;
car2.driver=driver2;
 for(int num=0;num<=3;num++){
 Tyre tyre=new Tyre();
 car2.tyres[num]=tyre;
}
 
 //input deatils of car2
  
  car2.inputDetails();
  
  
  //comand to print about both cars
 
    car1.printDetails();
 car2.printDetails();
  
  }

  }