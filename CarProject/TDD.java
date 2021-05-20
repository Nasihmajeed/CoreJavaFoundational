public class Tdd {

  public static void main(String[] args) {
   Car firstCar=new Car();
   Car secondCar=new Car();
  Engine firstCarEngine = new Engine();
  Driver firstCarDriver=new Driver();
  Engine secondCarEngine = new Engine();
  Driver secondCarDriver=new Driver();
  Tyre firstCarTyreType=new Tyre();
  Tyre secondCarTyreType=new Tyre();
 Color firstCarColor=new Color();
Color secondCarColor=new Color();

   firstCar.carDetails();
 firstCarEngine.engineDetails();
 firstCarTyreType.tyreDetails();
 firstCarColor.colorDetails();
 firstCarDriver.driverDetails();
   secondCar.carDetails();
secondCarEngine.engineDetails();
secondCarTyreType.tyreDetails();
secondCarColor.colorDetails();
secondCarDriver.driverDetails();

   firstCar.printCarDetails();
 firstCarEngine.printEngineDetails();  
 firstCarTyreType.printTyreDetails();
 firstCarColor.printColorDetails();
 firstCarDriver.printDriverDetails();
   secondCar.printCarDetails();
 secondCarEngine.printEngineDetails();
 secondCarTyreType.printTyreDetails();
 secondCarColor.printColorDetails();
 secondCarDriver.printDriverDetails();
  }
}

