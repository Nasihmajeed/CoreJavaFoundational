package com.lxisoft.moviescript;

import java.util.Scanner;

import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;

public class Director {

   private String name;

   int heroNo, heroineNo, comedianNo, villianNo;

   

   public String getName() {
       return name;
    
   }
  
   public void setName(String name){  
    this.name=name; 

   }

   public void directorDetails(){

      System.out.println("\t\t      Director Info");

      System.out.println("\t\t+-------------------------+" + "\n");

      System.out.println("\t\t  Director Name:" + name);

      System.out.println("\t\t+-------------------------+" + "\n");
   }

   Scanner sc = new Scanner(System.in);
   
   public String [] actors = new String [100];
    
   public void castDetails() {

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

        hero.actorsDetails();

        actors [i] = hero.getCharacterName();

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

        heroine.actorsDetails();

        actors [i+heroNo] = heroine.getCharacterName();


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

        comedian.actorsDetails();

        actors [i+heroNo+heroineNo] = comedian.getCharacterName();


       }
    
}}
