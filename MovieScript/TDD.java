import java.util.Scanner;

public class TDD  {

public static void main(String []args)  {

Theater tr = new Theater("MELAM","Cherppulassery","123456789");

Movie me = new Movie ();
tr.mv  = me;

Actor act = new Actor();

Hero h1 = new Hero();
me.hr1 = h1;

h1.setName ("DILEEP");
h1.setCharacterName ("GEORGE");
h1.setAge  ( "40");
h1.setGender  ( "Male");
h1.setPlace ("Cochi");

Heroine hrne = new Heroine();
me.hn1 = hrne;

hrne.setName  ("RAJISHA VIJAYAN");
hrne.setCharacterName  ("MERLIN");
hrne.setAge ("30");
hrne.setGender ("Female");
hrne.setPlace ("Cochi");

Comedian cd = new Comedian();
me.cmd = cd;

cd.setName("DHARMAJAN");
cd.setCharacterName  ("CC");
cd.setAge("30");
cd.setGender ("Male");
cd.setPlace ("Cochi");

Villan vn = new Villan();
me.v1 = vn;

vn.setName ("CHEMBAN VINOD");
vn.setCharacterName("PETER MATHAYI");
vn.setAge ("55");
vn.setGender ("Male");
vn.setPlace ("COCHI");


Dialogue dg = new Dialogue();
me.d1 = dg;



tr.theaterDetails();
}
}