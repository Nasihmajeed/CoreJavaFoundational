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

      System.out.println("\t\t      Director Info");

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

      System.out.println("\t\t         -- Cast Details --");

       System.out.println("\t\t+----------------------------------+"+"\n");

       System.out.println( " Enter The No Of Heros ");

       heroNo = sc.nextInt();

          sc.nextLine();

       for (int i = 1; i <=heroNo; i++) {

        Hero hero = new Hero();

        System.out.println("Enter" + i + "Hero Name");

        hero.setName(sc.nextLine());

        System.out.println("Enter" + i + "Hero Character Name");

        hero.setCharacterName(sc.nextLine());

        hero.showActorsDetails();

        actorsDetails.add (hero);

        System.out.println("\n");

       }

        System.out.println( " Enter The No Of Heroines ");

       heroineNo = sc.nextInt();

       sc.nextLine();

       for (int i = 1; i <=heroineNo; i++) {

        Heroine heroine = new Heroine();

        System.out.println("Enter" + i + "Heroine Name");

        heroine.setName(sc.nextLine());

        System.out.println("Enter" + i + "Heroine Character Name");

        heroine.setCharacterName(sc.nextLine());

        heroine.showActorsDetails();

        actorsDetails.add (heroine);


       }

       System.out.println( " Enter The No Of Comedians ");

       comedianNo = sc.nextInt();

       sc.nextLine();

       for (int i = 1; i <=comedianNo; i++) {

        Comedian comedian = new Comedian();

        System.out.println("Enter" + i + "Comedian Name");

        comedian.setName(sc.nextLine());

        System.out.println("Enter" + i + "Comedian Character Name");

        comedian.setCharacterName(sc.nextLine());

        comedian.showActorsDetails();

        actorsDetails.add (comedian);

        
       }
       return actorsDetails;
    
}}
