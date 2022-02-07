package com.lxisoft.test;


import java.io.*;
import java.util.Scanner;


import com.lxisoft.game.Animal;
import com.lxisoft.game.Forest;
import com.lxisoft.localization.Localization;
import com.lxisoft.factors.*;
public class TDD {
        static int option;
       public static void main(String[] args){
              Localization object = new Localization();
             System.out.println("choose your language :  \n  നിങ്ങളുടെ ഭാഷ തിരഞ്ഞെടുക്കുക :");
             System.out.println("\n 1.English \n 2.മലയാളം  \n");
           //  System.out.println(" നിങ്ങളുടെ ഭാഷ തിരഞ്ഞെടുക്കുക : ");
            // System.out.println("\n"+  object.initializeM().getProperty("opt_1") +"\n"+ object.initializeM().getProperty("opt_2"));
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
                System.out.println(" Wrong one is choosed ! please Try again  \n തെറ്റായ ഒന്ന് തിരഞ്ഞെടുത്തു! ദയവായി വീണ്ടും ശ്രമിക്കുക "); 
           //     System.out.println(object.initializeM().getProperty("warnning")); 
 
              } 
             
              
       }
       public static void setOption(int option)		               //distance
       {
              TDD.option=option;
       }
       
       public static int getOption()
       {
              return option;
       }
}