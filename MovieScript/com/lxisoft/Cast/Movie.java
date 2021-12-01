public class Movie {
    String name;
    String genere;
    int year;
    String director;
    String producer;
    
   public void inputDetails() {
       this.name="MeesaMadhavan";
       this.genere="Comedy - Drama";
       this.year= 2002;
       this.director="Lal Jose";
       this.producer= "Moviekshetra";

   }
    
   public void printDetails (){
    
       System.out.println("Movie Name:" +name);
       System.out.println("Gnere:" +genere);
       System.out.println("Year Of Release:" +year);
       System.out.println("Production Company:" +producer);
   }

}
