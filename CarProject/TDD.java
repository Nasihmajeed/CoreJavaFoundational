public class Tdd {

  public static void main(String[] args) {

  //Taking input from Cars
   Car car1=new Car();
   Engine engine1=new Engine();
   car1.engine=engine1;
  Tyre[] tyre=new Tyre[9];
   for(int num =0;num<=7;num++){
   tyre[num]=new Tyre();
 }
  
for(int num=0;num<=3;num++){

//car1.tyres[num]=tyre[num];
car1.tyres[num]=new Tyre();
car1.tyres[num]=tyre[num];
}

   Driver driver1=new Driver();
   car1.driver=driver1;
   car1.inputDetails();
 
   
Car car2=new Car();
   Engine engine2=new Engine();
  car2.engine=engine2;
 for(int num=0;num<=3;num++){
 car2.tyres[num]=new Tyre();
car2.tyres[num]=tyre[4+num];
//car1.tyres[num]=new Tyre();
}
 Driver driver2=new Driver();
  car2.driver=driver2;
  car2.inputDetails();
  //comand to print about both cars*/
 
    car1.printDetails();
  car2.printDetails();
  
  }

  }