package com.lxisoft.moviescript;

public class Theater {
 
  private String name;
 private String place;
 private String phone;
  

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
    
  
     public void showtheaterDetails () {

    System.out.println("\t\t        -- Theater Details --");

    System.out.println("\t\t+----------------------------------+");

    System.out.println("\t\tTheater Name:" +name);
    System.out.println("\t\tTheater Place:" +place);
    System.out.println("\t\tTheater Phone No:" +phone +"\n");

    System.out.println("\t\t+----------------------------------+");

    Movie movie = new Movie();

    
      movie.showmovieDetails();
     
  }
}

