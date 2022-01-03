package com.lxisoft.moviescript;

//import com.lxisoft.moviescript.*;
public class Theater {
 private String name;
 private String place;
 private String phone;
  
  
  //public void setupMovie() {

    public String getName() {
      return name;
    }

    public void setName(String name){  
      this.name=name;  
      }

      public String getPlace() {
        return place;
      }

      public void setPlace(String place){  
        this.place=place;  
        }

        public String getPhone() {
          return phone;
        }
  
        public void setPhone(String phone){  
          this.phone=phone;  
          }
  
  
   /* this.name="SATHYA MOVIE HOUSE";  
    this.place="PALAKKAD";
    this.phone="9678346784";*/

   // movie.setupMovie();
    
  
  public void viewTheater () {

    System.out.println("\t\t        -- Theater Details --");

    System.out.println("\t\t+----------------------------------+");

    System.out.println("\t\tTheater Name:" +name);
    System.out.println("\t\tTheater Place:" +place);
    System.out.println("\t\tTheater Phone No:" +phone +"\n");

    System.out.println("\t\t+----------------------------------+");
    
    System.out.println();

    Movie movie=new Movie();

       movie.setName ("THE FAULT IN OUR STARS");
       movie.setGenere("Romance - Drama");
       movie.setYear( 2014);
       movie.setDirector("Josh Boone");
       movie.setProducer("Marty Bowen and Wyck Godfrey");

    movie.playMovie();
     
  }
}

