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
    System.out.println("Theater Name:" +name);
    System.out.println("Theater Place:" +place);
    System.out.println("Theater Phone No:" +phone);
    
    System.out.println();

    movie.printDetails();

    

     
  }
}
