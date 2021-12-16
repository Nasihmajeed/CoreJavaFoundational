public class Movie  {

 private String name;
 private String genre;
 private String language;
 
 
 public String getName()  {
	 return name;
 }
 public void setName(String newName)  {
	 this.name = newName;
 }
 
 
 public String getGenre()  {
	 return genre;
 }
 public void setGenre(String newGenre)  {
	 this.genre = genre;
 }
 
 
 public String getLanguage()  {
	 return language;
 }
 public void setLanguage(String newLanguage)  {
	 this.language = language;
 }
 
 
 
 public void details()   {
	 
   this.name = "THE GREAT FATHER";
   this.genre = "ACTION";
   this.language = "MALAYALAM";

 }
 
 
 public void printDetails()   {
	 
	 
	 System.out.println("  MOVIE DETAIL");
	 System.out.println("----------------");
	System.out.println("Name :" + this.name); 
	 System.out.println("Genre :" + this.genre);
	 System.out.println("Language :" + this.language);
	 System.out.println("\n");
	 
	 
	 
	 
 }	 
}