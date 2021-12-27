import java.util.Scanner;

public class TDD  {

public static void main(String []args)  {

Theater tr = new Theater("MELAM","Cherppulassery","123456789");

Movie me = new Movie ();
tr.mv  = me;

Actor act = new Actor();

George g1 = new George();
me.grge = g1;

g1.setName ("DILEEP");
g1.setCharacterName ("GEORGE");
g1.setAge  ( "40");
g1.setGender  ( "Male");
g1.setPlace ("Cochi");

Rajisha rj= new Rajisha();
me.raji = rj;

rj.setName  ("RAJISHA VIJAYAN");
rj.setCharacterName  ("MERLIN");
rj.setAge ("30");
rj.setGender ("Female");
rj.setPlace ("Cochi");



Sharaf sf = new Sharaf();
me.srf = sf;

sf.setName("SHARAFUDHEEN");
sf.setCharacterName  ("PALLAN");
sf.setAge("30");
sf.setGender ("Male");
sf.setPlace ("Cochi");


Vinay vy = new Vinay ();
me.vny = vy;

vy.setName ("VINAY");
vy.setCharacterName  ("VAVA");
vy.setAge  ("30");
vy.setGender  ("Male");
vy.setPlace  ("Cochi");



ChembanVinod  cv = new ChembanVinod();
me.cbvd = cv;

cv.setName ("CHEMBAN VINOD");
cv.setCharacterName("PETER MATHAYI");
cv.setAge ("55");
cv.setGender ("Male");
cv.setPlace ("COCHI");


Script scpt = new Script();
me.sc1 = scpt;



tr.theaterDetails();
}
}