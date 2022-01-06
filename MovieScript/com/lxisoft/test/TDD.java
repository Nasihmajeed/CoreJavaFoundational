package com.lxisoft.test;
import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Villan;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Script;
import com.lxisoft.movie.Theater;

 
public class TDD  {


public static void main(String []args)  {

Theater theater = new Theater("MELAM","Cherppulassery","123456789");

Movie movie = new Movie ();
theater.movie1  = movie;




Hero hero = new Hero();
movie.hero1 = hero;

hero.getName();
hero.getCharacterName ();
}


Heroine heroine = new Heroine();
movie.rajisha1 = heroine;

rajisha.setName  ("RAJISHA VIJAYAN");
rajisha.setCharacterName  ("MERLIN");



Comedian sharaf= new Comedian();
movie.sharaf1= sharaf;

sharaf.setName("SHARAFUDHEEN");
sharaf.setCharacterName  ("PALLAN");


Comedian vinay = new Comedian();
movie.vinay1 = vinay;

vinay.setName ("VINAY");
vinay.setCharacterName  ("VAVA");



Villan chembanVinod  = new Villan();
movie.chemban1 = chembanVinod;

chembanVinod.setName ("CHEMBAN VINOD");
chembanVinod.setCharacterName("PETER MATHAYI");



Villan anil = new Villan();
movie.anil1 = anil;

anil.setName("ASSIM JAMAL");
anil.setCharacterName("ANIL");
 

Script scpt = new Script();
movie.sc1 = scpt;



theater.theaterDetails();
}
}