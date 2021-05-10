public class TDD {

  public static void main(String ar[]) {
  //car1
   Car c1= new Car();
   c1.carname="MG";
   c1.drive();
   Carcolor clr1= new Carcolor();
  clr1.color="Black";
  clr1.clr();
  Fuel f1=new Fuel();
  f1.carFuel="Petrol";
  f1.fuelType();
  Tyre T1=new Tyre();
  T1.CarTyre="Normal";
  T1.crtyr();
  Driver d1= new Driver();
  d1.PassangerLicense=true ;
  d1.license();
  Engine e1= new Engine();
  e1.engineType="Normal";
  e1.engine();
  //car2
  Car c2= new Car();
   c2.carname="Tesla";
   c2.drive();
   Carcolor clr2= new Carcolor();
  clr2.color="Red";
  clr2.clr();
  Fuel f2=new Fuel();
  f2.carFuel="Electric";
  f2.fuelType();
  Tyre T2=new Tyre();
  T2.CarTyre="Sports";
  T2.crtyr();
  Driver d2= new Driver();
  d2.PassangerLicense=false  ;
  d2.license();
  Engine e2= new Engine();
  e2.engineType="sports";
  e2.engine();
  //car3
  Car c3= new Car();
   c3.carname="TATA Nexon";
   c3.drive();
   Carcolor clr3= new Carcolor();
  clr3.color="White";
  clr3.clr();
  Fuel f3=new Fuel();
  f3.carFuel="Hybrid";
  f3.fuelType();
  Tyre T3=new Tyre();
  T3.CarTyre="Normal";
  T3.crtyr();
  Driver d3= new Driver();
  d3.PassangerLicense=true ;
  d3.license();
  Engine e3= new Engine();
  e3.engineType="High Power";
  e3.engine();
  }
}
