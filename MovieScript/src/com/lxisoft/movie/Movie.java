package com.lxisoft.movie;
import com.lxisoft.actors.*;
import java.util.*;
public class Movie{
  Scanner sc=new Scanner(System.in);
  ArrayList<Actors> actors=new ArrayList<Actors>();
  Actors a=new Actors();
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
  public void menu(){
    int sel;
    do{
    System.out.println("MOVIE ******PARAKKUM THALIKA******* \n\n");
    System.out.println("1.CAST");
    System.out.println("2.START MOVIE");
    System.out.println("3.PLOT");
    System.out.println("4.COMEDIAN");
    System.out.println("5.HEROINE");
    System.out.println("4.EXIT");
    sel=sc.nextInt();
    switch(sel){
      case 1:
            printCast();
            break;
      case 2:
            printDialogue();
            break;
      case 3:
            printPlot();
            break;
     case 4:
            printComedy();
            break;
     case 5:
            printHeroineDialogue();
            break;
     case 6:
            System.out.println("Exiting..");
            break;
      default:
              System.out.println("INVALID ENTRY");
              break;
    }
  }while(sel!=6);
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
    //System.out.println(actors.get(0).getDialogue());
    //System.out.println(actors.get(1).getDialogue());
    //System.out.println(actors.get(2).getDialogue());
    for(Actors a: actors){
      System.out.println(a.getDialogue());
      //System.out.println("\n");
    }
  }

  public void printCast(){
    System.out.println("|**************************************|");
    System.out.println("|Dileep as Unnikrishnan                |");
    System.out.println("|Harisree Ashokan as Sundhareshan      |");
    System.out.println("|Nithya Das as Basanthi,Gayathri       |");
    System.out.println("|Cochin Haneefa as Veerappan Kurupp    |");
    System.out.println("|**************************************|");
  }
  public void printComedy(){
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
  }

}
