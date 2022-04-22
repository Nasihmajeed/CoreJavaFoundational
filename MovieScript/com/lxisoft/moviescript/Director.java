package com.lxisoft.moviescript;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;

public class Director {
   
   private String name;

   public String getName() {
       return name;
    
   }
  
   public void setName(String name){  
    this.name=name; 

   }

   public void viewDirectorDetails(){

      System.out.println("\t\t  " + Language.prop.getProperty("directorinfo"));

      System.out.println("\t\t+-------------------------+" + "\n");

      System.out.println("\t\t  Director Name:" + name);

      System.out.println("\t\t+-------------------------+" + "\n");
   }

   Scanner sc = new Scanner(System.in);
   
   private List <Actor>  actorsDetails = new ArrayList<Actor> ();
   
   public List <Actor> getActorDetails(){

      return actorsDetails;
   }

   public void setActorDetails( List <Actor>actorDetails) {

      this.actorsDetails = actorDetails;
   }

   public List <Actor>  castActors() {

      int heroNo, heroineNo, comedianNo;

      System.out.println("\t\t  " + Language.prop.getProperty("castinfo"));

       System.out.println("\t\t+----------------------------------+"+"\n");

       System.out.println(Language.prop.getProperty("heronumbers") );

       heroNo = sc.nextInt();

          sc.nextLine();

       for (int i = 1; i <=heroNo; i++) {

        Hero hero = new Hero();

        System.out.println(i + Language.prop.getProperty("heroname") );

        hero.setName(sc.nextLine());

        System.out.println( + i + Language.prop.getProperty("herocharname") );

        hero.setCharacterName(sc.nextLine());

        hero.showActorsDetails();

        actorsDetails.add (hero);

        System.out.println("\n");

       }

        System.out.println(Language.prop.getProperty("heroinenumbers") );

       heroineNo = sc.nextInt();

       sc.nextLine();

       for (int i = 1; i <=heroineNo; i++) {

        Heroine heroine = new Heroine();

        System.out.println( i + Language.prop.getProperty("heroinename") );

        heroine.setName(sc.nextLine());

        System.out.println( i + Language.prop.getProperty("heroinecharname") );

        heroine.setCharacterName(sc.nextLine());

        heroine.showActorsDetails();

        actorsDetails.add (heroine);


       }

       System.out.println( Language.prop.getProperty("comediannumbers") );

       comedianNo = sc.nextInt();

       sc.nextLine();

       for (int i = 1; i <=comedianNo; i++) {

        Comedian comedian = new Comedian();

        System.out.println( i + Language.prop.getProperty("comedianname"));

        comedian.setName(sc.nextLine());

        System.out.println( i + Language.prop.getProperty("comediancharname"));

        comedian.setCharacterName(sc.nextLine());

        comedian.showActorsDetails();

        actorsDetails.add (comedian);

        
       }
       return actorsDetails;
    
}}
