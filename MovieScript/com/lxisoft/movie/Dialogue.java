package com.lxisoft.movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Dialogue  {
 
  File file = new File("dialogues.csv");
 


  
  try {


   boolean status = file.createNewFile();

   
FileWriter filewritter = new FileWriter("dialogues.csv");

String message = "ABCD";

filewritter.write(message);

System.out.println(" succeses");

filewritter.close();

  }
  
  catch (IOException e) {

System.out.println("Error");
   
   e.printStackTrace();

  }
  




  public String [] newActors = new String[100];
 


 ArrayList <String> scene1 = new ArrayList< String>();

 ArrayList <String> scene2 = new ArrayList<String>();

 ArrayList <String> scene3 = new ArrayList<String>();
 
 ArrayList <String> scene4 = new ArrayList<String>();
 
 ArrayList <String> scene5 = new ArrayList<String>();



public void playScene1()   {



 scene1.add(newActors[1] + ": ningal nerathe vanno ?");
   scene1.add(newActors[2] +" : innale veetil poyal alle nerathe varandollu.");
   scene1.add(newActors[3] +" : Students varumbo nammale kandillenki avarkk vishamam aavilladaa "); 
   scene1.add(newActors[4] +" : mani 7.30 aayitto avare kananillallo");
   scene1.add(newActors[1] +" : penkuttikal alledaa. ivattel kalath nerathe onnum eneekkilla.bhayankara madi aan ivattakalkk");
   scene1.add(newActors[1] +" : pall thechaal mathiyarnnu ivatteyokke");
   scene1.add(newActors[1]  +" : avanante bharya pall thekkunnundonn nokkunnilla irangeerikkaa avan");
scene1.add(newActors[1]  +": ey bindhu mathre ulloo?");
scene1.add(newActors[1]  +" : ey illadaa thaa car varunnu");
scene1.add(newActors[1]  +" : ey vandime piramid okke aayittanallo varane . A2Z nannayaa mathiyaarnnu  . oow entry  kalakki");
scene1.add(newActors[1] +" : thalla irangeetto. purake kidav undaavum .. pinnem thalleyaanallo");
scene1.add(newActors[1]  +": ini kidav vandeekkakathu irunnu thalla aayathaavo");
scene1.add(newActors[1]  +" : ey varum");
scene1.add("\t\t\t\t(BGM)");
scene1.add(newActors[1] +" : hey ith pinnem thallenallo");
scene1.add(newActors[1]  +" : ith kudumbasree kkarude Driving school aanenn thonnunnutto    lley?");
scene1.add(newActors[1]  +" : ee bindhu enthootta mmade life full stop idanaayitt  enthoottaa kaliyaa kalikkanath  ningal ingad vanne");



 for (String scene11 : scene1 )  {

   System.out.println(scene11);

 }

}


public void playScene2()  {
 





scene2.add(newActors[1] +" : josephettante karyathin inikkum bhayankara vishamam und. nee cheythath thanne shari. pakshe ini ingane kazhinjath kazhinjille . ini ninte manassil mmade parambum mmade kaleem mathre ndaavaan paadullu");
scene2.add(newActors[1] +" :anil jee  ne patti njan paranjallo .national player aan. ente koode bengaloril ninn vannathaa.  aal vijaarichaale mmal udheshikkunna pole mmade parambil oru national kali nadakkollu . aal ippo free aayi kaanum. poyi kandaalo?");
scene2.add(newActors[1] +" : mm");
scene2.add("\t\t\t"+"(" +newActors[1] + "  SMOKING)");
scene2.add(newActors[1]  +" : iyyalokkeyaanalle ningade teamil   bhai");
scene2.add(newActors[1] +" : practice nadakkunnund. match aavumbozhekkum ready aavum");
scene2.add(newActors[1]+": thanikkokke thalakk valla praanthundo?  enne insult cheyanano vilichu varuthiyirikkunath ");
scene2.add(newActors[1] +" : anil jee  njaan");
scene2.add(newActors[1]+" : federationile thante chathupoya thanthapidide kootukaaranmaar nirbhanthichittaan njan ingot kalikkaarem kond vannath");
//scene2.add(villan[1] +" : anil jee njan paranjallo ente appante perulla parambil");
//scene2.add(villan[2] +": haa thante appanu perundakkanvendi aa shavaparambil proffessional kalikkare irakki kalikkano ennano thaan parayunnath?  athum iyyale polulla oochaalikalde koode   why you insulting?");
//scene2.add(villan[1] +" : enth insult");
//scene2.add(villan[2] +" : ith valla sachin tendulkkar aanenkil ningal inganeyokke cheyyo veruthe nattil kidakkunna shavaparamb okke kanichu iyyale polulla nokkukuthikalude koode oru antharashtra cricket angott kalikkam ennokke ningal parayo");
//scene2.add(villan[1] +" : ath...");
//scene2.add(villan[2] +": hmm   ithond path paisade prathiphalam onnum illallo. prathiphalamayi enth tharum thante chathu poya appante  prathimeda kashnangalo");
//scene2.add(villan[1] +" : hmm  appan parayunnodaa ppaa");
//scene2.add(villan[1]+" : sorry...sorry ..sorry  .   anil jee  kozhappakkaruth . njan ellaa kaaryangalum arrange cheythu  ini prathiphalathinte kaaryathinanenki ente kayyil ini tharaan onnum illa");
//scene2.add("\t\t\t" + "(" + villan[2] +" LOOKING ARROUND)");
//scene2.add(villan[1] +" : pakshe anile ivane ningale tholpikkanenki  nte appante perilulla parambu athang njan tharum enikk ivane vishwasaa ");
/*scene2.add("(\t\t\t" +"("+ villan[2] +" LAUGHING)");
scene2.add(villan[1] +"ivan aa mannil kuruthu undaayathaa ivar nedum athalla jayichu kondu povaan pattonki  nee kondoykko");
scene2.add("\t\t\t" + "(" + villan[2] +" LOOKING ARROUND AND LAUGHING)");
scene2.add( villan[1] +" : aa parambey nte appante jeevithaa  njangade jeevanaa jeevan vechittaa njangal kalikkaney enthayaalum njangal jayichirikkum");
scene2.add( villan[1] +" : nee tension adikkandadaa nammal jayichirikkum ivanodoke samsaarichaaley  vaadaa george nammak povaam  vaa ");
scene2.add(hero[1] +" : ninte performance kidukkeetund petere . ethra simple aayittaa mmal kalichu valarna mathiyi parambu thattiyedukkan  ningal kalikkunna kalindallo kalakunnund");
scene2.add( villan[1] +" : george nee enthuttaa parayanath.  njan ente appante... ");
scene2.add(hero[1] +" : ninte appante haaa   sthira budhi illathaa aa pavam josephettane parambin vendiyalladaa konnath   enitt avante ammade panthayam vekkal");
scene2.add(villan[1] +" : george nee veruthe oronn ");
scene2.add(hero[1] +": aa paavam josephettan chathappo ithonnum aarum ariyillenn nee karuthiyo   georgintel ninne kudukkanulla saadhanam thannitt aada aa pavam poyath  . ith kando  lokhathu ninakku mathram ulla kuppayam aan ith");
scene2.add(hero[1] +": ninneyokke pidichu policil elpikkan ariyanjittalla. ninakkokke valiya pidipad alle ooriporum pinnem mmade mekkitt kerum");
scene2.add(hero[1]+" : ath kond aadhyam nee paranja kali .ninte oru padhathiyum nadakkilla  ath ninte appan mathayide  parambin vendeettalla aa pavam josephettan urangunna mann aanath athin vendi njangal kalikkum");
scene2.add("\t\t\t" + "(" + villan[1]+" SMILING)");
scene2.add(hero[1] +"nee nerathe paranjallo ivan jayicha parambu ezhuthi kodukkaann  nee aa kali thiricha vecho  nee mathayikk thanne undaayathaanel aa conditionil mmakk oru kali ang kalikkam");
scene2.add(villan[1]+" : njan paranja paranjath thanne. iniyippo ithoru vaashiyaya sthithik njan konduvanna piller undaavilla");
scene2.add(hero[1] +" : vendada  nee narathe naavadile  ath pole aa mannil kurutha mmale tholpichitt ninakk aaparambu kond povaan pattonki nee kond pokko   jayikkanath njangal aanenki  pinne mathayi parambinte kanvettathenganum ninne kandaal  petere  ninte nenjathu kavadi kalikkum George");
scene2.add("\t\t\t(BGM)");





for (String scene22 : scene2)  {

System.out.println(scene22);

}

}



public void playScene3()   {




  scene3.add(hero[1] +" : enthoru manam aada ivalde mudikk... thalel entho thekkunundtto");  
  scene3.add(comedian[1] + " : valla kachiya velichennayayirikkum");
  scene3.add(hero[1] +" : hmm  nee kadanno nee kadanno");
  scene3.add("");
scene3.add("\t\t\t(PLAYING SONG IN BUS)");
scene3.add("");
scene3.add(hero[1] +"ayyoo  .. she.. onn mindaan pattiyirunnenki");
scene3.add(comedian[1] +" : ennodaaaa..mmmm.");
scene3.add(comedian[1] +" : nokkikondirinno ol ippo thirinju nokkum ol ummachikuttiyada  oru nottam kittanel neeyokke vere janmam janikkanam");
scene3.add(hero[1] +" : mmm hmmm");
scene3.add("");
scene3.add("\t\t\t(" + heroine[1] + " LOOKING " +hero[1]+")");
scene3.add("");
scene3.add("\t\t\t("+hero[1] +" SMILING)");
scene3.add("");
scene3.add(hero[1] +" : nee enthada paranjath ol ummachikutti aan thirinju nokkillan.....  ol thirinju nokkiyada enne thirinju nokkiyada ummachi kutti aanel njan naayar aada ");
scene3.add(comedian[1] +": nee naayarayathin njan enth cheyyaanaa");
scene3.add(hero[1] +" : ha hahaaha");
scene3.add("");
scene3.add("\t\t\t(AFTER SOME TIME)");
scene3.add("");
scene3.add("(" +hero[1] +" CALLING " +  comedian[1]+")");
scene3.add("");
scene3.add("\t\t\t(PHONE RINGING)");
scene3.add("");
scene3.add(comedian[1] +" : Hello manju");
scene3.add(hero[1] +" : eeh  manjo appo chinjune nee vitto");
scene3.add(comedian[1] +" : ooh mr naayar ningal vilikkunna ee pavam subscriber ente mayyath edukkunnath vare nilavilillada thendi");
scene3.add(hero[1] +" : Eda   nee choodavalle... njan otta kaaryam ariyan vendi vilichathaa");
scene3.add(comedian[1] +": enthaa");
scene3.add(hero[1] +" : aa abdhul khadarinte veettumathilil kuppichill undo");
scene3.add(comedian[1] +": nee enthiyyan povaaa");
scene3.add("\n");
scene3.add("\t\t\t(BGM)");
scene3.add("\n");
scene3.add(hero[1] +" :" + heroine[1]+" "+ heroine[1] +"...");
scene3.add("\n");
scene3.add(heroine[1] +": eeh   (" +heroine[1]+" SHOCKED)");
scene3.add("\n");
scene3.add(hero[1] +" :  aa a mm sorry iam sorry Ayisha ninne vannu pedippikkanamenn karuthiyathalla pakshe enikk veetilirunnu irikkanum nikkanum pattanilla");
scene3.add(hero[1] +" : irikkumbo shardhikan thonnum nikkumbo kayyum kaaalum varakkum sathyam parayaalo ninte athrem bangi ulla pennine ente jeevithathil kandittilla ente ammayaan sathyam ");
scene3.add("\n");
scene3.add("\t\t\t(" + heroine[1] + " LOOKING  " + hero[1]);
scene3.add("\n");
scene3.add(hero[1] +": ooh enne ingane nokkalle Ayisha njan marichu povum");
scene3.add("\n");
scene3.add("\t\t\t(" + heroine[1]+" SMILING) ");
scene3.add("\n");
scene3.add(hero[1] +" : ooh bhayankara ashwasam thonnunnu entha parayaa  ee pathu pathinaalu dhivasam bakshanam kazhikkatha oralde munnil chicken biriyani vecha engane irikkum athaanente avastha  ");
scene3.add(hero[1] +" : vellam illathe oonum urakkom illathe oru 100 varsham enne nokkiyirikkaan pattoo ninakk anganeyonnum pattillayirikkum pakshe enik anganeyokke thonnum..");
scene3.add(hero[1] +" : ninte veettukar vannu enne thallunnathin munb njan parayaam hmm  hoo   ");
scene3.add(hero[1] +" :  I LOVE YOU " + heroine[1]);
scene3.add("\n");
scene3.add("\t\t\t(" + heroine[1] +" LOOKING "+ hero[1]);
scene3.add("\n");
scene3.add(hero[1] +" : ippo ingottonnum parayanda nannayi aalojich orupad samayam eduthu ishttanenn paranjaal mathi ");
scene3.add("\n");
scene3.add("\t\t\t(BGM)");



for (String scene33 : scene3)  {

  System.out.println(scene33);
  
  }
  

}
public void playScene4()  {


scene4.add(heroine[1] +" : hey karikk");
scene4.add(comedian[1] +": naariyalkka paani  sthrekkalude sountharyathin karikk bestaa...  hey  baaisaab  ek naariyal pani");
scene4.add(comedian[1] +" :  ee strow okke aarudeyokke vaayil ittathaanaavo.nammal ee strow kudichitt kalayille ath ivanmaarokke ath eduthitt packettil vekkum");
scene4.add(comedian[1] +" : pinnne ee vrithiyum vedippum samsaakkaravum illathavanmar atheduth  shhrr sshhhrr   ennu valichu kudikkum");
scene4.add(comedian[2] +" : baai saab ");
scene4.add(comedian[1] +" : kithnaa rupyaa");
scene4.add(comedian[2] +":theese rupya");
scene4.add(comedian[1] +" : theese rupyaa ??  discount nahiye?");
scene4.add(comedian[2] +": nahi nahi discount nahi");
scene4.add(comedian[1] +" :  eh keralakka nariyalpaani he");
scene4.add(comedian[2] +" : A pollachi kkaa");
scene4.add(comedian[1] +" : pollachiyo    aa bhaakki  bhaakki paisa dhedhonaa....Malayaleesine mandanmar aakkanda.. ithokke choichu vaangillenki tharilla njanaaraa mon");
scene4.add(comedian[2] + ": kyaa athmiyaa saala");
scene4.add(comedian[1] +" :Stationte purathu ithin 20 roopa ye undaavullu  manushyanmare pattikkunna pattikkaley  enthayalum kudicholooo");
scene4.add(comedian[1] +" : hee heee ippo tharaa .. ith pole njan ennum cheyyunnnathaa..");
scene4.add(heroine[1] +" : hehehehe");
scene4.add(comedian[1] +" : No tension  simple  ee nithyabhyasi  aana edukkumenn kettittille  athre ulloo");
scene4.add(heroine[1] +" : hhmmmm");
scene4.add(comedian[3] +" :  hahahaha athenthayaalum akathekk varilla  thanikk kudikkanel thaan purathu poyi kudikkado ");
scene4.add(comedian[1]+" : podo ");
scene4.add(comedian[3] +" : njan poyitt kaaryalla than thanne ponam... oru strow kittiyirunnel valichu kudikkarnnalle hahaha  appo ee pulliyenthaa paranjath vrithi ilathavar aan strow itt kudikkukayulloo enn");
scene4.add(comedian[3] +"porathathin pakarchavyadi varumenn  hahahaha  ipo kidannu aanjupidikkunnath kando hahaha ");
scene4.add(comedian[3] +" :  eh ayyo  kuttee pettennu pencilum paperum eduthu varacho hanuman malem chumannu pona figuraa");
scene4.add(heroine[1] +" :  hehehhehehe");
scene4.add(comedian[3] +" : the figure vitt...  inn vallathum nadakko pattilenki vitt kale  allenki ivade vallathu povum ");
scene4.add(comedian[1] +" : haa ipo ippo  sheriyyakki tharaam ");
scene4.add(heroine[1] +" : hmmm");
scene4.add(comedian[3] +" : amme..... ennalum ithevidunn ");
scene4.add(heroine[1] +" : haa ");
scene4.add(comedian[1] +" : naariyal paani ");
scene4.add(heroine[1] +" : ithengane ");
scene4.add(comedian[1] +" : NOTHING IS IMPOSSIBLE ");



for (String scene44 : scene4)  {

  System.out.println(scene44);
  
  }



}


public void playScene5() {


scene5.add(comedian[1] +" : enthaa varaan paranje");
scene5.add(comedian[3] +" : nammade " + hero[1] + " misssing aan.. innale rathri avanum " + heroine[1] +" pirinju");
scene5.add(comedian[1] +" : eh pirinjaa ");
scene5.add(comedian[3] +": hey ippo kuzhaponnum illa ippo clear aaayi... pakshe avan evade enn yaathru vivarom illa...");
scene5.add(comedian[1] +" : veetil anweshicho");
scene5.add(comedian[3] +": abdhu poyirunnu.. avade illa...   daa custermor care le babunte number edukk  .....     che");
scene5.add(comedian[1] +" : sorry recharge cheythittilla ");
scene5.add(comedian[1] +" : she ivaneyokke thante mobile thaa .......  aa babu thante oru sahayam venam       okk");
scene5.add("\n");
scene5.add("\t\t\t(PHONE RINGING)");
scene5.add("\n");
scene5.add(comedian[3] +" : aa babu urake pare kettoodaaa  ........     ok ");
scene5.add(comedian[3] +" : daa vaa povaam");
scene5.add(comedian[1] +": engottekkaa? ");
scene5.add(comedian[3] +" : Kadal paalam");
scene5.add("\t\t\t(" +heroine[1] +"  COMING)");
scene5.add(comedian[1] +" : dey akathott po   vegam po");
scene5.add(comedian[3] +": onnum thonnaruth ketto vandi alppam moshaan");
scene5.add(heroine[1] +": Thankyou");
scene5.add(comedian[3] +" : vegam chell ninte naayarde aduthekk");
scene5.add("\t\t\t(" + heroine[1] +" MEET"+ hero[1] +")");
scene5.add(comedian[1] +": mr naayar");
scene5.add(heroine[1] +" : punneppadi gopalan maashinte veettil niskara paayil irikkan oridam tharo");
scene5.add(hero[1] +" : hmmm   hmm");
scene5.add("\t\t\t(" + hero[1] +"  HUGGING " + heroine[1]+")");
scene5.add("\t\t\t(BGM)");
scene5.add("\n");



for (String scene55 : scene5)  {

  System.out.println(scene55);
  
  }*/



  
}



}   

