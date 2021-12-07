public class Movie {
    String name;
    String genere;
    int year;
    String director;
    String producer;
    
   public void inputDetails() {
       this.name="THE FAULT IN OUR STARS";
       this.genere="Romance - Drama";
       this.year= 2014;
       this.director="Josh Boone";
       this.producer= "Marty Bowen and Wyck Godfrey";

   }
    
   public void printDetails (){

System.out.println("\t\t+----------------------------------+");
    
       System.out.println("\t\t" +name +"\n");

       System.out.println("\t\tGnere:" +genere);
       System.out.println("\t\tYear Of Release:" +year);
       System.out.println("\t\tDirector:" +director);
       System.out.println("\t\tProducers:" +producer +"\n");

       System.out.println("\t\t+----------------------------------+");

   
     	Hero hero = new Hero();
        hero.inputDetails();
		hero.printDetails();


      
		Heroine heroine = new Heroine();
		heroine.inputDetails();
		heroine.printDetails();

		

        Script script = new Script();
        script.inputDetails();
        script.printDetails();

   


   }

}
