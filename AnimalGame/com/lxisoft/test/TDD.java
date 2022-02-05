package com.lxisoft.test;

import java.*;
import java.io.*;
import java.util.Scanner;

import com.lxisoft.*;
import com.lxisoft.game.Animal;
import com.lxisoft.game.Forest;
import com.lxisoft.localization.Localization;
import com.lxisoft.factors.*;
public class TDD {
        static int option;
       public static void main(String[] args){
              Localization object = new Localization();
             System.out.println(object.initialize().getProperty("FAQ"));
             System.out.println("\n"+  object.initialize().getProperty("opt_1") +"\n"+ object.initialize().getProperty("opt_2"));
             System.out.println(object.initializeM().getProperty("FAQ"));
             System.out.println("\n"+  object.initializeM().getProperty("opt_1") +"\n"+ object.initializeM().getProperty("opt_2"));
             Scanner sc = new Scanner(System.in);
             //Localization loc = new Localization(); 
            setOption(sc.nextInt());
             Forest forest = new Forest();
             switch(option){    
              case 1:    
              //loc.initialize(0); //code to be executed; 
              forest.welcomeToForest();
              break;  //optional  
              case 2:    
              //loc.initialize(1);
              forest.welcomeToForest();  //code to be executed;    
               break;  //optional  
                  
                  
              default:     
                System.out.println(object.initialize().getProperty("warnning")); 
                System.out.println(object.initializeM().getProperty("warnning")); 
 
              } 
             
              
       }
       public static void setOption(int option)		               //distance
       {
              TDD.option=option;
       }
       
       public int getOption()
       {
              return option;
       }
}