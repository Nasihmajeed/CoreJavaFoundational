package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;
import java.io.*;
public class Scenes{
	ArrayList<Script> script1 = new ArrayList<Script>();
	ArrayList<Script> script2 = new ArrayList<Script>();
	ArrayList<Script> script3 = new ArrayList<Script>();
	public void setScene1(){
		/*try{
			File file = new File("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt");
    		FileWriter fileWriter = new FileWriter(file);
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
	    	writer.write("\n    ***Sahadevan walks through side of the road and he notices a girl screaming from the other side of road***");
    		writer.write("\n Meena     : Ahh!!!...My bag.... Chor!!! Chor!!!\n");
    		writer.write("\n    ***Sahadevan chases the thief***");
	    	writer.write("\n Sahadevan : Da Thorappa odaruth....nikkadaa\n");
    		writer.write("\n Kochunni  : Chathalum nikooladaa....\n");
	    	writer.write("\n    ***Sahadevan cought Kochunni***");
	    	writer.write("\n Sahadevan : Oru paavam kuttiyude bag moshtich kadannu kalaya vijaricho nee\n");
    		writer.write("\n Kochunni  : Ini thallarudh...inna bagu...\n");
	    	writer.write("\n    ***Same time S.I.Peethambaran gets to that place and Sahadevan doesnt see him entering ***");
	    	writer.write("\n Sahadevan : Itha kutty bag...ini epolum sredhikanam okey!... eppolum ithupole enik ethan kazhinju ennu verilla\n");
    		writer.write("\n Meena     : Mera bag....\n");
	    	writer.write("\n S.I       : Enthada ivade oru bahalam...\n");
    		writer.write("\n Sahadevan : Aliayaa dhe ivann aa kuteede bag edthond oodi... njan ivane valare vidhaktham aayit ivane pidikoodi\n");
	    	writer.write("\n S.I       : Pha!!!...Aliyano aarada thendi ninte aliyan. Sathyam parada neeyum avanum koode chethu nadthiya oru moshana sremam alledaa ith...\n");
    		writer.write("\n Sahadevan : Sir njan alla dhe avananu bag moshtichath...\n");
		    writer.write("\n Kochunni  : ahh adhe Sire njangal crime partners aanu Sir njan moshtikkum ivan enne odichit pidikkum\n");
		    writer.write("\n S.I       : Rand pereyum pidich Jeepil kettadoo...\n");
	    	writer.write("\n Sahadevan : Njan police selection pona vazhiya Siree...enne onnu vidanam sir illel enik aa joli povum\n");
    		writer.write("\n S.I       : AAha!!...Selectionu pona vazhi aano...enna vaa namakk stationil keri chaya kudichit povaam\n");
	    	writer.write("\n S.I       : Poyii Jeepil kerada...!!!\n");
    		writer.write("\n Kochunni  : havuu!!....ippo oru aaswasam\n");
    		writer.flush();
    		writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}*/
		script1.add(new Moosa());
		script1.get(0).setDialogue0("\n Sahadevan : Da Thorappa odaruth....nikkadaa\n");
		script1.get(0).setDialogue1("\n Sahadevan : Oru paavam kuttiyude bag moshtich kadannu kalaya vijaricho nee\n");
		script1.get(0).setDialogue2("\n Sahadevan : Itha kutty bag...ini epolum sredhikanam okey!... eppolum ithupole enik ethan kazhinju ennu verilla\n");
		script1.get(0).setDialogue3("\n Sahadevan : Aliayaa dhe ivann aa kuteede bag edthond oodi... njan ivane valare vidhaktham aayit ivane pidikoodi\n");
		script1.get(0).setDialogue4("\n Sahadevan : Sir njan alla dhe avananu bag moshtichath..\n");
		script1.get(0).setDialogue5("\n Sahadevan : Njan police selection pona vazhiya Siree...enne onnu vidanam sir illel enik aa joli povum\n");
		script1.add(new Kochunni());
		script1.get(1).setDialogue0("\n Kochunni  : Chathalum nikooladaa....\n");
		script1.get(1).setDialogue1("\n Kochunni  : Ini thallarudh...inna bagu...\n");
		script1.get(1).setDialogue2("\n Kochunni  : ahh adhe Sire njangal crime partners aanu Sir njan moshtikkum ivan enne odichit pidikkum\n");
		script1.get(1).setDialogue3(" \nKochunni  : havuu!!....ippo oru aaswasam\n");
		script1.add(new Meena());
		script1.get(2).setDialogue0("\n Meena     : Ahh!!!...My bag.... Chor!!! Chor!!!\n");
		script1.get(2).setDialogue1("\n Meena     : Mera bag....\n");
		script1.add(new AliyanSI());
		script1.get(3).setDialogue0("\n S.I       : Enthada ivade oru bahalam...\n");
		script1.get(3).setDialogue1("\n S.I       : Pha!!!...Aliyano aarada thendi ninte aliyan. Sathyam parada neeyum avanum koode chethu nadthiya oru moshana sremam alledaa ith...\n");
		script1.get(3).setDialogue2("\n S.I       : Rand pereyum pidich Jeepil kettadoo...\n");
		script1.get(3).setDialogue3("\n S.I       : AAha!!...Selectionu pona vazhi aano...enna vaa namakk stationil keri chaya kudichit povaam\n");
		script1.get(3).setDialogue4("\n S.I       : Poyii Jeepil kerada...!!!\n");
	}
	public void printScene1(){
		try{
			File file = new File("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt");
    		FileWriter fileWriter = new FileWriter(file);
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
	    	writer.write("\n    ***Sahadevan walks through side of the road and he notices a girl screaming from the other side of road***\n");
	    	writer.write(script1.get(2).getDialogue0());
	    	writer.write("\n    ***Sahadevan chases the thief***");
	    	writer.write(script1.get(0).getDialogue0());
	    	writer.write(script1.get(1).getDialogue0());
	    	writer.write("\n    ***Sahadevan cought Kochunni***");
	    	writer.write(script1.get(0).getDialogue1());
	    	writer.write(script1.get(1).getDialogue1());
	    	writer.write("\n    ***Same time S.I.Peethambaran gets to that place and Sahadevan doesnt see him entering ***\n");
	    	writer.write(script1.get(0).getDialogue2());
	    	writer.write(script1.get(2).getDialogue1());
	    	writer.write(script1.get(3).getDialogue0());
	    	writer.write(script1.get(0).getDialogue3());
	    	writer.write(script1.get(3).getDialogue1());
	    	writer.write(script1.get(0).getDialogue4());
	    	writer.write(script1.get(1).getDialogue2());
	    	writer.write(script1.get(3).getDialogue2());
	    	writer.write(script1.get(0).getDialogue5());
	    	writer.write(script1.get(3).getDialogue3());
	    	writer.write(script1.get(3).getDialogue4());
	    	writer.flush();
	    	writer.close();
	    }
	    catch (IOException e) {
	    	e.printStackTrace();
	    }

		try{
			Scanner scan = new Scanner(System.in);
			BufferedReader buffReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt"));
			String s;
			while((s=buffReader.readLine()) != null)
			{
				System.out.print("\n");
				this.slowPrintt(s,50);
			} 
			buffReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		/*//Movies movie = new Movies();
		System.out.println("\n***Sahadevan walks through side of the road and he notices a girl screaming from the other side of road***");
		this.printArray1();
		System.out.println("\n Meena   : ");//+this.slowPrintt(script1.get(2).getDialogue0(),50)); //script1.get(2).getDialogue0());
		this.slowPrintt(script1.get(2).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n***Sahadevan chases the thief***\n");
		this.printArray1();
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue0());
		this.slowPrintt(script1.get(0).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n Kochunni  : ");//+script1.get(1).getDialogue0());
		this.slowPrintt(script1.get(1).getDialogue0(),50);
		//this.printArray1();
		System.out.println("\n***Sahadevan cought Kochunni***\n");
		this.printArray1();
		System.out.println("\n Sahadevan : ");//+script1.get(0).getDialogue1());
		this.slowPrintt(script1.get(0).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n***Beats Kochunni***\n");
		System.out.println("\n Kochunni  : ");//+script1.get(1).getDialogue1());
		this.slowPrintt(script1.get(1).getDialogue1(),50);
		//this.printArray1();
		System.out.println("\n***Same time S.I.Peethambaran gets to that place and Sahadevan doesnt see him entering ***\n");
		this.printArray1();
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
		//this.printArray1();	*/
	}
	public void setScene2(){
		/*try{
			File file = new File("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt");
		    FileWriter fileWriter = new FileWriter(file);
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
    		writer.write("\n     ***The office is getting painted and Sahadevan Kochunni and Vikraman stands in frond and discuss about the C.I.D concepts*** \n");
		    writer.write("\n Sahadevan : Mamante kadam veetyathum Detective agency thodangyathokke valare pettannayirunnu\n");
	    	writer.write("\n Kochunni  : Aa athey...Ennit ee kolam vechu enthelum nadakuoo...\n");
    		writer.write("\n Sahadevan : Dhe nee aa costume azhichu veche....njan aplale paranjatha ivanu onnum kodkanda nnu\n");
	    	writer.write("\n Vikraman  : Sheyy...ath vittu kalaa avan namakk oru sahayam aayirikkum\n");
    		writer.write("\n Kochunni  : Athey ningakk njan oru sahayam aayirikkum\n");
		    writer.write("\n Vikraman  : Ennalum avan paranjathilum karyam ind ee coatum kalasom okke ithiri over alley...\n");
	    	writer.write("\n Sahadevan : korachu veriety aayale aalukal sredhikkullu....\n");
    		writer.write("\n Vikraman  : Athum ok pakshey ee peru oru Gumm illa C.I.D.Moolamkuzhiyil Sahadevan\n");
	    	writer.write("\n Sahadevan : MoolamKuzhi lu  thott kalikaruth...!!\n");
    		writer.write("\n Vikraman  : Venda enna C.I.D.Moolam ennu mathy....\n");
	    	writer.write("\n Sahadevan : IDEA...!!! Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
    		writer.write("\n Kochunni  : haa C.I.D.SAAMUU\n");
	    	writer.write("\n Sahadevan : Eda ninne..!!! Poyke nee poyke...\n");
    		writer.write("\n Sahadevan : Vikrametta... Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
	    	writer.write("\n Kochunni  : AAHH...!!! MOO ID SA SAA\n");
    		writer.write("\n     ***Sahadevan slaps Kochunni and Vikraman starts laughing***\n");
	    	writer.write("\n Sahadevan : MOOSA!!!... C.I.D MOOSA\n"); 
    		writer.write("\n Vikraman  : MOOSA ath kollam oru Resam okke ind\n");
	    	writer.flush();
    		writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}*/
		
		script2.add(new Moosa());
		script2.get(0).setDialogue0("\n Sahadevan : Mamante kadam veetyathum Detective agency thodangyathokke valare pettannayirunnu\n");
		script2.get(0).setDialogue1("\n Sahadevan : Dhe nee aa costume azhichu veche....njan aplale paranjatha ivanu onnum kodkanda nnu\n");
		script2.get(0).setDialogue2("\n Sahadevan : korachu veriety aayale aalukal sredhikkullu....\n");
		script2.get(0).setDialogue3("\n Sahadevan : MoolamKuzhi lu  thott kalikaruth...!!\n");
		script2.get(0).setDialogue4("\n Sahadevan : IDEA...!!! Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
		script2.get(0).setDialogue5("\n Sahadevan : Eda ninne..!!! Poyke nee poyke...");
		script2.get(0).setDialogue6("\n Sahadevan : Vikrametta... Moolamkuzhuiyile \"MOOyum\" Sahadevanle \"SAAyum\" \n");
		script2.get(0).setDialogue7("\n Sahadevan : MOOSA!!!... C.I.D MOOSA\n");
		script2.add(new Kochunni());
		script2.get(1).setDialogue0("\n Kochunni  : Aa athey...Ennit ee kolam vechu enthelum nadakuoo...\n");
		script2.get(1).setDialogue1("\n Kochunni  : Athey ningakk njan oru sahayam aayirikkum\n");
		script2.get(1).setDialogue2("\n Kochunni  : haa C.I.D.SAAMUU\n");
		script2.get(1).setDialogue3("\n Kochunni  : AAHH...!!! MOO ID SA SAA\n");
		script2.add(new Vikraman());
		script2.get(2).setDialogue0("\n Vikraman  : Sheyy...ath vittu kalaa avan namakk oru sahayam aayirikkum\n");
		script2.get(2).setDialogue1("\n Vikraman  : Ennalum avan paranjathilum karyam ind ee coatum kalasom okke ithiri over alley...\n");
		script2.get(2).setDialogue2("\n Vikraman  : Athum ok pakshey ee peru oru Gumm illa C.I.D.Moolamkuzhiyil Sahadevan\n");
		script2.get(2).setDialogue3("\n Vikraman  : Venda enna C.I.D.Moolam ennu mathy....\n");
		script2.get(2).setDialogue4("\n Vikraman  : MOOSA ath kollam oru Resam okke ind\n");*/
	}
	public void printScene2(){
		try{
			File file = new File("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt");
		    FileWriter fileWriter = new FileWriter(file);
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
    		writer.write("\n     ***The office is getting painted and Sahadevan Kochunni and Vikraman stands in frond and discuss about the C.I.D concepts*** \n");
		    writer.write(script2.get(0).getDialogue0());
	    	writer.write(script2.get(1).getDialogue0());
    		writer.write(script2.get(0).getDialogue1());
	    	writer.write(script2.get(2).getDialogue0());
    		writer.write(script2.get(1).getDialogue1());
		    writer.write(script2.get(2).getDialogue1());
	    	writer.write(script2.get(0).getDialogue2());
    		writer.write(script2.get(2).getDialogue2());
	    	writer.write(script2.get(0).getDialogue3());
    		writer.write(script2.get(2).getDialogue3());
	    	writer.write(script2.get(0).getDialogue4());
    		writer.write(script2.get(1).getDialogue2());
	    	writer.write(script2.get(0).getDialogue5());
    		writer.write(script2.get(0).getDialogue6());
	    	writer.write(script2.get(1).getDialogue3());
    		writer.write("\n     ***Sahadevan slaps Kochunni and Vikraman starts laughing***\n");
	    	writer.write(script2.get(0).getDialogue7()); 
    		writer.write(script2.get(2).getDialogue4());
	    	writer.flush();
    		writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		try{
			Scanner scan = new Scanner(System.in);
			BufferedReader buffReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt"));
			String s;
			while((s=buffReader.readLine()) != null)
			{
				System.out.print("\n");
				this.slowPrintt(s,50);
			} 
			buffReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		/*System.out.println("\n***The office is getting painted and Sahadevan Kochunni and Vikraman stands in frond and discuss about the C.I.D concepts***\n");
		this.printArray1();
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
		this.printArray1();
		System.out.println("\n Sahadevan : ");//+script2.get(0).getDialogue7());
		this.slowPrintt(script2.get(0).getDialogue7(),50);
		//this.printArray1();
		System.out.println("\n Vikraman  : ");//+script2.get(2).getDialogue4());
		this.slowPrintt(script2.get(2).getDialogue4(),50);
		//this.printArray1();*/
	}
	public void setScene3(){
		/*try{
			File file = new File("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt");
		    FileWriter fileWriter = new FileWriter(file);
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
    		writer.write("\n     ***The three of them sits idle infront of their new detective agency***\n");
    		writer.write("\n Kochunni  : Detective company thodangi irkkan thogeet kore divasayii...oru case polum veranillaloo\n");
    		writer.write("\n Vikraman  : Sahadeva namakk oru pidikitta pulliye pidich kodtha nalla publicity kitoole...\n");
    		writer.write("\n Kochunni  : Aynu pidikitta pulliye evde poyi pidikkan aanu\n");
    		writer.write("\n Sahadevan : Eda Thorappa ninak onnnu sahayichoode daa\n");
    		writer.write("\n Kochunni  : Ambada pulusoo...ingane aanel njan illa tta\n");
    		writer.write("\n Vikraman  : Kitty...!!! Annu bomb beeshany ullavadem avan indayirunnu sammelana chadangilum avan indayirunnu\n");
    		writer.write("\n     ***Shows a Maniac who fools around carrying a dummy gun***\n");
    		writer.write("\n Sahadevan : Avan verum oru pottan alley...\n");
    		writer.write("\n Vikraman  : Avan pottane pole abhinayikunnathanu...alland CM pona stalathokke thokkum kond chellan avanendha Pottanaa\n");
    		writer.write("\n Sahadevan : Enna vikremetta namukk avane pidikoodam\n");
    		writer.write("\n Kochunni  : Aaa angu chellu avan pidikkan ninnu therum...\n");
    		writer.write("\n Sahadevan : Shey...ivane njan innu kollum, eda Thorappa ingane aanel njan ninne police karkku pidichu kodukkum nokkiko\n");
    		writer.write("\n Sahadevan : Adangi ninna ninakku kollam\n");
    		writer.write("\n Kochunni  : Oo Sire anisarikkame...\n");
    		writer.write("\n     ***Moosa and Team waits in his car the he saw that maniac in a car***\n");
    		writer.write("\n Vikraman  : Dhe ponu avan...Sahadeva Change...alla Chasee\n");	
    		writer.write("\n Sahadevan : Nammude oro neekangalum valare sookshichayirikanam....\n");
    		writer.write("\n     ***Moosa chases and blocks that car and he finds a international criminal in that car***\n");
    		writer.write("\n Sahadevan : Hey...!!! Da ivan aa theevara vaadhi alle CM ne kollan sremichavan\n");
    		writer.write("\n Kochunni  : Aa!! adhe idh avan thanne Sahadeva pidicho avane...\n");
    		writer.write("\n Vikraman  : Da dhe aa pottane Mental hospitalille vandeelu aalkaru vanu pidichond ponu....\n");
    		writer.write("\n Sahadevan : Aa pottan potte namuk ivane mathy...!!!\n");
    		writer.write("\n Kochunni  : Vikrametta vilikk Police ne...\n");
    		writer.write("\n     ***S.I.Peethambaran reaches the place and by that time Moosa went to D.IG with media***\n");
    		writer.write("\n S.I       : Well done ee Samstanam thedi kond irikkunna oru andharashtra kuttavaliye aanu ningal pidikoodyath...\n");
    		writer.write("\n S.I       : Pakshey ithinte credit njan ningakk theraan pokunnilla...\n");
    		writer.write("\n Vikraman  : Sir ithupolathe chetta parupadikal kanikkum ennu Sahadevan paranjirunnu...\n athukond media kare okke nerthey vilich kuttavaliyem kond Moosa DIG nerit kaanan poyitund\n");
    		writer.write("\n     ***D.IG announces 10Lacks price for capturing that culprit***\n");
    		writer.write("\n Sahadevan : Thank You Sir thank u very much\n");
    		writer.write("\n     ***S.I aliyan goes behind Sahadevan begging***\n");
    		writer.write("\n S.I       : Aliya aliyaa...ninte pengale ketyappo 1 roopa polum streedhanam thannitilla ippoo kityathinte pakuthi engilum enk theruoo...\n");
    		writer.write("\n Sahadevan : Atheenu 10paisa polum therilla\n");
    		writer.write("\n S.I       : Venda aa 10paisa aliyan vecho baaki enik thanoode..!!\n");
    		writer.write("\n Sahadevan : GOOD Bye....!!!\n");
    		writer.write("\n S.I       : Aliyaaa....!!!!\n");
    		writer.write("\n Vikraman  : Chammi poyalle Sire...\n");
    		writer.write("\n S.I       : Podaa...\n");
    		writer.flush();
    		writer.close();
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}*/

		
		script3.add(new Moosa());
		script3.get(0).setDialogue0("\n Sahadevan : Eda Thorappa ninak onnnu sahayichoode daa\n");
		script3.get(0).setDialogue1("\n Sahadevan : Avan verum oru pottan alley...\n");
		script3.get(0).setDialogue2("\n Sahadevan : Enna vikremetta namukk avane pidikoodam\n");
		script3.get(0).setDialogue3("\n Sahadevan : Shey...ivane njan innu kollum, eda Thorappa ingane aanel njan ninne police karkku pidichu kodukkum nokkiko\n");
		script3.get(0).setDialogue4("\n Sahadevan : Adangi ninna ninakku kollam\n");
		script3.get(0).setDialogue5("\n Sahadevan : Nammude oro neekangalum valare sookshichayirikanam....\n");
		script3.get(0).setDialogue6("\n Sahadevan : Hey...!!! Da ivan aa theevara vaadhi alle CM ne kollan sremichavan\n");
		script3.get(0).setDialogue7("\n Sahadevan : Aa pottan potte namuk ivane mathy...!!!\n");
		script3.get(0).setDialogue8("\n Sahadevan : Thank You Sir thank u very much\n");
		script3.get(0).setDialogue9("\n Sahadevan : Atheenu 10paisa polum therilla\n");
		script3.get(0).setDialogue10("\n Sahadevan : GOOD Bye....!!!\n");
		script3.add(new Kochunni());
		script3.get(1).setDialogue0("\n Kochunni  : Detective company thodangi irkkan thogeet kore divasayii...oru case polum veranillaloo\n");
		script3.get(1).setDialogue1("\n Kochunni  : Aynu pidikitta pulliye evde poyi pidikkan aanu\n");
		script3.get(1).setDialogue2("\n Kochunni  : Ambada pulusoo...ingane aanel njan illa tta\n");
		script3.get(1).setDialogue3("\n Kochunni  : Aaa angu chellu avan pidikkan ninnu therum...\n");
		script3.get(1).setDialogue4("\n Kochunni  : Oo Sire anisarikkame...\n");
		script3.get(1).setDialogue5("\n Kochunni  : Aa!! adhe idh avan thanne Sahadeva pidicho avane...\n");
		script3.get(1).setDialogue6("\n Kochunni  : Vikrametta vilikk Police ne...\n");
		script3.add(new Vikraman());
		script3.get(2).setDialogue0("\n Vikraman  : Sahadeva namakk oru pidikitta pulliye pidich kodtha nalla publicity kitoole...\n");
		script3.get(2).setDialogue1("\n Vikraman  : Kitty...!!! Annu bomb beeshany ullavadem avan indayirunnu sammelana chadangilum avan indayirunnu\n");
		script3.get(2).setDialogue2("\n Vikraman  : Avan pottane pole abhinayikunnathanu...alland CM pona stalathokke thokkum kond chellan avanendha Pottanaa\n");
		script3.get(2).setDialogue3("\n Vikraman  : Dhe ponu avan...Sahadeva Change...alla Chasee\n");
		script3.get(2).setDialogue4("\n Vikraman  : Da dhe aa pottane Mental hospitalille vandeelu aalkaru vanu pidichond ponu....\n");
		script3.get(2).setDialogue5("\n Vikraman  : Sir ithupolathe chetta parupadikal kanikkum ennu Sahadevan paranjirunnu...\n athukond media kare okke nerthey vilich kuttavaliyem kond Moosa DIG nerit kaanan poyitund\n");
		script3.get(2).setDialogue6("\n Vikraman  : Chammi poyalle Sire...\n");
		script3.add(new AliyanSI());
		script3.get(3).setDialogue0("\n S.I       : Well done ee Samstanam thedi kond irikkunna oru andharashtra kuttavaliye aanu ningal pidikoodyath...\n");
		script3.get(3).setDialogue1("\n S.I       : Pakshey ithinte credit njan ningakk theraan pokunnilla...\n");
		script3.get(3).setDialogue2("\n S.I       : Aliya aliyaa...ninte pengale ketyappo 1 roopa polum streedhanam thannitilla ippoo kityathinte pakuthi engilum enk theruoo...\n");
		script3.get(3).setDialogue3("\n S.I       : Venda aa 10paisa aliyan vecho baaki enik thanoode..!!\n");
		script3.get(3).setDialogue4("\n S.I       : Aliyaaa....!!!!\n");
		script3.get(3).setDialogue5("\n S.I       : Podaa...\n");
	}
	public void printScene3(){
		try{
			File file = new File("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt");
		    FileWriter fileWriter = new FileWriter(file);
	    	BufferedWriter writer = new BufferedWriter(fileWriter);
    		writer.write("\n     ***The three of them sits idle infront of their new detective agency***\n");
    		writer.write(script3.get(1).getDialogue0());
    		writer.write(script3.get(2).getDialogue0());
    		writer.write(script3.get(1).getDialogue1());
    		writer.write(script3.get(0).getDialogue0());
    		writer.write(script3.get(1).getDialogue2());
    		writer.write(script3.get(2).getDialogue1());
    		writer.write("\n     ***Shows a Maniac who fools around carrying a dummy gun***\n");
    		writer.write(script3.get(0).getDialogue1());
    		writer.write(script3.get(2).getDialogue2());
    		writer.write(script3.get(0).getDialogue2());
    		writer.write(script3.get(1).getDialogue3());
    		writer.write(script3.get(0).getDialogue3());
    		writer.write(script3.get(0).getDialogue4());
    		writer.write(script3.get(1).getDialogue4());
    		writer.write("\n     ***Moosa and Team waits in his car the he saw that maniac in a car***\n");
    		writer.write(script3.get(2).getDialogue3());	
    		writer.write(script3.get(0).getDialogue5());
    		writer.write("\n     ***Moosa chases and blocks that car and he finds a international criminal in that car***\n");
    		writer.write(script3.get(0).getDialogue6());
    		writer.write(script3.get(1).getDialogue5());
    		writer.write(script3.get(2).getDialogue4());
    		writer.write(script3.get(0).getDialogue7());
    		writer.write(script3.get(1).getDialogue6());
    		writer.write("\n     ***S.I.Peethambaran reaches the place and by that time Moosa went to D.IG with media***\n");
    		writer.write(script3.get(3).getDialogue0());
    		writer.write(script3.get(3).getDialogue1());
    		writer.write(script3.get(2).getDialogue5());
    		writer.write("\n     ***D.IG announces 10Lacks price for capturing that culprit***\n");
    		writer.write(script3.get(0).getDialogue8());
    		writer.write("\n     ***S.I aliyan goes behind Sahadevan begging***\n");
    		writer.write(script3.get(3).getDialogue2());
    		writer.write(script3.get(0).getDialogue9());
    		writer.write(script3.get(3).getDialogue3());
    		writer.write(script3.get(0).getDialogue10());
    		writer.write(script3.get(3).getDialogue4());
    		writer.write(script3.get(2).getDialogue6());
    		writer.write(script3.get(3).getDialogue5());
    		writer.flush();
    		writer.close();
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
		try{
			Scanner scan = new Scanner(System.in);
			BufferedReader buffReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\CoreJava\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\repository\\file.txt"));
			String s;
			while((s=buffReader.readLine()) != null)
			{
				System.out.print("\n");
				this.slowPrintt(s,50);
			} 
			buffReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		/*
		System.out.println("\n***The three of them sits idle infront of their new detective agency***\n");
		this.printArray1();
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
		this.printArray1();
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
		this.printArray1();
		System.out.println("\n Vikraman  : ");//+script3.get(2).getDialogue3());
		this.slowPrintt(script3.get(2).getDialogue3(),50);
		//this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue5());
		this.slowPrintt(script3.get(0).getDialogue5(),50);
		//this.printArray1();
		System.out.println("\n***Moosa chases and blocks that car and he finds a international criminal in that car***\n");
		this.printArray1();
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
		this.printArray1();
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
		this.printArray1();
		System.out.println("\n Sahadevan : ");//+script3.get(0).getDialogue8());
		this.slowPrintt(script3.get(0).getDialogue8(),50);
		//this.printArray1();
		System.out.println("\n***S.I aliyan goes behind Sahadevan begging***\n");
		this.printArray1();
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
		//this.printArray1();*/
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