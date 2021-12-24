import java.util.ArrayList;

public class Dialogue  {



 ArrayList <String> script = new ArrayList< String>();

 
public void printDetails()   {
	
System.out.println("\n");
System.out.println("\t\t\t\t\t   --------Scene 1--------");
System.out.println ("\n");
System.out.println("\t\t\t\t\t\t MATHAYI PARAMBU");
System.out.println("\t\t\t\t\t--------------------------------");
System.out.println ("\n");
System.out.println ("\n");
System.out.println ("\n");

   script.add("George : ningal nerathe vanno?" );
   script.add("Sharaf : innale veetil poyal alle nerathe varandollu.");
   script.add("Sharaf : Students varumbo nammale kandillenki avarkk vishamam aavilladaa "); 
   script.add("Vinay : mani 7.30 aayitto avare kananillallo");
   script.add("George : penkuttikal alledaa. ivattel kalath nerathe onnum eneekkilla.bhayankara madi aan ivattakalkk");
   script.add("Sharaf : pall thechaal mathiyarnnu ivatteyokke");
   script.add("George : avanante bharya pall thekkunnundonn nokkunnilla irangeerikkaa avan");
script.add("Sharaf : ey bindhu mathre ulloo?");
script.add("Vinay : ey illadaa thaa car varunnu");
script.add("George : ey vandime piramid okke aayittanallo varane . A2Z nannayaa mathiyaarnnu  . oow entry  kalakki");
script.add("Sharaf : thalla irangeetto. purake kidav undaavum .. pinnem thalleyaanallo");
script.add("George : ini kidav vandeekkakathu irunnu thalla aayathaavo");
script.add("Sharaf : ey varum");
script.add("\t\t\t\t(BGM)");
script.add("Sharaf : hey ith pinnem thallenallo");
script.add("Vinay : ith kudumbasree kkarude Driving school aanenn thonnunnutto George      lley?");
script.add("Gorge : ee bindhu enthootta mmade life full stop idanaayitt  enthoottaa kaliyaa kalikkanath  ningal ingad vanne");




 for (String script1 : script )  {

   System.out.println(script1);

 }

}
} 