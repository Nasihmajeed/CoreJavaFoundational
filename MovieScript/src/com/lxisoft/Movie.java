import java.util.*;
public class Movie{
  Scanner sc=new Scanner(System.in);
  ArrayList<Actors> actors=new ArrayList<Actors>();
  Actors a=new Actors();
  public void addDialogue(){
    //actors.add(new Unnikrishnan());
    //actors.get(0).setDialogue("Hi I am Unnikrishnan");

    actors.add(new Sundhareshan());
    actors.get(0).setDialogue(actors.get(0).getClass().getName()+" : Entammoo.....aaa palltheppoke kazhinjo..dhe lavaningad varum munpe padiyirangikoo");
    actors.add(new Basanthi());
    actors.get(1).setDialogue("\n"+actors.get(1).getClass().getName()+" : Padayappashinnaa");
    actors.add(new Sundhareshan());
    actors.get(2).setDialogue("\n"+actors.get(2).getClass().getName()+" : Aaa padayappa cinema oke njan kanditullathaa..vekam sthalam vitto..avanu deshyam vanal"+"\n"+" pinne kopayirikum..pidichal kittoolla, vem pokko");
    actors.add(new Basanthi());
    actors.get(3).setDialogue("\n"+actors.get(3).getClass().getName()+" : Bukaaroooo");
    actors.add(new Sundhareshan());
    actors.get(4).setDialogue("\n"+actors.get(4).getClass().getName()+" : Aaah Bukaro train nte samayam onum enik ariyan padilla..bukaro alle veed  ");
    actors.add(new Basanthi());
    actors.get(5).setDialogue("\n"+actors.get(5).getClass().getName()+" : (crying)..aaah Bukaaroooo");
    actors.add(new Sundhareshan());
    actors.get(6).setDialogue("\n"+actors.get(6).getClass().getName()+" : Vayattil kai vach bukaroo nn paranjal....aaaaaaa sadharana njangalk bujkaroo vannal "+"\n"+"oru mondha vellavumayi aa kuttikatttil poyi iruniit mukkaraa");
    actors.add(new Basanthi());
    actors.get(7).setDialogue("\n"+actors.get(7).getClass().getName()+" : (crying again) Bukaroo chinna kuttiii");
    actors.add(new Sundhareshan());
    actors.get(8).setDialogue("\n"+actors.get(8).getClass().getName()+" : Vayattilkai vach chinnakutti nnn paranjall..garbham....garbhaaaanooo");
    actors.add(new Basanthi());
    actors.get(9).setDialogue("\n"+actors.get(9).getClass().getName()+" : Haaa garbhaaaa ");
    actors.add(new Sundhareshan());
    actors.get(10).setDialogue("\n"+actors.get(10).getClass().getName()+" : Daivameee avan vannal ee garbham ente thalayil ketti vakkum, anjaaru roman ente thalayil "+"\n"+"poyi nn paranj enik kettikan ulla prayam onum ayitilla..poyee poyeee");
    actors.add(new Basanthi());
    actors.get(11).setDialogue("\n"+actors.get(11).getClass().getName()+" : Idli garbhaa dosha garbhaaa vada garbhaa");
    actors.add(new Sundhareshan());
    actors.get(12).setDialogue("\n"+actors.get(12).getClass().getName()+" : Idli dosa vada garbha ente dhaivame swasam nere veen. vishakunudalleee..ee idli dosa garbha "+"\n"+"medikan ayiit ente kayil paisa nahi illaa illaa..inale adichille aan dhushtann");
    actors.add(new Basanthi());
    actors.get(13).setDialogue("\n"+actors.get(13).getClass().getName()+" : Dhushtaannn?");
    actors.add(new Sundhareshan());
    actors.get(14).setDialogue("\n"+actors.get(14).getClass().getName()+" : Dhushtyannn...avan enik paisa thannillaa");
    actors.add(new Basanthi());
    actors.get(15).setDialogue("\n"+actors.get(15).getClass().getName()+" : haa paisaaa(takes out money)");
    actors.add(new Sundhareshan());
    actors.get(16).setDialogue("\n"+actors.get(16).getClass().getName()+" : Havu bagyam paisakk ella bashayilm paisa enn thanne aanu(receives the money from her stunned)"+"\n"+"paisa kaari aanalle ee bankil iniym paisa undoo");
    actors.add(new Basanthi());
    actors.get(17).setDialogue("\n"+actors.get(17).getClass().getName()+" : heeyy??");
    actors.add(new Sundhareshan());
    actors.get(18).setDialogue("\n"+actors.get(18).getClass().getName()+" : Ninak idali dosa vada garbha...enik porottem chickenum garbhaa(laughs)..daivame ethra nalaayi oru "+"\n"+"50nte pacha note kanditt chilavakaanum thonnanilla..oru photostat eduthu vakkam..apo oru photostatnte cash koode garbha(laughs awkwardly)");

    }
  public void menu(){
    System.out.println("SELECT ");
    System.out.println("1.CAST");
    System.out.println("2.START MOVIE");
    System.out.println("3.PLOT");
    int sel=sc.nextInt();
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
      default:
              System.out.println("INVALID ENTRY");
              break;
    }
  }
  public void printPlot(){
    System.out.println("Unnikrishnan owns an old bus, received as compensation for his father");
    System.out.println("The plot takes a turn when a girl named Basanthi enters the bus as a nomad,");
    System.out.println("but she is actually Gayathri, the daughter of an influential and politically powerful minister R. K. Santhanam in Puducherry.");
    System.out.println("The police trace her and takes her back to Santhanam's custody. Santhanam is making arrangements for her marriage with someone else.");
    System.out.println(" Meanwhile, Unni realizes that he could not live without Gayathri. He and Sundareshan secretly enter her house.");
    System.out.println("Unni and his friends plans to take Gayathri, but Santhanam find them inside the almirah. After a fight, everything ends well.");
  }
  public void printDialogue(){
    //System.out.println(actors.get(0).getDialogue());
    //System.out.println(actors.get(1).getDialogue());
    //System.out.println(actors.get(2).getDialogue());
    for(Actors a: actors){
      System.out.println(a.getDialogue());
      //System.out.println("\n");
    }
  }

  public void printCast(){
    System.out.println("Dileep as Unnikrishnan");
    System.out.println("Harisree Ashokan as Sundhareshan");
    System.out.println("Nithya Das as Basanthi,Gayathri");
    System.out.println("Cochin Haneefa as Veerappan Kurupp");
  }


}
