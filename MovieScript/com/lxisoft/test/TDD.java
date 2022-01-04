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



Hero george = new Hero();
movie.george1 = george;

george.setName ("DILEEP");
george.setCharacterName ("GEORGE");


Heroine rajisha = new Heroine();
movie.rajisha1 = rajisha;

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

scpt.act[0] = george.getCharacterName();

scpt.act [1] = rajisha.getCharacterName();

scpt.act[2] = sharaf.getCharacterName();

scpt.act[3] = vinay.getCharacterName();

scpt.act[4] = chembanVinod.getCharacterName();

scpt.act[5] = anil.getCharacterName();




theater.theaterDetails();
}
}