package com.lxisoft.moviescript;


public class Theater {
  String name;
  String place;
  String phone;
  Movie movie=new Movie();
  public void inputDetails() {
    this.name="SATHYA MOVIE HOUSE";  
    this.place="PALAKKAD";
    this.phone="9678346784";

    movie.inputDetails();
    
  }
  public void printDetails (){

 
    System.out.println("\t\t+----------------------------------+");

    System.out.println("\t\tTheater Name:" +name);
    System.out.println("\t\tTheater Place:" +place);
    System.out.println("\t\tTheater Phone No:" +phone);

    System.out.println("\t\t+----------------------------------+");
    
    System.out.println();

  

    movie.printDetails();

    try{ 
      Thread.sleep(2000);
      }
catch(InterruptedException e)
     {
     Thread.currentThread().interrupt();
     }

    
  

    

     
  }
}
