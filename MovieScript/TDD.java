import java.util.Scanner;

public class TDD  {

public static void main(String []args)  {

Theater tr = new Theater("MELAM","Cherppulassery","123456789");

Movie me = new Movie ();
tr.mv  = me;

Actor act = new Actor();

Hero h1 = new Hero();
me.hr1 = h1;

h1.setName ("MAMMOOTTY");
h1.setAge  ( "40");
h1.setGender  ( "Male");
h1.setPlace ("Cochi");

Heroine hrne = new Heroine();
me.hn1 = hrne;

hrne.setName  ("NAYANTHARA");
hrne.setAge ("30");
hrne.setGender ("Female");
hrne.setPlace ("Cochi");

Comedian cd = new Comedian();
me.cmd = cd;

cd.setName("DHARMAJAN");
cd.setAge("30");
cd.setGender ("Male");
cd.setPlace ("Cochi");




tr.printDetails();
}
}