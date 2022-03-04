public class Car {
  String name;
  String model;
  String RegNo;
  String colour;
  String service;
  String fuel;
  
  Tyre t1;
  Tyre t2;
  Tyre t3;
  Tyre t4;
  
  public void inputDetails() {
  
  this.name= "VOLKSWAGEN";
  this.model= "VOLKSWAGEN POLO";
  this.RegNo= "Kl-09-AT-9812";
  this.colour= "BLUE";
  this.service ="kochi";
  this.fuel= "petrol/diesel";
  
  
  this.t1.radius="185/60";
  this.t1.brand="CEAT";
  this.t1.position="Front Right";
  
  this.t2.radius="185/60";
  this.t2.brand="CEAT";
  this.t2.position="Front Left";
  
  this.t3.radius="185/60";
  this.t3.brand="CEAT";
  this.t3.position="Back Left";
  
  this.t4.radius="185/60";
  this.t4.brand="CEAT";
  this.t4.position="Back Right";
  
  
  }
  void printDetails()
  {
  System.out.println("CAR NAME:" +name);
  System.out.println("CAR MODEL:" +model);
  System.out.println("CAR REGISTER NUMBER:" +RegNo);
  System.out.println("CAR COLOUR:" +colour);
  System.out.println("CAR service center:" +service );
  System.out.println("fuel type:" +fuel);
  System.out.println("--------------------------------------------------------------\n\n");
  t1.printDetails();
  t2.printDetails();
  t3.printDetails();
  t4.printDetails();
  System.out.println("---------------------------------------------------------------");
  }
  }