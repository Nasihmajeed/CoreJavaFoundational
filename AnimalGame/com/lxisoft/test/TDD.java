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
            
             System.out.println("choose your language :  \n  നിങ്ങളുടെ ഭാഷ തിരഞ്ഞെടുക്കുക :");
             System.out.println("\n 1.English \n 2.മലയാളം  \n");
        
             Scanner sc = new Scanner(System.in);
             Localization object = new Localization();
            setOption(sc.nextInt());
             Forest forest = new Forest();
             switch(option){    
              case 1:    
             
              forest.welcomeToForest();
              object.initialize(getOption(), "english.properties");
              break;  //optional  
              case 2:    
            
              forest.welcomeToForest();  //code to be executed;    
               break;  //optional  
                  
                  
              default:     
                System.out.println(" Wrong one is choosed ! please Try again  \n തെറ്റായ ഒന്ന് തിരഞ്ഞെടുത്തു! ദയവായി വീണ്ടും ശ്രമിക്കുക "); 
         
 
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