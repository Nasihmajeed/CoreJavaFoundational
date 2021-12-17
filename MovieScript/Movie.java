public class Movie  {

 String name;
  String genre;
 String language;
 Hero hr1;
 Heroine hn1;
 Comedian cmd;
 
 public void showDetails()  {
	 
	name = "THE GREAT FATHER";
genre = "ACTION";
language = "MALAYALAM";	
	 	 
	 
 }
 
 
 
 public void printDetails()   {
	 
	 
	 System.out.println("  MOVIE DETAIL");
	 System.out.println("----------------");
	System.out.println("Name :" + this.name); 
	 System.out.println("Genre :" + this.genre);
	 System.out.println("Language :" + this.language);
	 System.out.println("\n");
	
	System.out.println(" ACTORS DETAILS");
	System.out.println("_________________");
	System.out.println("\n");
	
	 hr1.printDetails();
	 
	 hn1.printDetails();
	 
	 cmd.printDetails();
 }	 
}