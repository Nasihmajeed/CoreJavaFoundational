public class Movie  {

 private String name;
 private String genre;
private String language;
 George grge;
 Rajisha raji;
 Sharaf srf;
 Vinay vny;
 ChembanVinod cbvd;
 Anil anl;
 Script sc1;
 
 
 
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
	 
	 
	 System.out.println("\t\t\t\t\t\t\tMOVIE DETAIL");
	 System.out.println("\t\t\t\t\t\t-------------------------");
	System.out.println("\t\tName :" + this.name); 
	 System.out.println("\t\tGenre :" + this.genre);
	 System.out.println("\t\tLanguage :" + this.language);
	 System.out.println("\n");
	
	System.out.println("\t\t\t\t\t\t\tACTORS DETAILS");
	System.out.println("\t\t\t\t\t\t______________________________");
	System.out.println("\n");
	
	 grge.actorDetails();
	 
	 raji.actorDetails();
	 
	 srf.actorDetails ();
	 
	 vny.actorDetails();
	 
	 cbvd.actorDetails();
	 
	 anl.actorDetails();
	 
	 sc1.scene1Details();

		sc1.scene3Details();
 }	 
}