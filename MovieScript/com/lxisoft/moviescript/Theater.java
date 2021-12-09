package com.lxisoft.moviescript;

import com.lxisoft.moviescript.*;
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

    System.out.println("\t\t        -- Theater Details --");

    System.out.println("\t\t+----------------------------------+");

    System.out.println("\t\tTheater Name:" +name);
    System.out.println("\t\tTheater Place:" +place);
    System.out.println("\t\tTheater Phone No:" +phone +"\n");

    System.out.println("\t\t+----------------------------------+");
    
    System.out.println();

  

    movie.printDetails();
     
  }
}

