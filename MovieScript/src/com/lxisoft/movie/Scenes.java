package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;
public class Scenes{
	ArrayList<Script> script1 = new ArrayList<Script>();
	ArrayList<Script> script2 = new ArrayList<Script>();
	ArrayList<Script> script3 = new ArrayList<Script>();
	public void setScene1(){
		script1.add(new Moosa());
		script1.get(0).setDialogue0("Da Thorappa odaruth....nikkadaa\n");
		script1.get(0).setDialogue1("Oru paavam kuttiyude bag moshtich kadannu kalaya vijaricho nee\n");
		script1.get(0).setDialogue2("Itha kutty bag...ini epolum sredhikanam okey!... eppolum ithupole enik ethan kazhinju ennu verilla\n");
		script1.get(0).setDialogue3("Aliayaa dhe ivann aa kuteede bag edthond oodi... njan ivane valare vidhaktham aayit ivane pidikoodi\n");
		script1.get(0).setDialogue4("Sir njan alla dhe avananu bag moshtichath..\n");
		script1.get(0).setDialogue5("Njan police selection pona vazhiya Siree...enne onnu vidanam sir illel enik aa joli povum\n");
		script1.add(new Kochunni());
		script1.get(1).setDialogue0("Chathalum nikooladaa....\n");
		script1.get(1).setDialogue1("Ini thallarudh...inna bagu...\n");
		script1.get(1).setDialogue2("ahh adhe Sire njangal crime partners aanu Sir njan moshtikkum ivan enne odichit pidikkum\n");
		script1.get(1).setDialogue3("havuu!!....ippo oru aaswasam\n");
		script1.add(new Meena());
		script1.get(2).setDialogue0("Ahh!!!...My bag.... Chor!!! Chor!!!\n");
		script1.get(2).setDialogue1("Mera bag....\n");
		script1.add(new AliyanSI());
		script1.get(3).setDialogue0("Enthada ivade oru bahalam...\n");
		script1.get(3).setDialogue1("Pha!!!...Aliyano aarada thendi ninte aliyan. Sathyam parada neeyum avanum koode chethu nadthiya oru moshana sremam alledaa ith...\n");
		script1.get(3).setDialogue2("Rand pereyum pidich Jeepil kettadoo...\n");
		script1.get(3).setDialogue3("AAha!!...Selectionu pona vazhi aano...enna vaa namakk stationil keri chaya kudichit povaam\n");
		script1.get(3).setDialogue4("Poyii Jeepil kerada...!!!\n");
	}
	public void printScene1(){
		//Movies movie = new Movies();
		System.out.println("\n***Sahadevan walks through side of the road and he notices a girl screaming from the other side of road***");
		System.out.println("\n Meena   : ");//+this.slowPrintt(script1.get(2).getDialogue0(),50)); //script1.get(2).getDialogue0());
		this.slowPrintt(script1.get(2).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n***Sahadevan chases the thief***\n");
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue0());
		this.slowPrintt(script1.get(0).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script1.get(1).getDialogue0());
		this.slowPrintt(script1.get(1).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n***Sahadevan cought Kochunni***\n");
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue1());
		this.slowPrintt(script1.get(0).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n***Beats Kochunni***\n");
		System.out.println("\n Kochunni  : ");//+script1.get(1).getDialogue1());
		this.slowPrintt(script1.get(1).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n***Same time S.I.Peethambaran gets to that place and Sahadevan doesnt see him entering ***\n");
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue2());
		this.slowPrintt(script1.get(0).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Meena     : ");//+script1.get(2).getDialogue1());
		this.slowPrintt(script1.get(2).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script1.get(3).getDialogue0());
		this.slowPrintt(script1.get(3).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue3());
		this.slowPrintt(script1.get(0).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script1.get(3).getDialogue1());
		this.slowPrintt(script1.get(3).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue4());
		this.slowPrintt(script1.get(0).getDialogue4(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script1.get(1).getDialogue2());
		this.slowPrintt(script1.get(1).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script1.get(3).getDialogue2());
		this.slowPrintt(script1.get(3).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue5());
		this.slowPrintt(script1.get(0).getDialogue5(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script1.get(3).getDialogue3());
		this.slowPrintt(script1.get(3).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script1.get(3).getDialogue4());
		this.slowPrintt(script1.get(3).getDialogue4(),50);
		//this.printArray1();	
	}
	public void setScene2(){
		script2.add(new Moosa());
		script2.get(0).setDialogue0("Mamante kadam veetyathum Detective agency thodangyathokke valare pettannayirunnu\n");
		script2.get(0).setDialogue1("Dhe nee aa costume azhichu veche....njan aplale paranjatha ivanu onnum kodkanda nnu\n");
		script2.get(0).setDialogue2("korachu veriety aayale aalukal sredhikkullu....\n");
		script2.get(0).setDialogue3("MoolamKuzhi lu  thott kalikaruth...!!\n");
		script2.get(0).setDialogue4("IDEA...!!! Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
		script2.get(0).setDialogue5("Eda ninne..!!! Poyke nee poyke...");
		script2.get(0).setDialogue6("Vikrametta... Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
		script2.get(0).setDialogue7("MOOSA!!!... C.I.D MOOSA\n");
		script2.add(new Kochunni());
		script2.get(1).setDialogue0("Aa athey...Ennit ee kolam vechu enthelum nadakuoo...\n");
		script2.get(1).setDialogue1("Athey ningakk njan oru sahayam aayirikkum\n");
		script2.get(1).setDialogue2("haa C.I.D.SAAMUU\n");
		script2.get(1).setDialogue3("AAHH...!!! MOO ID SA SAA\n");
		script2.add(new Vikraman());
		script2.get(2).setDialogue0("Sheyy...ath vittu kalaa avan namakk oru sahayam aayirikkum\n");
		script2.get(2).setDialogue1("Ennalum avan paranjathilum karyam ind ee coatum kalasom okke ithiri over alley...\n");
		script2.get(2).setDialogue2("Athum ok pakshey ee peru oru Gumm illa C.I.D.Moolamkuzhiyil Sahadevan\n");
		script2.get(2).setDialogue3("Venda enna C.I.D.Moolam ennu mathy....\n");
		script2.get(2).setDialogue4("MOOSA ath kollam oru Resam okke ind\n");
	}
	public void printScene2(){
		System.out.println("\n***The office is getting painted and Sahadevan Kochunni and Vikraman stands in frond and discuss about the C.I.D concepts***\n");
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue0());
		this.slowPrintt(script2.get(0).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script2.get(1).getDialogue0());
		this.slowPrintt(script2.get(1).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue1());
		this.slowPrintt(script2.get(0).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script2.get(2).getDialogue0());
		this.slowPrintt(script2.get(2).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script2.get(1).getDialogue1());
		this.slowPrintt(script2.get(1).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script2.get(2).getDialogue1());
		this.slowPrintt(script2.get(2).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue2());
		this.slowPrintt(script2.get(0).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script2.get(2).getDialogue2());
		this.slowPrintt(script2.get(2).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue3());
		this.slowPrintt(script2.get(0).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script2.get(2).getDialogue3());
		this.slowPrintt(script2.get(2).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue4());
		this.slowPrintt(script2.get(0).getDialogue4(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script2.get(1).getDialogue2());
		this.slowPrintt(script2.get(1).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue5());
		this.slowPrintt(script2.get(0).getDialogue5(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue6());
		this.slowPrintt(script2.get(0).getDialogue6(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script2.get(1).getDialogue3());
		this.slowPrintt(script2.get(1).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n***Sahadevan slaps Kochunni and Vikraman starts laughing***\n");
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue7());
		this.slowPrintt(script2.get(0).getDialogue7(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script2.get(2).getDialogue4());
		this.slowPrintt(script2.get(2).getDialogue4(),50);
		//this.printArray1();
	}
	public void setScene3(){
		script3.add(new Moosa());
		script3.get(0).setDialogue0("Eda Thorappa ninak onnnu sahayichoode daa\n");
		script3.get(0).setDialogue1("Avan verum oru pottan alley...\n");
		script3.get(0).setDialogue2("Enna vikremetta namukk avane pidikoodam\n");
		script3.get(0).setDialogue3("Shey...ivane njan innu kollum, eda Thorappa ingane aanel njan ninne police karkku pidichu kodukkum nokkiko\n");
		script3.get(0).setDialogue4("Adangi ninna ninakku kollam\n");
		script3.get(0).setDialogue5("Nammude oro neekangalum valare sookshichayirikanam....\n");
		script3.get(0).setDialogue6("Hey...!!! Da ivan aa theevara vaadhi alle CM ne kollan sremichavan\n");
		script3.get(0).setDialogue7("Aa pottan potte namuk ivane mathy...!!!\n");
		script3.get(0).setDialogue8("Thank You Sir thank u very much\n");
		script3.get(0).setDialogue9("Atheenu 10paisa polum therilla\n");
		script3.get(0).setDialogue10("GOOD Bye....!!!\n");
		script3.add(new Kochunni());
		script3.get(1).setDialogue0("Detective company thodangi irkkan thogeet kore divasayii...oru case polum veranillaloo\n");
		script3.get(1).setDialogue1("Aynu pidikitta pulliye evde poyi pidikkan aanu\n");
		script3.get(1).setDialogue2("Ambada pulusoo...ingane aanel njan illa tta\n");
		script3.get(1).setDialogue3("Aaa angu chellu avan pidikkan ninnu therum...\n");
		script3.get(1).setDialogue4("Oo Sire anisarikkame...\n");
		script3.get(1).setDialogue5("Aa!! adhe idh avan thanne Sahadeva pidicho avane...\n");
		script3.get(1).setDialogue6("Vikrametta vilikk Police ne...\n");
		script3.add(new Vikraman());
		script3.get(2).setDialogue0("Sahadeva namakk oru pidikitta pulliye pidich kodtha nalla publicity kitoole...\n");
		script3.get(2).setDialogue1("Kitty...!!! Annu bomb beeshany ullavadem avan indayirunnu sammelana chadangilum avan indayirunnu\n");
		script3.get(2).setDialogue2("Avan pottane pole abhinayikunnathanu...alland CM pona stalathokke thokkum kond chellan avanendha Pottanaa\n");
		script3.get(2).setDialogue3("Dhe ponu avan...Sahadeva Change...alla Chasee\n");
		script3.get(2).setDialogue4("Da dhe aa pottane Mental hospitalille vandeelu aalkaru vanu pidichond ponu....\n");
		script3.get(2).setDialogue5("Sir ithupolathe chetta parupadikal kanikkum ennu Sahadevan paranjirunnu...\n athukond media kare okke nerthey vilich kuttavaliyem kond Moosa DIG nerit kaanan poyitund\n");
		script3.get(2).setDialogue6("Chammi poyalle Sire...\n");
		script3.add(new AliyanSI());
		script3.get(3).setDialogue0("Well done ee Samstanam thedi kond irikkunna oru andharashtra kuttavaliye aanu ningal pidikoodyath...\n");
		script3.get(3).setDialogue1("Pakshey ithinte credit njan ningakk theraan pokunnilla...\n");
		script3.get(3).setDialogue2("Aliya aliyaa...ninte pengale ketyappo 1 roopa polum streedhanam thannitilla ippoo kityathinte pakuthi engilum enk theruoo...\n");
		script3.get(3).setDialogue3("Venda aa 10paisa aliyan vecho baaki enik thanoode..!!\n");
		script3.get(3).setDialogue4("Aliyaaa....!!!!\n");
		script3.get(3).setDialogue5("Podaa...\n");
	}
	public void printScene3(){
		System.out.println("\n***The three of them sits idle infront of their new detective agency***\n");
		System.out.println("\n Kochunni  : ");//+script3.get(1).getDialogue0());
		this.slowPrintt(script3.get(1).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script3.get(2).getDialogue0());
		this.slowPrintt(script3.get(2).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script3.get(1).getDialogue1());
		this.slowPrintt(script3.get(1).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue0());
		this.slowPrintt(script3.get(0).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script3.get(1).getDialogue2());
		this.slowPrintt(script3.get(1).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script3.get(2).getDialogue1());
		this.slowPrintt(script3.get(2).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n***Shows a Maniac who fools around carrying a dummy gun***\n");
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue1());
		this.slowPrintt(script3.get(0).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script3.get(2).getDialogue2());
		this.slowPrintt(script3.get(2).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue2());
		this.slowPrintt(script3.get(0).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script3.get(1).getDialogue3());
        this.slowPrintt(script3.get(1).getDialogue3(),50);
        //this.printArray1();
        System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue3());
        this.slowPrintt(script3.get(0).getDialogue3(),50);
        //this.printArray1();
        System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue4());
		this.slowPrintt(script3.get(0).getDialogue4(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script3.get(1).getDialogue4());
		this.slowPrintt(script3.get(1).getDialogue4(),50);
		//this.printArray1();
		System.out.println("\n***Moosa and Team waits in his car the he saw that maniac in a car***\n");
		System.out.println("\n Vikraman  : ");//+script3.get(2).getDialogue3());
		this.slowPrintt(script3.get(2).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue5());
		this.slowPrintt(script3.get(0).getDialogue5(),50);
		//this.printArray1();
		System.out.println("\n***Moosa chases and blocks that car and he finds a international criminal in that car***\n");
		System.out.println("\n Sahadevan  : ");//+script3.get(0).getDialogue6());
		this.slowPrintt(script3.get(0).getDialogue6(),50);
		//this.printArray1();
		System.out.println("\n Kochunni   : ");//+script3.get(1).getDialogue5());
		this.slowPrintt(script3.get(1).getDialogue5(),50);
		//this.printArray1();
		System.out.println("\n Vikraman   : ");//+script3.get(2).getDialogue4());
		this.slowPrintt(script3.get(2).getDialogue4(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan  : ");//+script3.get(0).getDialogue7());
		this.slowPrintt(script3.get(0).getDialogue7(),50);
		//this.printArray1();
		System.out.println("\n Kochunni   : ");//+script3.get(1).getDialogue6());
		this.slowPrintt(script3.get(1).getDialogue6(),50);
		//this.printArray1();
		System.out.println("\n***S.I.Peethambaran reaches the place and by that time Moosa went to D.IG with media***\n");
		System.out.println("\n S.I        : ");//+script3.get(3).getDialogue0());
		this.slowPrintt(script3.get(3).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n S.I        : ");//+script3.get(3).getDialogue1());
		this.slowPrintt(script3.get(3).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n Vikraman   : ");//+script3.get(2).getDialogue5());
		this.slowPrintt(script3.get(2).getDialogue5(),50);
		//this.printArray1();
		System.out.println("\n***D.IG announces 10Lacks price for capturing that culprit***\n");
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue8());
		this.slowPrintt(script3.get(0).getDialogue8(),50);
		//this.printArray1();
		System.out.println("\n***S.I aliyan goes behind Sahadevan begging***\n");
		System.out.println("\n S.I       : ");//+script3.get(3).getDialogue2());
		this.slowPrintt(script3.get(3).getDialogue2(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue9());
		this.slowPrintt(script3.get(0).getDialogue9(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script3.get(3).getDialogue3());
		this.slowPrintt(script3.get(3).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue10());
		this.slowPrintt(script3.get(0).getDialogue10(),50);
		//this.printArray1();
		System.out.println("\n S.I       : ");//+script3.get(3).getDialogue4());
		this.slowPrintt(script3.get(3).getDialogue4(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script3.get(2).getDialogue6());
		this.slowPrintt(script3.get(2).getDialogue6(),50);
		//this.printArray1();
		System.out.println(" S.I       : ");//+script3.get(3).getDialogue5());
		this.slowPrintt(script3.get(3).getDialogue5(),50);
		//this.printArray1();
	}
	public void printArray1(){
		try{
			Thread.sleep(1500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public String slowPrintt(String scne,long delay){
		for(int i=0; i<scne.length();i++){
		    System.out.print(scne.charAt(i)); 
			try{
				Thread.sleep(delay);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		return scne;
	}
}