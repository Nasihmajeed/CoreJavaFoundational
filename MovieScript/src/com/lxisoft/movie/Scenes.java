package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;
public class Scenes{
	ArrayList<Script> script1 = new ArrayList<Script>();
	public void setScene1(){
		script1.add(new Moosa());
		script1.get(0).setDialogue0("Da Thorappa odaruth....nikkadaa");
		script1.get(0).setDialogue1("Oru paavam kuttiyude bag moshtich kadannu kalaya vijaricho nee");
		script1.get(0).setDialogue2("Itha kutty bag...ini epolum sredhikanam okey!... eppolum ithupole enik ethan kazhinju ennu verilla");
		script1.get(0).setDialogue3("Aliayaa dhe ivann aa kuteede bag edthond oodi... njan ivane valare vidhaktham aayit ivane pidikoodi");
		script1.get(0).setDialogue4("Sir njan alla dhe avananu bag moshtichath..");
		script1.get(0).setDialogue5("Njan police selection pona vazhiya Siree...enne onnu vidanam sir illel enik aa joli povum");
		script1.add(new Kochunni());
		script1.get(1).setDialogue0("Chathalum nikooladaa....");
		script1.get(1).setDialogue1("Ini thallarudh...inna bagu...");
		script1.get(1).setDialogue2("ahh adhe Sire njangal crime partners aanu Sir njan moshtikkum ivan enne odichit pidikkum");
		script1.get(1).setDialogue3("havuu!!....ippo oru aaswasam");
		script1.add(new Meena());
		script1.get(2).setDialogue0("Ahh!!!...My bag.... Chor!!! Chor!!!");
		script1.get(2).setDialogue1("Mera bag....");
		script1.add(new AliyanSI());
		script1.get(3).setDialogue0("Enthada ivade oru bahalam...");
		script1.get(3).setDialogue1("Pha!!!...Aliyano aarada thendi ninte aliyan. Sathyam parada neeyum avanum koode chethu nadthiya oru moshana sremam alledaa ith...");
		script1.get(3).setDialogue2("Rand pereyum pidich Jeepil kettadoo...");
		script1.get(3).setDialogue3("AAha!!...Selectionu pona vazhi aano...enna vaa namakk stationil keri chaya kudichit povaam");
		script1.get(3).setDialogue4("Poyii Jeepil kerada...!!!");
	}
	public void printScene1(){
		System.out.println("\n***Sahadevan walks through side of the road and he notices a girl screaming from the other side of road***");
		System.out.println("\n Meena   : "+script1.get(2).getDialogue0());
		System.out.println("\n***Sahadevan chases the thief***\n");
		System.out.println(" Sahadevan : "+script1.get(0).getDialogue0());
		System.out.println(" Kochunni  : "+script1.get(1).getDialogue0());
		System.out.println("\n***Sahadevan cought Kochunni***\n");
		System.out.println(" Sahadevan : "+script1.get(0).getDialogue1());
		System.out.println("\n***Beats Kochunni***\n");
		System.out.println(" Kochunni  : "+script1.get(1).getDialogue1());
		System.out.println("\n***Same time S.I.Peethambaran gets to that place and Sahadevan doesnt see him entering ***\n");
		System.out.println(" Sahadevan : "+script1.get(0).getDialogue2());
		System.out.println(" Meena     : "+script1.get(2).getDialogue1());
		System.out.println(" S.I       : "+script1.get(3).getDialogue0());
		System.out.println(" Sahadevan : "+script1.get(0).getDialogue3());
		System.out.println(" S.I       : "+script1.get(3).getDialogue1());
		System.out.println(" Sahadevan : "+script1.get(0).getDialogue4());
		System.out.println(" Kochunni  : "+script1.get(1).getDialogue2());
		System.out.println(" S.I       : "+script1.get(3).getDialogue2());
		System.out.println(" Sahadevan : "+script1.get(0).getDialogue5());
		System.out.println(" S.I       : "+script1.get(3).getDialogue3());
		System.out.println(" S.I       : "+script1.get(3).getDialogue4());

	}
}