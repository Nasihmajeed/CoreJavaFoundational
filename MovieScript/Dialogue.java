import java.util.ArrayList;

public class Dialogue  {


 ArrayList <String> script = new ArrayList< String>();

public void printDetails()   {
	
System.out.println("\n");
System.out.println("\t\t\t\t\t   Scene 1");
System.out.println("\t\t\t\t\t-------------");

   script.add("george : ningal nerathe vanno?");
   script.add("Sharaf : innale veetil poyal alle nerathe varandollu.");
   script.add("Sharaf : Students varumbo nammale kandillenki avarkk vishamam aavilladaa ");
   script.add("prasad : mani 7.30 aayitto avare kananillallo");
   script.add("George : penkuttikal alledaa. ivattel kalath nerathe onnum eneekkilla.bhayankara madi aan ivattakalkk");
   script.add("Sharaf : pall thechaal mathiyarnnu ivatteyokke");
   script.add("George : avanante bharya pall thekkunnundonn nokkunnilla irangeerikkaa avan");
script.add("Sharaf : ey bindhu mathre ulloo?");
script.add("Prasad : ey illadaa thaa car varunnu");


 for (String script1 : script )  {

   System.out.println(script1);

 }

}
} 