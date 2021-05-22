package com.lxisoft.movie;
import com.lxisoft.actors.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Movie{
  Scanner sc=new Scanner(System.in);
  Scanner sn=new Scanner(System.in);
  Scanner sr=new Scanner(System.in);
  Scanner sv=new Scanner(System.in);
  Scanner ss=new Scanner(System.in);
  Scanner si=new Scanner(System.in);
  ArrayList<Actors> actors=new ArrayList<Actors>();
  ArrayList<Script> script=new ArrayList<Script>();
  Actors a=new Actors();
  String [] name= new String[10];
  String dirName;
  String genre,comedian,hero,heroine,villain;
//  int n;
  String movieName;
  public int randNum(){
  		int s=script.size();
  		int random=(int)(Math.random()*s);
                  return random;
  	}
  public void FileWordSearch() throws IOException{

        File f1=new File("C:\\Users\\Nisha\\Desktop\\work\\Movie Script\\src\\com\\lxisoft\\files\\comedyScene.txt"); //Creation of File Descriptor for input file
        String[] words=null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;


           // Input word to be searched
        //int count=0;   //Intialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
           words=s.split(";");

          // System.out.println(size); //Split the word using space
          //  System.out.println(words[i]);
            if (words[0].equals("comedy") || words[0].equals("romantic") || words[0].equals("emotional")){
              script.add(new Script());
            //  System.out.println(script.size());
              for(int i=script.size()-1;i<script.size();i++){
              script.get(i).setGenre(words[0]);
              script.get(i).setCharacter(words[1]);
              script.get(i).setConversation(words[2]);
              //System.out.println(script.get(i).getGenre());
              //System.out.println(script.get(i).getConversation());
            }
          }



            }


fr.close();
        }






  public void addDialogue(){
    //actors.add(new Unnikrishnan());
    //actors.get(0).setDialogue("Hi I am Unnikrishnan");

   actors.add(new Sundhareshan());
    actors.get(0).setDialogue("Sundhareshan : Entammoo.....aaa palltheppoke kazhinjo..dhe lavaningad varum munpe padiyirangikoo");
    actors.add(new Basanthi());
    actors.get(1).setDialogue("\nBasanthi : Padayappashinnaa");
    actors.add(new Sundhareshan());
    actors.get(2).setDialogue("\nSundhareshan : Aaa padayappa cinema oke njan kanditullathaa..vekam sthalam vitto..avanu deshyam vanal"+"\n"+" pinne kopayirikum..pidichal kittoolla, vem pokko");
    actors.add(new Basanthi());
    actors.get(3).setDialogue("\nBasanthi : Bukaaroooo");
    actors.add(new Sundhareshan());
    actors.get(4).setDialogue("\nSundhareshan : Aaah Bukaro train nte samayam onum enik ariyan padilla..bukaro alle veed  ");
    actors.add(new Basanthi());
    actors.get(5).setDialogue("\nBasanthi : (crying)..aaah Bukaaroooo");
    actors.add(new Sundhareshan());
    actors.get(6).setDialogue("\nSundhareshan : Vayattil kai vach bukaroo nn paranjal....aaaaaaa sadharana njangalk bujkaroo vannal "+"\n"+"oru mondha vellavumayi aa kuttikatttil poyi iruniit mukkaraa");
    actors.add(new Basanthi());
    actors.get(7).setDialogue("\nBasanthi : (crying again) Bukaroo chinna kuttiii");
    actors.add(new Sundhareshan());
    actors.get(8).setDialogue("\nSundhareshan : Vayattilkai vach chinnakutti nnn paranjall..garbham....garbhaaaanooo");
    actors.add(new Basanthi());
    actors.get(9).setDialogue("\nBasanthi : Haaa garbhaaaa ");
    actors.add(new Sundhareshan());
    actors.get(10).setDialogue("\nSundhareshan : Daivameee avan vannal ee garbham ente thalayil ketti vakkum, anjaaru roman ente thalayil "+"\n"+"poyi nn paranj enik kettikan ulla prayam onum ayitilla..poyee poyeee");
    actors.add(new Basanthi());
    actors.get(11).setDialogue("\nBasanthi : Idli garbhaa dosha garbhaaa vada garbhaa");
    actors.add(new Sundhareshan());
    actors.get(12).setDialogue("\nSundhareshan : Idli dosa vada garbha ente dhaivame swasam nere veen. vishakunudalleee..ee idli dosa garbha "+"\n"+"medikan ayiit ente kayil paisa nahi illaa illaa..inale adichille aan dhushtann");
    actors.add(new Basanthi());
    actors.get(13).setDialogue("\nBasanthi : Dhushtaannn?");
    actors.add(new Sundhareshan());
    actors.get(14).setDialogue("\nSundhareshan : Dhushtyannn...avan enik paisa thannillaa");
    actors.add(new Basanthi());
    actors.get(15).setDialogue("\nBasanthi : haa paisaaa(takes out money)");
    actors.add(new Sundhareshan());
    actors.get(16).setDialogue("\nSundhareshan : Havu bagyam paisakk ella bashayilm paisa enn thanne aanu(receives the money from her stunned)"+"\n"+"paisa kaari aanalle ee bankil iniym paisa undoo");
    actors.add(new Basanthi());
    actors.get(17).setDialogue("\nBasanthi : heeyy??");
    actors.add(new Sundhareshan());
    actors.get(18).setDialogue("\nSundhareshan : Ninak idali dosa vada garbha...enik porottem chickenum garbhaa(laughs)..daivame ethra nalaayi oru "+"\n"+"50nte pacha note kanditt chilavakaanum thonnanilla..oru photostat eduthu vakkam..apo oru photostatnte cash koode garbha(laughs awkwardly)");

  }
  public void menu() throws IOException{
    int sel;
    do{
      System.out.println("********************************");
      System.out.println("********************************");
      System.out.println("*******SCRIPT GENERATOR*******");
      System.out.println("********************************");
      System.out.println("********************************");
      System.out.println("1.CAST");
      //System.out.println("2.START MOVIE");
      System.out.println("2.PLOT");
      System.out.println("3.GENERATE SCRIPT");
      System.out.println("4.EXIT");

      //System.out.println("5.EXIT");
      sel=sc.nextInt();
    switch(sel){
      case 1:
            printCast();
            break;

      case 2:
            printPlot();
            break;
      case 3:
            generateScript();
            break;
     case 4:
            System.out.println("Exiting...");
            break;

      default:
              System.out.println("INVALID ENTRY ");
              break;
    }
  }while(sel!=4);
}
  public void generateScript(){
    System.out.println("Enter movie name :");
     movieName=sn.nextLine();
  /*  System.out.println("How many actors?");
    n=sc.nextInt();
    System.out.println("ENTER THE Actor's name : ");
    for(int i=0;i<=n;i++){
      name[i]=sc.nextLine();
    }*/
    System.out.println("ENTER comedian's name : ");
    comedian=sr.nextLine();
    System.out.println("ENTER Hero's name : ");
    hero=ss.nextLine();
    System.out.println("ENTER Heroine's name : ");
    heroine=sv.nextLine();
    System.out.println("ENTER Vilain's name : ");
    villain=si.nextLine();
    for (int i=0;i<script.size();i++){
    //  System.out.println(script.get(i).getCharacter());
      if(script.get(i).getCharacter().equals("Comedian")){
       script.get(i).setCharacter(comedian);
      }
      if(script.get(i).getCharacter().equals("Heroine")){
       script.get(i).setCharacter(heroine);
      }
      if(script.get(i).getCharacter().equals("Hero")){
       script.get(i).setCharacter(hero);
      }
      if(script.get(i).getCharacter().equals("Villain")){
       script.get(i).setCharacter(villain);
      }
    }


    System.out.println("ENTER DIRECTOR's name : ");
    dirName=sn.nextLine();
    System.out.println("ENTER THE GENRE ");
    String input1=sc.next();



      System.out.println("********************************");
      System.out.println("********************************");
      System.out.println("******"+movieName+"*******");
      System.out.println("********************************");
      System.out.println("********************************");
      System.out.println("********************************");
      System.out.println("DIRECTOR :          "+dirName);
      System.out.println("********************************");
      System.out.println("ACTORS : ");
      System.out.println("COMEDIAN : "+comedian);
      System.out.println("HERO :"+hero);
      System.out.println("HEROINE :"+heroine);
      System.out.println("VILLAIN :"+villain);
      System.out.println("********************************\n\n");
      System.out.println("********************************");
      System.out.println("********************************");
      System.out.println("************SCENE1***************");
      System.out.println("********************************");
      System.out.println("********************************");


                      for (int i=0;i<script.size();i++)
                      {
                      //  System.out.println(script.get(i).getCharacter());
                        if(script.get(i).getGenre().equals(input1)){
                         System.out.println(script.get(i).getCharacter()+" "+script.get(i).getConversation());
                        }

        }
        int n=randNum();
        //System.out.println(n);
        for(int i=0;i<n;i++){
          //  System.out.println(n);
         if(!script.get(i).getGenre().equals(input1)){
           //System.out.println(n);
           System.out.println(script.get(i).getCharacter()+"  "+script.get(i).getConversation());
         }
        }
      }


  public void printPlot(){
    System.out.println("|****************************************************************************************************************************************|");
    System.out.println("|Unnikrishnan owns an old bus, received as compensation for his father                                                                   |");
    System.out.println("|The plot takes a turn when a girl named Basanthi enters the bus as a nomad,                                                             |");
    System.out.println("|but she is actually Gayathri, the daughter of an influential and politically powerful minister R. K. Santhanam in Puducherry.           |");
    System.out.println("|The police trace her and takes her back to Santhanam's custody. Santhanam is making arrangements for her marriage with someone else.    |");
    System.out.println("|Meanwhile, Unni realizes that he could not live without Gayathri. He and Sundareshan secretly enter her house.                         |");
    System.out.println("|Unni and his friends plans to take Gayathri, but Santhanam find them inside the almirah. After a fight, everything ends well.           |");
    System.out.println("|****************************************************************************************************************************************|");
  }
  public void printDialogue(){
    System.out.println("\n\n*************************************************");
    System.out.println("******************SCENE 1************************");
    System.out.println("*************************************************");
    System.out.println("Sundhareshan enters the scene humming a song, finds Basanthi siiting infront of the bus\n\n");

  }

  public void printCast(){
    System.out.println("|**************************************|");
    System.out.println("|Dileep as Unnikrishnan                |");
    System.out.println("|Harisree Ashokan as Sundhareshan      |");
    System.out.println("|Nithya Das as Basanthi,Gayathri       |");
    System.out.println("|Cochin Haneefa as Veerappan Kurupp    |");
    System.out.println("|**************************************|");
  }
/*  public void printComedy(){
    for(Actors a: actors){
      if(a instanceof comedian)
          System.out.println(a.getDialogue());
      }
  }
  public void printHeroineDialogue(){
    for(Actors a: actors){
      if(a instanceof heroine)
          System.out.println(a.getDialogue());
      }
  }*/
  public void printComedy(){
    try{
      File myFile = new File("C:\\Users\\Nisha\\Desktop\\work\\Movie Script\\src\\com\\lxisoft\\files\\comedyScene.txt");
      Scanner sc= new Scanner(myFile);
      while(sc.hasNextLine()){
        String data=sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    }catch(FileNotFoundException e){
      System.out.println("An error occure");
      e.printStackTrace();
    }
    }
    public void printEmotionalScene(){
      try{
        File myFile = new File("C:\\Users\\Nisha\\Desktop\\work\\Movie Script\\src\\com\\lxisoft\\files\\emotionalScene.txt");
        Scanner sc= new Scanner(myFile);
        while(sc.hasNextLine()){
          String data=sc.nextLine();
          System.out.println(data);
        }
        sc.close();
      }catch(FileNotFoundException e){
        System.out.println("An error occure");
        e.printStackTrace();
      }
      }



  }
