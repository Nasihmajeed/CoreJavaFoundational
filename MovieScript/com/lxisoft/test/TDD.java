package com.lxisoft.test;
import com.lxisoft.cast;
import com.lxisoft.moviescript;


public class TDD  {

public static void main(String []args)  {

Theater tr = new Theater("MELAM","Cherppulassery","123456789");

Movie me = new Movie ();
tr.mv  = me;

Actor act = new Actor();

Hero george = new Hero();
me.g1 = george;

george.setName ("DILEEP");
george.setCharacterName ("GEORGE");


Heroine rajisha = new Heroine();
me.r1 = rajisha;

rajisha.setName  ("RAJISHA VIJAYAN");
rajisha.setCharacterName  ("MERLIN");



Comedian sharaf= new Comedian();
me.srf = sharaf;

sharaf.setName("SHARAFUDHEEN");
sharaf.setCharacterName  ("PALLAN");


Comedian vinay = new Comedian();
me.vny = vinay;

 vinay.setName ("VINAY");
vinay.setCharacterName  ("VAVA");



Villan chembanVinod  = new Villan();
me.cbvd = chembanVinod;

chembanVinod.setName ("CHEMBAN VINOD");
chembanVinod.setCharacterName("PETER MATHAYI");



Villan anil = new Villan();
me.anl = anil;

anil.setName("ASSIM JAMAL");
anil.setCharacterName("ANIL");


Script scpt = new Script();
me.sc1 = scpt;

scpt.act[0] = george.getCharacterName();

scpt.act [1] = rajisha.getCharacterName();

scpt.act[2] = sharaf.getCharacterName();

scpt.act[3] = vinay.getCharacterName();

scpt.act[4] = chembanVinod.getCharacterName();

scpt.act[5] = anil.getCharacterName();




tr.theaterDetails();
}
}