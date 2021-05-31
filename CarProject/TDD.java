public class Tdd {

  public static void main(String[] args) {

  //Taking input from Cars 1
   Car car1=new Car();
   //Array 
   Tyre[] tyre=new Tyre[8];
   
   //objects for car1
   
   Engine engine1=new Engine();
   Driver driver1=new Driver();
  for(int num =0;num<=3;num++){
 tyre[num]=new Tyre();
}
//assigning for methods of car 1

   car1.engine=engine1;
  car1.driver=driver1;
for(int num=0;num<=3;num++){
car1.tyres[num]=tyre[num];
}
//input details

car1.inputDetails();
 
   // input for car 2
Car car2=new Car();
//objects for car 2
   Engine engine2=new Engine();
   Driver driver2=new Driver();
   for(int num =4;num<=7;num++){
 tyre[num]=new Tyre();
}

//assigng for method for car 2

 car2.engine=engine2;
car2.driver=driver2;
 for(int num=0;num<=3;num++){
 car2.tyres[num]=tyre[4+num];
}
 
 //input deatils of car2
  
  car2.inputDetails();
  
  
  //comand to print about both cars*/
 
    car1.printDetails();
  car2.printDetails();
  
  }

  }