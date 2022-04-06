package com.lxisoft.movie;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;



enum Genre{

ACTION,COMEDY,ROMANTIC,THRILLER;


}



public class Movie  {

	Scanner sc = new Scanner(System.in);
 

 private String name;
 private Genre genre;
private String language;


 private List< Actor> actors = new ArrayList<Actor> ();


Director director = new Director("Director 1");

Script script = new Script();

ScriptWriter scriptWriter = new ScriptWriter();

 public String getName()   {
	 return name;
 }
 public void setName(String newName)  {
	 this.name = newName;
 }
 
 
 public Genre getGenre() {
	 return genre;
 }
 public void setGenre(Genre newGenre)  {
	 this.genre = newGenre;
 }
 
 
 
 public String getLanguage()  {
	 return language;
 }
 public void setLanguage(String newLanguage)   {
	 this.language = newLanguage;
 }
 
 public List<Actor> getActors() {

		return actors;

	}

	public void setActors(List< Actor> actors) {

this.actors = actors;

	}
 
 public void movieDetails() throws Exception   {
	 
		 int number;
String selectLanguage;

System.out.println("Select Language");
System.out.println("1 = English");
System.out.println("2 = Malayalam");
selectLanguage = sc.nextLine();

switch (selectLanguage)  {

case "1":

selectLanguage = "English";
break;

case "2" :
selectLanguage = "Malayalam";
break;
}

System.out.println("");

System.out.println("You are Selected " + selectLanguage + " Language");


FileInputStream fileinputstream = new FileInputStream("../com/lxisoft/language/" + selectLanguage + "Language.properties");

Properties property= new Properties();

property.load(fileinputstream);

	 
	 System.out.println("\t\t\t\t\t\t\t" + property.getProperty("moviedetail"));
	 System.out.println("\t\t\t\t\t\t-------------------------");
		System.out.println("\t\t" + property.getProperty("movietypes"));
		System.out.println("\t\t____________________");
		System.out.println("\n");

		System.out.println("1 = Action");
		System.out.println("2 = Romantic");
		System.out.println("3 = Comedy");
		System.out.println("4 = Thriller");
		System.out.println("\n");

		System.out.println( property.getProperty("genretype"));
		 number= sc.nextInt();

			sc.nextLine();

			switch  (number)  {

case 1 :

 Genre genreAction = Genre.ACTION;
	genre =genreAction;

break;


case 2: 

Genre genreRomantic = Genre.ROMANTIC;
genre =genreRomantic;

break;


case 3:

Genre genreComedy = Genre.COMEDY;
genre =genreComedy;

break;


case 4:

Genre genreThriller = Genre.THRILLER;
genre =genreThriller;

break;
	

			}


		System.out.println(property.getProperty("moviename"));
		name = sc.nextLine();
		System.out.println("\n");
	 System.out.println(property.getProperty("availablelanguage"));
		System.out.println("*MALAYALAM");
		System.out.println(property.getProperty("selectmalayalam"));
		System.out.println("\n");
		System.out.println(property.getProperty("enternumber"));
		number = sc.nextInt();
sc.nextLine();

if (number ==1)  {

language = "MALAYALAM";

}

		if(number != 1)   {

			System.out.println(property.getProperty("wrongnumber"));

		}

		System.out.println("\t\t" +property.getProperty("name")+ this.name); 
	 System.out.println("\t\t" +property.getProperty("director") + director.getName());
		System.out.println("\t\t"  + property.getProperty("genre")+ this.genre);
		System.out.println("\t\t" + property.getProperty("language")+this.language);
	 System.out.println("\n");


 actors = director.castActors(property);

	scriptWriter.createDialogues();

	script = scriptWriter.addDialoguesToScenes(actors);

script.showScenes();

 }	
	

}