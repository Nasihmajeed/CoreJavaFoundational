public class Movie  {

 private String name;
 private String genre;
private String language;
 Hero hr1;
 Heroine hn1;
 Comedian cmd;
 Villan v1;
 Dialogue d1;
 
 
 
 public String getName()   {
	 return name;
 }
 public void set(String newName)  {
	 this.name = newName;
 }
 
 
 public String getGenre() {
	 return genre;
 }
 public void setGenre(String newGenre)  {
	 this.genre = newGenre;
 }
 
 
 
 public String getLanguage()  {
	 return language;
 }
 public void setLanguage(String newLanguage)   {
	 this.language = newLanguage;
 }
 


 
 public void movieDetails()  {
	 
	name = "GEORGETTAN'S POORAM";
genre = "COMEDY";
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
	 
	 v1.printDetails();
	 
	 d1.printDetails();
 }	 
}